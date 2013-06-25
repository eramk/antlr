// $ANTLR 3.3 Nov 30, 2010 12:46:29 com\\ericsson\\SearchQuery.g 2013-06-24 10:56:23

package com.ericsson.ne;

import java.util.List;
import com.ericsson.ne.SearchCriteria;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SearchQueryParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "All", "Star", "Everything", "On", "Int", "Digit", "Number", "ID", "Space", "Comma", "'-'"
    };
    public static final int EOF=-1;
    public static final int T__14=14;
    public static final int All=4;
    public static final int Star=5;
    public static final int Everything=6;
    public static final int On=7;
    public static final int Int=8;
    public static final int Digit=9;
    public static final int Number=10;
    public static final int ID=11;
    public static final int Space=12;
    public static final int Comma=13;

    // delegates
    // delegators


        public SearchQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SearchQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SearchQueryParser.tokenNames; }
    public String getGrammarFileName() { return "com\\ericsson\\SearchQuery.g"; }


    public static class start_return extends ParserRuleReturnScope {
        public SearchCriteria sc;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // com\\ericsson\\SearchQuery.g:59:1: start returns [SearchCriteria sc] : query EOF -> query ;
    public final SearchQueryParser.start_return start() throws RecognitionException {
        SearchQueryParser.start_return retval = new SearchQueryParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        SearchQueryParser.query_return query1 = null;


        Object EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");
        try {
            // com\\ericsson\\SearchQuery.g:60:3: ( query EOF -> query )
            // com\\ericsson\\SearchQuery.g:60:6: query EOF
            {
            pushFollow(FOLLOW_query_in_start234);
            query1=query();

            state._fsp--;

            stream_query.add(query1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start236);  
            stream_EOF.add(EOF2);



            // AST REWRITE
            // elements: query
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:16: -> query
            {
                adaptor.addChild(root_0, stream_query.nextTree());
                adaptor.addChild(root_0, retval.sc = (query1!=null?query1.scq:null));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class query_return extends ParserRuleReturnScope {
        public SearchCriteria scq;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "query"
    // com\\ericsson\\SearchQuery.g:63:1: query returns [SearchCriteria scq] : ( All | Star | Everything ) On exprList ;
    public final SearchQueryParser.query_return query() throws RecognitionException {
        SearchQueryParser.query_return retval = new SearchQueryParser.query_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set3=null;
        Token On4=null;
        SearchQueryParser.exprList_return exprList5 = null;


        Object set3_tree=null;
        Object On4_tree=null;

        try {
            // com\\ericsson\\SearchQuery.g:64:3: ( ( All | Star | Everything ) On exprList )
            // com\\ericsson\\SearchQuery.g:64:5: ( All | Star | Everything ) On exprList
            {
            root_0 = (Object)adaptor.nil();

            set3=(Token)input.LT(1);
            if ( (input.LA(1)>=All && input.LA(1)<=Everything) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set3));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            On4=(Token)match(input,On,FOLLOW_On_in_query269); 
            On4_tree = (Object)adaptor.create(On4);
            adaptor.addChild(root_0, On4_tree);

            pushFollow(FOLLOW_exprList_in_query271);
            exprList5=exprList();

            state._fsp--;

            adaptor.addChild(root_0, exprList5.getTree());
            retval.scq = (exprList5!=null?exprList5.scExpList:null);
                                                    

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "query"

    public static class exprList_return extends ParserRuleReturnScope {
        public SearchCriteria scExpList;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // com\\ericsson\\SearchQuery.g:68:1: exprList returns [SearchCriteria scExpList] : e1= expression_enhanced ( Comma | Space )* (e2= expression_enhanced )* ;
    public final SearchQueryParser.exprList_return exprList() throws RecognitionException {
        SearchQueryParser.exprList_return retval = new SearchQueryParser.exprList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set6=null;
        SearchQueryParser.expression_enhanced_return e1 = null;

        SearchQueryParser.expression_enhanced_return e2 = null;


        Object set6_tree=null;


         retval.scExpList = new SearchCriteria();
         List l = new ArrayList();

        try {
            // com\\ericsson\\SearchQuery.g:78:3: (e1= expression_enhanced ( Comma | Space )* (e2= expression_enhanced )* )
            // com\\ericsson\\SearchQuery.g:78:6: e1= expression_enhanced ( Comma | Space )* (e2= expression_enhanced )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_enhanced_in_exprList309);
            e1=expression_enhanced();

            state._fsp--;

            adaptor.addChild(root_0, e1.getTree());
            l.addAll((e1!=null?e1.scExpList:null));
            // com\\ericsson\\SearchQuery.g:79:6: ( Comma | Space )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case Space:
                case Comma:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // com\\ericsson\\SearchQuery.g:
            	    {
            	    set6=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Space && input.LA(1)<=Comma) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set6));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // com\\ericsson\\SearchQuery.g:80:6: (e2= expression_enhanced )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case ID:
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // com\\ericsson\\SearchQuery.g:80:7: e2= expression_enhanced
            	    {
            	    pushFollow(FOLLOW_expression_enhanced_in_exprList338);
            	    e2=expression_enhanced();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e2.getTree());
            	    l.addAll((e2!=null?e2.scExpList:null));

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


            retval.scExpList.setMo(l);
            System.out.println("List-> "+l);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprList"

    public static class expression_return extends ParserRuleReturnScope {
        public String scExp;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // com\\ericsson\\SearchQuery.g:83:1: expression returns [String scExp] : id= ID ( '-' Number )? ;
    public final SearchQueryParser.expression_return expression() throws RecognitionException {
        SearchQueryParser.expression_return retval = new SearchQueryParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token char_literal7=null;
        Token Number8=null;

        Object id_tree=null;
        Object char_literal7_tree=null;
        Object Number8_tree=null;

        try {
            // com\\ericsson\\SearchQuery.g:84:3: (id= ID ( '-' Number )? )
            // com\\ericsson\\SearchQuery.g:84:5: id= ID ( '-' Number )?
            {
            root_0 = (Object)adaptor.nil();

            id=(Token)match(input,ID,FOLLOW_ID_in_expression365); 
            id_tree = (Object)adaptor.create(id);
            adaptor.addChild(root_0, id_tree);

            retval.scExp = id.getText(); 
            // com\\ericsson\\SearchQuery.g:85:3: ( '-' Number )?
            int alt3=2;
            switch ( input.LA(1) ) {
                case 14:
                    {
                    alt3=1;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // com\\ericsson\\SearchQuery.g:85:4: '-' Number
                    {
                    char_literal7=(Token)match(input,14,FOLLOW_14_in_expression372); 
                    char_literal7_tree = (Object)adaptor.create(char_literal7);
                    adaptor.addChild(root_0, char_literal7_tree);

                    Number8=(Token)match(input,Number,FOLLOW_Number_in_expression373); 
                    Number8_tree = (Object)adaptor.create(Number8);
                    adaptor.addChild(root_0, Number8_tree);

                    System.out.println("Repeat for->"+ Number8.getText());
                      for(int i =0; i<(Number8!=null?Integer.valueOf(Number8.getText()):0); i++){
                      	  System.out.println("i-> "+i);
                      	  }
                      

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expression_enhanced_return extends ParserRuleReturnScope {
        public List scExpList;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_enhanced"
    // com\\ericsson\\SearchQuery.g:92:1: expression_enhanced returns [List scExpList] : id= ID ( '-' Number )? ;
    public final SearchQueryParser.expression_enhanced_return expression_enhanced() throws RecognitionException {
        SearchQueryParser.expression_enhanced_return retval = new SearchQueryParser.expression_enhanced_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token char_literal9=null;
        Token Number10=null;

        Object id_tree=null;
        Object char_literal9_tree=null;
        Object Number10_tree=null;


        retval.scExpList = new ArrayList(); 

        try {
            // com\\ericsson\\SearchQuery.g:96:3: (id= ID ( '-' Number )? )
            // com\\ericsson\\SearchQuery.g:96:5: id= ID ( '-' Number )?
            {
            root_0 = (Object)adaptor.nil();

            id=(Token)match(input,ID,FOLLOW_ID_in_expression_enhanced404); 
            id_tree = (Object)adaptor.create(id);
            adaptor.addChild(root_0, id_tree);

            retval.scExpList.add(id.getText()); 
            // com\\ericsson\\SearchQuery.g:97:3: ( '-' Number )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case 14:
                    {
                    alt4=1;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // com\\ericsson\\SearchQuery.g:97:4: '-' Number
                    {
                    char_literal9=(Token)match(input,14,FOLLOW_14_in_expression_enhanced411); 
                    char_literal9_tree = (Object)adaptor.create(char_literal9);
                    adaptor.addChild(root_0, char_literal9_tree);

                    Number10=(Token)match(input,Number,FOLLOW_Number_in_expression_enhanced412); 
                    Number10_tree = (Object)adaptor.create(Number10);
                    adaptor.addChild(root_0, Number10_tree);

                    System.out.println("Repeat for->"+ Number10.getText());
                      for(int i =1; i<=(Number10!=null?Integer.valueOf(Number10.getText()):0); i++){
                      	  System.out.println("i-> "+i);
                      	  retval.scExpList.add(id.getText());
                      	  }
                      

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression_enhanced"

    // Delegated rules


 

    public static final BitSet FOLLOW_query_in_start234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_query261 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_On_in_query269 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_exprList_in_query271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_enhanced_in_exprList309 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_set_in_exprList318 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_expression_enhanced_in_exprList338 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ID_in_expression365 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_expression372 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Number_in_expression373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expression_enhanced404 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_expression_enhanced411 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Number_in_expression_enhanced412 = new BitSet(new long[]{0x0000000000000002L});

}