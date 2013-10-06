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
    public static final int RULE_ANY_OTHER=28;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_DECIMAL_LITERAL=17;
    public static final int RULE_HEX_LITERAL=15;
    public static final int RULE_OCTAL_LITERAL=16;
    public static final int RULE_CHARACTER_LITERAL=13;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_HEX_DIGIT=18;
    public static final int RULE_ABSTRACT_CONDTION=10;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=25;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_EXPONENT=20;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_ASYACTIONS=9;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_OCTAL_ESCAPE=24;
    public static final int RULE_AMOUNT_ONE_OR_ZERO=8;
    public static final int RULE_ESCAPE_SEQUENCE=22;
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
    public static final int RULE_STRING_LITERAL=14;
    public static final int T__59=59;
    public static final int RULE_AMOUNT_GEONE=7;
    public static final int RULE_INT=6;
    public static final int RULE_UNICODE_ESCAPE=23;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_CLOCK=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=26;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_FLOAT_TYPE_SUFFIX=21;
    public static final int T__38=38;
    public static final int RULE_INTEGER_TYPE_SUFFIX=19;
    public static final int T__39=39;
    public static final int RULE_FLOATING_POINT_LITERAL=12;
    public static final int RULE_WS=27;

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

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:18:7: ( 'Native' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:18:9: 'Native'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:19:7: ( 'void' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:19:9: 'void'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:20:7: ( 'int' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:20:9: 'int'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:21:7: ( 'real' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:21:9: 'real'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:22:7: ( 'boolean' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:22:9: 'boolean'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:23:7: ( 'String' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:23:9: 'String'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:24:7: ( 'Int' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:24:9: 'Int'
            {
            match("Int"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:25:7: ( 'Real' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:25:9: 'Real'
            {
            match("Real"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:26:7: ( 'interface' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:26:9: 'interface'
            {
            match("interface"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:27:7: ( 'extends' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:27:9: 'extends'
            {
            match("extends"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:28:7: ( '{' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:28:9: '{'
            {
            match('{'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:29:7: ( '}' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:29:9: '}'
            {
            match('}'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:30:7: ( 'class' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:30:9: 'class'
            {
            match("class"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:31:7: ( 'implements' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:31:9: 'implements'
            {
            match("implements"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:32:7: ( '=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:32:9: '='
            {
            match('='); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:33:7: ( '(' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:33:9: '('
            {
            match('('); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:34:7: ( ',' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:34:9: ','
            {
            match(','); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:35:7: ( ')' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:35:9: ')'
            {
            match(')'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:36:7: ( 'return' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:36:9: 'return'
            {
            match("return"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:37:7: ( 'this' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:37:9: 'this'
            {
            match("this"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:38:7: ( 'new' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:38:9: 'new'
            {
            match("new"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:39:7: ( 'true' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:39:9: 'true'
            {
            match("true"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:40:7: ( 'false' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:40:9: 'false'
            {
            match("false"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:41:7: ( 'Requires' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:41:9: 'Requires'
            {
            match("Requires"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:42:7: ( '[' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:42:9: '['
            {
            match('['); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:43:7: ( ']' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:43:9: ']'
            {
            match(']'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:44:7: ( ':' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:44:9: ':'
            {
            match(':'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:45:7: ( '|' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:45:9: '|'
            {
            match('|'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:46:7: ( 'Constraint' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:46:9: 'Constraint'
            {
            match("Constraint"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:47:7: ( 'Invariant' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:47:9: 'Invariant'
            {
            match("Invariant"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:48:7: ( '+=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:48:9: '+='
            {
            match("+="); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:49:7: ( '-=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:49:9: '-='
            {
            match("-="); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:50:7: ( '*=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:50:9: '*='
            {
            match("*="); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:51:7: ( '/=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:51:9: '/='
            {
            match("/="); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:52:7: ( '&=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:52:9: '&='
            {
            match("&="); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:53:7: ( '|=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:53:9: '|='
            {
            match("|="); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:54:7: ( '^=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:54:9: '^='
            {
            match("^="); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:55:7: ( '%=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:55:9: '%='
            {
            match("%="); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:56:7: ( '?' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:56:9: '?'
            {
            match('?'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:57:7: ( 'or' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:57:9: 'or'
            {
            match("or"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:58:7: ( 'and' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:58:9: 'and'
            {
            match("and"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:59:7: ( 'xor' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:59:9: 'xor'
            {
            match("xor"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:60:7: ( '==' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:60:9: '=='
            {
            match("=="); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:61:7: ( '!=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:61:9: '!='
            {
            match("!="); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:62:7: ( 'instanceof' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:62:9: 'instanceof'
            {
            match("instanceof"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:63:7: ( '<' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:63:9: '<'
            {
            match('<'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:64:7: ( '<=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:64:9: '<='
            {
            match("<="); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:65:7: ( '>' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:65:9: '>'
            {
            match('>'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:66:7: ( '>=' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:66:9: '>='
            {
            match(">="); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:67:7: ( '+' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:67:9: '+'
            {
            match('+'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:68:7: ( '-' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:68:9: '-'
            {
            match('-'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:69:7: ( '*' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:69:9: '*'
            {
            match('*'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:70:7: ( '/' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:70:9: '/'
            {
            match('/'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:71:7: ( '%' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:71:9: '%'
            {
            match('%'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:72:7: ( '++' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:72:9: '++'
            {
            match("++"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:73:7: ( '--' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:73:9: '--'
            {
            match("--"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:74:7: ( '!' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:74:9: '!'
            {
            match('!'); 

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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:75:7: ( 'super' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:75:9: 'super'
            {
            match("super"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:76:7: ( 'null' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:76:9: 'null'
            {
            match("null"); 


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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:77:7: ( 'dot' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:77:9: 'dot'
            {
            match("dot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "RULE_AMOUNT_GEONE"
    public final void mRULE_AMOUNT_GEONE() throws RecognitionException {
        try {
            int _type = RULE_AMOUNT_GEONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4315:19: ( '1..*' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4315:21: '1..*'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4317:25: ( '0..1' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4317:27: '0..1'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4319:17: ( '(' '?' '|' '!' ')' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4319:19: '(' '?' '|' '!' ')'
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

    // $ANTLR start "RULE_ABSTRACT_CONDTION"
    public final void mRULE_ABSTRACT_CONDTION() throws RecognitionException {
        try {
            int _type = RULE_ABSTRACT_CONDTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4321:24: ( 'Condition' '{' '}' ';' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4321:26: 'Condition' '{' '}' ';'
            {
            match("Condition"); 

            match('{'); 
            match('}'); 
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ABSTRACT_CONDTION"

    // $ANTLR start "RULE_CLOCK"
    public final void mRULE_CLOCK() throws RecognitionException {
        try {
            int _type = RULE_CLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4323:12: ( 'clock' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4323:14: 'clock'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4325:18: ( '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ ( RULE_INTEGER_TYPE_SUFFIX )? )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4325:20: '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4325:34: ( RULE_HEX_DIGIT )+
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
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4325:34: RULE_HEX_DIGIT
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

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4325:50: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='L'||LA2_0=='l') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4325:50: RULE_INTEGER_TYPE_SUFFIX
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4327:22: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( RULE_INTEGER_TYPE_SUFFIX )? )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4327:24: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4327:24: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4327:25: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4327:29: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4327:38: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4327:39: '0' .. '9'
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

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4327:51: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='L'||LA5_0=='l') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4327:51: RULE_INTEGER_TYPE_SUFFIX
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4329:20: ( '0' ( '0' .. '7' )+ ( RULE_INTEGER_TYPE_SUFFIX )? )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4329:22: '0' ( '0' .. '7' )+ ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            match('0'); 
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4329:26: ( '0' .. '7' )+
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
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4329:27: '0' .. '7'
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

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4329:38: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='L'||LA7_0=='l') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4329:38: RULE_INTEGER_TYPE_SUFFIX
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4331:25: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4331:27: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4333:35: ( ( 'l' | 'L' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4333:37: ( 'l' | 'L' )
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:29: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:31: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:31: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:32: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:32: ( '0' .. '9' )+
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
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:33: '0' .. '9'
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
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:48: ( '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:49: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:60: ( RULE_EXPONENT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:60: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:75: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='D'||LA11_0=='F'||LA11_0=='d'||LA11_0=='f') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:75: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:99: '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    match('.'); 
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:103: ( '0' .. '9' )+
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
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:104: '0' .. '9'
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

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:115: ( RULE_EXPONENT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:115: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:130: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='D'||LA14_0=='F'||LA14_0=='d'||LA14_0=='f') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:130: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:154: ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:154: ( '0' .. '9' )+
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
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:155: '0' .. '9'
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
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:180: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='D'||LA16_0=='F'||LA16_0=='d'||LA16_0=='f') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:180: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:204: ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:204: ( '0' .. '9' )+
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
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4335:205: '0' .. '9'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4337:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4337:26: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4337:36: ( '+' | '-' )?
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

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4337:47: ( '0' .. '9' )+
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
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4337:48: '0' .. '9'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4339:33: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4339:35: ( 'f' | 'F' | 'd' | 'D' )
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4341:24: ( '\\'' ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) ) '\\'' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4341:26: '\\'' ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) ) '\\''
            {
            match('\''); 
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4341:31: ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\'' | '\\\\' ) ) )
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
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4341:32: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4341:53: ~ ( ( '\\'' | '\\\\' ) )
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4343:21: ( '\"' ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4343:23: '\"' ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4343:27: ( RULE_ESCAPE_SEQUENCE | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4343:28: RULE_ESCAPE_SEQUENCE
            	    {
            	    mRULE_ESCAPE_SEQUENCE(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4343:49: ~ ( ( '\\\\' | '\"' ) )
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4345:31: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESCAPE | RULE_OCTAL_ESCAPE ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4345:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESCAPE | RULE_OCTAL_ESCAPE )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4345:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | RULE_UNICODE_ESCAPE | RULE_OCTAL_ESCAPE )
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
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4345:34: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4345:75: RULE_UNICODE_ESCAPE
                    {
                    mRULE_UNICODE_ESCAPE(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4345:95: RULE_OCTAL_ESCAPE
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4347:28: ( ( '\\\\' '0' .. '3' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4347:30: ( '\\\\' '0' .. '3' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4347:30: ( '\\\\' '0' .. '3' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' '0' .. '7' | '\\\\' '0' .. '7' )
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
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4347:31: '\\\\' '0' .. '3' '0' .. '7' '0' .. '7'
                    {
                    match('\\'); 
                    matchRange('0','3'); 
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4347:63: '\\\\' '0' .. '7' '0' .. '7'
                    {
                    match('\\'); 
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4347:86: '\\\\' '0' .. '7'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4349:30: ( '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4349:32: '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4351:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4351:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4351:11: ( '^' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='^') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4351:11: '^'
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

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4351:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4353:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4353:12: ( '0' .. '9' )+
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4353:12: ( '0' .. '9' )+
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
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4353:13: '0' .. '9'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4355:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4355:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4355:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4355:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4355:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4355:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4355:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4355:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4355:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4355:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4355:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4357:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4357:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4357:24: ( options {greedy=false; } : . )*
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
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4357:52: .
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4359:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4359:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4359:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4359:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4359:40: ( ( '\\r' )? '\\n' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\n'||LA34_0=='\r') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4359:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4359:41: ( '\\r' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='\r') ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4359:41: '\\r'
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4361:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4361:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4361:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4363:16: ( . )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4363:18: .
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
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:8: ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | RULE_AMOUNT_GEONE | RULE_AMOUNT_ONE_OR_ZERO | RULE_ASYACTIONS | RULE_ABSTRACT_CONDTION | RULE_CLOCK | RULE_HEX_LITERAL | RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_FLOATING_POINT_LITERAL | RULE_CHARACTER_LITERAL | RULE_STRING_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt36=85;
        alt36 = dfa36.predict(input);
        switch (alt36) {
            case 1 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:10: T__29
                {
                mT__29(); 

                }
                break;
            case 2 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:16: T__30
                {
                mT__30(); 

                }
                break;
            case 3 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:22: T__31
                {
                mT__31(); 

                }
                break;
            case 4 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:28: T__32
                {
                mT__32(); 

                }
                break;
            case 5 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:34: T__33
                {
                mT__33(); 

                }
                break;
            case 6 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:40: T__34
                {
                mT__34(); 

                }
                break;
            case 7 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:46: T__35
                {
                mT__35(); 

                }
                break;
            case 8 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:52: T__36
                {
                mT__36(); 

                }
                break;
            case 9 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:58: T__37
                {
                mT__37(); 

                }
                break;
            case 10 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:64: T__38
                {
                mT__38(); 

                }
                break;
            case 11 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:70: T__39
                {
                mT__39(); 

                }
                break;
            case 12 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:76: T__40
                {
                mT__40(); 

                }
                break;
            case 13 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:82: T__41
                {
                mT__41(); 

                }
                break;
            case 14 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:88: T__42
                {
                mT__42(); 

                }
                break;
            case 15 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:94: T__43
                {
                mT__43(); 

                }
                break;
            case 16 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:100: T__44
                {
                mT__44(); 

                }
                break;
            case 17 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:106: T__45
                {
                mT__45(); 

                }
                break;
            case 18 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:112: T__46
                {
                mT__46(); 

                }
                break;
            case 19 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:118: T__47
                {
                mT__47(); 

                }
                break;
            case 20 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:124: T__48
                {
                mT__48(); 

                }
                break;
            case 21 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:130: T__49
                {
                mT__49(); 

                }
                break;
            case 22 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:136: T__50
                {
                mT__50(); 

                }
                break;
            case 23 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:142: T__51
                {
                mT__51(); 

                }
                break;
            case 24 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:148: T__52
                {
                mT__52(); 

                }
                break;
            case 25 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:154: T__53
                {
                mT__53(); 

                }
                break;
            case 26 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:160: T__54
                {
                mT__54(); 

                }
                break;
            case 27 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:166: T__55
                {
                mT__55(); 

                }
                break;
            case 28 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:172: T__56
                {
                mT__56(); 

                }
                break;
            case 29 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:178: T__57
                {
                mT__57(); 

                }
                break;
            case 30 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:184: T__58
                {
                mT__58(); 

                }
                break;
            case 31 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:190: T__59
                {
                mT__59(); 

                }
                break;
            case 32 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:196: T__60
                {
                mT__60(); 

                }
                break;
            case 33 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:202: T__61
                {
                mT__61(); 

                }
                break;
            case 34 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:208: T__62
                {
                mT__62(); 

                }
                break;
            case 35 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:214: T__63
                {
                mT__63(); 

                }
                break;
            case 36 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:220: T__64
                {
                mT__64(); 

                }
                break;
            case 37 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:226: T__65
                {
                mT__65(); 

                }
                break;
            case 38 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:232: T__66
                {
                mT__66(); 

                }
                break;
            case 39 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:238: T__67
                {
                mT__67(); 

                }
                break;
            case 40 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:244: T__68
                {
                mT__68(); 

                }
                break;
            case 41 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:250: T__69
                {
                mT__69(); 

                }
                break;
            case 42 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:256: T__70
                {
                mT__70(); 

                }
                break;
            case 43 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:262: T__71
                {
                mT__71(); 

                }
                break;
            case 44 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:268: T__72
                {
                mT__72(); 

                }
                break;
            case 45 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:274: T__73
                {
                mT__73(); 

                }
                break;
            case 46 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:280: T__74
                {
                mT__74(); 

                }
                break;
            case 47 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:286: T__75
                {
                mT__75(); 

                }
                break;
            case 48 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:292: T__76
                {
                mT__76(); 

                }
                break;
            case 49 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:298: T__77
                {
                mT__77(); 

                }
                break;
            case 50 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:304: T__78
                {
                mT__78(); 

                }
                break;
            case 51 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:310: T__79
                {
                mT__79(); 

                }
                break;
            case 52 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:316: T__80
                {
                mT__80(); 

                }
                break;
            case 53 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:322: T__81
                {
                mT__81(); 

                }
                break;
            case 54 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:328: T__82
                {
                mT__82(); 

                }
                break;
            case 55 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:334: T__83
                {
                mT__83(); 

                }
                break;
            case 56 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:340: T__84
                {
                mT__84(); 

                }
                break;
            case 57 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:346: T__85
                {
                mT__85(); 

                }
                break;
            case 58 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:352: T__86
                {
                mT__86(); 

                }
                break;
            case 59 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:358: T__87
                {
                mT__87(); 

                }
                break;
            case 60 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:364: T__88
                {
                mT__88(); 

                }
                break;
            case 61 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:370: T__89
                {
                mT__89(); 

                }
                break;
            case 62 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:376: T__90
                {
                mT__90(); 

                }
                break;
            case 63 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:382: T__91
                {
                mT__91(); 

                }
                break;
            case 64 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:388: T__92
                {
                mT__92(); 

                }
                break;
            case 65 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:394: T__93
                {
                mT__93(); 

                }
                break;
            case 66 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:400: T__94
                {
                mT__94(); 

                }
                break;
            case 67 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:406: T__95
                {
                mT__95(); 

                }
                break;
            case 68 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:412: RULE_AMOUNT_GEONE
                {
                mRULE_AMOUNT_GEONE(); 

                }
                break;
            case 69 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:430: RULE_AMOUNT_ONE_OR_ZERO
                {
                mRULE_AMOUNT_ONE_OR_ZERO(); 

                }
                break;
            case 70 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:454: RULE_ASYACTIONS
                {
                mRULE_ASYACTIONS(); 

                }
                break;
            case 71 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:470: RULE_ABSTRACT_CONDTION
                {
                mRULE_ABSTRACT_CONDTION(); 

                }
                break;
            case 72 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:493: RULE_CLOCK
                {
                mRULE_CLOCK(); 

                }
                break;
            case 73 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:504: RULE_HEX_LITERAL
                {
                mRULE_HEX_LITERAL(); 

                }
                break;
            case 74 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:521: RULE_DECIMAL_LITERAL
                {
                mRULE_DECIMAL_LITERAL(); 

                }
                break;
            case 75 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:542: RULE_OCTAL_LITERAL
                {
                mRULE_OCTAL_LITERAL(); 

                }
                break;
            case 76 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:561: RULE_FLOATING_POINT_LITERAL
                {
                mRULE_FLOATING_POINT_LITERAL(); 

                }
                break;
            case 77 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:589: RULE_CHARACTER_LITERAL
                {
                mRULE_CHARACTER_LITERAL(); 

                }
                break;
            case 78 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:612: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 79 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:632: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 80 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:640: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 81 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:649: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 82 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:661: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 83 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:677: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 84 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:693: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 85 :
                // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1:701: RULE_ANY_OTHER
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
        "\2\uffff\1\2\1\4\1\1\1\3";
    static final String DFA18_specialS =
        "\6\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\12\uffff\1\3\1\5\1\3\35\uffff\1\3\1\5\1"+
            "\3",
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
            return "4335:31: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_FLOAT_TYPE_SUFFIX )";
        }
    }
    static final String DFA36_eotS =
        "\1\uffff\1\67\1\uffff\1\67\1\74\10\67\2\uffff\1\67\1\112\1\114"+
        "\2\uffff\3\67\3\uffff\1\130\1\67\1\134\1\137\1\141\1\145\2\63\1"+
        "\151\1\uffff\3\67\1\157\1\161\1\163\2\67\3\170\2\63\3\uffff\3\67"+
        "\2\uffff\2\67\3\uffff\10\67\2\uffff\1\67\6\uffff\5\67\5\uffff\1"+
        "\67\21\uffff\1\u009d\2\67\6\uffff\2\67\1\75\1\170\1\uffff\1\75\1"+
        "\uffff\1\u00a4\1\u00a5\7\uffff\4\67\1\u00b3\7\67\1\u00bb\10\67\1"+
        "\u00c4\3\67\1\uffff\1\u00c9\1\u00ca\1\67\1\u00cc\13\uffff\6\67\1"+
        "\uffff\2\67\1\u00d7\1\u00d8\3\67\1\uffff\1\67\1\u00dd\4\67\1\u00e2"+
        "\1\u00e3\1\uffff\1\u00e4\3\67\2\uffff\1\67\3\uffff\10\67\2\uffff"+
        "\4\67\1\uffff\2\67\1\u00f9\1\u00fa\3\uffff\1\u00fb\2\67\1\u00fe"+
        "\2\uffff\1\67\1\u0102\1\67\1\u0104\3\67\1\u0108\1\u0109\1\67\1\u010b"+
        "\3\67\3\uffff\2\67\3\uffff\1\u0113\1\uffff\1\u0114\1\uffff\3\67"+
        "\2\uffff\1\u0118\1\uffff\2\67\1\u011b\2\67\4\uffff\3\67\1\uffff"+
        "\1\67\1\u0122\1\uffff\3\67\1\u0126\1\67\1\u0128\1\uffff\2\67\1\u012b"+
        "\1\uffff\1\u012c\1\uffff\1\u012d\4\uffff";
    static final String DFA36_eofS =
        "\u012e\uffff";
    static final String DFA36_minS =
        "\1\0\1\141\1\uffff\1\155\1\52\1\141\1\157\1\145\1\157\1\164\1\156"+
        "\1\145\1\170\2\uffff\1\154\1\75\1\77\2\uffff\1\150\1\145\1\141\3"+
        "\uffff\1\75\1\157\1\53\1\55\1\75\1\52\3\75\1\uffff\1\162\1\156\1"+
        "\157\3\75\1\165\1\157\3\56\2\0\3\uffff\1\143\1\142\1\151\2\uffff"+
        "\1\160\1\163\3\uffff\1\164\1\151\1\141\1\157\1\162\1\164\1\141\1"+
        "\164\2\uffff\1\141\6\uffff\1\151\1\165\1\167\2\154\5\uffff\1\156"+
        "\21\uffff\1\60\1\144\1\162\6\uffff\1\160\1\164\2\56\1\uffff\1\56"+
        "\1\uffff\2\56\1\42\1\0\1\uffff\1\42\1\0\2\uffff\1\153\1\154\1\166"+
        "\1\154\1\60\1\164\1\151\1\144\1\154\1\165\1\154\1\151\1\60\1\141"+
        "\1\154\1\165\1\145\1\163\1\143\1\163\1\145\1\60\1\154\1\163\1\144"+
        "\1\uffff\2\60\1\145\1\60\4\uffff\2\0\2\uffff\2\0\1\uffff\1\141\1"+
        "\151\1\141\1\162\1\145\1\162\1\uffff\1\141\1\166\2\60\1\162\1\145"+
        "\1\156\1\uffff\1\162\1\60\1\151\1\156\1\163\1\153\2\60\1\uffff\1"+
        "\60\1\145\1\164\1\151\2\uffff\1\162\1\uffff\2\0\1\147\1\143\2\164"+
        "\1\155\1\146\1\156\1\145\2\uffff\1\156\1\141\1\147\1\151\1\uffff"+
        "\1\162\1\144\2\60\3\uffff\1\60\1\162\1\164\1\60\2\0\1\145\1\60\1"+
        "\145\1\60\1\145\1\141\1\143\2\60\1\156\1\60\1\141\1\145\1\163\3"+
        "\uffff\1\141\1\151\1\uffff\2\0\1\60\1\uffff\1\60\1\uffff\1\156\1"+
        "\143\1\145\2\uffff\1\60\1\uffff\1\156\1\163\1\60\1\151\1\157\2\0"+
        "\2\uffff\1\164\1\145\1\157\1\uffff\1\164\1\60\1\uffff\2\156\1\163"+
        "\1\60\1\146\1\60\1\uffff\1\164\1\173\1\60\1\uffff\1\60\1\uffff\1"+
        "\60\4\uffff";
    static final String DFA36_maxS =
        "\1\uffff\1\165\1\uffff\1\156\1\71\1\141\1\157\1\145\1\157\1\164"+
        "\1\156\1\145\1\170\2\uffff\1\154\1\75\1\77\2\uffff\1\162\1\165\1"+
        "\141\3\uffff\1\75\1\157\5\75\1\172\1\75\1\uffff\1\162\1\156\1\157"+
        "\3\75\1\165\1\157\1\146\1\170\1\146\2\uffff\3\uffff\1\143\1\142"+
        "\1\151\2\uffff\1\160\1\164\3\uffff\1\164\1\151\1\164\1\157\1\162"+
        "\1\166\1\161\1\164\2\uffff\1\157\6\uffff\1\151\1\165\1\167\2\154"+
        "\5\uffff\1\156\21\uffff\1\172\1\144\1\162\6\uffff\1\160\1\164\1"+
        "\56\1\146\1\uffff\1\56\1\uffff\2\146\1\165\1\uffff\1\uffff\1\165"+
        "\1\uffff\2\uffff\1\153\1\154\1\166\1\157\1\172\1\164\1\151\1\144"+
        "\1\154\1\165\1\154\1\151\1\172\1\141\1\154\1\165\1\145\1\163\1\143"+
        "\1\163\1\145\1\172\1\154\2\163\1\uffff\2\172\1\145\1\172\4\uffff"+
        "\2\uffff\2\uffff\2\uffff\1\uffff\1\141\1\151\1\141\1\162\1\145\1"+
        "\162\1\uffff\1\141\1\166\2\172\1\162\1\145\1\156\1\uffff\1\162\1"+
        "\172\1\151\1\156\1\163\1\153\2\172\1\uffff\1\172\1\145\1\164\1\151"+
        "\2\uffff\1\162\1\uffff\2\uffff\1\147\1\143\2\164\1\155\1\146\1\156"+
        "\1\145\2\uffff\1\156\1\141\1\147\1\151\1\uffff\1\162\1\144\2\172"+
        "\3\uffff\1\172\1\162\1\164\1\172\2\uffff\1\145\1\172\1\145\1\172"+
        "\1\145\1\141\1\143\2\172\1\156\1\172\1\141\1\145\1\163\3\uffff\1"+
        "\141\1\151\1\uffff\2\uffff\1\172\1\uffff\1\172\1\uffff\1\156\1\143"+
        "\1\145\2\uffff\1\172\1\uffff\1\156\1\163\1\172\1\151\1\157\2\uffff"+
        "\2\uffff\1\164\1\145\1\157\1\uffff\1\164\1\172\1\uffff\2\156\1\163"+
        "\1\172\1\146\1\172\1\uffff\1\164\1\173\1\172\1\uffff\1\172\1\uffff"+
        "\1\172\4\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\12\uffff\1\22\1\23\3\uffff\1\30\1\31\3\uffff\1\40"+
        "\1\41\1\42\11\uffff\1\56\15\uffff\1\117\1\124\1\125\3\uffff\1\117"+
        "\1\2\2\uffff\1\4\1\5\1\114\10\uffff\1\22\1\23\1\uffff\1\62\1\26"+
        "\1\106\1\27\1\30\1\31\5\uffff\1\40\1\41\1\42\1\53\1\43\1\uffff\1"+
        "\46\1\76\1\71\1\47\1\77\1\72\1\50\1\73\1\51\1\122\1\123\1\74\1\52"+
        "\1\54\1\55\1\75\1\56\3\uffff\1\63\1\100\1\66\1\65\1\70\1\67\4\uffff"+
        "\1\112\1\uffff\1\111\4\uffff\1\121\2\uffff\1\116\1\124\31\uffff"+
        "\1\57\4\uffff\1\104\1\105\1\113\1\120\2\uffff\2\115\2\uffff\1\116"+
        "\6\uffff\1\12\7\uffff\1\16\10\uffff\1\34\4\uffff\1\60\1\61\1\uffff"+
        "\1\103\12\uffff\1\11\1\13\4\uffff\1\17\4\uffff\1\33\1\35\1\102\24"+
        "\uffff\1\24\1\110\1\36\2\uffff\1\101\3\uffff\1\6\1\uffff\1\3\3\uffff"+
        "\1\10\1\32\1\uffff\1\15\7\uffff\1\1\1\7\3\uffff\1\14\2\uffff\1\21"+
        "\6\uffff\1\37\3\uffff\1\20\1\uffff\1\45\1\uffff\1\107\1\25\1\64"+
        "\1\44";
    static final String DFA36_specialS =
        "\1\0\56\uffff\1\14\1\15\115\uffff\1\2\2\uffff\1\1\44\uffff\1\16"+
        "\1\17\2\uffff\1\20\1\11\41\uffff\1\12\1\4\32\uffff\1\7\1\3\24\uffff"+
        "\1\10\1\5\20\uffff\1\6\1\13\33\uffff}>";
    static final String[] DFA36_transitionS = {
            "\11\63\2\62\2\63\1\62\22\63\1\62\1\47\1\60\2\63\1\42\1\40\1"+
            "\57\1\21\1\23\1\36\1\34\1\22\1\35\1\4\1\37\1\55\1\54\10\56\1"+
            "\31\1\2\1\50\1\20\1\51\1\43\1\63\2\61\1\33\5\61\1\12\4\61\1"+
            "\5\3\61\1\13\1\11\7\61\1\27\1\63\1\30\1\41\1\61\1\63\1\45\1"+
            "\10\1\17\1\53\1\14\1\26\2\61\1\3\4\61\1\25\1\44\1\1\1\61\1\7"+
            "\1\52\1\24\1\61\1\6\1\61\1\46\2\61\1\15\1\32\1\16\uff82\63",
            "\1\64\20\uffff\1\66\2\uffff\1\65",
            "",
            "\1\71\1\72",
            "\1\73\5\uffff\12\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\113",
            "",
            "",
            "\1\117\11\uffff\1\120",
            "\1\121\17\uffff\1\122",
            "\1\123",
            "",
            "",
            "",
            "\1\127",
            "\1\131",
            "\1\133\21\uffff\1\132",
            "\1\136\17\uffff\1\135",
            "\1\140",
            "\1\143\4\uffff\1\144\15\uffff\1\142",
            "\1\146",
            "\1\147\3\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\150",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\160",
            "\1\162",
            "\1\164",
            "\1\165",
            "\1\166\1\uffff\12\167\12\uffff\3\75\35\uffff\3\75",
            "\1\171\1\uffff\10\173\2\174\12\uffff\3\75\21\uffff\1\172\13"+
            "\uffff\3\75\21\uffff\1\172",
            "\1\75\1\uffff\12\167\12\uffff\3\75\35\uffff\3\75",
            "\47\176\1\177\64\176\1\175\uffa3\176",
            "\42\u0081\1\u0082\71\u0081\1\u0080\uffa3\u0081",
            "",
            "",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "\1\u0087",
            "\1\u0089\1\u0088",
            "",
            "",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c\22\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090\1\uffff\1\u0091",
            "\1\u0092\17\uffff\1\u0093",
            "\1\u0094",
            "",
            "",
            "\1\u0095\15\uffff\1\u0096",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "",
            "",
            "",
            "\1\u009c",
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
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u009e",
            "\1\u009f",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\75\1\uffff\12\167\12\uffff\3\75\35\uffff\3\75",
            "",
            "\1\u00a3",
            "",
            "\1\75\1\uffff\10\173\2\174\12\uffff\3\75\35\uffff\3\75",
            "\1\75\1\uffff\12\174\12\uffff\3\75\35\uffff\3\75",
            "\1\u00a6\4\uffff\1\u00a6\10\uffff\10\u00a8\44\uffff\1\u00a6"+
            "\5\uffff\1\u00a6\3\uffff\1\u00a6\7\uffff\1\u00a6\3\uffff\1\u00a6"+
            "\1\uffff\1\u00a6\1\u00a7",
            "\47\177\1\u00a9\uffd8\177",
            "",
            "\1\u00aa\4\uffff\1\u00aa\10\uffff\10\u00ac\44\uffff\1\u00aa"+
            "\5\uffff\1\u00aa\3\uffff\1\u00aa\7\uffff\1\u00aa\3\uffff\1\u00aa"+
            "\1\uffff\1\u00aa\1\u00ab",
            "\42\u0081\1\u0082\71\u0081\1\u0080\uffa3\u0081",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b1\2\uffff\1\u00b0",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u00b2\25"+
            "\67",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c8\16\uffff\1\u00c7",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00cb",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "",
            "\47\177\1\u00a9\uffd8\177",
            "\60\177\12\u00cd\7\177\6\u00cd\32\177\6\u00cd\uff99\177",
            "",
            "",
            "\42\u0081\1\u0082\71\u0081\1\u0080\uffa3\u0081",
            "\60\177\12\u00ce\7\177\6\u00ce\32\177\6\u00ce\uff99\177",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "",
            "\1\u00e8",
            "",
            "\60\177\12\u00e9\7\177\6\u00e9\32\177\6\u00e9\uff99\177",
            "\60\177\12\u00ea\7\177\6\u00ea\32\177\6\u00ea\uff99\177",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00fc",
            "\1\u00fd",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\60\177\12\u00ff\7\177\6\u00ff\32\177\6\u00ff\uff99\177",
            "\60\177\12\u0100\7\177\6\u0100\32\177\6\u0100\uff99\177",
            "\1\u0101",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0103",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u010a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "",
            "",
            "\1\u010f",
            "\1\u0110",
            "",
            "\60\177\12\u0111\7\177\6\u0111\32\177\6\u0111\uff99\177",
            "\60\177\12\u0112\7\177\6\u0112\32\177\6\u0112\uff99\177",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0119",
            "\1\u011a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u011c",
            "\1\u011d",
            "\47\177\1\u00a9\uffd8\177",
            "\42\u0081\1\u0082\71\u0081\1\u0080\uffa3\u0081",
            "",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "",
            "\1\u0121",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0127",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u0129",
            "\1\u012a",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | RULE_AMOUNT_GEONE | RULE_AMOUNT_ONE_OR_ZERO | RULE_ASYACTIONS | RULE_ABSTRACT_CONDTION | RULE_CLOCK | RULE_HEX_LITERAL | RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_FLOATING_POINT_LITERAL | RULE_CHARACTER_LITERAL | RULE_STRING_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                        s = -1;
                        if ( (LA36_0=='p') ) {s = 1;}

                        else if ( (LA36_0==';') ) {s = 2;}

                        else if ( (LA36_0=='i') ) {s = 3;}

                        else if ( (LA36_0=='.') ) {s = 4;}

                        else if ( (LA36_0=='N') ) {s = 5;}

                        else if ( (LA36_0=='v') ) {s = 6;}

                        else if ( (LA36_0=='r') ) {s = 7;}

                        else if ( (LA36_0=='b') ) {s = 8;}

                        else if ( (LA36_0=='S') ) {s = 9;}

                        else if ( (LA36_0=='I') ) {s = 10;}

                        else if ( (LA36_0=='R') ) {s = 11;}

                        else if ( (LA36_0=='e') ) {s = 12;}

                        else if ( (LA36_0=='{') ) {s = 13;}

                        else if ( (LA36_0=='}') ) {s = 14;}

                        else if ( (LA36_0=='c') ) {s = 15;}

                        else if ( (LA36_0=='=') ) {s = 16;}

                        else if ( (LA36_0=='(') ) {s = 17;}

                        else if ( (LA36_0==',') ) {s = 18;}

                        else if ( (LA36_0==')') ) {s = 19;}

                        else if ( (LA36_0=='t') ) {s = 20;}

                        else if ( (LA36_0=='n') ) {s = 21;}

                        else if ( (LA36_0=='f') ) {s = 22;}

                        else if ( (LA36_0=='[') ) {s = 23;}

                        else if ( (LA36_0==']') ) {s = 24;}

                        else if ( (LA36_0==':') ) {s = 25;}

                        else if ( (LA36_0=='|') ) {s = 26;}

                        else if ( (LA36_0=='C') ) {s = 27;}

                        else if ( (LA36_0=='+') ) {s = 28;}

                        else if ( (LA36_0=='-') ) {s = 29;}

                        else if ( (LA36_0=='*') ) {s = 30;}

                        else if ( (LA36_0=='/') ) {s = 31;}

                        else if ( (LA36_0=='&') ) {s = 32;}

                        else if ( (LA36_0=='^') ) {s = 33;}

                        else if ( (LA36_0=='%') ) {s = 34;}

                        else if ( (LA36_0=='?') ) {s = 35;}

                        else if ( (LA36_0=='o') ) {s = 36;}

                        else if ( (LA36_0=='a') ) {s = 37;}

                        else if ( (LA36_0=='x') ) {s = 38;}

                        else if ( (LA36_0=='!') ) {s = 39;}

                        else if ( (LA36_0=='<') ) {s = 40;}

                        else if ( (LA36_0=='>') ) {s = 41;}

                        else if ( (LA36_0=='s') ) {s = 42;}

                        else if ( (LA36_0=='d') ) {s = 43;}

                        else if ( (LA36_0=='1') ) {s = 44;}

                        else if ( (LA36_0=='0') ) {s = 45;}

                        else if ( ((LA36_0>='2' && LA36_0<='9')) ) {s = 46;}

                        else if ( (LA36_0=='\'') ) {s = 47;}

                        else if ( (LA36_0=='\"') ) {s = 48;}

                        else if ( ((LA36_0>='A' && LA36_0<='B')||(LA36_0>='D' && LA36_0<='H')||(LA36_0>='J' && LA36_0<='M')||(LA36_0>='O' && LA36_0<='Q')||(LA36_0>='T' && LA36_0<='Z')||LA36_0=='_'||(LA36_0>='g' && LA36_0<='h')||(LA36_0>='j' && LA36_0<='m')||LA36_0=='q'||LA36_0=='u'||LA36_0=='w'||(LA36_0>='y' && LA36_0<='z')) ) {s = 49;}

                        else if ( ((LA36_0>='\t' && LA36_0<='\n')||LA36_0=='\r'||LA36_0==' ') ) {s = 50;}

                        else if ( ((LA36_0>='\u0000' && LA36_0<='\b')||(LA36_0>='\u000B' && LA36_0<='\f')||(LA36_0>='\u000E' && LA36_0<='\u001F')||(LA36_0>='#' && LA36_0<='$')||LA36_0=='@'||LA36_0=='\\'||LA36_0=='`'||(LA36_0>='~' && LA36_0<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_129 = input.LA(1);

                        s = -1;
                        if ( (LA36_129=='\"') ) {s = 130;}

                        else if ( (LA36_129=='\\') ) {s = 128;}

                        else if ( ((LA36_129>='\u0000' && LA36_129<='!')||(LA36_129>='#' && LA36_129<='[')||(LA36_129>=']' && LA36_129<='\uFFFF')) ) {s = 129;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_126 = input.LA(1);

                        s = -1;
                        if ( (LA36_126=='\'') ) {s = 169;}

                        else if ( ((LA36_126>='\u0000' && LA36_126<='&')||(LA36_126>='(' && LA36_126<='\uFFFF')) ) {s = 127;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA36_234 = input.LA(1);

                        s = -1;
                        if ( ((LA36_234>='\u0000' && LA36_234<='/')||(LA36_234>=':' && LA36_234<='@')||(LA36_234>='G' && LA36_234<='`')||(LA36_234>='g' && LA36_234<='\uFFFF')) ) {s = 127;}

                        else if ( ((LA36_234>='0' && LA36_234<='9')||(LA36_234>='A' && LA36_234<='F')||(LA36_234>='a' && LA36_234<='f')) ) {s = 256;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA36_206 = input.LA(1);

                        s = -1;
                        if ( ((LA36_206>='0' && LA36_206<='9')||(LA36_206>='A' && LA36_206<='F')||(LA36_206>='a' && LA36_206<='f')) ) {s = 234;}

                        else if ( ((LA36_206>='\u0000' && LA36_206<='/')||(LA36_206>=':' && LA36_206<='@')||(LA36_206>='G' && LA36_206<='`')||(LA36_206>='g' && LA36_206<='\uFFFF')) ) {s = 127;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA36_256 = input.LA(1);

                        s = -1;
                        if ( ((LA36_256>='\u0000' && LA36_256<='/')||(LA36_256>=':' && LA36_256<='@')||(LA36_256>='G' && LA36_256<='`')||(LA36_256>='g' && LA36_256<='\uFFFF')) ) {s = 127;}

                        else if ( ((LA36_256>='0' && LA36_256<='9')||(LA36_256>='A' && LA36_256<='F')||(LA36_256>='a' && LA36_256<='f')) ) {s = 274;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA36_273 = input.LA(1);

                        s = -1;
                        if ( (LA36_273=='\'') ) {s = 169;}

                        else if ( ((LA36_273>='\u0000' && LA36_273<='&')||(LA36_273>='(' && LA36_273<='\uFFFF')) ) {s = 127;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA36_233 = input.LA(1);

                        s = -1;
                        if ( ((LA36_233>='\u0000' && LA36_233<='/')||(LA36_233>=':' && LA36_233<='@')||(LA36_233>='G' && LA36_233<='`')||(LA36_233>='g' && LA36_233<='\uFFFF')) ) {s = 127;}

                        else if ( ((LA36_233>='0' && LA36_233<='9')||(LA36_233>='A' && LA36_233<='F')||(LA36_233>='a' && LA36_233<='f')) ) {s = 255;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA36_255 = input.LA(1);

                        s = -1;
                        if ( ((LA36_255>='0' && LA36_255<='9')||(LA36_255>='A' && LA36_255<='F')||(LA36_255>='a' && LA36_255<='f')) ) {s = 273;}

                        else if ( ((LA36_255>='\u0000' && LA36_255<='/')||(LA36_255>=':' && LA36_255<='@')||(LA36_255>='G' && LA36_255<='`')||(LA36_255>='g' && LA36_255<='\uFFFF')) ) {s = 127;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA36_171 = input.LA(1);

                        s = -1;
                        if ( ((LA36_171>='0' && LA36_171<='9')||(LA36_171>='A' && LA36_171<='F')||(LA36_171>='a' && LA36_171<='f')) ) {s = 206;}

                        else if ( ((LA36_171>='\u0000' && LA36_171<='/')||(LA36_171>=':' && LA36_171<='@')||(LA36_171>='G' && LA36_171<='`')||(LA36_171>='g' && LA36_171<='\uFFFF')) ) {s = 127;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA36_205 = input.LA(1);

                        s = -1;
                        if ( ((LA36_205>='\u0000' && LA36_205<='/')||(LA36_205>=':' && LA36_205<='@')||(LA36_205>='G' && LA36_205<='`')||(LA36_205>='g' && LA36_205<='\uFFFF')) ) {s = 127;}

                        else if ( ((LA36_205>='0' && LA36_205<='9')||(LA36_205>='A' && LA36_205<='F')||(LA36_205>='a' && LA36_205<='f')) ) {s = 233;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA36_274 = input.LA(1);

                        s = -1;
                        if ( (LA36_274=='\"') ) {s = 130;}

                        else if ( (LA36_274=='\\') ) {s = 128;}

                        else if ( ((LA36_274>='\u0000' && LA36_274<='!')||(LA36_274>='#' && LA36_274<='[')||(LA36_274>=']' && LA36_274<='\uFFFF')) ) {s = 129;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA36_47 = input.LA(1);

                        s = -1;
                        if ( (LA36_47=='\\') ) {s = 125;}

                        else if ( ((LA36_47>='\u0000' && LA36_47<='&')||(LA36_47>='(' && LA36_47<='[')||(LA36_47>=']' && LA36_47<='\uFFFF')) ) {s = 126;}

                        else if ( (LA36_47=='\'') ) {s = 127;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA36_48 = input.LA(1);

                        s = -1;
                        if ( (LA36_48=='\\') ) {s = 128;}

                        else if ( ((LA36_48>='\u0000' && LA36_48<='!')||(LA36_48>='#' && LA36_48<='[')||(LA36_48>=']' && LA36_48<='\uFFFF')) ) {s = 129;}

                        else if ( (LA36_48=='\"') ) {s = 130;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA36_166 = input.LA(1);

                        s = -1;
                        if ( (LA36_166=='\'') ) {s = 169;}

                        else if ( ((LA36_166>='\u0000' && LA36_166<='&')||(LA36_166>='(' && LA36_166<='\uFFFF')) ) {s = 127;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA36_167 = input.LA(1);

                        s = -1;
                        if ( ((LA36_167>='0' && LA36_167<='9')||(LA36_167>='A' && LA36_167<='F')||(LA36_167>='a' && LA36_167<='f')) ) {s = 205;}

                        else if ( ((LA36_167>='\u0000' && LA36_167<='/')||(LA36_167>=':' && LA36_167<='@')||(LA36_167>='G' && LA36_167<='`')||(LA36_167>='g' && LA36_167<='\uFFFF')) ) {s = 127;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA36_170 = input.LA(1);

                        s = -1;
                        if ( (LA36_170=='\"') ) {s = 130;}

                        else if ( (LA36_170=='\\') ) {s = 128;}

                        else if ( ((LA36_170>='\u0000' && LA36_170<='!')||(LA36_170>='#' && LA36_170<='[')||(LA36_170>=']' && LA36_170<='\uFFFF')) ) {s = 129;}

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