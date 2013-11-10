package org.xtext.fofo.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApricotLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int RULE_ANY_OTHER=27;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_DECIMAL_LITERAL=14;
    public static final int RULE_HEX_LITERAL=12;
    public static final int RULE_OCTAL_LITERAL=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int RULE_CHARACTER_LITERAL=10;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_HEX_DIGIT=15;
    public static final int T__85=85;
    public static final int T__141=141;
    public static final int T__84=84;
    public static final int T__142=142;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__140=140;
    public static final int T__89=89;
    public static final int T__145=145;
    public static final int T__88=88;
    public static final int T__146=146;
    public static final int RULE_ML_COMMENT=24;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=23;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_EXPONENT=17;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int RULE_ASYACTIONS=7;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_OCTAL_ESCAPE=21;
    public static final int RULE_ESCAPE_SEQUENCE=19;
    public static final int RULE_AMOUNT_ONE_OR_ZERO=6;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_STRING_LITERAL=11;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int RULE_AMOUNT_GEONE=5;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int RULE_UNICODE_ESCAPE=20;
    public static final int RULE_INT=22;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_CLOCK=8;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=25;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_FLOAT_TYPE_SUFFIX=18;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_INTEGER_TYPE_SUFFIX=16;
    public static final int RULE_FLOATING_POINT_LITERAL=9;
    public static final int RULE_WS=26;

    // delegates
    // delegators

    public InternalApricotLexer() {;} 
    public InternalApricotLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalApricotLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g"; }

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:11:7: ( 'package' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:12:7: ( ';' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:13:7: ( 'import' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:13:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:14:7: ( '.*' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:14:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:15:7: ( '.' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:16:7: ( 'public' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:16:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:17:7: ( 'private' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:17:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:18:7: ( 'Constant' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:18:9: 'Constant'
            {
            match("Constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:19:7: ( 'Native' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:19:9: 'Native'
            {
            match("Native"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:20:7: ( 'void' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:20:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:21:7: ( 'int' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:21:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:22:7: ( 'real' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:22:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:23:7: ( 'boolean' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:23:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:24:7: ( 'String' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:24:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:25:7: ( 'Interval' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:25:9: 'Interval'
            {
            match("Interval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:26:7: ( 'Int' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:26:9: 'Int'
            {
            match("Int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:27:7: ( 'Real' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:27:9: 'Real'
            {
            match("Real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:28:7: ( 'interface' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:28:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:29:7: ( 'extends' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:29:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:30:7: ( '{' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:30:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:31:7: ( '}' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:32:7: ( 'class' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:32:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:33:7: ( 'implements' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:33:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:34:7: ( '=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:34:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:35:7: ( '(' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:35:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:36:7: ( ',' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:37:7: ( ')' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:37:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:38:7: ( 'return' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:38:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:39:7: ( 'Requires' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:39:9: 'Requires'
            {
            match("Requires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:40:7: ( '[' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:40:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:41:7: ( ']' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:41:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:42:7: ( ':' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:42:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:43:7: ( '|' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:43:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:44:7: ( 'Condition' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:44:9: 'Condition'
            {
            match("Condition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:45:7: ( 'Composition' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:45:9: 'Composition'
            {
            match("Composition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:46:7: ( 'Start' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:46:9: 'Start'
            {
            match("Start"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:47:7: ( 'Discrete' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:47:9: 'Discrete'
            {
            match("Discrete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:48:7: ( 'Constraint' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:48:9: 'Constraint'
            {
            match("Constraint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:49:7: ( 'Invariant' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:49:9: 'Invariant'
            {
            match("Invariant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:50:7: ( '+=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:50:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:51:7: ( '-=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:51:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:52:7: ( '*=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:52:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:53:7: ( '/=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:53:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:54:7: ( '&=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:54:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:55:7: ( '|=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:55:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:56:7: ( '^=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:56:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:57:7: ( '%=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:57:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:58:7: ( '?' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:58:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:59:7: ( 'or' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:59:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:60:7: ( 'and' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:60:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:61:7: ( 'xor' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:61:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:62:7: ( '==' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:62:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:63:7: ( '!=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:63:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:64:7: ( 'instanceof' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:64:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:65:7: ( '<' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:65:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:66:7: ( '<=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:66:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:67:7: ( '>' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:67:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:68:7: ( '>=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:68:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:69:7: ( 'in' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:69:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:70:7: ( '||' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:70:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:71:7: ( '~' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:71:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:72:7: ( '+' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:72:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:73:7: ( '-' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:73:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:74:7: ( '*' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:74:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:75:7: ( '/' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:75:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:76:7: ( '%' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:76:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:77:7: ( '++' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:77:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:78:7: ( '--' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:78:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:79:7: ( '!' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:79:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:80:7: ( 'this' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:80:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:81:7: ( 'super' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:81:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:82:7: ( 'at' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:82:9: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:83:8: ( '(!)' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:83:10: '(!)'
            {
            match("(!)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:84:8: ( '(?)' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:84:10: '(?)'
            {
            match("(?)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:85:8: ( 'Inf' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:85:10: 'Inf'
            {
            match("Inf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:86:8: ( 'null' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:86:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:87:8: ( 'true' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:87:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:88:8: ( 'false' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:88:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:89:8: ( 'dot' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:89:10: 'dot'
            {
            match("dot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:90:8: ( 'Equation' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:90:10: 'Equation'
            {
            match("Equation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:91:8: ( 'Continuous' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:91:10: 'Continuous'
            {
            match("Continuous"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:92:8: ( 'sqrt' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:92:10: 'sqrt'
            {
            match("sqrt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:93:8: ( 'sin' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:93:10: 'sin'
            {
            match("sin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:94:8: ( 'cos' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:94:10: 'cos'
            {
            match("cos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:95:8: ( 'tan' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:95:10: 'tan'
            {
            match("tan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:96:8: ( 'cot' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:96:10: 'cot'
            {
            match("cot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:97:8: ( 'sec' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:97:10: 'sec'
            {
            match("sec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:98:8: ( 'csc' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:98:10: 'csc'
            {
            match("csc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:99:8: ( 'round' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:99:10: 'round'
            {
            match("round"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:100:8: ( 'floor' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:100:10: 'floor'
            {
            match("floor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:101:8: ( 'ceil' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:101:10: 'ceil'
            {
            match("ceil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:102:8: ( 'div' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:102:10: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:103:8: ( 'fld' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:103:10: 'fld'
            {
            match("fld"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:104:8: ( 'rem' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:104:10: 'rem'
            {
            match("rem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:105:8: ( 'mod' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:105:10: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:106:8: ( 'gcd' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:106:10: 'gcd'
            {
            match("gcd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:107:8: ( 'lcm' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:107:10: 'lcm'
            {
            match("lcm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:108:8: ( 'abs' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:108:10: 'abs'
            {
            match("abs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:109:8: ( 'sign' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:109:10: 'sign'
            {
            match("sign"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:110:8: ( 'root' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:110:10: 'root'
            {
            match("root"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:111:8: ( 'hypot' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:111:10: 'hypot'
            {
            match("hypot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:112:8: ( 'pow' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:112:10: 'pow'
            {
            match("pow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:113:8: ( 'exp' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:113:10: 'exp'
            {
            match("exp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:114:8: ( 'log' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:114:10: 'log'
            {
            match("log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:115:8: ( 'erf' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:115:10: 'erf'
            {
            match("erf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:116:8: ( 'gamma' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:116:10: 'gamma'
            {
            match("gamma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:117:8: ( 'max' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:117:10: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:118:8: ( 'min' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:118:10: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:119:8: ( 'pause' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:119:10: 'pause'
            {
            match("pause"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:120:8: ( 'size' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:120:10: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:121:8: ( 'if' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:121:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:122:8: ( 'else' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:122:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:123:8: ( 'for' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:123:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:124:8: ( 'break' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:124:10: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:125:8: ( 'continue' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:125:10: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:126:8: ( 'while' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:126:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:127:8: ( 'Init' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:127:10: 'Init'
            {
            match("Init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:128:8: ( 'new' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:128:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:129:8: ( '[]' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:129:10: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "RULE_AMOUNT_GEONE"
    public final void mRULE_AMOUNT_GEONE() throws RecognitionException {
        try {
            int _type = RULE_AMOUNT_GEONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9363:19: ( '1..*' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9363:21: '1..*'
            {
            match("1..*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AMOUNT_GEONE"

    // $ANTLR start "RULE_AMOUNT_ONE_OR_ZERO"
    public final void mRULE_AMOUNT_ONE_OR_ZERO() throws RecognitionException {
        try {
            int _type = RULE_AMOUNT_ONE_OR_ZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9365:25: ( '0..1' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9365:27: '0..1'
            {
            match("0..1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AMOUNT_ONE_OR_ZERO"

    // $ANTLR start "RULE_ASYACTIONS"
    public final void mRULE_ASYACTIONS() throws RecognitionException {
        try {
            int _type = RULE_ASYACTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9367:17: ( '(' '?' '|' '!' ')' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9367:19: '(' '?' '|' '!' ')'
            {
            match('('); 
            match('?'); 
            match('|'); 
            match('!'); 
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASYACTIONS"

    // $ANTLR start "RULE_CLOCK"
    public final void mRULE_CLOCK() throws RecognitionException {
        try {
            int _type = RULE_CLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9369:12: ( 'clock' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9369:14: 'clock'
            {
            match("clock"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOCK"

    // $ANTLR start "RULE_HEX_LITERAL"
    public final void mRULE_HEX_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_HEX_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9371:18: ( '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ ( RULE_INTEGER_TYPE_SUFFIX )? )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9371:20: '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9371:34: ( RULE_HEX_DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9371:34: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9371:50: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='L'||LA2_0=='l') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9371:50: RULE_INTEGER_TYPE_SUFFIX
                    {
                    mRULE_INTEGER_TYPE_SUFFIX(); 

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
    // $ANTLR end "RULE_HEX_LITERAL"

    // $ANTLR start "RULE_DECIMAL_LITERAL"
    public final void mRULE_DECIMAL_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9373:22: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( RULE_INTEGER_TYPE_SUFFIX )? )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9373:24: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9373:24: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9373:25: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9373:29: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9373:38: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9373:39: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9373:51: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='L'||LA5_0=='l') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9373:51: RULE_INTEGER_TYPE_SUFFIX
                    {
                    mRULE_INTEGER_TYPE_SUFFIX(); 

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
    // $ANTLR end "RULE_DECIMAL_LITERAL"

    // $ANTLR start "RULE_OCTAL_LITERAL"
    public final void mRULE_OCTAL_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_OCTAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9375:20: ( '0' ( '0' .. '7' )+ ( RULE_INTEGER_TYPE_SUFFIX )? )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9375:22: '0' ( '0' .. '7' )+ ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            match('0'); 
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9375:26: ( '0' .. '7' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='7')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9375:27: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

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

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9375:38: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='L'||LA7_0=='l') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9375:38: RULE_INTEGER_TYPE_SUFFIX
                    {
                    mRULE_INTEGER_TYPE_SUFFIX(); 

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
    // $ANTLR end "RULE_OCTAL_LITERAL"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9377:25: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9377:27: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_INTEGER_TYPE_SUFFIX"
    public final void mRULE_INTEGER_TYPE_SUFFIX() throws RecognitionException {
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9379:35: ( ( 'l' | 'L' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9379:37: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_TYPE_SUFFIX"

    // $ANTLR start "RULE_FLOATING_POINT_LITERAL"
    public final void mRULE_FLOATING_POINT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_FLOATING_POINT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:29: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:31: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:31: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:32: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:32: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    match('.'); 
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:48: ( '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:49: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:60: ( RULE_EXPONENT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:60: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:75: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='D'||LA11_0=='F'||LA11_0=='d'||LA11_0=='f') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:75: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:99: '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    match('.'); 
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:103: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:104: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:115: ( RULE_EXPONENT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:115: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:130: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='D'||LA14_0=='F'||LA14_0=='d'||LA14_0=='f') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:130: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:154: ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:154: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:155: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    mRULE_EXPONENT(); 
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:180: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='D'||LA16_0=='F'||LA16_0=='d'||LA16_0=='f') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:180: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:204: ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:204: ( '0' .. '9' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9381:205: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    mRULE_FLOAT_TYPE_SUFFIX(); 

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
    // $ANTLR end "RULE_FLOATING_POINT_LITERAL"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9383:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9383:26: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9383:36: ( '+' | '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='+'||LA19_0=='-') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9383:47: ( '0' .. '9' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9383:48: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_FLOAT_TYPE_SUFFIX"
    public final void mRULE_FLOAT_TYPE_SUFFIX() throws RecognitionException {
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9385:33: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9385:35: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_TYPE_SUFFIX"

    // $ANTLR start "RULE_CHARACTER_LITERAL"
    public final void mRULE_CHARACTER_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_CHARACTER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9387:24: ( '\\'' ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) ) '\\'' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9387:26: '\\'' ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) ) '\\''
            {
            match('\''); 
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9387:31: ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\\') ) {
                alt21=1;
            }
            else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9387:32: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9387:53: ~ ( ( '\\'' | '\\\\' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHARACTER_LITERAL"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9389:21: ( '\"' ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9389:23: '\"' ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9389:27: ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\\\' | '\"' ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\\') ) {
                    alt22=1;
                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9389:28: RULE_ESCAPE_SEQUENCE
            	    {
            	    mRULE_ESCAPE_SEQUENCE(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9389:49: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL"

    // $ANTLR start "RULE_ESCAPE_SEQUENCE"
    public final void mRULE_ESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9391:31: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESCAPE | RULE_OCTAL_ESCAPE ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9391:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESCAPE | RULE_OCTAL_ESCAPE )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9391:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESCAPE | RULE_OCTAL_ESCAPE )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt23=1;
                    }
                    break;
                case 'u':
                    {
                    alt23=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt23=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9391:34: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9391:75: RULE_UNICODE_ESCAPE
                    {
                    mRULE_UNICODE_ESCAPE(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9391:95: RULE_OCTAL_ESCAPE
                    {
                    mRULE_OCTAL_ESCAPE(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPE_SEQUENCE"

    // $ANTLR start "RULE_OCTAL_ESCAPE"
    public final void mRULE_OCTAL_ESCAPE() throws RecognitionException {
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9393:28: ( ( '\\\\' '0' .. '3' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9393:30: ( '\\\\' '0' .. '3' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9393:30: ( '\\\\' '0' .. '3' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\\') ) {
                int LA24_1 = input.LA(2);

                if ( ((LA24_1>='0' && LA24_1<='3')) ) {
                    int LA24_2 = input.LA(3);

                    if ( ((LA24_2>='0' && LA24_2<='7')) ) {
                        int LA24_4 = input.LA(4);

                        if ( ((LA24_4>='0' && LA24_4<='7')) ) {
                            alt24=1;
                        }
                        else {
                            alt24=2;}
                    }
                    else {
                        alt24=3;}
                }
                else if ( ((LA24_1>='4' && LA24_1<='7')) ) {
                    int LA24_3 = input.LA(3);

                    if ( ((LA24_3>='0' && LA24_3<='7')) ) {
                        alt24=2;
                    }
                    else {
                        alt24=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9393:31: '\\\\' '0' .. '3' '0' .. '7' '0' .. '7'
                    {
                    match('\\'); 
                    matchRange('0','3'); 
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9393:63: '\\\\' '0' .. '7' '0' .. '7'
                    {
                    match('\\'); 
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9393:86: '\\\\' '0' .. '7'
                    {
                    match('\\'); 
                    matchRange('0','7'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_ESCAPE"

    // $ANTLR start "RULE_UNICODE_ESCAPE"
    public final void mRULE_UNICODE_ESCAPE() throws RecognitionException {
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9395:30: ( '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9395:32: '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_ESCAPE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9397:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9397:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9397:11: ( '^' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='^') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9397:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9397:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:
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
            	    break loop26;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9399:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9399:12: ( '0' .. '9' )+
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9399:12: ( '0' .. '9' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9399:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9401:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9401:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9401:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\"') ) {
                alt30=1;
            }
            else if ( (LA30_0=='\'') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9401:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9401:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='\\') ) {
                            alt28=1;
                        }
                        else if ( ((LA28_0>='\u0000' && LA28_0<='!')||(LA28_0>='#' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\uFFFF')) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9401:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9401:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9401:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9401:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop29:
                    do {
                        int alt29=3;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='\\') ) {
                            alt29=1;
                        }
                        else if ( ((LA29_0>='\u0000' && LA29_0<='&')||(LA29_0>='(' && LA29_0<='[')||(LA29_0>=']' && LA29_0<='\uFFFF')) ) {
                            alt29=2;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9401:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9401:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9403:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9403:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9403:24: ( options {greedy=false; } : . )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='*') ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1=='/') ) {
                        alt31=2;
                    }
                    else if ( ((LA31_1>='\u0000' && LA31_1<='.')||(LA31_1>='0' && LA31_1<='\uFFFF')) ) {
                        alt31=1;
                    }


                }
                else if ( ((LA31_0>='\u0000' && LA31_0<=')')||(LA31_0>='+' && LA31_0<='\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9403:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9405:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9405:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9405:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9405:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9405:40: ( ( '\\r' )? '\\n' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\n'||LA34_0=='\r') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9405:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9405:41: ( '\\r' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='\r') ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9405:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9407:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9407:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9407:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='\t' && LA35_0<='\n')||LA35_0=='\r'||LA35_0==' ') ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9409:16: ( . )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:9409:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:8: ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | RULE_AMOUNT_GEONE | RULE_AMOUNT_ONE_OR_ZERO | RULE_ASYACTIONS | RULE_CLOCK | RULE_HEX_LITERAL | RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_FLOATING_POINT_LITERAL | RULE_CHARACTER_LITERAL | RULE_STRING_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt36=136;
        alt36 = dfa36.predict(input);
        switch (alt36) {
            case 1 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:10: T__28
                {
                mT__28(); 

                }
                break;
            case 2 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:16: T__29
                {
                mT__29(); 

                }
                break;
            case 3 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:22: T__30
                {
                mT__30(); 

                }
                break;
            case 4 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:28: T__31
                {
                mT__31(); 

                }
                break;
            case 5 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:34: T__32
                {
                mT__32(); 

                }
                break;
            case 6 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:40: T__33
                {
                mT__33(); 

                }
                break;
            case 7 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:46: T__34
                {
                mT__34(); 

                }
                break;
            case 8 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:52: T__35
                {
                mT__35(); 

                }
                break;
            case 9 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:58: T__36
                {
                mT__36(); 

                }
                break;
            case 10 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:64: T__37
                {
                mT__37(); 

                }
                break;
            case 11 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:70: T__38
                {
                mT__38(); 

                }
                break;
            case 12 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:76: T__39
                {
                mT__39(); 

                }
                break;
            case 13 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:82: T__40
                {
                mT__40(); 

                }
                break;
            case 14 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:88: T__41
                {
                mT__41(); 

                }
                break;
            case 15 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:94: T__42
                {
                mT__42(); 

                }
                break;
            case 16 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:100: T__43
                {
                mT__43(); 

                }
                break;
            case 17 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:106: T__44
                {
                mT__44(); 

                }
                break;
            case 18 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:112: T__45
                {
                mT__45(); 

                }
                break;
            case 19 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:118: T__46
                {
                mT__46(); 

                }
                break;
            case 20 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:124: T__47
                {
                mT__47(); 

                }
                break;
            case 21 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:130: T__48
                {
                mT__48(); 

                }
                break;
            case 22 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:136: T__49
                {
                mT__49(); 

                }
                break;
            case 23 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:142: T__50
                {
                mT__50(); 

                }
                break;
            case 24 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:148: T__51
                {
                mT__51(); 

                }
                break;
            case 25 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:154: T__52
                {
                mT__52(); 

                }
                break;
            case 26 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:160: T__53
                {
                mT__53(); 

                }
                break;
            case 27 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:166: T__54
                {
                mT__54(); 

                }
                break;
            case 28 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:172: T__55
                {
                mT__55(); 

                }
                break;
            case 29 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:178: T__56
                {
                mT__56(); 

                }
                break;
            case 30 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:184: T__57
                {
                mT__57(); 

                }
                break;
            case 31 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:190: T__58
                {
                mT__58(); 

                }
                break;
            case 32 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:196: T__59
                {
                mT__59(); 

                }
                break;
            case 33 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:202: T__60
                {
                mT__60(); 

                }
                break;
            case 34 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:208: T__61
                {
                mT__61(); 

                }
                break;
            case 35 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:214: T__62
                {
                mT__62(); 

                }
                break;
            case 36 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:220: T__63
                {
                mT__63(); 

                }
                break;
            case 37 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:226: T__64
                {
                mT__64(); 

                }
                break;
            case 38 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:232: T__65
                {
                mT__65(); 

                }
                break;
            case 39 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:238: T__66
                {
                mT__66(); 

                }
                break;
            case 40 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:244: T__67
                {
                mT__67(); 

                }
                break;
            case 41 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:250: T__68
                {
                mT__68(); 

                }
                break;
            case 42 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:256: T__69
                {
                mT__69(); 

                }
                break;
            case 43 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:262: T__70
                {
                mT__70(); 

                }
                break;
            case 44 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:268: T__71
                {
                mT__71(); 

                }
                break;
            case 45 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:274: T__72
                {
                mT__72(); 

                }
                break;
            case 46 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:280: T__73
                {
                mT__73(); 

                }
                break;
            case 47 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:286: T__74
                {
                mT__74(); 

                }
                break;
            case 48 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:292: T__75
                {
                mT__75(); 

                }
                break;
            case 49 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:298: T__76
                {
                mT__76(); 

                }
                break;
            case 50 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:304: T__77
                {
                mT__77(); 

                }
                break;
            case 51 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:310: T__78
                {
                mT__78(); 

                }
                break;
            case 52 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:316: T__79
                {
                mT__79(); 

                }
                break;
            case 53 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:322: T__80
                {
                mT__80(); 

                }
                break;
            case 54 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:328: T__81
                {
                mT__81(); 

                }
                break;
            case 55 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:334: T__82
                {
                mT__82(); 

                }
                break;
            case 56 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:340: T__83
                {
                mT__83(); 

                }
                break;
            case 57 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:346: T__84
                {
                mT__84(); 

                }
                break;
            case 58 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:352: T__85
                {
                mT__85(); 

                }
                break;
            case 59 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:358: T__86
                {
                mT__86(); 

                }
                break;
            case 60 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:364: T__87
                {
                mT__87(); 

                }
                break;
            case 61 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:370: T__88
                {
                mT__88(); 

                }
                break;
            case 62 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:376: T__89
                {
                mT__89(); 

                }
                break;
            case 63 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:382: T__90
                {
                mT__90(); 

                }
                break;
            case 64 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:388: T__91
                {
                mT__91(); 

                }
                break;
            case 65 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:394: T__92
                {
                mT__92(); 

                }
                break;
            case 66 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:400: T__93
                {
                mT__93(); 

                }
                break;
            case 67 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:406: T__94
                {
                mT__94(); 

                }
                break;
            case 68 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:412: T__95
                {
                mT__95(); 

                }
                break;
            case 69 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:418: T__96
                {
                mT__96(); 

                }
                break;
            case 70 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:424: T__97
                {
                mT__97(); 

                }
                break;
            case 71 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:430: T__98
                {
                mT__98(); 

                }
                break;
            case 72 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:436: T__99
                {
                mT__99(); 

                }
                break;
            case 73 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:442: T__100
                {
                mT__100(); 

                }
                break;
            case 74 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:449: T__101
                {
                mT__101(); 

                }
                break;
            case 75 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:456: T__102
                {
                mT__102(); 

                }
                break;
            case 76 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:463: T__103
                {
                mT__103(); 

                }
                break;
            case 77 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:470: T__104
                {
                mT__104(); 

                }
                break;
            case 78 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:477: T__105
                {
                mT__105(); 

                }
                break;
            case 79 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:484: T__106
                {
                mT__106(); 

                }
                break;
            case 80 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:491: T__107
                {
                mT__107(); 

                }
                break;
            case 81 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:498: T__108
                {
                mT__108(); 

                }
                break;
            case 82 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:505: T__109
                {
                mT__109(); 

                }
                break;
            case 83 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:512: T__110
                {
                mT__110(); 

                }
                break;
            case 84 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:519: T__111
                {
                mT__111(); 

                }
                break;
            case 85 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:526: T__112
                {
                mT__112(); 

                }
                break;
            case 86 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:533: T__113
                {
                mT__113(); 

                }
                break;
            case 87 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:540: T__114
                {
                mT__114(); 

                }
                break;
            case 88 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:547: T__115
                {
                mT__115(); 

                }
                break;
            case 89 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:554: T__116
                {
                mT__116(); 

                }
                break;
            case 90 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:561: T__117
                {
                mT__117(); 

                }
                break;
            case 91 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:568: T__118
                {
                mT__118(); 

                }
                break;
            case 92 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:575: T__119
                {
                mT__119(); 

                }
                break;
            case 93 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:582: T__120
                {
                mT__120(); 

                }
                break;
            case 94 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:589: T__121
                {
                mT__121(); 

                }
                break;
            case 95 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:596: T__122
                {
                mT__122(); 

                }
                break;
            case 96 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:603: T__123
                {
                mT__123(); 

                }
                break;
            case 97 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:610: T__124
                {
                mT__124(); 

                }
                break;
            case 98 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:617: T__125
                {
                mT__125(); 

                }
                break;
            case 99 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:624: T__126
                {
                mT__126(); 

                }
                break;
            case 100 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:631: T__127
                {
                mT__127(); 

                }
                break;
            case 101 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:638: T__128
                {
                mT__128(); 

                }
                break;
            case 102 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:645: T__129
                {
                mT__129(); 

                }
                break;
            case 103 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:652: T__130
                {
                mT__130(); 

                }
                break;
            case 104 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:659: T__131
                {
                mT__131(); 

                }
                break;
            case 105 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:666: T__132
                {
                mT__132(); 

                }
                break;
            case 106 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:673: T__133
                {
                mT__133(); 

                }
                break;
            case 107 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:680: T__134
                {
                mT__134(); 

                }
                break;
            case 108 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:687: T__135
                {
                mT__135(); 

                }
                break;
            case 109 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:694: T__136
                {
                mT__136(); 

                }
                break;
            case 110 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:701: T__137
                {
                mT__137(); 

                }
                break;
            case 111 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:708: T__138
                {
                mT__138(); 

                }
                break;
            case 112 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:715: T__139
                {
                mT__139(); 

                }
                break;
            case 113 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:722: T__140
                {
                mT__140(); 

                }
                break;
            case 114 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:729: T__141
                {
                mT__141(); 

                }
                break;
            case 115 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:736: T__142
                {
                mT__142(); 

                }
                break;
            case 116 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:743: T__143
                {
                mT__143(); 

                }
                break;
            case 117 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:750: T__144
                {
                mT__144(); 

                }
                break;
            case 118 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:757: T__145
                {
                mT__145(); 

                }
                break;
            case 119 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:764: T__146
                {
                mT__146(); 

                }
                break;
            case 120 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:771: RULE_AMOUNT_GEONE
                {
                mRULE_AMOUNT_GEONE(); 

                }
                break;
            case 121 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:789: RULE_AMOUNT_ONE_OR_ZERO
                {
                mRULE_AMOUNT_ONE_OR_ZERO(); 

                }
                break;
            case 122 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:813: RULE_ASYACTIONS
                {
                mRULE_ASYACTIONS(); 

                }
                break;
            case 123 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:829: RULE_CLOCK
                {
                mRULE_CLOCK(); 

                }
                break;
            case 124 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:840: RULE_HEX_LITERAL
                {
                mRULE_HEX_LITERAL(); 

                }
                break;
            case 125 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:857: RULE_DECIMAL_LITERAL
                {
                mRULE_DECIMAL_LITERAL(); 

                }
                break;
            case 126 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:878: RULE_OCTAL_LITERAL
                {
                mRULE_OCTAL_LITERAL(); 

                }
                break;
            case 127 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:897: RULE_FLOATING_POINT_LITERAL
                {
                mRULE_FLOATING_POINT_LITERAL(); 

                }
                break;
            case 128 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:925: RULE_CHARACTER_LITERAL
                {
                mRULE_CHARACTER_LITERAL(); 

                }
                break;
            case 129 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:948: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 130 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:968: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 131 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:976: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 132 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:985: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 133 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:997: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 134 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:1013: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 135 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:1029: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 136 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:1037: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA18_eotS =
        "\6\uffff";
    static final String DFA18_eofS =
        "\6\uffff";
    static final String DFA18_minS =
        "\2\56\4\uffff";
    static final String DFA18_maxS =
        "\1\71\1\146\4\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\1\1\4\1\3";
    static final String DFA18_specialS =
        "\6\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\12\uffff\1\4\1\5\1\4\35\uffff\1\4\1\5\1"+
            "\4",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "9381:31: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX )";
        }
    }
    static final String DFA36_eotS =
        "\1\uffff\1\100\1\uffff\1\100\1\107\11\100\2\uffff\1\100\1\134\1"+
        "\137\2\uffff\1\143\2\uffff\1\150\1\100\1\154\1\157\1\161\1\165\2"+
        "\73\1\171\1\uffff\3\100\1\u0081\1\u0083\1\u0085\1\uffff\13\100\3"+
        "\u00a1\2\73\3\uffff\4\100\2\uffff\1\100\1\u00b5\1\u00b6\3\uffff"+
        "\15\100\2\uffff\4\100\16\uffff\1\100\21\uffff\1\u00d8\1\100\1\u00da"+
        "\2\100\7\uffff\30\100\1\106\1\u00a1\1\uffff\1\106\1\uffff\1\u00fa"+
        "\1\u00fb\7\uffff\4\100\1\u0107\1\100\1\u010b\1\100\2\uffff\6\100"+
        "\1\u0115\6\100\1\u011d\1\100\1\u011f\4\100\1\u0124\1\u0125\3\100"+
        "\1\u0129\1\u012a\1\100\1\u012c\1\100\2\uffff\1\100\1\uffff\1\u012f"+
        "\1\uffff\1\u0130\1\u0131\2\100\1\u0134\2\100\1\u0137\2\100\1\u013a"+
        "\1\100\1\u013c\2\100\1\u013f\1\u0140\1\u0141\1\u0142\1\100\1\u0144"+
        "\1\u0145\1\u0146\1\u0147\1\100\1\u0149\1\u014a\2\100\13\uffff\4"+
        "\100\1\uffff\3\100\1\uffff\6\100\1\u015c\1\u015d\1\100\1\uffff\1"+
        "\100\1\u0160\5\100\1\uffff\1\100\1\uffff\1\u0167\1\u0168\2\100\2"+
        "\uffff\1\u016b\2\100\2\uffff\1\100\1\uffff\1\u016f\1\100\3\uffff"+
        "\1\u0171\1\u0172\1\uffff\1\100\1\u0174\1\uffff\1\u0175\1\u0176\1"+
        "\uffff\1\u0177\1\uffff\2\100\4\uffff\1\100\4\uffff\1\100\2\uffff"+
        "\2\100\2\uffff\1\100\1\u0181\13\100\2\uffff\1\100\1\u018f\1\uffff"+
        "\1\100\1\u0191\1\100\1\u0193\2\100\2\uffff\2\100\1\uffff\1\u0198"+
        "\1\u0199\1\100\1\uffff\1\100\2\uffff\1\u019c\4\uffff\1\u019d\1\u019e"+
        "\1\100\1\u01a0\1\u01a1\1\u01a2\2\uffff\1\100\1\uffff\1\u01a6\1\100"+
        "\1\u01a8\10\100\1\u01b1\1\u01b2\1\uffff\1\100\1\uffff\1\u01b4\1"+
        "\uffff\4\100\2\uffff\2\100\3\uffff\1\100\5\uffff\1\u01be\1\uffff"+
        "\1\u01bf\1\uffff\10\100\2\uffff\1\u01c8\1\uffff\3\100\1\u01cc\3"+
        "\100\4\uffff\3\100\1\u01d3\4\100\1\uffff\1\u01d8\1\100\1\u01da\1"+
        "\uffff\1\u01db\1\u01dc\1\u01dd\1\100\1\u01df\1\100\1\uffff\1\100"+
        "\1\u01e2\2\100\1\uffff\1\u01e5\4\uffff\1\u01e6\1\uffff\1\u01e7\1"+
        "\u01e8\1\uffff\1\u01e9\1\100\5\uffff\1\u01eb\1\uffff";
    static final String DFA36_eofS =
        "\u01ec\uffff";
    static final String DFA36_minS =
        "\1\0\1\141\1\uffff\1\146\1\52\1\157\1\141\1\157\1\145\1\157\1\164"+
        "\1\156\1\145\1\154\2\uffff\1\145\1\75\1\41\2\uffff\1\135\2\uffff"+
        "\1\75\1\151\1\53\1\55\1\75\1\52\3\75\1\uffff\1\162\1\142\1\157\3"+
        "\75\1\uffff\1\141\2\145\1\141\1\151\1\161\2\141\1\143\1\171\1\150"+
        "\3\56\2\0\3\uffff\1\143\1\142\1\151\1\167\2\uffff\1\160\2\60\3\uffff"+
        "\1\155\1\164\1\151\1\141\2\157\1\145\1\141\1\146\1\141\1\160\1\146"+
        "\1\163\2\uffff\1\141\1\156\1\143\1\151\3\uffff\1\51\12\uffff\1\163"+
        "\21\uffff\1\60\1\144\1\60\1\163\1\162\7\uffff\1\151\1\165\1\156"+
        "\1\160\1\162\1\147\1\143\1\154\1\167\1\154\1\144\1\162\1\164\1\166"+
        "\1\165\1\144\1\170\1\156\1\144\2\155\1\147\1\160\1\151\2\56\1\uffff"+
        "\1\56\1\uffff\2\56\1\42\1\0\1\uffff\1\42\1\0\2\uffff\1\153\1\163"+
        "\1\154\1\166\1\60\1\154\1\60\1\164\2\uffff\1\144\1\160\1\151\1\144"+
        "\1\154\1\165\1\60\1\156\1\164\1\154\1\141\1\151\1\162\1\60\1\141"+
        "\1\60\1\164\1\154\1\165\1\145\2\60\1\145\1\163\1\143\2\60\1\164"+
        "\1\60\1\154\2\uffff\1\143\1\uffff\1\60\1\uffff\2\60\1\163\1\145"+
        "\1\60\1\145\1\164\1\60\1\156\1\145\1\60\1\154\1\60\1\163\1\157\4"+
        "\60\1\141\4\60\1\155\2\60\1\157\1\154\4\uffff\2\0\2\uffff\2\0\1"+
        "\uffff\1\141\1\145\1\151\1\141\1\uffff\1\162\1\145\1\162\1\uffff"+
        "\1\141\1\164\2\151\1\157\1\166\2\60\1\162\1\uffff\1\144\1\60\1\145"+
        "\1\153\1\156\1\164\1\162\1\uffff\1\162\1\uffff\2\60\1\151\1\156"+
        "\2\uffff\1\60\1\163\1\153\2\uffff\1\151\1\uffff\1\60\1\162\3\uffff"+
        "\2\60\1\uffff\1\162\1\60\1\uffff\2\60\1\uffff\1\60\1\uffff\1\145"+
        "\1\162\4\uffff\1\164\4\uffff\1\141\2\uffff\1\164\1\145\2\0\1\147"+
        "\1\60\1\143\2\164\1\155\1\146\1\156\1\141\1\164\1\156\1\163\1\145"+
        "\2\uffff\1\156\1\60\1\uffff\1\141\1\60\1\147\1\60\1\166\1\151\2"+
        "\uffff\1\162\1\144\1\uffff\2\60\1\156\1\uffff\1\145\2\uffff\1\60"+
        "\4\uffff\2\60\1\151\3\60\2\0\1\145\1\uffff\1\60\1\145\1\60\1\145"+
        "\1\141\1\143\1\156\1\141\1\151\1\165\1\151\2\60\1\uffff\1\156\1"+
        "\uffff\1\60\1\uffff\2\141\1\145\1\163\2\uffff\1\165\1\164\3\uffff"+
        "\1\157\3\uffff\2\0\1\60\1\uffff\1\60\1\uffff\1\156\1\143\1\145\1"+
        "\164\1\151\2\157\1\164\2\uffff\1\60\1\uffff\1\154\1\156\1\163\1"+
        "\60\2\145\1\156\2\0\2\uffff\1\164\1\145\1\157\1\60\2\156\1\165\1"+
        "\151\1\uffff\1\60\1\164\1\60\1\uffff\3\60\1\163\1\60\1\146\1\uffff"+
        "\1\164\1\60\1\163\1\157\1\uffff\1\60\4\uffff\1\60\1\uffff\2\60\1"+
        "\uffff\1\60\1\156\5\uffff\1\60\1\uffff";
    static final String DFA36_maxS =
        "\1\uffff\1\165\1\uffff\1\156\1\71\1\157\1\141\2\157\1\162\1\164"+
        "\1\156\1\145\1\170\2\uffff\1\163\1\75\1\77\2\uffff\1\135\2\uffff"+
        "\1\174\1\151\5\75\1\172\1\75\1\uffff\1\162\1\164\1\157\3\75\1\uffff"+
        "\1\162\2\165\2\157\1\161\1\157\1\143\1\157\1\171\1\150\1\146\1\170"+
        "\1\146\2\uffff\3\uffff\1\165\1\142\1\151\1\167\2\uffff\1\160\2\172"+
        "\3\uffff\1\156\1\164\1\151\1\164\1\165\1\157\1\145\1\162\1\166\1"+
        "\161\1\164\1\146\1\163\2\uffff\1\157\1\164\1\143\1\151\3\uffff\1"+
        "\174\12\uffff\1\163\21\uffff\1\172\1\144\1\172\1\163\1\162\7\uffff"+
        "\1\151\1\165\1\156\1\160\1\162\1\172\1\143\1\154\1\167\1\154\1\157"+
        "\1\162\1\164\1\166\1\165\1\144\1\170\1\156\1\144\2\155\1\147\1\160"+
        "\1\151\1\56\1\146\1\uffff\1\56\1\uffff\2\146\1\165\1\uffff\1\uffff"+
        "\1\165\1\uffff\2\uffff\1\153\1\163\1\154\1\166\1\172\1\157\1\172"+
        "\1\164\2\uffff\1\164\1\160\1\151\1\144\1\154\1\165\1\172\1\156\1"+
        "\164\1\154\1\141\1\151\1\162\1\172\1\141\1\172\1\164\1\154\1\165"+
        "\1\145\2\172\1\145\1\163\1\143\2\172\1\164\1\172\1\154\2\uffff\1"+
        "\143\1\uffff\1\172\1\uffff\2\172\1\163\1\145\1\172\1\145\1\164\1"+
        "\172\1\156\1\145\1\172\1\154\1\172\1\163\1\157\4\172\1\141\4\172"+
        "\1\155\2\172\1\157\1\154\4\uffff\2\uffff\2\uffff\2\uffff\1\uffff"+
        "\1\141\1\145\1\151\1\141\1\uffff\1\162\1\145\1\162\1\uffff\1\141"+
        "\1\164\2\151\1\157\1\166\2\172\1\162\1\uffff\1\144\1\172\1\145\1"+
        "\153\1\156\1\164\1\162\1\uffff\1\162\1\uffff\2\172\1\151\1\156\2"+
        "\uffff\1\172\1\163\1\153\2\uffff\1\151\1\uffff\1\172\1\162\3\uffff"+
        "\2\172\1\uffff\1\162\1\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1"+
        "\145\1\162\4\uffff\1\164\4\uffff\1\141\2\uffff\1\164\1\145\2\uffff"+
        "\1\147\1\172\1\143\2\164\1\155\1\146\1\156\1\162\1\164\1\156\1\163"+
        "\1\145\2\uffff\1\156\1\172\1\uffff\1\141\1\172\1\147\1\172\1\166"+
        "\1\151\2\uffff\1\162\1\144\1\uffff\2\172\1\156\1\uffff\1\145\2\uffff"+
        "\1\172\4\uffff\2\172\1\151\3\172\2\uffff\1\145\1\uffff\1\172\1\145"+
        "\1\172\1\145\1\141\1\143\1\156\1\141\1\151\1\165\1\151\2\172\1\uffff"+
        "\1\156\1\uffff\1\172\1\uffff\2\141\1\145\1\163\2\uffff\1\165\1\164"+
        "\3\uffff\1\157\3\uffff\2\uffff\1\172\1\uffff\1\172\1\uffff\1\156"+
        "\1\143\1\145\1\164\1\151\2\157\1\164\2\uffff\1\172\1\uffff\1\154"+
        "\1\156\1\163\1\172\2\145\1\156\2\uffff\2\uffff\1\164\1\145\1\157"+
        "\1\172\2\156\1\165\1\151\1\uffff\1\172\1\164\1\172\1\uffff\3\172"+
        "\1\163\1\172\1\146\1\uffff\1\164\1\172\1\163\1\157\1\uffff\1\172"+
        "\4\uffff\1\172\1\uffff\2\172\1\uffff\1\172\1\156\5\uffff\1\172\1"+
        "\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\13\uffff\1\24\1\25\3\uffff\1\32\1\33\1\uffff\1\37"+
        "\1\40\11\uffff\1\60\6\uffff\1\75\20\uffff\1\u0082\1\u0087\1\u0088"+
        "\4\uffff\1\u0082\1\2\3\uffff\1\4\1\177\1\5\15\uffff\1\24\1\25\4"+
        "\uffff\1\64\1\30\1\111\1\uffff\1\31\1\32\1\33\1\167\1\36\1\37\1"+
        "\40\1\55\1\74\1\41\1\uffff\1\50\1\103\1\76\1\51\1\104\1\77\1\52"+
        "\1\100\1\53\1\u0085\1\u0086\1\101\1\54\1\56\1\57\1\102\1\60\5\uffff"+
        "\1\65\1\105\1\70\1\67\1\72\1\71\1\75\32\uffff\1\175\1\uffff\1\174"+
        "\4\uffff\1\u0084\2\uffff\1\u0081\1\u0087\10\uffff\1\73\1\157\36"+
        "\uffff\1\112\1\172\1\uffff\1\61\1\uffff\1\110\35\uffff\1\170\1\171"+
        "\1\176\1\u0083\2\uffff\2\u0080\2\uffff\1\u0081\4\uffff\1\146\3\uffff"+
        "\1\13\11\uffff\1\136\7\uffff\1\20\1\uffff\1\113\4\uffff\1\147\1"+
        "\151\3\uffff\1\124\1\126\1\uffff\1\130\2\uffff\1\62\1\142\1\63\2"+
        "\uffff\1\125\2\uffff\1\123\2\uffff\1\127\1\uffff\1\166\2\uffff\1"+
        "\135\1\161\1\117\1\134\1\uffff\1\137\1\153\1\154\1\140\1\uffff\1"+
        "\141\1\150\21\uffff\1\12\1\14\2\uffff\1\144\6\uffff\1\165\1\21\2"+
        "\uffff\1\160\3\uffff\1\133\1\uffff\1\106\1\115\1\uffff\1\122\1\143"+
        "\1\156\1\114\11\uffff\1\155\15\uffff\1\131\1\uffff\1\162\1\uffff"+
        "\1\44\4\uffff\1\26\1\173\2\uffff\1\107\1\116\1\132\1\uffff\1\152"+
        "\1\145\1\164\3\uffff\1\6\1\uffff\1\3\10\uffff\1\11\1\34\1\uffff"+
        "\1\16\11\uffff\1\1\1\7\10\uffff\1\15\3\uffff\1\23\6\uffff\1\10\4"+
        "\uffff\1\17\1\uffff\1\35\1\163\1\45\1\120\1\uffff\1\22\2\uffff\1"+
        "\42\2\uffff\1\47\1\27\1\66\1\46\1\121\1\uffff\1\43";
    static final String DFA36_specialS =
        "\1\10\66\uffff\1\20\1\7\156\uffff\1\14\2\uffff\1\13\121\uffff\1"+
        "\0\1\6\2\uffff\1\1\1\12\113\uffff\1\17\1\4\57\uffff\1\15\1\3\43"+
        "\uffff\1\16\1\2\27\uffff\1\5\1\11\56\uffff}>";
    static final String[] DFA36_transitionS = {
            "\11\73\2\72\2\73\1\72\22\73\1\72\1\45\1\70\2\73\1\40\1\36\1"+
            "\67\1\22\1\24\1\34\1\32\1\23\1\33\1\4\1\35\1\65\1\64\10\66\1"+
            "\27\1\2\1\46\1\21\1\47\1\41\1\73\2\71\1\5\1\31\1\56\3\71\1\13"+
            "\4\71\1\6\3\71\1\14\1\12\7\71\1\25\1\73\1\26\1\37\1\71\1\73"+
            "\1\43\1\11\1\20\1\55\1\15\1\54\1\60\1\62\1\3\2\71\1\61\1\57"+
            "\1\53\1\42\1\1\1\71\1\10\1\52\1\51\1\71\1\7\1\63\1\44\2\71\1"+
            "\16\1\30\1\17\1\50\uff81\73",
            "\1\74\15\uffff\1\77\2\uffff\1\76\2\uffff\1\75",
            "",
            "\1\104\6\uffff\1\102\1\103",
            "\1\105\5\uffff\12\106",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113\11\uffff\1\114",
            "\1\115\2\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\124\5\uffff\1\123\5\uffff\1\122",
            "",
            "",
            "\1\132\6\uffff\1\127\2\uffff\1\130\3\uffff\1\131",
            "\1\133",
            "\1\135\35\uffff\1\136",
            "",
            "",
            "\1\142",
            "",
            "",
            "\1\146\76\uffff\1\147",
            "\1\151",
            "\1\153\21\uffff\1\152",
            "\1\156\17\uffff\1\155",
            "\1\160",
            "\1\163\4\uffff\1\164\15\uffff\1\162",
            "\1\166",
            "\1\167\3\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\170",
            "",
            "\1\173",
            "\1\176\13\uffff\1\174\5\uffff\1\175",
            "\1\177",
            "\1\u0080",
            "\1\u0082",
            "\1\u0084",
            "",
            "\1\u0089\6\uffff\1\u0087\11\uffff\1\u0088",
            "\1\u008d\3\uffff\1\u008c\7\uffff\1\u008b\3\uffff\1\u008a",
            "\1\u008f\17\uffff\1\u008e",
            "\1\u0090\12\uffff\1\u0091\2\uffff\1\u0092",
            "\1\u0094\5\uffff\1\u0093",
            "\1\u0095",
            "\1\u0097\7\uffff\1\u0098\5\uffff\1\u0096",
            "\1\u009a\1\uffff\1\u0099",
            "\1\u009b\13\uffff\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f\1\uffff\12\u00a0\12\uffff\3\106\35\uffff\3\106",
            "\1\u00a2\1\uffff\10\u00a4\2\u00a5\12\uffff\3\106\21\uffff"+
            "\1\u00a3\13\uffff\3\106\21\uffff\1\u00a3",
            "\1\106\1\uffff\12\u00a0\12\uffff\3\106\35\uffff\3\106",
            "\47\u00a7\1\u00a8\64\u00a7\1\u00a6\uffa3\u00a7",
            "\42\u00aa\1\u00ab\71\u00aa\1\u00a9\uffa3\u00aa",
            "",
            "",
            "",
            "\1\u00ad\21\uffff\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "",
            "\1\u00b2",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\22\100\1\u00b4"+
            "\1\u00b3\6\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "",
            "\1\u00b8\1\u00b7",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb\13\uffff\1\u00bd\6\uffff\1\u00bc",
            "\1\u00bf\5\uffff\1\u00be",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c3\20\uffff\1\u00c2",
            "\1\u00c6\2\uffff\1\u00c7\12\uffff\1\u00c4\1\uffff\1\u00c5",
            "\1\u00c8\17\uffff\1\u00c9",
            "\1\u00cb\3\uffff\1\u00ca",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "",
            "\1\u00ce\15\uffff\1\u00cf",
            "\1\u00d2\4\uffff\1\u00d0\1\u00d1",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "",
            "",
            "\1\u00d5\122\uffff\1\u00d6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00d9",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00db",
            "\1\u00dc",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e3\6\uffff\1\u00e2\13\uffff\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00ea\12\uffff\1\u00e9",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\106\1\uffff\12\u00a0\12\uffff\3\106\35\uffff\3\106",
            "",
            "\1\u00f9",
            "",
            "\1\106\1\uffff\10\u00a4\2\u00a5\12\uffff\3\106\35\uffff\3"+
            "\106",
            "\1\106\1\uffff\12\u00a5\12\uffff\3\106\35\uffff\3\106",
            "\1\u00fc\4\uffff\1\u00fc\10\uffff\10\u00fe\44\uffff\1\u00fc"+
            "\5\uffff\1\u00fc\3\uffff\1\u00fc\7\uffff\1\u00fc\3\uffff\1\u00fc"+
            "\1\uffff\1\u00fc\1\u00fd",
            "\47\u00a8\1\u00ff\uffd8\u00a8",
            "",
            "\1\u0100\4\uffff\1\u0100\10\uffff\10\u0102\44\uffff\1\u0100"+
            "\5\uffff\1\u0100\3\uffff\1\u0100\7\uffff\1\u0100\3\uffff\1\u0100"+
            "\1\uffff\1\u0100\1\u0101",
            "\42\u00aa\1\u00ab\71\u00aa\1\u00a9\uffa3\u00aa",
            "",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0109\2\uffff\1\u0108",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\4\100\1\u010a"+
            "\25\100",
            "\1\u010c",
            "",
            "",
            "\1\u010e\16\uffff\1\u010d\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\4\100\1\u011c"+
            "\25\100",
            "\1\u011e",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u012b",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u012d",
            "",
            "",
            "\1\u012e",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0132",
            "\1\u0133",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0135",
            "\1\u0136",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0138",
            "\1\u0139",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u013b",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u013d",
            "\1\u013e",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0143",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0148",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u014b",
            "\1\u014c",
            "",
            "",
            "",
            "",
            "\47\u00a8\1\u00ff\uffd8\u00a8",
            "\60\u00a8\12\u014d\7\u00a8\6\u014d\32\u00a8\6\u014d\uff99"+
            "\u00a8",
            "",
            "",
            "\42\u00aa\1\u00ab\71\u00aa\1\u00a9\uffa3\u00aa",
            "\60\u00a8\12\u014e\7\u00a8\6\u014e\32\u00a8\6\u014e\uff99"+
            "\u00a8",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u015e",
            "",
            "\1\u015f",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "",
            "\1\u0166",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0169",
            "\1\u016a",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u016c",
            "\1\u016d",
            "",
            "",
            "\1\u016e",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0170",
            "",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u0173",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u0178",
            "\1\u0179",
            "",
            "",
            "",
            "",
            "\1\u017a",
            "",
            "",
            "",
            "",
            "\1\u017b",
            "",
            "",
            "\1\u017c",
            "\1\u017d",
            "\60\u00a8\12\u017e\7\u00a8\6\u017e\32\u00a8\6\u017e\uff99"+
            "\u00a8",
            "\60\u00a8\12\u017f\7\u00a8\6\u017f\32\u00a8\6\u017f\uff99"+
            "\u00a8",
            "\1\u0180",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188\20\uffff\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "",
            "",
            "\1\u018e",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u0190",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0192",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0194",
            "\1\u0195",
            "",
            "",
            "\1\u0196",
            "\1\u0197",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u019a",
            "",
            "\1\u019b",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u019f",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\60\u00a8\12\u01a3\7\u00a8\6\u01a3\32\u00a8\6\u01a3\uff99"+
            "\u00a8",
            "\60\u00a8\12\u01a4\7\u00a8\6\u01a4\32\u00a8\6\u01a4\uff99"+
            "\u00a8",
            "\1\u01a5",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u01a7",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u01b3",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "",
            "\1\u01b9",
            "\1\u01ba",
            "",
            "",
            "",
            "\1\u01bb",
            "",
            "",
            "",
            "\60\u00a8\12\u01bc\7\u00a8\6\u01bc\32\u00a8\6\u01bc\uff99"+
            "\u00a8",
            "\60\u00a8\12\u01bd\7\u00a8\6\u01bd\32\u00a8\6\u01bd\uff99"+
            "\u00a8",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\47\u00a8\1\u00ff\uffd8\u00a8",
            "\42\u00aa\1\u00ab\71\u00aa\1\u00a9\uffa3\u00aa",
            "",
            "",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u01d9",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u01de",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u01e0",
            "",
            "\1\u01e1",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u01e3",
            "\1\u01e4",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u01ea",
            "",
            "",
            "",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | RULE_AMOUNT_GEONE | RULE_AMOUNT_ONE_OR_ZERO | RULE_ASYACTIONS | RULE_CLOCK | RULE_HEX_LITERAL | RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_FLOATING_POINT_LITERAL | RULE_CHARACTER_LITERAL | RULE_STRING_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_252 = input.LA(1);

                        s = -1;
                        if ( (LA36_252=='\'') ) {s = 255;}

                        else if ( ((LA36_252>='\u0000' && LA36_252<='&')||(LA36_252>='(' && LA36_252<='\uFFFF')) ) {s = 168;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_256 = input.LA(1);

                        s = -1;
                        if ( (LA36_256=='\"') ) {s = 171;}

                        else if ( (LA36_256=='\\') ) {s = 169;}

                        else if ( ((LA36_256>='\u0000' && LA36_256<='!')||(LA36_256>='#' && LA36_256<='[')||(LA36_256>=']' && LA36_256<='\uFFFF')) ) {s = 170;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_420 = input.LA(1);

                        s = -1;
                        if ( ((LA36_420>='\u0000' && LA36_420<='/')||(LA36_420>=':' && LA36_420<='@')||(LA36_420>='G' && LA36_420<='`')||(LA36_420>='g' && LA36_420<='\uFFFF')) ) {s = 168;}

                        else if ( ((LA36_420>='0' && LA36_420<='9')||(LA36_420>='A' && LA36_420<='F')||(LA36_420>='a' && LA36_420<='f')) ) {s = 445;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_383 = input.LA(1);

                        s = -1;
                        if ( ((LA36_383>='0' && LA36_383<='9')||(LA36_383>='A' && LA36_383<='F')||(LA36_383>='a' && LA36_383<='f')) ) {s = 420;}

                        else if ( ((LA36_383>='\u0000' && LA36_383<='/')||(LA36_383>=':' && LA36_383<='@')||(LA36_383>='G' && LA36_383<='`')||(LA36_383>='g' && LA36_383<='\uFFFF')) ) {s = 168;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_334 = input.LA(1);

                        s = -1;
                        if ( ((LA36_334>='0' && LA36_334<='9')||(LA36_334>='A' && LA36_334<='F')||(LA36_334>='a' && LA36_334<='f')) ) {s = 383;}

                        else if ( ((LA36_334>='\u0000' && LA36_334<='/')||(LA36_334>=':' && LA36_334<='@')||(LA36_334>='G' && LA36_334<='`')||(LA36_334>='g' && LA36_334<='\uFFFF')) ) {s = 168;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_444 = input.LA(1);

                        s = -1;
                        if ( (LA36_444=='\'') ) {s = 255;}

                        else if ( ((LA36_444>='\u0000' && LA36_444<='&')||(LA36_444>='(' && LA36_444<='\uFFFF')) ) {s = 168;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA36_253 = input.LA(1);

                        s = -1;
                        if ( ((LA36_253>='\u0000' && LA36_253<='/')||(LA36_253>=':' && LA36_253<='@')||(LA36_253>='G' && LA36_253<='`')||(LA36_253>='g' && LA36_253<='\uFFFF')) ) {s = 168;}

                        else if ( ((LA36_253>='0' && LA36_253<='9')||(LA36_253>='A' && LA36_253<='F')||(LA36_253>='a' && LA36_253<='f')) ) {s = 333;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA36_56 = input.LA(1);

                        s = -1;
                        if ( (LA36_56=='\\') ) {s = 169;}

                        else if ( ((LA36_56>='\u0000' && LA36_56<='!')||(LA36_56>='#' && LA36_56<='[')||(LA36_56>=']' && LA36_56<='\uFFFF')) ) {s = 170;}

                        else if ( (LA36_56=='\"') ) {s = 171;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA36_0 = input.LA(1);

                        s = -1;
                        if ( (LA36_0=='p') ) {s = 1;}

                        else if ( (LA36_0==';') ) {s = 2;}

                        else if ( (LA36_0=='i') ) {s = 3;}

                        else if ( (LA36_0=='.') ) {s = 4;}

                        else if ( (LA36_0=='C') ) {s = 5;}

                        else if ( (LA36_0=='N') ) {s = 6;}

                        else if ( (LA36_0=='v') ) {s = 7;}

                        else if ( (LA36_0=='r') ) {s = 8;}

                        else if ( (LA36_0=='b') ) {s = 9;}

                        else if ( (LA36_0=='S') ) {s = 10;}

                        else if ( (LA36_0=='I') ) {s = 11;}

                        else if ( (LA36_0=='R') ) {s = 12;}

                        else if ( (LA36_0=='e') ) {s = 13;}

                        else if ( (LA36_0=='{') ) {s = 14;}

                        else if ( (LA36_0=='}') ) {s = 15;}

                        else if ( (LA36_0=='c') ) {s = 16;}

                        else if ( (LA36_0=='=') ) {s = 17;}

                        else if ( (LA36_0=='(') ) {s = 18;}

                        else if ( (LA36_0==',') ) {s = 19;}

                        else if ( (LA36_0==')') ) {s = 20;}

                        else if ( (LA36_0=='[') ) {s = 21;}

                        else if ( (LA36_0==']') ) {s = 22;}

                        else if ( (LA36_0==':') ) {s = 23;}

                        else if ( (LA36_0=='|') ) {s = 24;}

                        else if ( (LA36_0=='D') ) {s = 25;}

                        else if ( (LA36_0=='+') ) {s = 26;}

                        else if ( (LA36_0=='-') ) {s = 27;}

                        else if ( (LA36_0=='*') ) {s = 28;}

                        else if ( (LA36_0=='/') ) {s = 29;}

                        else if ( (LA36_0=='&') ) {s = 30;}

                        else if ( (LA36_0=='^') ) {s = 31;}

                        else if ( (LA36_0=='%') ) {s = 32;}

                        else if ( (LA36_0=='?') ) {s = 33;}

                        else if ( (LA36_0=='o') ) {s = 34;}

                        else if ( (LA36_0=='a') ) {s = 35;}

                        else if ( (LA36_0=='x') ) {s = 36;}

                        else if ( (LA36_0=='!') ) {s = 37;}

                        else if ( (LA36_0=='<') ) {s = 38;}

                        else if ( (LA36_0=='>') ) {s = 39;}

                        else if ( (LA36_0=='~') ) {s = 40;}

                        else if ( (LA36_0=='t') ) {s = 41;}

                        else if ( (LA36_0=='s') ) {s = 42;}

                        else if ( (LA36_0=='n') ) {s = 43;}

                        else if ( (LA36_0=='f') ) {s = 44;}

                        else if ( (LA36_0=='d') ) {s = 45;}

                        else if ( (LA36_0=='E') ) {s = 46;}

                        else if ( (LA36_0=='m') ) {s = 47;}

                        else if ( (LA36_0=='g') ) {s = 48;}

                        else if ( (LA36_0=='l') ) {s = 49;}

                        else if ( (LA36_0=='h') ) {s = 50;}

                        else if ( (LA36_0=='w') ) {s = 51;}

                        else if ( (LA36_0=='1') ) {s = 52;}

                        else if ( (LA36_0=='0') ) {s = 53;}

                        else if ( ((LA36_0>='2' && LA36_0<='9')) ) {s = 54;}

                        else if ( (LA36_0=='\'') ) {s = 55;}

                        else if ( (LA36_0=='\"') ) {s = 56;}

                        else if ( ((LA36_0>='A' && LA36_0<='B')||(LA36_0>='F' && LA36_0<='H')||(LA36_0>='J' && LA36_0<='M')||(LA36_0>='O' && LA36_0<='Q')||(LA36_0>='T' && LA36_0<='Z')||LA36_0=='_'||(LA36_0>='j' && LA36_0<='k')||LA36_0=='q'||LA36_0=='u'||(LA36_0>='y' && LA36_0<='z')) ) {s = 57;}

                        else if ( ((LA36_0>='\t' && LA36_0<='\n')||LA36_0=='\r'||LA36_0==' ') ) {s = 58;}

                        else if ( ((LA36_0>='\u0000' && LA36_0<='\b')||(LA36_0>='\u000B' && LA36_0<='\f')||(LA36_0>='\u000E' && LA36_0<='\u001F')||(LA36_0>='#' && LA36_0<='$')||LA36_0=='@'||LA36_0=='\\'||LA36_0=='`'||(LA36_0>='\u007F' && LA36_0<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA36_445 = input.LA(1);

                        s = -1;
                        if ( (LA36_445=='\"') ) {s = 171;}

                        else if ( (LA36_445=='\\') ) {s = 169;}

                        else if ( ((LA36_445>='\u0000' && LA36_445<='!')||(LA36_445>='#' && LA36_445<='[')||(LA36_445>=']' && LA36_445<='\uFFFF')) ) {s = 170;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA36_257 = input.LA(1);

                        s = -1;
                        if ( ((LA36_257>='0' && LA36_257<='9')||(LA36_257>='A' && LA36_257<='F')||(LA36_257>='a' && LA36_257<='f')) ) {s = 334;}

                        else if ( ((LA36_257>='\u0000' && LA36_257<='/')||(LA36_257>=':' && LA36_257<='@')||(LA36_257>='G' && LA36_257<='`')||(LA36_257>='g' && LA36_257<='\uFFFF')) ) {s = 168;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA36_170 = input.LA(1);

                        s = -1;
                        if ( (LA36_170=='\"') ) {s = 171;}

                        else if ( (LA36_170=='\\') ) {s = 169;}

                        else if ( ((LA36_170>='\u0000' && LA36_170<='!')||(LA36_170>='#' && LA36_170<='[')||(LA36_170>=']' && LA36_170<='\uFFFF')) ) {s = 170;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA36_167 = input.LA(1);

                        s = -1;
                        if ( (LA36_167=='\'') ) {s = 255;}

                        else if ( ((LA36_167>='\u0000' && LA36_167<='&')||(LA36_167>='(' && LA36_167<='\uFFFF')) ) {s = 168;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA36_382 = input.LA(1);

                        s = -1;
                        if ( ((LA36_382>='\u0000' && LA36_382<='/')||(LA36_382>=':' && LA36_382<='@')||(LA36_382>='G' && LA36_382<='`')||(LA36_382>='g' && LA36_382<='\uFFFF')) ) {s = 168;}

                        else if ( ((LA36_382>='0' && LA36_382<='9')||(LA36_382>='A' && LA36_382<='F')||(LA36_382>='a' && LA36_382<='f')) ) {s = 419;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA36_419 = input.LA(1);

                        s = -1;
                        if ( ((LA36_419>='\u0000' && LA36_419<='/')||(LA36_419>=':' && LA36_419<='@')||(LA36_419>='G' && LA36_419<='`')||(LA36_419>='g' && LA36_419<='\uFFFF')) ) {s = 168;}

                        else if ( ((LA36_419>='0' && LA36_419<='9')||(LA36_419>='A' && LA36_419<='F')||(LA36_419>='a' && LA36_419<='f')) ) {s = 444;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA36_333 = input.LA(1);

                        s = -1;
                        if ( ((LA36_333>='\u0000' && LA36_333<='/')||(LA36_333>=':' && LA36_333<='@')||(LA36_333>='G' && LA36_333<='`')||(LA36_333>='g' && LA36_333<='\uFFFF')) ) {s = 168;}

                        else if ( ((LA36_333>='0' && LA36_333<='9')||(LA36_333>='A' && LA36_333<='F')||(LA36_333>='a' && LA36_333<='f')) ) {s = 382;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA36_55 = input.LA(1);

                        s = -1;
                        if ( (LA36_55=='\\') ) {s = 166;}

                        else if ( ((LA36_55>='\u0000' && LA36_55<='&')||(LA36_55>='(' && LA36_55<='[')||(LA36_55>=']' && LA36_55<='\uFFFF')) ) {s = 167;}

                        else if ( (LA36_55=='\'') ) {s = 168;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}