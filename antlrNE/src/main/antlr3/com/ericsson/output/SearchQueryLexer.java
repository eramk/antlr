// $ANTLR 3.5 C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g 2013-06-18 15:19:07

package com.ericsson.ne;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SearchQueryLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SearchQueryLexer() {} 
	public SearchQueryLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SearchQueryLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g"; }

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:11:7: ( ',' )
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:11:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "All"
	public final void mAll() throws RecognitionException {
		try {
			int _type = All;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:29:3: ( 'all' )
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:29:6: 'all'
			{
			match("all"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "All"

	// $ANTLR start "Star"
	public final void mStar() throws RecognitionException {
		try {
			int _type = Star;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:32:3: ( '*' )
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:32:5: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Star"

	// $ANTLR start "Everything"
	public final void mEverything() throws RecognitionException {
		try {
			int _type = Everything;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:35:3: ( 'everything' )
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:35:4: 'everything'
			{
			match("everything"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Everything"

	// $ANTLR start "On"
	public final void mOn() throws RecognitionException {
		try {
			int _type = On;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:38:3: ( 'on' )
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:38:6: 'on'
			{
			match("on"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "On"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:41:3: ( Int ( '.' ( Digit )* )? )
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:41:6: Int ( '.' ( Digit )* )?
			{
			mInt(); 

			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:41:10: ( '.' ( Digit )* )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='.') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:41:11: '.' ( Digit )*
					{
					match('.'); 
					// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:41:15: ( Digit )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop1;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:45:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:45:6: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
			{
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:45:6: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "Space"
	public final void mSpace() throws RecognitionException {
		try {
			int _type = Space;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:50:3: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+ )
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:50:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
			{
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:50:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Space"

	// $ANTLR start "Int"
	public final void mInt() throws RecognitionException {
		try {
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:80:3: ( '1' .. '9' ( Digit )* | '0' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= '1' && LA6_0 <= '9')) ) {
				alt6=1;
			}
			else if ( (LA6_0=='0') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:80:6: '1' .. '9' ( Digit )*
					{
					matchRange('1','9'); 
					// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:80:15: ( Digit )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;
				case 2 :
					// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:81:6: '0'
					{
					match('0'); 
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Int"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:85:3: ( '0' .. '9' )
			// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:1:8: ( T__13 | All | Star | Everything | On | Number | ID | Space )
		int alt7=8;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:1:10: T__13
				{
				mT__13(); 

				}
				break;
			case 2 :
				// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:1:16: All
				{
				mAll(); 

				}
				break;
			case 3 :
				// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:1:20: Star
				{
				mStar(); 

				}
				break;
			case 4 :
				// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:1:25: Everything
				{
				mEverything(); 

				}
				break;
			case 5 :
				// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:1:36: On
				{
				mOn(); 

				}
				break;
			case 6 :
				// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:1:39: Number
				{
				mNumber(); 

				}
				break;
			case 7 :
				// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:1:46: ID
				{
				mID(); 

				}
				break;
			case 8 :
				// C:\\Users\\eramkoh\\TestBitsWorkspace\\antlrNE\\src\\main\\antlr3\\com\\ericsson\\SearchQuery.g:1:49: Space
				{
				mSpace(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\2\uffff\1\10\1\uffff\2\10\2\16\2\uffff\2\10\1\21\1\16\1\uffff\1\22\1"+
		"\10\2\uffff\6\10\1\32\1\uffff";
	static final String DFA7_eofS =
		"\33\uffff";
	static final String DFA7_minS =
		"\1\11\1\uffff\1\154\1\uffff\1\166\1\156\2\60\2\uffff\1\154\1\145\2\60"+
		"\1\uffff\1\60\1\162\2\uffff\1\171\1\164\1\150\1\151\1\156\1\147\1\60\1"+
		"\uffff";
	static final String DFA7_maxS =
		"\1\172\1\uffff\1\154\1\uffff\1\166\1\156\2\172\2\uffff\1\154\1\145\2\172"+
		"\1\uffff\1\172\1\162\2\uffff\1\171\1\164\1\150\1\151\1\156\1\147\1\172"+
		"\1\uffff";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\4\uffff\1\7\1\10\4\uffff\1\6\2\uffff\1\5\1\2"+
		"\7\uffff\1\4";
	static final String DFA7_specialS =
		"\33\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\11\1\uffff\2\11\22\uffff\1\11\11\uffff\1\3\1\uffff\1\1\3\uffff\1\7"+
			"\11\6\7\uffff\32\10\4\uffff\1\10\1\uffff\1\2\3\10\1\4\11\10\1\5\13\10",
			"",
			"\1\12",
			"",
			"\1\13",
			"\1\14",
			"\12\15\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"",
			"",
			"\1\17",
			"\1\20",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"\12\15\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"\1\23",
			"",
			"",
			"\1\24",
			"\1\25",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\31",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__13 | All | Star | Everything | On | Number | ID | Space );";
		}
	}

}
