// $ANTLR 3.5 C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g 2013-06-18 15:19:07

package com.ericsson.ne;

import java.util.List;
import com.ericsson.ne.SearchCriteria;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class SearchQueryParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "All", "Digit", "Everything", 
		"ID", "Int", "Number", "On", "Space", "Star", "','"
	};
	public static final int EOF=-1;
	public static final int T__13=13;
	public static final int All=4;
	public static final int Digit=5;
	public static final int Everything=6;
	public static final int ID=7;
	public static final int Int=8;
	public static final int Number=9;
	public static final int On=10;
	public static final int Space=11;
	public static final int Star=12;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "exprList", "expression", "start", "query"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public SearchQueryParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public SearchQueryParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public SearchQueryParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return SearchQueryParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g"; }


	public static class start_return extends ParserRuleReturnScope {
		public SearchCriteria sc;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "start"
	// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:56:1: start returns [SearchCriteria sc] : query EOF -> query ;
	public final SearchQueryParser.start_return start() throws  {
		SearchQueryParser.start_return retval = new SearchQueryParser.start_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope query1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_query=new RewriteRuleSubtreeStream(adaptor,"rule query");

		try { dbg.enterRule(getGrammarFileName(), "start");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:57:3: ( query EOF -> query )
			dbg.enterAlt(1);

			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:57:6: query EOF
			{
			dbg.location(57,6);
			pushFollow(FOLLOW_query_in_start210);
			query1=query();
			state._fsp--;

			stream_query.add(query1.getTree());dbg.location(57,12);
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start212);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: query
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 57:16: -> query
			{
				dbg.location(57,19);
				adaptor.addChild(root_0, stream_query.nextTree());dbg.location(57,25);
				adaptor.addChild(root_0, retval.sc = (query1!=null?((SearchQueryParser.query_return)query1).scq:null));
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
			// do for sure before leaving
		}
		dbg.location(58, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "start");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "start"


	public static class query_return extends ParserRuleReturnScope {
		public SearchCriteria scq;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "query"
	// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:60:1: query returns [SearchCriteria scq] : ( All | Star | Everything ) On exprList ;
	public final SearchQueryParser.query_return query() throws  {
		SearchQueryParser.query_return retval = new SearchQueryParser.query_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set3=null;
		Token On4=null;
		ParserRuleReturnScope exprList5 =null;

		Object set3_tree=null;
		Object On4_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "query");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:61:3: ( ( All | Star | Everything ) On exprList )
			dbg.enterAlt(1);

			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:61:5: ( All | Star | Everything ) On exprList
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(61,5);
			set3=input.LT(1);
			if ( input.LA(1)==All||input.LA(1)==Everything||input.LA(1)==Star ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set3));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(61,27);
			On4=(Token)match(input,On,FOLLOW_On_in_query245); 
			On4_tree = (Object)adaptor.create(On4);
			adaptor.addChild(root_0, On4_tree);
			dbg.location(61,30);
			pushFollow(FOLLOW_exprList_in_query247);
			exprList5=exprList();
			state._fsp--;

			adaptor.addChild(root_0, exprList5.getTree());
			dbg.location(61,39);
			retval.scq = (exprList5!=null?((SearchQueryParser.exprList_return)exprList5).scExpList:null);
			                                        System.out.println("SearchCriteria-> "+retval.scq.toString()); 
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
			// do for sure before leaving
		}
		dbg.location(63, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "query");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "query"


	public static class exprList_return extends ParserRuleReturnScope {
		public SearchCriteria scExpList;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprList"
	// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:65:1: exprList returns [SearchCriteria scExpList] : e1= expression ( ',' e2= expression )* ;
	public final SearchQueryParser.exprList_return exprList() throws  {
		SearchQueryParser.exprList_return retval = new SearchQueryParser.exprList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal6=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		Object char_literal6_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "exprList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:66:3: (e1= expression ( ',' e2= expression )* )
			dbg.enterAlt(1);

			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:66:6: e1= expression ( ',' e2= expression )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(66,9);
			pushFollow(FOLLOW_expression_in_exprList274);
			e1=expression();
			state._fsp--;

			adaptor.addChild(root_0, e1.getTree());
			dbg.location(66,22);
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:66:22: ( ',' e2= expression )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==13) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:66:23: ',' e2= expression
					{
					dbg.location(66,23);
					char_literal6=(Token)match(input,13,FOLLOW_13_in_exprList277); 
					char_literal6_tree = (Object)adaptor.create(char_literal6);
					adaptor.addChild(root_0, char_literal6_tree);
					dbg.location(66,30);
					pushFollow(FOLLOW_expression_in_exprList284);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(66,47);

			  										List l = new ArrayList();
			  										l.add((e1!=null?((SearchQueryParser.expression_return)e1).scExp:null)); 
			  										retval.scExpList.setMo(l);
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
			// do for sure before leaving
		}
		dbg.location(70, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprList"


	public static class expression_return extends ParserRuleReturnScope {
		public String scExp;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:72:1: expression returns [String scExp] : id= ID ;
	public final SearchQueryParser.expression_return expression() throws  {
		SearchQueryParser.expression_return retval = new SearchQueryParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token id=null;

		Object id_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(72, 0);

		try {
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:73:3: (id= ID )
			dbg.enterAlt(1);

			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:73:5: id= ID
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(73,7);
			id=(Token)match(input,ID,FOLLOW_ID_in_expression312); 
			id_tree = (Object)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			dbg.location(73,13);
			retval.scExp = id.getText();
			  
			  
			  
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
			// do for sure before leaving
		}
		dbg.location(77, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression"

	// Delegated rules



	public static final BitSet FOLLOW_query_in_start210 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_start212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_query237 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_On_in_query245 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_exprList_in_query247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprList274 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_exprList277 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_expression_in_exprList284 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_expression312 = new BitSet(new long[]{0x0000000000000002L});
}
