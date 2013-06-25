grammar SearchQuery;

options
{
  // antlr will generate java lexer and parser
  language = Java;
  // generated parser should create abstract syntax tree
  output = AST;
}


//package, we have to add package declaration on top of it
@lexer::header {
package com.ericsson.ne;
}


//package, we have to add package declaration on top of it
@parser::header {
package com.ericsson.ne;

import java.util.List;
import com.ericsson.ne.SearchCriteria;
}

// ***************** lexer rules:
//the grammar must contain at least one lexer rule
All
  :  'all' | 'All'
  ;
Star
  : '*'
  ;
Everything
  :'everything' | 'Everything'
  ;
On 
  :  'on' | 'On'
  ;
Number
  :  Int ('.' Digit*)?
  ;

ID
  :  ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+
  ;


Space
  :  (' ' | '\t' | '\r' | '\n' | '\u000C')+ {skip();}
  ;

Comma
  : ','
  ;

// ***************** parser rules:
//our grammar accepts only salutation followed by an end symbol
start returns [SearchCriteria sc]
  :  query EOF -> query {$sc = $query.scq}
  ;
  
query returns [SearchCriteria scq]
  : (All|Star|Everything) On exprList {$scq = $exprList.scExpList;
                                        }
  ;
  
exprList  returns [SearchCriteria scExpList]
@init{
 $scExpList = new SearchCriteria();
 List l = new ArrayList();
}
@after{
$scExpList.setMo(l);
System.out.println("List-> "+l);
}
  //:  e1 = expression{l.add($e1.scExp);} (Comma| Space)* (e2 =  expression {l.add($e2.scExp);})*
  :  e1 = expression_enhanced{l.addAll($e1.scExpList);} 
     (Comma| Space)* 
     (e2 =  expression_enhanced {l.addAll($e2.scExpList);})*
  ;
  
expression returns [String scExp]
  : id=  ID {$scExp = $id.getText(); }
  ('-'Number {System.out.println("Repeat for->"+ $Number.getText());
  for(int i =0; i<$Number.int; i++){
  	  System.out.println("i-> "+i);
  	  }
  } )?
  ;
 
expression_enhanced returns [List scExpList]
@init{
$scExpList = new ArrayList(); 
}
  : id=  ID {$scExpList.add($id.getText()); }
  ('-'Number {System.out.println("Repeat for->"+ $Number.getText());
  for(int i =1; i<=$Number.int; i++){
  	  System.out.println("i-> "+i);
  	  $scExpList.add($id.getText());
  	  }
  } )?
  ;
  
fragment Int
  :  '1'..'9' Digit*
  |  '0'
  ;
  
fragment Digit 
  :  '0'..'9'
  ;
