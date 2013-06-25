// $ANTLR 3.3 Nov 30, 2010 12:46:29 com\\ericsson\\SearchQuery.g 2013-06-24 10:56:24

package com.ericsson.ne;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SearchQueryLexer extends Lexer {
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

    public SearchQueryLexer() {;} 
    public SearchQueryLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SearchQueryLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "com\\ericsson\\SearchQuery.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\ericsson\\SearchQuery.g:11:7: ( '-' )
            // com\\ericsson\\SearchQuery.g:11:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "All"
    public final void mAll() throws RecognitionException {
        try {
            int _type = All;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\ericsson\\SearchQuery.g:29:3: ( 'all' | 'All' )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt1=1;
                }
                break;
            case 'A':
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // com\\ericsson\\SearchQuery.g:29:6: 'all'
                    {
                    match("all"); 


                    }
                    break;
                case 2 :
                    // com\\ericsson\\SearchQuery.g:29:14: 'All'
                    {
                    match("All"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "All"

    // $ANTLR start "Star"
    public final void mStar() throws RecognitionException {
        try {
            int _type = Star;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\ericsson\\SearchQuery.g:32:3: ( '*' )
            // com\\ericsson\\SearchQuery.g:32:5: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Star"

    // $ANTLR start "Everything"
    public final void mEverything() throws RecognitionException {
        try {
            int _type = Everything;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\ericsson\\SearchQuery.g:35:3: ( 'everything' | 'Everything' )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 'e':
                {
                alt2=1;
                }
                break;
            case 'E':
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // com\\ericsson\\SearchQuery.g:35:4: 'everything'
                    {
                    match("everything"); 


                    }
                    break;
                case 2 :
                    // com\\ericsson\\SearchQuery.g:35:19: 'Everything'
                    {
                    match("Everything"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Everything"

    // $ANTLR start "On"
    public final void mOn() throws RecognitionException {
        try {
            int _type = On;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\ericsson\\SearchQuery.g:38:3: ( 'on' | 'On' )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 'o':
                {
                alt3=1;
                }
                break;
            case 'O':
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // com\\ericsson\\SearchQuery.g:38:6: 'on'
                    {
                    match("on"); 


                    }
                    break;
                case 2 :
                    // com\\ericsson\\SearchQuery.g:38:13: 'On'
                    {
                    match("On"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "On"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\ericsson\\SearchQuery.g:41:3: ( Int ( '.' ( Digit )* )? )
            // com\\ericsson\\SearchQuery.g:41:6: Int ( '.' ( Digit )* )?
            {
            mInt(); 
            // com\\ericsson\\SearchQuery.g:41:10: ( '.' ( Digit )* )?
            int alt5=2;
            switch ( input.LA(1) ) {
                case '.':
                    {
                    alt5=1;
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // com\\ericsson\\SearchQuery.g:41:11: '.' ( Digit )*
                    {
                    match('.'); 
                    // com\\ericsson\\SearchQuery.g:41:15: ( Digit )*
                    loop4:
                    do {
                        int alt4=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt4=1;
                            }
                            break;

                        }

                        switch (alt4) {
                    	case 1 :
                    	    // com\\ericsson\\SearchQuery.g:41:15: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\ericsson\\SearchQuery.g:45:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
            // com\\ericsson\\SearchQuery.g:45:6: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            {
            // com\\ericsson\\SearchQuery.g:45:6: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt6=1;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // com\\ericsson\\SearchQuery.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "Space"
    public final void mSpace() throws RecognitionException {
        try {
            int _type = Space;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\ericsson\\SearchQuery.g:50:3: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+ )
            // com\\ericsson\\SearchQuery.g:50:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
            {
            // com\\ericsson\\SearchQuery.g:50:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                    {
                    alt7=1;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // com\\ericsson\\SearchQuery.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Space"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\ericsson\\SearchQuery.g:54:3: ( ',' )
            // com\\ericsson\\SearchQuery.g:54:5: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            // com\\ericsson\\SearchQuery.g:106:3: ( '1' .. '9' ( Digit )* | '0' )
            int alt9=2;
            switch ( input.LA(1) ) {
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt9=1;
                }
                break;
            case '0':
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // com\\ericsson\\SearchQuery.g:106:6: '1' .. '9' ( Digit )*
                    {
                    matchRange('1','9'); 
                    // com\\ericsson\\SearchQuery.g:106:15: ( Digit )*
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt8=1;
                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // com\\ericsson\\SearchQuery.g:106:15: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // com\\ericsson\\SearchQuery.g:107:6: '0'
                    {
                    match('0'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // com\\ericsson\\SearchQuery.g:111:3: ( '0' .. '9' )
            // com\\ericsson\\SearchQuery.g:111:6: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    public void mTokens() throws RecognitionException {
        // com\\ericsson\\SearchQuery.g:1:8: ( T__14 | All | Star | Everything | On | Number | ID | Space | Comma )
        int alt10=9;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // com\\ericsson\\SearchQuery.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // com\\ericsson\\SearchQuery.g:1:16: All
                {
                mAll(); 

                }
                break;
            case 3 :
                // com\\ericsson\\SearchQuery.g:1:20: Star
                {
                mStar(); 

                }
                break;
            case 4 :
                // com\\ericsson\\SearchQuery.g:1:25: Everything
                {
                mEverything(); 

                }
                break;
            case 5 :
                // com\\ericsson\\SearchQuery.g:1:36: On
                {
                mOn(); 

                }
                break;
            case 6 :
                // com\\ericsson\\SearchQuery.g:1:39: Number
                {
                mNumber(); 

                }
                break;
            case 7 :
                // com\\ericsson\\SearchQuery.g:1:46: ID
                {
                mID(); 

                }
                break;
            case 8 :
                // com\\ericsson\\SearchQuery.g:1:49: Space
                {
                mSpace(); 

                }
                break;
            case 9 :
                // com\\ericsson\\SearchQuery.g:1:55: Comma
                {
                mComma(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\2\uffff\2\13\1\uffff\4\13\2\25\3\uffff\4\13\2\32\1\25\1\uffff"+
        "\2\33\2\13\2\uffff\14\13\2\52\1\uffff";
    static final String DFA10_eofS =
        "\53\uffff";
    static final String DFA10_minS =
        "\1\11\1\uffff\2\154\1\uffff\2\166\2\156\2\60\3\uffff\2\154\2\145"+
        "\3\60\1\uffff\2\60\2\162\2\uffff\2\171\2\164\2\150\2\151\2\156\2"+
        "\147\2\60\1\uffff";
    static final String DFA10_maxS =
        "\1\172\1\uffff\2\154\1\uffff\2\166\2\156\2\172\3\uffff\2\154\2"+
        "\145\3\172\1\uffff\2\172\2\162\2\uffff\2\171\2\164\2\150\2\151\2"+
        "\156\2\147\2\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\6\uffff\1\7\1\10\1\11\7\uffff\1\6\4\uffff"+
        "\1\5\1\2\16\uffff\1\4";
    static final String DFA10_specialS =
        "\53\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\14\1\uffff\2\14\22\uffff\1\14\11\uffff\1\4\1\uffff\1\15"+
            "\1\1\2\uffff\1\12\11\11\7\uffff\1\3\3\13\1\6\11\13\1\10\13\13"+
            "\4\uffff\1\13\1\uffff\1\2\3\13\1\5\11\13\1\7\13\13",
            "",
            "\1\16",
            "\1\17",
            "",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\12\24\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "",
            "",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\12\24\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\1\34",
            "\1\35",
            "",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | All | Star | Everything | On | Number | ID | Space | Comma );";
        }
    }
 

}