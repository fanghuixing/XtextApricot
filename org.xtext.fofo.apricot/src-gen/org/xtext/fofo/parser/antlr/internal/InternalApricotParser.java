package org.xtext.fofo.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.fofo.services.ApricotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalApricotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_AMOUNT_GEONE", "RULE_AMOUNT_ONE_OR_ZERO", "RULE_ASYACTIONS", "RULE_ABSTRACT_CONDTION", "RULE_CLOCK", "RULE_FLOATING_POINT_LITERAL", "RULE_CHARACTER_LITERAL", "RULE_STRING_LITERAL", "RULE_HEX_LITERAL", "RULE_OCTAL_LITERAL", "RULE_DECIMAL_LITERAL", "RULE_HEX_DIGIT", "RULE_INTEGER_TYPE_SUFFIX", "RULE_EXPONENT", "RULE_FLOAT_TYPE_SUFFIX", "RULE_ESCAPE_SEQUENCE", "RULE_UNICODE_ESCAPE", "RULE_OCTAL_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.*'", "'.'", "'public'", "'private'", "'Native'", "'void'", "'int'", "'real'", "'boolean'", "'String'", "'Int'", "'Real'", "'interface'", "'extends'", "'{'", "'}'", "'class'", "'implements'", "'='", "'('", "','", "')'", "'return'", "'this'", "'new'", "'true'", "'false'", "'Requires'", "'['", "']'", "':'", "'|'", "'Constraint'", "'Invariant'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'?'", "'or'", "'and'", "'xor'", "'=='", "'!='", "'instanceof'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'super'", "'null'", "'dot'"
    };
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
    public static final int T__85=85;
    public static final int RULE_ABSTRACT_CONDTION=10;
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
    public static final int T__39=39;
    public static final int RULE_INTEGER_TYPE_SUFFIX=19;
    public static final int RULE_FLOATING_POINT_LITERAL=12;
    public static final int RULE_WS=27;

    // delegates
    // delegators


        public InternalApricotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalApricotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalApricotParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g"; }



     	private ApricotGrammarAccess grammarAccess;
     	
        public InternalApricotParser(TokenStream input, ApricotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected ApricotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:76:1: ruleProgram returns [EObject current=null] : this_PackageDeclaration_0= rulePackageDeclaration ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:79:28: (this_PackageDeclaration_0= rulePackageDeclaration )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:81:5: this_PackageDeclaration_0= rulePackageDeclaration
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getProgramAccess().getPackageDeclarationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_ruleProgram131);
            this_PackageDeclaration_0=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PackageDeclaration_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:97:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:98:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:99:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration165);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:106:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:109:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:110:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:110:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:110:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_rulePackageDeclaration212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:114:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:115:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:115:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:116:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration233);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePackageDeclaration245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getSemicolonKeyword_2());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:136:1: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:137:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:137:1: (lv_imports_3_0= ruleImport )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:138:3: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getImportsImportParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_rulePackageDeclaration266);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_3_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:154:3: ( (lv_elements_4_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=34 && LA2_0<=35)||LA2_0==44||LA2_0==48) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:155:1: (lv_elements_4_0= ruleAbstractElement )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:155:1: (lv_elements_4_0= ruleAbstractElement )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:156:3: lv_elements_4_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_rulePackageDeclaration288);
            	    lv_elements_4_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_4_0, 
            	              		"AbstractElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:180:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:181:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:182:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement325);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement335); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:189:1: ruleAbstractElement returns [EObject current=null] : this_RefType_0= ruleRefType ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_RefType_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:192:28: (this_RefType_0= ruleRefType )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:194:5: this_RefType_0= ruleRefType
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAbstractElementAccess().getRefTypeParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleRefType_in_ruleAbstractElement381);
            this_RefType_0=ruleRefType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RefType_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:210:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:211:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:212:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport415);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport425); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:219:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:222:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:223:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:223:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:223:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleImport462); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:227:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:228:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:228:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:229:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport483);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleImport495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:257:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:258:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:259:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard532);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard543); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:266:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:269:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:270:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:270:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:271:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard590);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:281:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:282:2: kw= '.*'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleQualifiedNameWithWildcard609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:295:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:296:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:297:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName652);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName663); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:304:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:307:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:308:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:308:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:308:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:315:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==33) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:316:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_ruleQualifiedName722); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName737); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleModifier"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:338:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:339:2: (iv_ruleModifier= ruleModifier EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:340:2: iv_ruleModifier= ruleModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifierRule()); 
            }
            pushFollow(FOLLOW_ruleModifier_in_entryRuleModifier787);
            iv_ruleModifier=ruleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifier798); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:347:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'public' | kw= 'private' ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:350:28: ( (kw= 'public' | kw= 'private' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:351:1: (kw= 'public' | kw= 'private' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:351:1: (kw= 'public' | kw= 'private' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            else if ( (LA5_0==35) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:352:2: kw= 'public'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleModifier836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getModifierAccess().getPublicKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:359:2: kw= 'private'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleModifier855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getModifierAccess().getPrivateKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleBuiltInModifier"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:372:1: entryRuleBuiltInModifier returns [String current=null] : iv_ruleBuiltInModifier= ruleBuiltInModifier EOF ;
    public final String entryRuleBuiltInModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBuiltInModifier = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:373:2: (iv_ruleBuiltInModifier= ruleBuiltInModifier EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:374:2: iv_ruleBuiltInModifier= ruleBuiltInModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltInModifierRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltInModifier_in_entryRuleBuiltInModifier896);
            iv_ruleBuiltInModifier=ruleBuiltInModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltInModifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInModifier907); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuiltInModifier"


    // $ANTLR start "ruleBuiltInModifier"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:381:1: ruleBuiltInModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Native' ;
    public final AntlrDatatypeRuleToken ruleBuiltInModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:384:28: (kw= 'Native' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:386:2: kw= 'Native'
            {
            kw=(Token)match(input,36,FOLLOW_36_in_ruleBuiltInModifier944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getBuiltInModifierAccess().getNativeKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuiltInModifier"


    // $ANTLR start "entryRuleRefType"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:399:1: entryRuleRefType returns [EObject current=null] : iv_ruleRefType= ruleRefType EOF ;
    public final EObject entryRuleRefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefType = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:400:2: (iv_ruleRefType= ruleRefType EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:401:2: iv_ruleRefType= ruleRefType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRefType_in_entryRuleRefType983);
            iv_ruleRefType=ruleRefType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefType993); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefType"


    // $ANTLR start "ruleRefType"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:408:1: ruleRefType returns [EObject current=null] : (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) ;
    public final EObject ruleRefType() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Interface_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:411:28: ( (this_Class_0= ruleClass | this_Interface_1= ruleInterface ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:412:1: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:412:1: (this_Class_0= ruleClass | this_Interface_1= ruleInterface )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 34:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==48) ) {
                    alt6=1;
                }
                else if ( (LA6_1==44) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==44) ) {
                    alt6=2;
                }
                else if ( (LA6_2==48) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                alt6=1;
                }
                break;
            case 44:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:413:5: this_Class_0= ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRefTypeAccess().getClassParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClass_in_ruleRefType1040);
                    this_Class_0=ruleClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Class_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:423:5: this_Interface_1= ruleInterface
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRefTypeAccess().getInterfaceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterface_in_ruleRefType1067);
                    this_Interface_1=ruleInterface();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Interface_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefType"


    // $ANTLR start "entryRuleNonRefType"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:439:1: entryRuleNonRefType returns [EObject current=null] : iv_ruleNonRefType= ruleNonRefType EOF ;
    public final EObject entryRuleNonRefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonRefType = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:440:2: (iv_ruleNonRefType= ruleNonRefType EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:441:2: iv_ruleNonRefType= ruleNonRefType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonRefTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNonRefType_in_entryRuleNonRefType1102);
            iv_ruleNonRefType=ruleNonRefType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonRefType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonRefType1112); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonRefType"


    // $ANTLR start "ruleNonRefType"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:448:1: ruleNonRefType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_MathType_1= ruleMathType ) ;
    public final EObject ruleNonRefType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_MathType_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:451:28: ( (this_BasicType_0= ruleBasicType | this_MathType_1= ruleMathType ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:452:1: (this_BasicType_0= ruleBasicType | this_MathType_1= ruleMathType )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:452:1: (this_BasicType_0= ruleBasicType | this_MathType_1= ruleMathType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=37 && LA7_0<=41)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=42 && LA7_0<=43)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:453:5: this_BasicType_0= ruleBasicType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNonRefTypeAccess().getBasicTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBasicType_in_ruleNonRefType1159);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:463:5: this_MathType_1= ruleMathType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNonRefTypeAccess().getMathTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMathType_in_ruleNonRefType1186);
                    this_MathType_1=ruleMathType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MathType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonRefType"


    // $ANTLR start "entryRuleBasicType"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:479:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:480:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:481:2: iv_ruleBasicType= ruleBasicType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicTypeRule()); 
            }
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType1221);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType1231); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:488:1: ruleBasicType returns [EObject current=null] : ( ( (lv_BT_0_1= 'void' | lv_BT_0_2= 'int' | lv_BT_0_3= 'real' | lv_BT_0_4= 'boolean' | lv_BT_0_5= 'String' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_BT_0_1=null;
        Token lv_BT_0_2=null;
        Token lv_BT_0_3=null;
        Token lv_BT_0_4=null;
        Token lv_BT_0_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:491:28: ( ( ( (lv_BT_0_1= 'void' | lv_BT_0_2= 'int' | lv_BT_0_3= 'real' | lv_BT_0_4= 'boolean' | lv_BT_0_5= 'String' ) ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:492:1: ( ( (lv_BT_0_1= 'void' | lv_BT_0_2= 'int' | lv_BT_0_3= 'real' | lv_BT_0_4= 'boolean' | lv_BT_0_5= 'String' ) ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:492:1: ( ( (lv_BT_0_1= 'void' | lv_BT_0_2= 'int' | lv_BT_0_3= 'real' | lv_BT_0_4= 'boolean' | lv_BT_0_5= 'String' ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:493:1: ( (lv_BT_0_1= 'void' | lv_BT_0_2= 'int' | lv_BT_0_3= 'real' | lv_BT_0_4= 'boolean' | lv_BT_0_5= 'String' ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:493:1: ( (lv_BT_0_1= 'void' | lv_BT_0_2= 'int' | lv_BT_0_3= 'real' | lv_BT_0_4= 'boolean' | lv_BT_0_5= 'String' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:494:1: (lv_BT_0_1= 'void' | lv_BT_0_2= 'int' | lv_BT_0_3= 'real' | lv_BT_0_4= 'boolean' | lv_BT_0_5= 'String' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:494:1: (lv_BT_0_1= 'void' | lv_BT_0_2= 'int' | lv_BT_0_3= 'real' | lv_BT_0_4= 'boolean' | lv_BT_0_5= 'String' )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt8=1;
                }
                break;
            case 38:
                {
                alt8=2;
                }
                break;
            case 39:
                {
                alt8=3;
                }
                break;
            case 40:
                {
                alt8=4;
                }
                break;
            case 41:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:495:3: lv_BT_0_1= 'void'
                    {
                    lv_BT_0_1=(Token)match(input,37,FOLLOW_37_in_ruleBasicType1275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_BT_0_1, grammarAccess.getBasicTypeAccess().getBTVoidKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBasicTypeRule());
                      	        }
                             		setWithLastConsumed(current, "BT", lv_BT_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:507:8: lv_BT_0_2= 'int'
                    {
                    lv_BT_0_2=(Token)match(input,38,FOLLOW_38_in_ruleBasicType1304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_BT_0_2, grammarAccess.getBasicTypeAccess().getBTIntKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBasicTypeRule());
                      	        }
                             		setWithLastConsumed(current, "BT", lv_BT_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:519:8: lv_BT_0_3= 'real'
                    {
                    lv_BT_0_3=(Token)match(input,39,FOLLOW_39_in_ruleBasicType1333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_BT_0_3, grammarAccess.getBasicTypeAccess().getBTRealKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBasicTypeRule());
                      	        }
                             		setWithLastConsumed(current, "BT", lv_BT_0_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:531:8: lv_BT_0_4= 'boolean'
                    {
                    lv_BT_0_4=(Token)match(input,40,FOLLOW_40_in_ruleBasicType1362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_BT_0_4, grammarAccess.getBasicTypeAccess().getBTBooleanKeyword_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBasicTypeRule());
                      	        }
                             		setWithLastConsumed(current, "BT", lv_BT_0_4, null);
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:543:8: lv_BT_0_5= 'String'
                    {
                    lv_BT_0_5=(Token)match(input,41,FOLLOW_41_in_ruleBasicType1391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_BT_0_5, grammarAccess.getBasicTypeAccess().getBTStringKeyword_0_4());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBasicTypeRule());
                      	        }
                             		setWithLastConsumed(current, "BT", lv_BT_0_5, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleMathType"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:566:1: entryRuleMathType returns [EObject current=null] : iv_ruleMathType= ruleMathType EOF ;
    public final EObject entryRuleMathType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathType = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:567:2: (iv_ruleMathType= ruleMathType EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:568:2: iv_ruleMathType= ruleMathType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMathTypeRule()); 
            }
            pushFollow(FOLLOW_ruleMathType_in_entryRuleMathType1442);
            iv_ruleMathType=ruleMathType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMathType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathType1452); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathType"


    // $ANTLR start "ruleMathType"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:575:1: ruleMathType returns [EObject current=null] : ( ( (lv_MT_0_1= 'Int' | lv_MT_0_2= 'Real' ) ) ) ;
    public final EObject ruleMathType() throws RecognitionException {
        EObject current = null;

        Token lv_MT_0_1=null;
        Token lv_MT_0_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:578:28: ( ( ( (lv_MT_0_1= 'Int' | lv_MT_0_2= 'Real' ) ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:579:1: ( ( (lv_MT_0_1= 'Int' | lv_MT_0_2= 'Real' ) ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:579:1: ( ( (lv_MT_0_1= 'Int' | lv_MT_0_2= 'Real' ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:580:1: ( (lv_MT_0_1= 'Int' | lv_MT_0_2= 'Real' ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:580:1: ( (lv_MT_0_1= 'Int' | lv_MT_0_2= 'Real' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:581:1: (lv_MT_0_1= 'Int' | lv_MT_0_2= 'Real' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:581:1: (lv_MT_0_1= 'Int' | lv_MT_0_2= 'Real' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            else if ( (LA9_0==43) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:582:3: lv_MT_0_1= 'Int'
                    {
                    lv_MT_0_1=(Token)match(input,42,FOLLOW_42_in_ruleMathType1496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_MT_0_1, grammarAccess.getMathTypeAccess().getMTIntKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMathTypeRule());
                      	        }
                             		setWithLastConsumed(current, "MT", lv_MT_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:594:8: lv_MT_0_2= 'Real'
                    {
                    lv_MT_0_2=(Token)match(input,43,FOLLOW_43_in_ruleMathType1525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_MT_0_2, grammarAccess.getMathTypeAccess().getMTRealKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMathTypeRule());
                      	        }
                             		setWithLastConsumed(current, "MT", lv_MT_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathType"


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:617:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:618:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:619:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface1576);
            iv_ruleInterface=ruleInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface1586); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:626:1: ruleInterface returns [EObject current=null] : ( ( ruleModifier )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleAbstractInterfaceElement ) )* otherlv_7= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_members_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:629:28: ( ( ( ruleModifier )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleAbstractInterfaceElement ) )* otherlv_7= '}' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:630:1: ( ( ruleModifier )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleAbstractInterfaceElement ) )* otherlv_7= '}' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:630:1: ( ( ruleModifier )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleAbstractInterfaceElement ) )* otherlv_7= '}' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:630:2: ( ruleModifier )? otherlv_1= 'interface' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_members_6_0= ruleAbstractInterfaceElement ) )* otherlv_7= '}'
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:630:2: ( ruleModifier )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=34 && LA10_0<=35)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:631:5: ruleModifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceAccess().getModifierParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleModifier_in_ruleInterface1628);
                    ruleModifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleInterface1641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:642:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:643:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:643:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:644:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInterfaceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:660:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:660:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleInterface1676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:664:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:665:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:665:1: ( ruleQualifiedName )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:666:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceAccess().getSuperclassInterfaceCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInterface1699);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleInterface1713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:683:1: ( (lv_members_6_0= ruleAbstractInterfaceElement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=34 && LA12_0<=43)||LA12_0==59||(LA12_0>=64 && LA12_0<=65)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:684:1: (lv_members_6_0= ruleAbstractInterfaceElement )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:684:1: (lv_members_6_0= ruleAbstractInterfaceElement )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:685:3: lv_members_6_0= ruleAbstractInterfaceElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceAccess().getMembersAbstractInterfaceElementParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractInterfaceElement_in_ruleInterface1734);
            	    lv_members_6_0=ruleAbstractInterfaceElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_6_0, 
            	              		"AbstractInterfaceElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleInterface1747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleClass"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:713:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:714:2: (iv_ruleClass= ruleClass EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:715:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass1783);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass1793); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:722:1: ruleClass returns [EObject current=null] : ( ( ruleModifier )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'implements' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_members_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:725:28: ( ( ( ruleModifier )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'implements' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:726:1: ( ( ruleModifier )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'implements' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:726:1: ( ( ruleModifier )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'implements' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:726:2: ( ruleModifier )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'implements' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_members_8_0= ruleMember ) )* otherlv_9= '}'
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:726:2: ( ruleModifier )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=34 && LA13_0<=35)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:727:5: ruleModifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassAccess().getModifierParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleModifier_in_ruleClass1835);
                    ruleModifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleClass1848); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:738:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:739:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:739:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:740:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:756:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==45) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:756:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleClass1883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:760:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:761:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:761:1: ( ruleQualifiedName )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:762:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getSuperclassClassCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass1906);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:775:4: (otherlv_5= 'implements' ( ( ruleQualifiedName ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==49) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:775:6: otherlv_5= 'implements' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleClass1921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getImplementsKeyword_4_0());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:779:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:780:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:780:1: ( ruleQualifiedName )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:781:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassAccess().getInterfaceclassInterfaceCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleClass1944);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleClass1958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:798:1: ( (lv_members_8_0= ruleMember ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=34 && LA16_0<=35)||(LA16_0>=37 && LA16_0<=43)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:799:1: (lv_members_8_0= ruleMember )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:799:1: (lv_members_8_0= ruleMember )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:800:3: lv_members_8_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getMembersMemberParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMember_in_ruleClass1979);
            	    lv_members_8_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_8_0, 
            	              		"Member");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleClass1992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleMember"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:828:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:829:2: (iv_ruleMember= ruleMember EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:830:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember2028);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember2038); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:837:1: ruleMember returns [EObject current=null] : (this_Field_0= ruleField | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Method_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:840:28: ( (this_Field_0= ruleField | this_Method_1= ruleMethod ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:841:1: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:841:1: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:842:5: this_Field_0= ruleField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleField_in_ruleMember2085);
                    this_Field_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Field_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:852:5: this_Method_1= ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMethod_in_ruleMember2112);
                    this_Method_1=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Method_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleFieldName"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:868:1: entryRuleFieldName returns [String current=null] : iv_ruleFieldName= ruleFieldName EOF ;
    public final String entryRuleFieldName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldName = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:869:2: (iv_ruleFieldName= ruleFieldName EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:870:2: iv_ruleFieldName= ruleFieldName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldNameRule()); 
            }
            pushFollow(FOLLOW_ruleFieldName_in_entryRuleFieldName2148);
            iv_ruleFieldName=ruleFieldName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldName2159); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldName"


    // $ANTLR start "ruleFieldName"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:877:1: ruleFieldName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleFieldName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:880:28: (this_ID_0= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:881:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldName2198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFieldNameAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldName"


    // $ANTLR start "entryRuleField"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:896:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:897:2: (iv_ruleField= ruleField EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:898:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField2242);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField2252); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:905:1: ruleField returns [EObject current=null] : ( ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= ruleFieldName ) ) (otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_varini_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:908:28: ( ( ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= ruleFieldName ) ) (otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) ) )? otherlv_4= ';' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:909:1: ( ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= ruleFieldName ) ) (otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) ) )? otherlv_4= ';' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:909:1: ( ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= ruleFieldName ) ) (otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) ) )? otherlv_4= ';' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:909:2: ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= ruleFieldName ) ) (otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) ) )? otherlv_4= ';'
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:909:2: ( (lv_type_0_0= ruleUseType ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:910:1: (lv_type_0_0= ruleUseType )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:910:1: (lv_type_0_0= ruleUseType )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:911:3: lv_type_0_0= ruleUseType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getTypeUseTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUseType_in_ruleField2298);
            lv_type_0_0=ruleUseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"UseType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:927:2: ( (lv_name_1_0= ruleFieldName ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:928:1: (lv_name_1_0= ruleFieldName )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:928:1: (lv_name_1_0= ruleFieldName )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:929:3: lv_name_1_0= ruleFieldName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getNameFieldNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldName_in_ruleField2319);
            lv_name_1_0=ruleFieldName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"FieldName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:945:2: (otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==50) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:945:4: otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) )
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleField2332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:949:1: ( (lv_varini_3_0= ruleVariableInitializer ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:950:1: (lv_varini_3_0= ruleVariableInitializer )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:950:1: (lv_varini_3_0= ruleVariableInitializer )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:951:3: lv_varini_3_0= ruleVariableInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getVariniVariableInitializerParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableInitializer_in_ruleField2353);
                    lv_varini_3_0=ruleVariableInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"varini",
                              		lv_varini_3_0, 
                              		"VariableInitializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleField2367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:979:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:980:2: (iv_ruleMethod= ruleMethod EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:981:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod2403);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod2413); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:988:1: ruleMethod returns [EObject current=null] : ( ( ruleModifier )? ( (lv_type_1_0= ruleUseType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleMethodBody ) ) otherlv_10= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_type_1_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_body_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:991:28: ( ( ( ruleModifier )? ( (lv_type_1_0= ruleUseType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleMethodBody ) ) otherlv_10= '}' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:992:1: ( ( ruleModifier )? ( (lv_type_1_0= ruleUseType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleMethodBody ) ) otherlv_10= '}' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:992:1: ( ( ruleModifier )? ( (lv_type_1_0= ruleUseType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleMethodBody ) ) otherlv_10= '}' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:992:2: ( ruleModifier )? ( (lv_type_1_0= ruleUseType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_body_9_0= ruleMethodBody ) ) otherlv_10= '}'
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:992:2: ( ruleModifier )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=34 && LA19_0<=35)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:993:5: ruleModifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMethodAccess().getModifierParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleModifier_in_ruleMethod2455);
                    ruleModifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1000:3: ( (lv_type_1_0= ruleUseType ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1001:1: (lv_type_1_0= ruleUseType )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1001:1: (lv_type_1_0= ruleUseType )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1002:3: lv_type_1_0= ruleUseType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getTypeUseTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUseType_in_ruleMethod2477);
            lv_type_1_0=ruleUseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"UseType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1018:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1019:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1019:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1020:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod2494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleMethod2511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1040:1: ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||(LA21_0>=37 && LA21_0<=43)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1040:2: ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )*
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1040:2: ( (lv_params_4_0= ruleParameter ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1041:1: (lv_params_4_0= ruleParameter )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1041:1: (lv_params_4_0= ruleParameter )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1042:3: lv_params_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod2533);
                    lv_params_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_4_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1058:2: (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==52) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1058:4: otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleMethod2546); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1062:1: ( (lv_params_6_0= ruleParameter ) )
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1063:1: (lv_params_6_0= ruleParameter )
                    	    {
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1063:1: (lv_params_6_0= ruleParameter )
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1064:3: lv_params_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod2567);
                    	    lv_params_6_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_6_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleMethod2583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleMethod2595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1088:1: ( (lv_body_9_0= ruleMethodBody ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1089:1: (lv_body_9_0= ruleMethodBody )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1089:1: (lv_body_9_0= ruleMethodBody )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1090:3: lv_body_9_0= ruleMethodBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMethodBody_in_ruleMethod2616);
            lv_body_9_0=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_9_0, 
                      		"MethodBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,47,FOLLOW_47_in_ruleMethod2628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleAbstractMethod"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1118:1: entryRuleAbstractMethod returns [EObject current=null] : iv_ruleAbstractMethod= ruleAbstractMethod EOF ;
    public final EObject entryRuleAbstractMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMethod = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1119:2: (iv_ruleAbstractMethod= ruleAbstractMethod EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1120:2: iv_ruleAbstractMethod= ruleAbstractMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractMethodRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractMethod_in_entryRuleAbstractMethod2664);
            iv_ruleAbstractMethod=ruleAbstractMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractMethod2674); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractMethod"


    // $ANTLR start "ruleAbstractMethod"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1127:1: ruleAbstractMethod returns [EObject current=null] : ( ( ruleModifier )? ( ruleBuiltInModifier )? ( (lv_type_2_0= ruleUseType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= '{' ( (lv_body_10_0= ruleAbstractMethodBody ) ) otherlv_11= '}' )? otherlv_12= ';' ) ;
    public final EObject ruleAbstractMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_type_2_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_body_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1130:28: ( ( ( ruleModifier )? ( ruleBuiltInModifier )? ( (lv_type_2_0= ruleUseType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= '{' ( (lv_body_10_0= ruleAbstractMethodBody ) ) otherlv_11= '}' )? otherlv_12= ';' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1131:1: ( ( ruleModifier )? ( ruleBuiltInModifier )? ( (lv_type_2_0= ruleUseType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= '{' ( (lv_body_10_0= ruleAbstractMethodBody ) ) otherlv_11= '}' )? otherlv_12= ';' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1131:1: ( ( ruleModifier )? ( ruleBuiltInModifier )? ( (lv_type_2_0= ruleUseType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= '{' ( (lv_body_10_0= ruleAbstractMethodBody ) ) otherlv_11= '}' )? otherlv_12= ';' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1131:2: ( ruleModifier )? ( ruleBuiltInModifier )? ( (lv_type_2_0= ruleUseType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= '{' ( (lv_body_10_0= ruleAbstractMethodBody ) ) otherlv_11= '}' )? otherlv_12= ';'
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1131:2: ( ruleModifier )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=34 && LA22_0<=35)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1132:5: ruleModifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractMethodAccess().getModifierParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleModifier_in_ruleAbstractMethod2716);
                    ruleModifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1139:3: ( ruleBuiltInModifier )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1140:5: ruleBuiltInModifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractMethodAccess().getBuiltInModifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltInModifier_in_ruleAbstractMethod2734);
                    ruleBuiltInModifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1147:3: ( (lv_type_2_0= ruleUseType ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1148:1: (lv_type_2_0= ruleUseType )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1148:1: (lv_type_2_0= ruleUseType )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1149:3: lv_type_2_0= ruleUseType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbstractMethodAccess().getTypeUseTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUseType_in_ruleAbstractMethod2756);
            lv_type_2_0=ruleUseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAbstractMethodRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"UseType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1165:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1166:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1166:1: (lv_name_3_0= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1167:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstractMethod2773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getAbstractMethodAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAbstractMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleAbstractMethod2790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAbstractMethodAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1187:1: ( ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||(LA25_0>=37 && LA25_0<=43)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1187:2: ( (lv_params_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1187:2: ( (lv_params_5_0= ruleParameter ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1188:1: (lv_params_5_0= ruleParameter )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1188:1: (lv_params_5_0= ruleParameter )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1189:3: lv_params_5_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAbstractMethodAccess().getParamsParameterParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleAbstractMethod2812);
                    lv_params_5_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAbstractMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_5_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1205:2: (otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==52) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1205:4: otherlv_6= ',' ( (lv_params_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleAbstractMethod2825); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getAbstractMethodAccess().getCommaKeyword_5_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1209:1: ( (lv_params_7_0= ruleParameter ) )
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1210:1: (lv_params_7_0= ruleParameter )
                    	    {
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1210:1: (lv_params_7_0= ruleParameter )
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1211:3: lv_params_7_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAbstractMethodAccess().getParamsParameterParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleAbstractMethod2846);
                    	    lv_params_7_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAbstractMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_7_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,53,FOLLOW_53_in_ruleAbstractMethod2862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getAbstractMethodAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1231:1: (otherlv_9= '{' ( (lv_body_10_0= ruleAbstractMethodBody ) ) otherlv_11= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1231:3: otherlv_9= '{' ( (lv_body_10_0= ruleAbstractMethodBody ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_46_in_ruleAbstractMethod2875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getAbstractMethodAccess().getLeftCurlyBracketKeyword_7_0());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1235:1: ( (lv_body_10_0= ruleAbstractMethodBody ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1236:1: (lv_body_10_0= ruleAbstractMethodBody )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1236:1: (lv_body_10_0= ruleAbstractMethodBody )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1237:3: lv_body_10_0= ruleAbstractMethodBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAbstractMethodAccess().getBodyAbstractMethodBodyParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractMethodBody_in_ruleAbstractMethod2896);
                    lv_body_10_0=ruleAbstractMethodBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAbstractMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_10_0, 
                              		"AbstractMethodBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleAbstractMethod2908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getAbstractMethodAccess().getRightCurlyBracketKeyword_7_2());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleAbstractMethod2922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getAbstractMethodAccess().getSemicolonKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractMethod"


    // $ANTLR start "entryRuleUseType"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1269:1: entryRuleUseType returns [EObject current=null] : iv_ruleUseType= ruleUseType EOF ;
    public final EObject entryRuleUseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseType = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1270:2: (iv_ruleUseType= ruleUseType EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1271:2: iv_ruleUseType= ruleUseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUseType_in_entryRuleUseType2958);
            iv_ruleUseType=ruleUseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUseType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseType2968); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseType"


    // $ANTLR start "ruleUseType"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1278:1: ruleUseType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_type2_1_0= ruleNonRefType ) ) ) ;
    public final EObject ruleUseType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type2_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1281:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_type2_1_0= ruleNonRefType ) ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1282:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_type2_1_0= ruleNonRefType ) ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1282:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_type2_1_0= ruleNonRefType ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=37 && LA27_0<=43)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1282:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1282:2: ( (otherlv_0= RULE_ID ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1283:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1283:1: (otherlv_0= RULE_ID )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1284:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getUseTypeRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseType3013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getUseTypeAccess().getType1RefTypeCrossReference_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1296:6: ( (lv_type2_1_0= ruleNonRefType ) )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1296:6: ( (lv_type2_1_0= ruleNonRefType ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1297:1: (lv_type2_1_0= ruleNonRefType )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1297:1: (lv_type2_1_0= ruleNonRefType )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1298:3: lv_type2_1_0= ruleNonRefType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUseTypeAccess().getType2NonRefTypeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNonRefType_in_ruleUseType3040);
                    lv_type2_1_0=ruleNonRefType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUseTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"type2",
                              		lv_type2_1_0, 
                              		"NonRefType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseType"


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1322:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1323:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1324:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3076);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3086); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1331:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1334:28: ( ( ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1335:1: ( ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1335:1: ( ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1335:2: ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1335:2: ( (lv_type_0_0= ruleUseType ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1336:1: (lv_type_0_0= ruleUseType )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1336:1: (lv_type_0_0= ruleUseType )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1337:3: lv_type_0_0= ruleUseType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeUseTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUseType_in_ruleParameter3132);
            lv_type_0_0=ruleUseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"UseType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1353:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1354:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1354:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1355:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3149); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleMethodBody"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1381:1: entryRuleMethodBody returns [EObject current=null] : iv_ruleMethodBody= ruleMethodBody EOF ;
    public final EObject entryRuleMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodBody = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1382:2: (iv_ruleMethodBody= ruleMethodBody EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1383:2: iv_ruleMethodBody= ruleMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodBodyRule()); 
            }
            pushFollow(FOLLOW_ruleMethodBody_in_entryRuleMethodBody3192);
            iv_ruleMethodBody=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodBody3202); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodBody"


    // $ANTLR start "ruleMethodBody"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1390:1: ruleMethodBody returns [EObject current=null] : ( ( (lv_locvars_0_0= ruleLocalVarDec ) )* ( (lv_return_1_0= ruleReturnStatement ) ) ) ;
    public final EObject ruleMethodBody() throws RecognitionException {
        EObject current = null;

        EObject lv_locvars_0_0 = null;

        EObject lv_return_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1393:28: ( ( ( (lv_locvars_0_0= ruleLocalVarDec ) )* ( (lv_return_1_0= ruleReturnStatement ) ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1394:1: ( ( (lv_locvars_0_0= ruleLocalVarDec ) )* ( (lv_return_1_0= ruleReturnStatement ) ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1394:1: ( ( (lv_locvars_0_0= ruleLocalVarDec ) )* ( (lv_return_1_0= ruleReturnStatement ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1394:2: ( (lv_locvars_0_0= ruleLocalVarDec ) )* ( (lv_return_1_0= ruleReturnStatement ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1394:2: ( (lv_locvars_0_0= ruleLocalVarDec ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=37 && LA28_0<=43)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1395:1: (lv_locvars_0_0= ruleLocalVarDec )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1395:1: (lv_locvars_0_0= ruleLocalVarDec )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1396:3: lv_locvars_0_0= ruleLocalVarDec
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethodBodyAccess().getLocvarsLocalVarDecParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLocalVarDec_in_ruleMethodBody3248);
            	    lv_locvars_0_0=ruleLocalVarDec();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMethodBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"locvars",
            	              		lv_locvars_0_0, 
            	              		"LocalVarDec");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1412:3: ( (lv_return_1_0= ruleReturnStatement ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1413:1: (lv_return_1_0= ruleReturnStatement )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1413:1: (lv_return_1_0= ruleReturnStatement )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1414:3: lv_return_1_0= ruleReturnStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodBodyAccess().getReturnReturnStatementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReturnStatement_in_ruleMethodBody3270);
            lv_return_1_0=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodBodyRule());
              	        }
                     		set(
                     			current, 
                     			"return",
                      		lv_return_1_0, 
                      		"ReturnStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodBody"


    // $ANTLR start "entryRuleAbstractMethodBody"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1438:1: entryRuleAbstractMethodBody returns [EObject current=null] : iv_ruleAbstractMethodBody= ruleAbstractMethodBody EOF ;
    public final EObject entryRuleAbstractMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMethodBody = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1439:2: (iv_ruleAbstractMethodBody= ruleAbstractMethodBody EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1440:2: iv_ruleAbstractMethodBody= ruleAbstractMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractMethodBodyRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractMethodBody_in_entryRuleAbstractMethodBody3306);
            iv_ruleAbstractMethodBody=ruleAbstractMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractMethodBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractMethodBody3316); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractMethodBody"


    // $ANTLR start "ruleAbstractMethodBody"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1447:1: ruleAbstractMethodBody returns [EObject current=null] : this_RequiresAbstractComposition_0= ruleRequiresAbstractComposition ;
    public final EObject ruleAbstractMethodBody() throws RecognitionException {
        EObject current = null;

        EObject this_RequiresAbstractComposition_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1450:28: (this_RequiresAbstractComposition_0= ruleRequiresAbstractComposition )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1452:5: this_RequiresAbstractComposition_0= ruleRequiresAbstractComposition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAbstractMethodBodyAccess().getRequiresAbstractCompositionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleRequiresAbstractComposition_in_ruleAbstractMethodBody3362);
            this_RequiresAbstractComposition_0=ruleRequiresAbstractComposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RequiresAbstractComposition_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractMethodBody"


    // $ANTLR start "entryRuleLocalVarName"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1468:1: entryRuleLocalVarName returns [String current=null] : iv_ruleLocalVarName= ruleLocalVarName EOF ;
    public final String entryRuleLocalVarName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLocalVarName = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1469:2: (iv_ruleLocalVarName= ruleLocalVarName EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1470:2: iv_ruleLocalVarName= ruleLocalVarName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalVarNameRule()); 
            }
            pushFollow(FOLLOW_ruleLocalVarName_in_entryRuleLocalVarName3397);
            iv_ruleLocalVarName=ruleLocalVarName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalVarName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVarName3408); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVarName"


    // $ANTLR start "ruleLocalVarName"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1477:1: ruleLocalVarName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleLocalVarName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1480:28: (this_ID_0= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1481:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVarName3447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getLocalVarNameAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVarName"


    // $ANTLR start "entryRuleLocalVarDec"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1496:1: entryRuleLocalVarDec returns [EObject current=null] : iv_ruleLocalVarDec= ruleLocalVarDec EOF ;
    public final EObject entryRuleLocalVarDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVarDec = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1497:2: (iv_ruleLocalVarDec= ruleLocalVarDec EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1498:2: iv_ruleLocalVarDec= ruleLocalVarDec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalVarDecRule()); 
            }
            pushFollow(FOLLOW_ruleLocalVarDec_in_entryRuleLocalVarDec3491);
            iv_ruleLocalVarDec=ruleLocalVarDec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalVarDec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVarDec3501); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVarDec"


    // $ANTLR start "ruleLocalVarDec"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1505:1: ruleLocalVarDec returns [EObject current=null] : ( ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= ruleLocalVarName ) ) (otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleLocalVarDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_varini_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1508:28: ( ( ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= ruleLocalVarName ) ) (otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) ) )? otherlv_4= ';' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1509:1: ( ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= ruleLocalVarName ) ) (otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) ) )? otherlv_4= ';' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1509:1: ( ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= ruleLocalVarName ) ) (otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) ) )? otherlv_4= ';' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1509:2: ( (lv_type_0_0= ruleUseType ) ) ( (lv_name_1_0= ruleLocalVarName ) ) (otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) ) )? otherlv_4= ';'
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1509:2: ( (lv_type_0_0= ruleUseType ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1510:1: (lv_type_0_0= ruleUseType )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1510:1: (lv_type_0_0= ruleUseType )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1511:3: lv_type_0_0= ruleUseType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalVarDecAccess().getTypeUseTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUseType_in_ruleLocalVarDec3547);
            lv_type_0_0=ruleUseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalVarDecRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"UseType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1527:2: ( (lv_name_1_0= ruleLocalVarName ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1528:1: (lv_name_1_0= ruleLocalVarName )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1528:1: (lv_name_1_0= ruleLocalVarName )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1529:3: lv_name_1_0= ruleLocalVarName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalVarDecAccess().getNameLocalVarNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLocalVarName_in_ruleLocalVarDec3568);
            lv_name_1_0=ruleLocalVarName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalVarDecRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"LocalVarName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1545:2: (otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1545:4: otherlv_2= '=' ( (lv_varini_3_0= ruleVariableInitializer ) )
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleLocalVarDec3581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocalVarDecAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1549:1: ( (lv_varini_3_0= ruleVariableInitializer ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1550:1: (lv_varini_3_0= ruleVariableInitializer )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1550:1: (lv_varini_3_0= ruleVariableInitializer )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1551:3: lv_varini_3_0= ruleVariableInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalVarDecAccess().getVariniVariableInitializerParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableInitializer_in_ruleLocalVarDec3602);
                    lv_varini_3_0=ruleVariableInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalVarDecRule());
                      	        }
                             		set(
                             			current, 
                             			"varini",
                              		lv_varini_3_0, 
                              		"VariableInitializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleLocalVarDec3616); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLocalVarDecAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalVarDec"


    // $ANTLR start "entryRuleVariableInitializer"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1579:1: entryRuleVariableInitializer returns [EObject current=null] : iv_ruleVariableInitializer= ruleVariableInitializer EOF ;
    public final EObject entryRuleVariableInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableInitializer = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1580:2: (iv_ruleVariableInitializer= ruleVariableInitializer EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1581:2: iv_ruleVariableInitializer= ruleVariableInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleVariableInitializer_in_entryRuleVariableInitializer3652);
            iv_ruleVariableInitializer=ruleVariableInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableInitializer3662); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableInitializer"


    // $ANTLR start "ruleVariableInitializer"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1588:1: ruleVariableInitializer returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleVariableInitializer() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1591:28: (this_Expression_0= ruleExpression )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1593:5: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getVariableInitializerAccess().getExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableInitializer3708);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableInitializer"


    // $ANTLR start "entryRuleReturnStatement"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1609:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1610:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1611:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement3742);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement3752); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1618:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1621:28: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1622:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1622:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1622:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleReturnStatement3789); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1626:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1627:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1627:1: (lv_expression_1_0= ruleExpression )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1628:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReturnStatement3810);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReturnStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleReturnStatement3822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReturnStatementAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleTerminalExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1656:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1657:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1658:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression3858);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression3868); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1665:1: ruleTerminalExpression returns [EObject current=null] : (this_This_0= ruleThis | this_ParamRef_1= ruleParamRef | this_NewByClass_2= ruleNewByClass | ( ( ruleCast )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_This_0 = null;

        EObject this_ParamRef_1 = null;

        EObject this_NewByClass_2 = null;

        EObject this_Cast_3 = null;

        EObject this_Constant_4 = null;

        EObject this_Paren_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1668:28: ( (this_This_0= ruleThis | this_ParamRef_1= ruleParamRef | this_NewByClass_2= ruleNewByClass | ( ( ruleCast )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1669:1: (this_This_0= ruleThis | this_ParamRef_1= ruleParamRef | this_NewByClass_2= ruleNewByClass | ( ( ruleCast )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1669:1: (this_This_0= ruleThis | this_ParamRef_1= ruleParamRef | this_NewByClass_2= ruleNewByClass | ( ( ruleCast )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen )
            int alt30=6;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1670:5: this_This_0= ruleThis
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getThisParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleThis_in_ruleTerminalExpression3915);
                    this_This_0=ruleThis();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_This_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1680:5: this_ParamRef_1= ruleParamRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getParamRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParamRef_in_ruleTerminalExpression3942);
                    this_ParamRef_1=ruleParamRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParamRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1690:5: this_NewByClass_2= ruleNewByClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getNewByClassParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNewByClass_in_ruleTerminalExpression3969);
                    this_NewByClass_2=ruleNewByClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NewByClass_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1699:6: ( ( ruleCast )=>this_Cast_3= ruleCast )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1699:6: ( ( ruleCast )=>this_Cast_3= ruleCast )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1699:7: ( ruleCast )=>this_Cast_3= ruleCast
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getCastParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCast_in_ruleTerminalExpression4002);
                    this_Cast_3=ruleCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Cast_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1710:5: this_Constant_4= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getConstantParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleTerminalExpression4030);
                    this_Constant_4=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Constant_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1720:5: this_Paren_5= ruleParen
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTerminalExpressionAccess().getParenParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParen_in_ruleTerminalExpression4057);
                    this_Paren_5=ruleParen();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Paren_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleThis"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1736:1: entryRuleThis returns [EObject current=null] : iv_ruleThis= ruleThis EOF ;
    public final EObject entryRuleThis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThis = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1737:2: (iv_ruleThis= ruleThis EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1738:2: iv_ruleThis= ruleThis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThisRule()); 
            }
            pushFollow(FOLLOW_ruleThis_in_entryRuleThis4092);
            iv_ruleThis=ruleThis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThis4102); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThis"


    // $ANTLR start "ruleThis"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1745:1: ruleThis returns [EObject current=null] : ( (lv_variable_0_0= 'this' ) ) ;
    public final EObject ruleThis() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1748:28: ( ( (lv_variable_0_0= 'this' ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1749:1: ( (lv_variable_0_0= 'this' ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1749:1: ( (lv_variable_0_0= 'this' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1750:1: (lv_variable_0_0= 'this' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1750:1: (lv_variable_0_0= 'this' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1751:3: lv_variable_0_0= 'this'
            {
            lv_variable_0_0=(Token)match(input,55,FOLLOW_55_in_ruleThis4144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_variable_0_0, grammarAccess.getThisAccess().getVariableThisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getThisRule());
              	        }
                     		setWithLastConsumed(current, "variable", lv_variable_0_0, "this");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThis"


    // $ANTLR start "entryRuleParamRef"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1772:1: entryRuleParamRef returns [EObject current=null] : iv_ruleParamRef= ruleParamRef EOF ;
    public final EObject entryRuleParamRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamRef = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1773:2: (iv_ruleParamRef= ruleParamRef EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1774:2: iv_ruleParamRef= ruleParamRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamRefRule()); 
            }
            pushFollow(FOLLOW_ruleParamRef_in_entryRuleParamRef4192);
            iv_ruleParamRef=ruleParamRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamRef4202); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamRef"


    // $ANTLR start "ruleParamRef"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1781:1: ruleParamRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParamRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1784:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1785:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1785:1: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1786:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1786:1: (otherlv_0= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1787:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParamRefRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParamRef4246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getParamRefAccess().getParameterParameterCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamRef"


    // $ANTLR start "entryRuleNewByClass"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1806:1: entryRuleNewByClass returns [EObject current=null] : iv_ruleNewByClass= ruleNewByClass EOF ;
    public final EObject entryRuleNewByClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewByClass = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1807:2: (iv_ruleNewByClass= ruleNewByClass EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1808:2: iv_ruleNewByClass= ruleNewByClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewByClassRule()); 
            }
            pushFollow(FOLLOW_ruleNewByClass_in_entryRuleNewByClass4281);
            iv_ruleNewByClass=ruleNewByClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewByClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewByClass4291); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewByClass"


    // $ANTLR start "ruleNewByClass"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1815:1: ruleNewByClass returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleNewByClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1818:28: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1819:1: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1819:1: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1819:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleNewByClass4328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNewByClassAccess().getNewKeyword_0());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1823:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1824:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1824:1: (otherlv_1= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1825:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNewByClassRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewByClass4348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getNewByClassAccess().getTypeClassCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleNewByClass4360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNewByClassAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1840:1: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||(LA32_0>=RULE_FLOATING_POINT_LITERAL && LA32_0<=RULE_DECIMAL_LITERAL)||LA32_0==51||LA32_0==55||(LA32_0>=57 && LA32_0<=58)||(LA32_0>=85 && LA32_0<=86)||(LA32_0>=90 && LA32_0<=92)||LA32_0==94) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1840:2: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1840:2: ( (lv_args_3_0= ruleExpression ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1841:1: (lv_args_3_0= ruleExpression )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1841:1: (lv_args_3_0= ruleExpression )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1842:3: lv_args_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNewByClassAccess().getArgsExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleNewByClass4382);
                    lv_args_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNewByClassRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1858:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==52) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1858:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleNewByClass4395); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getNewByClassAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1862:1: ( (lv_args_5_0= ruleExpression ) )
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1863:1: (lv_args_5_0= ruleExpression )
                    	    {
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1863:1: (lv_args_5_0= ruleExpression )
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1864:3: lv_args_5_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNewByClassAccess().getArgsExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleNewByClass4416);
                    	    lv_args_5_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNewByClassRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_5_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleNewByClass4432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getNewByClassAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewByClass"


    // $ANTLR start "entryRuleCast"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1892:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1893:2: (iv_ruleCast= ruleCast EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1894:2: iv_ruleCast= ruleCast EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastRule()); 
            }
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast4468);
            iv_ruleCast=ruleCast();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCast; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast4478); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCast"


    // $ANTLR start "ruleCast"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1901:1: ruleCast returns [EObject current=null] : (otherlv_0= '(' ( (lv_type_1_0= ruleUseType ) ) otherlv_2= ')' ( (lv_expression_3_0= ruleTerminalExpression ) ) ) ;
    public final EObject ruleCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1904:28: ( (otherlv_0= '(' ( (lv_type_1_0= ruleUseType ) ) otherlv_2= ')' ( (lv_expression_3_0= ruleTerminalExpression ) ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1905:1: (otherlv_0= '(' ( (lv_type_1_0= ruleUseType ) ) otherlv_2= ')' ( (lv_expression_3_0= ruleTerminalExpression ) ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1905:1: (otherlv_0= '(' ( (lv_type_1_0= ruleUseType ) ) otherlv_2= ')' ( (lv_expression_3_0= ruleTerminalExpression ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1905:3: otherlv_0= '(' ( (lv_type_1_0= ruleUseType ) ) otherlv_2= ')' ( (lv_expression_3_0= ruleTerminalExpression ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleCast4515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCastAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1909:1: ( (lv_type_1_0= ruleUseType ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1910:1: (lv_type_1_0= ruleUseType )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1910:1: (lv_type_1_0= ruleUseType )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1911:3: lv_type_1_0= ruleUseType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCastAccess().getTypeUseTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUseType_in_ruleCast4536);
            lv_type_1_0=ruleUseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCastRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"UseType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleCast4548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCastAccess().getRightParenthesisKeyword_2());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1931:1: ( (lv_expression_3_0= ruleTerminalExpression ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1932:1: (lv_expression_3_0= ruleTerminalExpression )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1932:1: (lv_expression_3_0= ruleTerminalExpression )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1933:3: lv_expression_3_0= ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCastAccess().getExpressionTerminalExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleCast4569);
            lv_expression_3_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCastRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"TerminalExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCast"


    // $ANTLR start "entryRuleParen"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1957:1: entryRuleParen returns [EObject current=null] : iv_ruleParen= ruleParen EOF ;
    public final EObject entryRuleParen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParen = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1958:2: (iv_ruleParen= ruleParen EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1959:2: iv_ruleParen= ruleParen EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenRule()); 
            }
            pushFollow(FOLLOW_ruleParen_in_entryRuleParen4605);
            iv_ruleParen=ruleParen();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParen; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParen4615); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParen"


    // $ANTLR start "ruleParen"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1966:1: ruleParen returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1969:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1970:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1970:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1970:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleParen4652); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParen4674);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleParen4685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParenAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParen"


    // $ANTLR start "entryRuleConstant"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1995:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1996:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1997:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant4721);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant4731); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2004:1: ruleConstant returns [EObject current=null] : (this_IntConstant_0= ruleIntConstant | this_BoolConstant_1= ruleBoolConstant | this_StringConstant_2= ruleStringConstant ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        EObject this_IntConstant_0 = null;

        EObject this_BoolConstant_1 = null;

        EObject this_StringConstant_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2007:28: ( (this_IntConstant_0= ruleIntConstant | this_BoolConstant_1= ruleBoolConstant | this_StringConstant_2= ruleStringConstant ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2008:1: (this_IntConstant_0= ruleIntConstant | this_BoolConstant_1= ruleBoolConstant | this_StringConstant_2= ruleStringConstant )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2008:1: (this_IntConstant_0= ruleIntConstant | this_BoolConstant_1= ruleBoolConstant | this_StringConstant_2= ruleStringConstant )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt33=1;
                }
                break;
            case 57:
            case 58:
                {
                alt33=2;
                }
                break;
            case RULE_STRING:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2009:5: this_IntConstant_0= ruleIntConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantAccess().getIntConstantParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntConstant_in_ruleConstant4778);
                    this_IntConstant_0=ruleIntConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntConstant_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2019:5: this_BoolConstant_1= ruleBoolConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantAccess().getBoolConstantParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolConstant_in_ruleConstant4805);
                    this_BoolConstant_1=ruleBoolConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolConstant_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2029:5: this_StringConstant_2= ruleStringConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantAccess().getStringConstantParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringConstant_in_ruleConstant4832);
                    this_StringConstant_2=ruleStringConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringConstant_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleStringConstant"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2045:1: entryRuleStringConstant returns [EObject current=null] : iv_ruleStringConstant= ruleStringConstant EOF ;
    public final EObject entryRuleStringConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstant = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2046:2: (iv_ruleStringConstant= ruleStringConstant EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2047:2: iv_ruleStringConstant= ruleStringConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringConstantRule()); 
            }
            pushFollow(FOLLOW_ruleStringConstant_in_entryRuleStringConstant4867);
            iv_ruleStringConstant=ruleStringConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstant4877); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringConstant"


    // $ANTLR start "ruleStringConstant"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2054:1: ruleStringConstant returns [EObject current=null] : ( (lv_constant_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringConstant() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2057:28: ( ( (lv_constant_0_0= RULE_STRING ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2058:1: ( (lv_constant_0_0= RULE_STRING ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2058:1: ( (lv_constant_0_0= RULE_STRING ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2059:1: (lv_constant_0_0= RULE_STRING )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2059:1: (lv_constant_0_0= RULE_STRING )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2060:3: lv_constant_0_0= RULE_STRING
            {
            lv_constant_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstant4918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_constant_0_0, grammarAccess.getStringConstantAccess().getConstantSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"constant",
                      		lv_constant_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringConstant"


    // $ANTLR start "entryRuleIntConstant"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2084:1: entryRuleIntConstant returns [EObject current=null] : iv_ruleIntConstant= ruleIntConstant EOF ;
    public final EObject entryRuleIntConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConstant = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2085:2: (iv_ruleIntConstant= ruleIntConstant EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2086:2: iv_ruleIntConstant= ruleIntConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntConstantRule()); 
            }
            pushFollow(FOLLOW_ruleIntConstant_in_entryRuleIntConstant4958);
            iv_ruleIntConstant=ruleIntConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntConstant4968); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntConstant"


    // $ANTLR start "ruleIntConstant"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2093:1: ruleIntConstant returns [EObject current=null] : ( (lv_constant_0_0= RULE_INT ) ) ;
    public final EObject ruleIntConstant() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2096:28: ( ( (lv_constant_0_0= RULE_INT ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2097:1: ( (lv_constant_0_0= RULE_INT ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2097:1: ( (lv_constant_0_0= RULE_INT ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2098:1: (lv_constant_0_0= RULE_INT )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2098:1: (lv_constant_0_0= RULE_INT )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2099:3: lv_constant_0_0= RULE_INT
            {
            lv_constant_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntConstant5009); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_constant_0_0, grammarAccess.getIntConstantAccess().getConstantINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"constant",
                      		lv_constant_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntConstant"


    // $ANTLR start "entryRuleBoolConstant"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2123:1: entryRuleBoolConstant returns [EObject current=null] : iv_ruleBoolConstant= ruleBoolConstant EOF ;
    public final EObject entryRuleBoolConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolConstant = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2124:2: (iv_ruleBoolConstant= ruleBoolConstant EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2125:2: iv_ruleBoolConstant= ruleBoolConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolConstantRule()); 
            }
            pushFollow(FOLLOW_ruleBoolConstant_in_entryRuleBoolConstant5049);
            iv_ruleBoolConstant=ruleBoolConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolConstant5059); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolConstant"


    // $ANTLR start "ruleBoolConstant"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2132:1: ruleBoolConstant returns [EObject current=null] : ( ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolConstant() throws RecognitionException {
        EObject current = null;

        Token lv_constant_0_1=null;
        Token lv_constant_0_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2135:28: ( ( ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2136:1: ( ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2136:1: ( ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2137:1: ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2137:1: ( (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2138:1: (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2138:1: (lv_constant_0_1= 'true' | lv_constant_0_2= 'false' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==57) ) {
                alt34=1;
            }
            else if ( (LA34_0==58) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2139:3: lv_constant_0_1= 'true'
                    {
                    lv_constant_0_1=(Token)match(input,57,FOLLOW_57_in_ruleBoolConstant5103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_constant_0_1, grammarAccess.getBoolConstantAccess().getConstantTrueKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoolConstantRule());
                      	        }
                             		setWithLastConsumed(current, "constant", lv_constant_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2151:8: lv_constant_0_2= 'false'
                    {
                    lv_constant_0_2=(Token)match(input,58,FOLLOW_58_in_ruleBoolConstant5132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_constant_0_2, grammarAccess.getBoolConstantAccess().getConstantFalseKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBoolConstantRule());
                      	        }
                             		setWithLastConsumed(current, "constant", lv_constant_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolConstant"


    // $ANTLR start "entryRuleAMOUNT"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2174:1: entryRuleAMOUNT returns [String current=null] : iv_ruleAMOUNT= ruleAMOUNT EOF ;
    public final String entryRuleAMOUNT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAMOUNT = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2175:2: (iv_ruleAMOUNT= ruleAMOUNT EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2176:2: iv_ruleAMOUNT= ruleAMOUNT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAMOUNTRule()); 
            }
            pushFollow(FOLLOW_ruleAMOUNT_in_entryRuleAMOUNT5184);
            iv_ruleAMOUNT=ruleAMOUNT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAMOUNT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAMOUNT5195); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAMOUNT"


    // $ANTLR start "ruleAMOUNT"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2183:1: ruleAMOUNT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AMOUNT_GEONE_0= RULE_AMOUNT_GEONE | this_AMOUNT_ONE_OR_ZERO_1= RULE_AMOUNT_ONE_OR_ZERO ) ;
    public final AntlrDatatypeRuleToken ruleAMOUNT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_AMOUNT_GEONE_0=null;
        Token this_AMOUNT_ONE_OR_ZERO_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2186:28: ( (this_AMOUNT_GEONE_0= RULE_AMOUNT_GEONE | this_AMOUNT_ONE_OR_ZERO_1= RULE_AMOUNT_ONE_OR_ZERO ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2187:1: (this_AMOUNT_GEONE_0= RULE_AMOUNT_GEONE | this_AMOUNT_ONE_OR_ZERO_1= RULE_AMOUNT_ONE_OR_ZERO )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2187:1: (this_AMOUNT_GEONE_0= RULE_AMOUNT_GEONE | this_AMOUNT_ONE_OR_ZERO_1= RULE_AMOUNT_ONE_OR_ZERO )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_AMOUNT_GEONE) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_AMOUNT_ONE_OR_ZERO) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2187:6: this_AMOUNT_GEONE_0= RULE_AMOUNT_GEONE
                    {
                    this_AMOUNT_GEONE_0=(Token)match(input,RULE_AMOUNT_GEONE,FOLLOW_RULE_AMOUNT_GEONE_in_ruleAMOUNT5235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AMOUNT_GEONE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AMOUNT_GEONE_0, grammarAccess.getAMOUNTAccess().getAMOUNT_GEONETerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2195:10: this_AMOUNT_ONE_OR_ZERO_1= RULE_AMOUNT_ONE_OR_ZERO
                    {
                    this_AMOUNT_ONE_OR_ZERO_1=(Token)match(input,RULE_AMOUNT_ONE_OR_ZERO,FOLLOW_RULE_AMOUNT_ONE_OR_ZERO_in_ruleAMOUNT5261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AMOUNT_ONE_OR_ZERO_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AMOUNT_ONE_OR_ZERO_1, grammarAccess.getAMOUNTAccess().getAMOUNT_ONE_OR_ZEROTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAMOUNT"


    // $ANTLR start "entryRuleAbstractInterfaceElement"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2210:1: entryRuleAbstractInterfaceElement returns [EObject current=null] : iv_ruleAbstractInterfaceElement= ruleAbstractInterfaceElement EOF ;
    public final EObject entryRuleAbstractInterfaceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractInterfaceElement = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2211:2: (iv_ruleAbstractInterfaceElement= ruleAbstractInterfaceElement EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2212:2: iv_ruleAbstractInterfaceElement= ruleAbstractInterfaceElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractInterfaceElementRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractInterfaceElement_in_entryRuleAbstractInterfaceElement5306);
            iv_ruleAbstractInterfaceElement=ruleAbstractInterfaceElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractInterfaceElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractInterfaceElement5316); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractInterfaceElement"


    // $ANTLR start "ruleAbstractInterfaceElement"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2219:1: ruleAbstractInterfaceElement returns [EObject current=null] : (this_AbstractMethod_0= ruleAbstractMethod | this_Requires_1= ruleRequires | this_ClockConstraint_2= ruleClockConstraint | this_AbstractInvariant_3= ruleAbstractInvariant ) ;
    public final EObject ruleAbstractInterfaceElement() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractMethod_0 = null;

        EObject this_Requires_1 = null;

        EObject this_ClockConstraint_2 = null;

        EObject this_AbstractInvariant_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2222:28: ( (this_AbstractMethod_0= ruleAbstractMethod | this_Requires_1= ruleRequires | this_ClockConstraint_2= ruleClockConstraint | this_AbstractInvariant_3= ruleAbstractInvariant ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2223:1: (this_AbstractMethod_0= ruleAbstractMethod | this_Requires_1= ruleRequires | this_ClockConstraint_2= ruleClockConstraint | this_AbstractInvariant_3= ruleAbstractInvariant )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2223:1: (this_AbstractMethod_0= ruleAbstractMethod | this_Requires_1= ruleRequires | this_ClockConstraint_2= ruleClockConstraint | this_AbstractInvariant_3= ruleAbstractInvariant )
            int alt36=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt36=1;
                }
                break;
            case 59:
                {
                alt36=2;
                }
                break;
            case 64:
                {
                alt36=3;
                }
                break;
            case 65:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2224:5: this_AbstractMethod_0= ruleAbstractMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractInterfaceElementAccess().getAbstractMethodParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbstractMethod_in_ruleAbstractInterfaceElement5363);
                    this_AbstractMethod_0=ruleAbstractMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AbstractMethod_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2234:5: this_Requires_1= ruleRequires
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractInterfaceElementAccess().getRequiresParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRequires_in_ruleAbstractInterfaceElement5390);
                    this_Requires_1=ruleRequires();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Requires_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2244:5: this_ClockConstraint_2= ruleClockConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractInterfaceElementAccess().getClockConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClockConstraint_in_ruleAbstractInterfaceElement5417);
                    this_ClockConstraint_2=ruleClockConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClockConstraint_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2254:5: this_AbstractInvariant_3= ruleAbstractInvariant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractInterfaceElementAccess().getAbstractInvariantParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbstractInvariant_in_ruleAbstractInterfaceElement5444);
                    this_AbstractInvariant_3=ruleAbstractInvariant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AbstractInvariant_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractInterfaceElement"


    // $ANTLR start "entryRuleRequires"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2270:1: entryRuleRequires returns [EObject current=null] : iv_ruleRequires= ruleRequires EOF ;
    public final EObject entryRuleRequires() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequires = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2271:2: (iv_ruleRequires= ruleRequires EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2272:2: iv_ruleRequires= ruleRequires EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiresRule()); 
            }
            pushFollow(FOLLOW_ruleRequires_in_entryRuleRequires5479);
            iv_ruleRequires=ruleRequires();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequires; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequires5489); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequires"


    // $ANTLR start "ruleRequires"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2279:1: ruleRequires returns [EObject current=null] : (otherlv_0= 'Requires' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ruleAMOUNT otherlv_4= ']' otherlv_5= ':' ( (lv_type_6_0= ruleUseType ) ) otherlv_7= ';' ) ;
    public final EObject ruleRequires() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2282:28: ( (otherlv_0= 'Requires' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ruleAMOUNT otherlv_4= ']' otherlv_5= ':' ( (lv_type_6_0= ruleUseType ) ) otherlv_7= ';' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2283:1: (otherlv_0= 'Requires' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ruleAMOUNT otherlv_4= ']' otherlv_5= ':' ( (lv_type_6_0= ruleUseType ) ) otherlv_7= ';' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2283:1: (otherlv_0= 'Requires' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ruleAMOUNT otherlv_4= ']' otherlv_5= ':' ( (lv_type_6_0= ruleUseType ) ) otherlv_7= ';' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2283:3: otherlv_0= 'Requires' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ruleAMOUNT otherlv_4= ']' otherlv_5= ':' ( (lv_type_6_0= ruleUseType ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleRequires5526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRequiresAccess().getRequiresKeyword_0());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2287:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2288:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2288:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2289:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequires5543); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRequiresAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiresRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleRequires5560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRequiresAccess().getLeftSquareBracketKeyword_2());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRequiresAccess().getAMOUNTParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleAMOUNT_in_ruleRequires5576);
            ruleAMOUNT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,61,FOLLOW_61_in_ruleRequires5587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRequiresAccess().getRightSquareBracketKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,62,FOLLOW_62_in_ruleRequires5599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRequiresAccess().getColonKeyword_5());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2325:1: ( (lv_type_6_0= ruleUseType ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2326:1: (lv_type_6_0= ruleUseType )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2326:1: (lv_type_6_0= ruleUseType )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2327:3: lv_type_6_0= ruleUseType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequiresAccess().getTypeUseTypeParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUseType_in_ruleRequires5620);
            lv_type_6_0=ruleUseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRequiresRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_6_0, 
                      		"UseType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleRequires5632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getRequiresAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequires"


    // $ANTLR start "entryRuleAbstractDynamicSwitch"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2355:1: entryRuleAbstractDynamicSwitch returns [EObject current=null] : iv_ruleAbstractDynamicSwitch= ruleAbstractDynamicSwitch EOF ;
    public final EObject entryRuleAbstractDynamicSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDynamicSwitch = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2356:2: (iv_ruleAbstractDynamicSwitch= ruleAbstractDynamicSwitch EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2357:2: iv_ruleAbstractDynamicSwitch= ruleAbstractDynamicSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractDynamicSwitchRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractDynamicSwitch_in_entryRuleAbstractDynamicSwitch5668);
            iv_ruleAbstractDynamicSwitch=ruleAbstractDynamicSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractDynamicSwitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDynamicSwitch5678); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDynamicSwitch"


    // $ANTLR start "ruleAbstractDynamicSwitch"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2364:1: ruleAbstractDynamicSwitch returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '|' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '|' ( (otherlv_9= RULE_ID ) ) )? otherlv_10= ')' ) ;
    public final EObject ruleAbstractDynamicSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2367:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '|' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '|' ( (otherlv_9= RULE_ID ) ) )? otherlv_10= ')' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2368:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '|' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '|' ( (otherlv_9= RULE_ID ) ) )? otherlv_10= ')' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2368:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '|' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '|' ( (otherlv_9= RULE_ID ) ) )? otherlv_10= ')' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2368:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '|' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '|' ( (otherlv_9= RULE_ID ) ) )? otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleAbstractDynamicSwitch5715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAbstractDynamicSwitchAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2372:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2373:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2373:1: (otherlv_1= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2374:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAbstractDynamicSwitchRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstractDynamicSwitch5735); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getAbstractDynamicSwitchAccess().getType1RefTypeCrossReference_1_0()); 
              	
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2385:2: (otherlv_2= '|' ( (otherlv_3= RULE_ID ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==63) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2385:4: otherlv_2= '|' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleAbstractDynamicSwitch5748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAbstractDynamicSwitchAccess().getVerticalLineKeyword_2_0());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2389:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2390:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2390:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2391:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAbstractDynamicSwitchRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstractDynamicSwitch5768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getAbstractDynamicSwitchAccess().getType2RefTypeCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleAbstractDynamicSwitch5782); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAbstractDynamicSwitchAccess().getCommaKeyword_3());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2406:1: ( (otherlv_5= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2407:1: (otherlv_5= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2407:1: (otherlv_5= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2408:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAbstractDynamicSwitchRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstractDynamicSwitch5802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getAbstractDynamicSwitchAccess().getType3RefTypeCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleAbstractDynamicSwitch5814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAbstractDynamicSwitchAccess().getCommaKeyword_5());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2423:1: ( (otherlv_7= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2424:1: (otherlv_7= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2424:1: (otherlv_7= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2425:3: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAbstractDynamicSwitchRule());
              	        }
                      
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstractDynamicSwitch5834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_7, grammarAccess.getAbstractDynamicSwitchAccess().getType4RefTypeCrossReference_6_0()); 
              	
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2436:2: (otherlv_8= '|' ( (otherlv_9= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==63) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2436:4: otherlv_8= '|' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,63,FOLLOW_63_in_ruleAbstractDynamicSwitch5847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getAbstractDynamicSwitchAccess().getVerticalLineKeyword_7_0());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2440:1: ( (otherlv_9= RULE_ID ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2441:1: (otherlv_9= RULE_ID )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2441:1: (otherlv_9= RULE_ID )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2442:3: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAbstractDynamicSwitchRule());
                      	        }
                              
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstractDynamicSwitch5867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_9, grammarAccess.getAbstractDynamicSwitchAccess().getType5RefTypeCrossReference_7_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,53,FOLLOW_53_in_ruleAbstractDynamicSwitch5881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getAbstractDynamicSwitchAccess().getRightParenthesisKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDynamicSwitch"


    // $ANTLR start "entryRuleRequiresAbstractComposition"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2465:1: entryRuleRequiresAbstractComposition returns [EObject current=null] : iv_ruleRequiresAbstractComposition= ruleRequiresAbstractComposition EOF ;
    public final EObject entryRuleRequiresAbstractComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiresAbstractComposition = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2466:2: (iv_ruleRequiresAbstractComposition= ruleRequiresAbstractComposition EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2467:2: iv_ruleRequiresAbstractComposition= ruleRequiresAbstractComposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiresAbstractCompositionRule()); 
            }
            pushFollow(FOLLOW_ruleRequiresAbstractComposition_in_entryRuleRequiresAbstractComposition5917);
            iv_ruleRequiresAbstractComposition=ruleRequiresAbstractComposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiresAbstractComposition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiresAbstractComposition5927); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiresAbstractComposition"


    // $ANTLR start "ruleRequiresAbstractComposition"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2474:1: ruleRequiresAbstractComposition returns [EObject current=null] : (otherlv_0= 'Requires' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ruleAMOUNT otherlv_4= ']' this_ASYACTIONS_5= RULE_ASYACTIONS otherlv_6= '[' ruleAMOUNT otherlv_8= ']' otherlv_9= ':' ( (lv_abstract_dynamic_switch_10_0= ruleAbstractDynamicSwitch ) ) otherlv_11= '{' this_ABSTRACT_CONDTION_12= RULE_ABSTRACT_CONDTION otherlv_13= '}' otherlv_14= ';' ) ;
    public final EObject ruleRequiresAbstractComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_ASYACTIONS_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_ABSTRACT_CONDTION_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_abstract_dynamic_switch_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2477:28: ( (otherlv_0= 'Requires' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ruleAMOUNT otherlv_4= ']' this_ASYACTIONS_5= RULE_ASYACTIONS otherlv_6= '[' ruleAMOUNT otherlv_8= ']' otherlv_9= ':' ( (lv_abstract_dynamic_switch_10_0= ruleAbstractDynamicSwitch ) ) otherlv_11= '{' this_ABSTRACT_CONDTION_12= RULE_ABSTRACT_CONDTION otherlv_13= '}' otherlv_14= ';' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2478:1: (otherlv_0= 'Requires' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ruleAMOUNT otherlv_4= ']' this_ASYACTIONS_5= RULE_ASYACTIONS otherlv_6= '[' ruleAMOUNT otherlv_8= ']' otherlv_9= ':' ( (lv_abstract_dynamic_switch_10_0= ruleAbstractDynamicSwitch ) ) otherlv_11= '{' this_ABSTRACT_CONDTION_12= RULE_ABSTRACT_CONDTION otherlv_13= '}' otherlv_14= ';' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2478:1: (otherlv_0= 'Requires' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ruleAMOUNT otherlv_4= ']' this_ASYACTIONS_5= RULE_ASYACTIONS otherlv_6= '[' ruleAMOUNT otherlv_8= ']' otherlv_9= ':' ( (lv_abstract_dynamic_switch_10_0= ruleAbstractDynamicSwitch ) ) otherlv_11= '{' this_ABSTRACT_CONDTION_12= RULE_ABSTRACT_CONDTION otherlv_13= '}' otherlv_14= ';' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2478:3: otherlv_0= 'Requires' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ruleAMOUNT otherlv_4= ']' this_ASYACTIONS_5= RULE_ASYACTIONS otherlv_6= '[' ruleAMOUNT otherlv_8= ']' otherlv_9= ':' ( (lv_abstract_dynamic_switch_10_0= ruleAbstractDynamicSwitch ) ) otherlv_11= '{' this_ABSTRACT_CONDTION_12= RULE_ABSTRACT_CONDTION otherlv_13= '}' otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleRequiresAbstractComposition5964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRequiresAbstractCompositionAccess().getRequiresKeyword_0());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2482:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2483:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2483:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2484:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiresAbstractComposition5981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRequiresAbstractCompositionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiresAbstractCompositionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleRequiresAbstractComposition5998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRequiresAbstractCompositionAccess().getLeftSquareBracketKeyword_2());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRequiresAbstractCompositionAccess().getAMOUNTParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleAMOUNT_in_ruleRequiresAbstractComposition6014);
            ruleAMOUNT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_4=(Token)match(input,61,FOLLOW_61_in_ruleRequiresAbstractComposition6025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRequiresAbstractCompositionAccess().getRightSquareBracketKeyword_4());
                  
            }
            this_ASYACTIONS_5=(Token)match(input,RULE_ASYACTIONS,FOLLOW_RULE_ASYACTIONS_in_ruleRequiresAbstractComposition6036); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ASYACTIONS_5, grammarAccess.getRequiresAbstractCompositionAccess().getASYACTIONSTerminalRuleCall_5()); 
                  
            }
            otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleRequiresAbstractComposition6047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRequiresAbstractCompositionAccess().getLeftSquareBracketKeyword_6());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRequiresAbstractCompositionAccess().getAMOUNTParserRuleCall_7()); 
                  
            }
            pushFollow(FOLLOW_ruleAMOUNT_in_ruleRequiresAbstractComposition6063);
            ruleAMOUNT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_8=(Token)match(input,61,FOLLOW_61_in_ruleRequiresAbstractComposition6074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRequiresAbstractCompositionAccess().getRightSquareBracketKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,62,FOLLOW_62_in_ruleRequiresAbstractComposition6086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getRequiresAbstractCompositionAccess().getColonKeyword_9());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2540:1: ( (lv_abstract_dynamic_switch_10_0= ruleAbstractDynamicSwitch ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2541:1: (lv_abstract_dynamic_switch_10_0= ruleAbstractDynamicSwitch )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2541:1: (lv_abstract_dynamic_switch_10_0= ruleAbstractDynamicSwitch )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2542:3: lv_abstract_dynamic_switch_10_0= ruleAbstractDynamicSwitch
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequiresAbstractCompositionAccess().getAbstract_dynamic_switchAbstractDynamicSwitchParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractDynamicSwitch_in_ruleRequiresAbstractComposition6107);
            lv_abstract_dynamic_switch_10_0=ruleAbstractDynamicSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRequiresAbstractCompositionRule());
              	        }
                     		set(
                     			current, 
                     			"abstract_dynamic_switch",
                      		lv_abstract_dynamic_switch_10_0, 
                      		"AbstractDynamicSwitch");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,46,FOLLOW_46_in_ruleRequiresAbstractComposition6119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getRequiresAbstractCompositionAccess().getLeftCurlyBracketKeyword_11());
                  
            }
            this_ABSTRACT_CONDTION_12=(Token)match(input,RULE_ABSTRACT_CONDTION,FOLLOW_RULE_ABSTRACT_CONDTION_in_ruleRequiresAbstractComposition6130); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ABSTRACT_CONDTION_12, grammarAccess.getRequiresAbstractCompositionAccess().getABSTRACT_CONDTIONTerminalRuleCall_12()); 
                  
            }
            otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleRequiresAbstractComposition6141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getRequiresAbstractCompositionAccess().getRightCurlyBracketKeyword_13());
                  
            }
            otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleRequiresAbstractComposition6153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getRequiresAbstractCompositionAccess().getSemicolonKeyword_14());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiresAbstractComposition"


    // $ANTLR start "entryRuleClockConstraint"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2582:1: entryRuleClockConstraint returns [EObject current=null] : iv_ruleClockConstraint= ruleClockConstraint EOF ;
    public final EObject entryRuleClockConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClockConstraint = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2583:2: (iv_ruleClockConstraint= ruleClockConstraint EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2584:2: iv_ruleClockConstraint= ruleClockConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClockConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleClockConstraint_in_entryRuleClockConstraint6189);
            iv_ruleClockConstraint=ruleClockConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClockConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClockConstraint6199); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClockConstraint"


    // $ANTLR start "ruleClockConstraint"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2591:1: ruleClockConstraint returns [EObject current=null] : ( () otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_CLOCK ) ) otherlv_3= ';' ) ;
    public final EObject ruleClockConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2594:28: ( ( () otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_CLOCK ) ) otherlv_3= ';' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2595:1: ( () otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_CLOCK ) ) otherlv_3= ';' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2595:1: ( () otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_CLOCK ) ) otherlv_3= ';' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2595:2: () otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_CLOCK ) ) otherlv_3= ';'
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2595:2: ()
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2596:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClockConstraintAccess().getClockConstraintAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleClockConstraint6245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClockConstraintAccess().getConstraintKeyword_1());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2605:1: ( (lv_name_2_0= RULE_CLOCK ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2606:1: (lv_name_2_0= RULE_CLOCK )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2606:1: (lv_name_2_0= RULE_CLOCK )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2607:3: lv_name_2_0= RULE_CLOCK
            {
            lv_name_2_0=(Token)match(input,RULE_CLOCK,FOLLOW_RULE_CLOCK_in_ruleClockConstraint6262); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getClockConstraintAccess().getNameCLOCKTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClockConstraintRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"CLOCK");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleClockConstraint6279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getClockConstraintAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClockConstraint"


    // $ANTLR start "entryRuleAbstractInvariant"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2635:1: entryRuleAbstractInvariant returns [EObject current=null] : iv_ruleAbstractInvariant= ruleAbstractInvariant EOF ;
    public final EObject entryRuleAbstractInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractInvariant = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2636:2: (iv_ruleAbstractInvariant= ruleAbstractInvariant EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2637:2: iv_ruleAbstractInvariant= ruleAbstractInvariant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractInvariantRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractInvariant_in_entryRuleAbstractInvariant6315);
            iv_ruleAbstractInvariant=ruleAbstractInvariant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractInvariant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractInvariant6325); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractInvariant"


    // $ANTLR start "ruleAbstractInvariant"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2644:1: ruleAbstractInvariant returns [EObject current=null] : ( () otherlv_1= 'Invariant' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleAbstractInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2647:28: ( ( () otherlv_1= 'Invariant' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2648:1: ( () otherlv_1= 'Invariant' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2648:1: ( () otherlv_1= 'Invariant' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2648:2: () otherlv_1= 'Invariant' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';'
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2648:2: ()
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2649:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbstractInvariantAccess().getAbstractInvariantAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleAbstractInvariant6371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbstractInvariantAccess().getInvariantKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleAbstractInvariant6383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAbstractInvariantAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleAbstractInvariant6395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAbstractInvariantAccess().getRightCurlyBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleAbstractInvariant6407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAbstractInvariantAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractInvariant"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2678:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2679:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2680:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6443);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6453); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2687:1: ruleExpression returns [EObject current=null] : (this_ConditionalExpression_0= ruleConditionalExpression ( ( ( ( ruleAssignmentOperator ) )=> (lv_assignmentoperator_1_0= ruleAssignmentOperator ) ) ( (lv_expression_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalExpression_0 = null;

        AntlrDatatypeRuleToken lv_assignmentoperator_1_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2690:28: ( (this_ConditionalExpression_0= ruleConditionalExpression ( ( ( ( ruleAssignmentOperator ) )=> (lv_assignmentoperator_1_0= ruleAssignmentOperator ) ) ( (lv_expression_2_0= ruleExpression ) ) )? ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2691:1: (this_ConditionalExpression_0= ruleConditionalExpression ( ( ( ( ruleAssignmentOperator ) )=> (lv_assignmentoperator_1_0= ruleAssignmentOperator ) ) ( (lv_expression_2_0= ruleExpression ) ) )? )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2691:1: (this_ConditionalExpression_0= ruleConditionalExpression ( ( ( ( ruleAssignmentOperator ) )=> (lv_assignmentoperator_1_0= ruleAssignmentOperator ) ) ( (lv_expression_2_0= ruleExpression ) ) )? )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2692:5: this_ConditionalExpression_0= ruleConditionalExpression ( ( ( ( ruleAssignmentOperator ) )=> (lv_assignmentoperator_1_0= ruleAssignmentOperator ) ) ( (lv_expression_2_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getConditionalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_ruleExpression6500);
            this_ConditionalExpression_0=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConditionalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2700:1: ( ( ( ( ruleAssignmentOperator ) )=> (lv_assignmentoperator_1_0= ruleAssignmentOperator ) ) ( (lv_expression_2_0= ruleExpression ) ) )?
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2700:2: ( ( ( ruleAssignmentOperator ) )=> (lv_assignmentoperator_1_0= ruleAssignmentOperator ) ) ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2700:2: ( ( ( ruleAssignmentOperator ) )=> (lv_assignmentoperator_1_0= ruleAssignmentOperator ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2700:3: ( ( ruleAssignmentOperator ) )=> (lv_assignmentoperator_1_0= ruleAssignmentOperator )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2705:1: (lv_assignmentoperator_1_0= ruleAssignmentOperator )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2706:3: lv_assignmentoperator_1_0= ruleAssignmentOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentoperatorAssignmentOperatorParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignmentOperator_in_ruleExpression6531);
                    lv_assignmentoperator_1_0=ruleAssignmentOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"assignmentoperator",
                              		lv_assignmentoperator_1_0, 
                              		"AssignmentOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2722:2: ( (lv_expression_2_0= ruleExpression ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2723:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2723:1: (lv_expression_2_0= ruleExpression )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2724:3: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression6552);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignmentOperator"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2748:1: entryRuleAssignmentOperator returns [String current=null] : iv_ruleAssignmentOperator= ruleAssignmentOperator EOF ;
    public final String entryRuleAssignmentOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignmentOperator = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2749:2: (iv_ruleAssignmentOperator= ruleAssignmentOperator EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2750:2: iv_ruleAssignmentOperator= ruleAssignmentOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentOperator_in_entryRuleAssignmentOperator6591);
            iv_ruleAssignmentOperator=ruleAssignmentOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentOperator6602); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentOperator"


    // $ANTLR start "ruleAssignmentOperator"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2757:1: ruleAssignmentOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '%=' ) ;
    public final AntlrDatatypeRuleToken ruleAssignmentOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2760:28: ( (kw= '=' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '%=' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2761:1: (kw= '=' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '%=' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2761:1: (kw= '=' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '%=' )
            int alt40=9;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt40=1;
                }
                break;
            case 66:
                {
                alt40=2;
                }
                break;
            case 67:
                {
                alt40=3;
                }
                break;
            case 68:
                {
                alt40=4;
                }
                break;
            case 69:
                {
                alt40=5;
                }
                break;
            case 70:
                {
                alt40=6;
                }
                break;
            case 71:
                {
                alt40=7;
                }
                break;
            case 72:
                {
                alt40=8;
                }
                break;
            case 73:
                {
                alt40=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2762:2: kw= '='
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleAssignmentOperator6640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2769:2: kw= '+='
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleAssignmentOperator6659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getPlusSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2776:2: kw= '-='
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleAssignmentOperator6678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2783:2: kw= '*='
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleAssignmentOperator6697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getAsteriskEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2790:2: kw= '/='
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleAssignmentOperator6716); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getSolidusEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2797:2: kw= '&='
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleAssignmentOperator6735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getAmpersandEqualsSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2804:2: kw= '|='
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleAssignmentOperator6754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getVerticalLineEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2811:2: kw= '^='
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleAssignmentOperator6773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getCircumflexAccentEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2818:2: kw= '%='
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleAssignmentOperator6792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getPercentSignEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentOperator"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2831:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2832:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2833:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6832);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression6842); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2840:1: ruleConditionalExpression returns [EObject current=null] : ( ( (lv_conditionalorexpression_0_0= ruleConditionalOrExpression ) ) (otherlv_1= '?' ( (lv_expression1_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_expression2_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_conditionalorexpression_0_0 = null;

        EObject lv_expression1_2_0 = null;

        EObject lv_expression2_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2843:28: ( ( ( (lv_conditionalorexpression_0_0= ruleConditionalOrExpression ) ) (otherlv_1= '?' ( (lv_expression1_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_expression2_4_0= ruleExpression ) ) )? ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2844:1: ( ( (lv_conditionalorexpression_0_0= ruleConditionalOrExpression ) ) (otherlv_1= '?' ( (lv_expression1_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_expression2_4_0= ruleExpression ) ) )? )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2844:1: ( ( (lv_conditionalorexpression_0_0= ruleConditionalOrExpression ) ) (otherlv_1= '?' ( (lv_expression1_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_expression2_4_0= ruleExpression ) ) )? )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2844:2: ( (lv_conditionalorexpression_0_0= ruleConditionalOrExpression ) ) (otherlv_1= '?' ( (lv_expression1_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_expression2_4_0= ruleExpression ) ) )?
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2844:2: ( (lv_conditionalorexpression_0_0= ruleConditionalOrExpression ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2845:1: (lv_conditionalorexpression_0_0= ruleConditionalOrExpression )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2845:1: (lv_conditionalorexpression_0_0= ruleConditionalOrExpression )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2846:3: lv_conditionalorexpression_0_0= ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getConditionalorexpressionConditionalOrExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleConditionalExpression6888);
            lv_conditionalorexpression_0_0=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"conditionalorexpression",
                      		lv_conditionalorexpression_0_0, 
                      		"ConditionalOrExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2862:2: (otherlv_1= '?' ( (lv_expression1_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_expression2_4_0= ruleExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==74) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2862:4: otherlv_1= '?' ( (lv_expression1_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_expression2_4_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleConditionalExpression6901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_0());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2866:1: ( (lv_expression1_2_0= ruleExpression ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2867:1: (lv_expression1_2_0= ruleExpression )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2867:1: (lv_expression1_2_0= ruleExpression )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2868:3: lv_expression1_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getExpression1ExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleConditionalExpression6922);
                    lv_expression1_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression1",
                              		lv_expression1_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleConditionalExpression6934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_2());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2888:1: ( (lv_expression2_4_0= ruleExpression ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2889:1: (lv_expression2_4_0= ruleExpression )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2889:1: (lv_expression2_4_0= ruleExpression )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2890:3: lv_expression2_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getExpression2ExpressionParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleConditionalExpression6955);
                    lv_expression2_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression2",
                              		lv_expression2_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleConditionalOrExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2914:1: entryRuleConditionalOrExpression returns [EObject current=null] : iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF ;
    public final EObject entryRuleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalOrExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2915:2: (iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2916:2: iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression6993);
            iv_ruleConditionalOrExpression=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalOrExpression7003); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalOrExpression"


    // $ANTLR start "ruleConditionalOrExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2923:1: ruleConditionalOrExpression returns [EObject current=null] : ( ( (lv_conditionalandexpression_0_0= ruleConditionalAndExpression ) ) (otherlv_1= 'or' ( (lv_conditionalandexpression_2_0= ruleConditionalAndExpression ) ) )* ) ;
    public final EObject ruleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_conditionalandexpression_0_0 = null;

        EObject lv_conditionalandexpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2926:28: ( ( ( (lv_conditionalandexpression_0_0= ruleConditionalAndExpression ) ) (otherlv_1= 'or' ( (lv_conditionalandexpression_2_0= ruleConditionalAndExpression ) ) )* ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2927:1: ( ( (lv_conditionalandexpression_0_0= ruleConditionalAndExpression ) ) (otherlv_1= 'or' ( (lv_conditionalandexpression_2_0= ruleConditionalAndExpression ) ) )* )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2927:1: ( ( (lv_conditionalandexpression_0_0= ruleConditionalAndExpression ) ) (otherlv_1= 'or' ( (lv_conditionalandexpression_2_0= ruleConditionalAndExpression ) ) )* )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2927:2: ( (lv_conditionalandexpression_0_0= ruleConditionalAndExpression ) ) (otherlv_1= 'or' ( (lv_conditionalandexpression_2_0= ruleConditionalAndExpression ) ) )*
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2927:2: ( (lv_conditionalandexpression_0_0= ruleConditionalAndExpression ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2928:1: (lv_conditionalandexpression_0_0= ruleConditionalAndExpression )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2928:1: (lv_conditionalandexpression_0_0= ruleConditionalAndExpression )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2929:3: lv_conditionalandexpression_0_0= ruleConditionalAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getConditionalandexpressionConditionalAndExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression7049);
            lv_conditionalandexpression_0_0=ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalOrExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"conditionalandexpression",
                      		lv_conditionalandexpression_0_0, 
                      		"ConditionalAndExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2945:2: (otherlv_1= 'or' ( (lv_conditionalandexpression_2_0= ruleConditionalAndExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==75) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2945:4: otherlv_1= 'or' ( (lv_conditionalandexpression_2_0= ruleConditionalAndExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleConditionalOrExpression7062); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getConditionalOrExpressionAccess().getOrKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2949:1: ( (lv_conditionalandexpression_2_0= ruleConditionalAndExpression ) )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2950:1: (lv_conditionalandexpression_2_0= ruleConditionalAndExpression )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2950:1: (lv_conditionalandexpression_2_0= ruleConditionalAndExpression )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2951:3: lv_conditionalandexpression_2_0= ruleConditionalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getConditionalandexpressionConditionalAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression7083);
            	    lv_conditionalandexpression_2_0=ruleConditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalOrExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"conditionalandexpression",
            	              		lv_conditionalandexpression_2_0, 
            	              		"ConditionalAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalOrExpression"


    // $ANTLR start "entryRuleConditionalAndExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2975:1: entryRuleConditionalAndExpression returns [EObject current=null] : iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF ;
    public final EObject entryRuleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAndExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2976:2: (iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2977:2: iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression7121);
            iv_ruleConditionalAndExpression=ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalAndExpression7131); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalAndExpression"


    // $ANTLR start "ruleConditionalAndExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2984:1: ruleConditionalAndExpression returns [EObject current=null] : ( ( (lv_exclusiveorexpression_0_0= ruleExclusiveOrExpression ) ) (otherlv_1= 'and' ( (lv_exclusiveorexpression_2_0= ruleExclusiveOrExpression ) ) )* ) ;
    public final EObject ruleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exclusiveorexpression_0_0 = null;

        EObject lv_exclusiveorexpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2987:28: ( ( ( (lv_exclusiveorexpression_0_0= ruleExclusiveOrExpression ) ) (otherlv_1= 'and' ( (lv_exclusiveorexpression_2_0= ruleExclusiveOrExpression ) ) )* ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2988:1: ( ( (lv_exclusiveorexpression_0_0= ruleExclusiveOrExpression ) ) (otherlv_1= 'and' ( (lv_exclusiveorexpression_2_0= ruleExclusiveOrExpression ) ) )* )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2988:1: ( ( (lv_exclusiveorexpression_0_0= ruleExclusiveOrExpression ) ) (otherlv_1= 'and' ( (lv_exclusiveorexpression_2_0= ruleExclusiveOrExpression ) ) )* )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2988:2: ( (lv_exclusiveorexpression_0_0= ruleExclusiveOrExpression ) ) (otherlv_1= 'and' ( (lv_exclusiveorexpression_2_0= ruleExclusiveOrExpression ) ) )*
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2988:2: ( (lv_exclusiveorexpression_0_0= ruleExclusiveOrExpression ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2989:1: (lv_exclusiveorexpression_0_0= ruleExclusiveOrExpression )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2989:1: (lv_exclusiveorexpression_0_0= ruleExclusiveOrExpression )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2990:3: lv_exclusiveorexpression_0_0= ruleExclusiveOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getExclusiveorexpressionExclusiveOrExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExclusiveOrExpression_in_ruleConditionalAndExpression7177);
            lv_exclusiveorexpression_0_0=ruleExclusiveOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalAndExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"exclusiveorexpression",
                      		lv_exclusiveorexpression_0_0, 
                      		"ExclusiveOrExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3006:2: (otherlv_1= 'and' ( (lv_exclusiveorexpression_2_0= ruleExclusiveOrExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==76) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3006:4: otherlv_1= 'and' ( (lv_exclusiveorexpression_2_0= ruleExclusiveOrExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleConditionalAndExpression7190); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getConditionalAndExpressionAccess().getAndKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3010:1: ( (lv_exclusiveorexpression_2_0= ruleExclusiveOrExpression ) )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3011:1: (lv_exclusiveorexpression_2_0= ruleExclusiveOrExpression )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3011:1: (lv_exclusiveorexpression_2_0= ruleExclusiveOrExpression )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3012:3: lv_exclusiveorexpression_2_0= ruleExclusiveOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getExclusiveorexpressionExclusiveOrExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExclusiveOrExpression_in_ruleConditionalAndExpression7211);
            	    lv_exclusiveorexpression_2_0=ruleExclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalAndExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"exclusiveorexpression",
            	              		lv_exclusiveorexpression_2_0, 
            	              		"ExclusiveOrExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalAndExpression"


    // $ANTLR start "entryRuleExclusiveOrExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3036:1: entryRuleExclusiveOrExpression returns [EObject current=null] : iv_ruleExclusiveOrExpression= ruleExclusiveOrExpression EOF ;
    public final EObject entryRuleExclusiveOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusiveOrExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3037:2: (iv_ruleExclusiveOrExpression= ruleExclusiveOrExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3038:2: iv_ruleExclusiveOrExpression= ruleExclusiveOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExclusiveOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExclusiveOrExpression_in_entryRuleExclusiveOrExpression7249);
            iv_ruleExclusiveOrExpression=ruleExclusiveOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExclusiveOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExclusiveOrExpression7259); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExclusiveOrExpression"


    // $ANTLR start "ruleExclusiveOrExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3045:1: ruleExclusiveOrExpression returns [EObject current=null] : ( ( (lv_equalityexpression_0_0= ruleEqualityExpression ) ) (otherlv_1= 'xor' ( (lv_equalityexpression_2_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleExclusiveOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_equalityexpression_0_0 = null;

        EObject lv_equalityexpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3048:28: ( ( ( (lv_equalityexpression_0_0= ruleEqualityExpression ) ) (otherlv_1= 'xor' ( (lv_equalityexpression_2_0= ruleEqualityExpression ) ) )* ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3049:1: ( ( (lv_equalityexpression_0_0= ruleEqualityExpression ) ) (otherlv_1= 'xor' ( (lv_equalityexpression_2_0= ruleEqualityExpression ) ) )* )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3049:1: ( ( (lv_equalityexpression_0_0= ruleEqualityExpression ) ) (otherlv_1= 'xor' ( (lv_equalityexpression_2_0= ruleEqualityExpression ) ) )* )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3049:2: ( (lv_equalityexpression_0_0= ruleEqualityExpression ) ) (otherlv_1= 'xor' ( (lv_equalityexpression_2_0= ruleEqualityExpression ) ) )*
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3049:2: ( (lv_equalityexpression_0_0= ruleEqualityExpression ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3050:1: (lv_equalityexpression_0_0= ruleEqualityExpression )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3050:1: (lv_equalityexpression_0_0= ruleEqualityExpression )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3051:3: lv_equalityexpression_0_0= ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExclusiveOrExpressionAccess().getEqualityexpressionEqualityExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleExclusiveOrExpression7305);
            lv_equalityexpression_0_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExclusiveOrExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"equalityexpression",
                      		lv_equalityexpression_0_0, 
                      		"EqualityExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3067:2: (otherlv_1= 'xor' ( (lv_equalityexpression_2_0= ruleEqualityExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==77) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3067:4: otherlv_1= 'xor' ( (lv_equalityexpression_2_0= ruleEqualityExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleExclusiveOrExpression7318); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExclusiveOrExpressionAccess().getXorKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3071:1: ( (lv_equalityexpression_2_0= ruleEqualityExpression ) )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3072:1: (lv_equalityexpression_2_0= ruleEqualityExpression )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3072:1: (lv_equalityexpression_2_0= ruleEqualityExpression )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3073:3: lv_equalityexpression_2_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExclusiveOrExpressionAccess().getEqualityexpressionEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleExclusiveOrExpression7339);
            	    lv_equalityexpression_2_0=ruleEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExclusiveOrExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"equalityexpression",
            	              		lv_equalityexpression_2_0, 
            	              		"EqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExclusiveOrExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3097:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3098:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3099:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression7377);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression7387); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3106:1: ruleEqualityExpression returns [EObject current=null] : ( ( (lv_instanceofexpression_0_0= ruleInstanceOfExpression ) ) ( (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_instanceofexpression_3_0= ruleInstanceOfExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_instanceofexpression_0_0 = null;

        EObject lv_instanceofexpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3109:28: ( ( ( (lv_instanceofexpression_0_0= ruleInstanceOfExpression ) ) ( (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_instanceofexpression_3_0= ruleInstanceOfExpression ) ) )* ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3110:1: ( ( (lv_instanceofexpression_0_0= ruleInstanceOfExpression ) ) ( (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_instanceofexpression_3_0= ruleInstanceOfExpression ) ) )* )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3110:1: ( ( (lv_instanceofexpression_0_0= ruleInstanceOfExpression ) ) ( (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_instanceofexpression_3_0= ruleInstanceOfExpression ) ) )* )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3110:2: ( (lv_instanceofexpression_0_0= ruleInstanceOfExpression ) ) ( (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_instanceofexpression_3_0= ruleInstanceOfExpression ) ) )*
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3110:2: ( (lv_instanceofexpression_0_0= ruleInstanceOfExpression ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3111:1: (lv_instanceofexpression_0_0= ruleInstanceOfExpression )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3111:1: (lv_instanceofexpression_0_0= ruleInstanceOfExpression )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3112:3: lv_instanceofexpression_0_0= ruleInstanceOfExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getInstanceofexpressionInstanceOfExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstanceOfExpression_in_ruleEqualityExpression7433);
            lv_instanceofexpression_0_0=ruleInstanceOfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"instanceofexpression",
                      		lv_instanceofexpression_0_0, 
                      		"InstanceOfExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3128:2: ( (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_instanceofexpression_3_0= ruleInstanceOfExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=78 && LA46_0<=79)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3128:3: (otherlv_1= '==' | otherlv_2= '!=' ) ( (lv_instanceofexpression_3_0= ruleInstanceOfExpression ) )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3128:3: (otherlv_1= '==' | otherlv_2= '!=' )
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==78) ) {
            	        alt45=1;
            	    }
            	    else if ( (LA45_0==79) ) {
            	        alt45=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 45, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3128:5: otherlv_1= '=='
            	            {
            	            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleEqualityExpression7447); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_1, grammarAccess.getEqualityExpressionAccess().getEqualsSignEqualsSignKeyword_1_0_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3133:7: otherlv_2= '!='
            	            {
            	            otherlv_2=(Token)match(input,79,FOLLOW_79_in_ruleEqualityExpression7465); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getEqualityExpressionAccess().getExclamationMarkEqualsSignKeyword_1_0_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3137:2: ( (lv_instanceofexpression_3_0= ruleInstanceOfExpression ) )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3138:1: (lv_instanceofexpression_3_0= ruleInstanceOfExpression )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3138:1: (lv_instanceofexpression_3_0= ruleInstanceOfExpression )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3139:3: lv_instanceofexpression_3_0= ruleInstanceOfExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getInstanceofexpressionInstanceOfExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstanceOfExpression_in_ruleEqualityExpression7487);
            	    lv_instanceofexpression_3_0=ruleInstanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instanceofexpression",
            	              		lv_instanceofexpression_3_0, 
            	              		"InstanceOfExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleInstanceOfExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3163:1: entryRuleInstanceOfExpression returns [EObject current=null] : iv_ruleInstanceOfExpression= ruleInstanceOfExpression EOF ;
    public final EObject entryRuleInstanceOfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceOfExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3164:2: (iv_ruleInstanceOfExpression= ruleInstanceOfExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3165:2: iv_ruleInstanceOfExpression= ruleInstanceOfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceOfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceOfExpression_in_entryRuleInstanceOfExpression7525);
            iv_ruleInstanceOfExpression=ruleInstanceOfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceOfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceOfExpression7535); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceOfExpression"


    // $ANTLR start "ruleInstanceOfExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3172:1: ruleInstanceOfExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression (otherlv_1= 'instanceof' ( (lv_type_2_0= ruleUseType ) ) )? ) ;
    public final EObject ruleInstanceOfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3175:28: ( (this_RelationalExpression_0= ruleRelationalExpression (otherlv_1= 'instanceof' ( (lv_type_2_0= ruleUseType ) ) )? ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3176:1: (this_RelationalExpression_0= ruleRelationalExpression (otherlv_1= 'instanceof' ( (lv_type_2_0= ruleUseType ) ) )? )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3176:1: (this_RelationalExpression_0= ruleRelationalExpression (otherlv_1= 'instanceof' ( (lv_type_2_0= ruleUseType ) ) )? )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3177:5: this_RelationalExpression_0= ruleRelationalExpression (otherlv_1= 'instanceof' ( (lv_type_2_0= ruleUseType ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInstanceOfExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleInstanceOfExpression7582);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3185:1: (otherlv_1= 'instanceof' ( (lv_type_2_0= ruleUseType ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==80) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3185:3: otherlv_1= 'instanceof' ( (lv_type_2_0= ruleUseType ) )
                    {
                    otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleInstanceOfExpression7594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getInstanceOfExpressionAccess().getInstanceofKeyword_1_0());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3189:1: ( (lv_type_2_0= ruleUseType ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3190:1: (lv_type_2_0= ruleUseType )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3190:1: (lv_type_2_0= ruleUseType )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3191:3: lv_type_2_0= ruleUseType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstanceOfExpressionAccess().getTypeUseTypeParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUseType_in_ruleInstanceOfExpression7615);
                    lv_type_2_0=ruleUseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstanceOfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"UseType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceOfExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3215:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3216:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3217:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression7653);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression7663); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3224:1: ruleRelationalExpression returns [EObject current=null] : ( ( (lv_additiveexpression_0_0= ruleAdditiveExpression ) ) ( ( (lv_relationalop_1_0= ruleRelationalOp ) ) ( (lv_additiveexpression_2_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_additiveexpression_0_0 = null;

        AntlrDatatypeRuleToken lv_relationalop_1_0 = null;

        EObject lv_additiveexpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3227:28: ( ( ( (lv_additiveexpression_0_0= ruleAdditiveExpression ) ) ( ( (lv_relationalop_1_0= ruleRelationalOp ) ) ( (lv_additiveexpression_2_0= ruleAdditiveExpression ) ) )* ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3228:1: ( ( (lv_additiveexpression_0_0= ruleAdditiveExpression ) ) ( ( (lv_relationalop_1_0= ruleRelationalOp ) ) ( (lv_additiveexpression_2_0= ruleAdditiveExpression ) ) )* )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3228:1: ( ( (lv_additiveexpression_0_0= ruleAdditiveExpression ) ) ( ( (lv_relationalop_1_0= ruleRelationalOp ) ) ( (lv_additiveexpression_2_0= ruleAdditiveExpression ) ) )* )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3228:2: ( (lv_additiveexpression_0_0= ruleAdditiveExpression ) ) ( ( (lv_relationalop_1_0= ruleRelationalOp ) ) ( (lv_additiveexpression_2_0= ruleAdditiveExpression ) ) )*
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3228:2: ( (lv_additiveexpression_0_0= ruleAdditiveExpression ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3229:1: (lv_additiveexpression_0_0= ruleAdditiveExpression )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3229:1: (lv_additiveexpression_0_0= ruleAdditiveExpression )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3230:3: lv_additiveexpression_0_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveexpressionAdditiveExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression7709);
            lv_additiveexpression_0_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"additiveexpression",
                      		lv_additiveexpression_0_0, 
                      		"AdditiveExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3246:2: ( ( (lv_relationalop_1_0= ruleRelationalOp ) ) ( (lv_additiveexpression_2_0= ruleAdditiveExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=81 && LA48_0<=84)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3246:3: ( (lv_relationalop_1_0= ruleRelationalOp ) ) ( (lv_additiveexpression_2_0= ruleAdditiveExpression ) )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3246:3: ( (lv_relationalop_1_0= ruleRelationalOp ) )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3247:1: (lv_relationalop_1_0= ruleRelationalOp )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3247:1: (lv_relationalop_1_0= ruleRelationalOp )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3248:3: lv_relationalop_1_0= ruleRelationalOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRelationalopRelationalOpParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOp_in_ruleRelationalExpression7731);
            	    lv_relationalop_1_0=ruleRelationalOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"relationalop",
            	              		lv_relationalop_1_0, 
            	              		"RelationalOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3264:2: ( (lv_additiveexpression_2_0= ruleAdditiveExpression ) )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3265:1: (lv_additiveexpression_2_0= ruleAdditiveExpression )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3265:1: (lv_additiveexpression_2_0= ruleAdditiveExpression )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3266:3: lv_additiveexpression_2_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveexpressionAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression7752);
            	    lv_additiveexpression_2_0=ruleAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"additiveexpression",
            	              		lv_additiveexpression_2_0, 
            	              		"AdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleRelationalOp"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3290:1: entryRuleRelationalOp returns [String current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final String entryRuleRelationalOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOp = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3291:2: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3292:2: iv_ruleRelationalOp= ruleRelationalOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalOpRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalOp_in_entryRuleRelationalOp7791);
            iv_ruleRelationalOp=ruleRelationalOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOp7802); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalOp"


    // $ANTLR start "ruleRelationalOp"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3299:1: ruleRelationalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3302:28: ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3303:1: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3303:1: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt49=1;
                }
                break;
            case 82:
                {
                alt49=2;
                }
                break;
            case 83:
                {
                alt49=3;
                }
                break;
            case 84:
                {
                alt49=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3304:2: kw= '<'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleRelationalOp7840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3311:2: kw= '<='
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleRelationalOp7859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3318:2: kw= '>'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleRelationalOp7878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3325:2: kw= '>='
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleRelationalOp7897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3338:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3339:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3340:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression7937);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression7947); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3347:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_multiplicativeexpression_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multiplicativeexpression_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multiplicativeexpression_0_0 = null;

        EObject lv_multiplicativeexpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3350:28: ( ( ( (lv_multiplicativeexpression_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multiplicativeexpression_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3351:1: ( ( (lv_multiplicativeexpression_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multiplicativeexpression_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3351:1: ( ( (lv_multiplicativeexpression_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multiplicativeexpression_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3351:2: ( (lv_multiplicativeexpression_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multiplicativeexpression_3_0= ruleMultiplicativeExpression ) ) )*
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3351:2: ( (lv_multiplicativeexpression_0_0= ruleMultiplicativeExpression ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3352:1: (lv_multiplicativeexpression_0_0= ruleMultiplicativeExpression )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3352:1: (lv_multiplicativeexpression_0_0= ruleMultiplicativeExpression )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3353:3: lv_multiplicativeexpression_0_0= ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeexpressionMultiplicativeExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7993);
            lv_multiplicativeexpression_0_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"multiplicativeexpression",
                      		lv_multiplicativeexpression_0_0, 
                      		"MultiplicativeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3369:2: ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multiplicativeexpression_3_0= ruleMultiplicativeExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=85 && LA51_0<=86)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3369:3: (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multiplicativeexpression_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3369:3: (otherlv_1= '+' | otherlv_2= '-' )
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==85) ) {
            	        alt50=1;
            	    }
            	    else if ( (LA50_0==86) ) {
            	        alt50=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 50, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3369:5: otherlv_1= '+'
            	            {
            	            otherlv_1=(Token)match(input,85,FOLLOW_85_in_ruleAdditiveExpression8007); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_1, grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3374:7: otherlv_2= '-'
            	            {
            	            otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleAdditiveExpression8025); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_0_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3378:2: ( (lv_multiplicativeexpression_3_0= ruleMultiplicativeExpression ) )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3379:1: (lv_multiplicativeexpression_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3379:1: (lv_multiplicativeexpression_3_0= ruleMultiplicativeExpression )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3380:3: lv_multiplicativeexpression_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeexpressionMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression8047);
            	    lv_multiplicativeexpression_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"multiplicativeexpression",
            	              		lv_multiplicativeexpression_3_0, 
            	              		"MultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3404:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3405:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3406:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression8085);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression8095); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3413:1: ruleMultiplicativeExpression returns [EObject current=null] : ( ( (lv_unaryexpression_0_0= ruleUnaryExpression ) ) ( (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_unaryexpression_4_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_unaryexpression_0_0 = null;

        EObject lv_unaryexpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3416:28: ( ( ( (lv_unaryexpression_0_0= ruleUnaryExpression ) ) ( (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_unaryexpression_4_0= ruleUnaryExpression ) ) )* ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3417:1: ( ( (lv_unaryexpression_0_0= ruleUnaryExpression ) ) ( (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_unaryexpression_4_0= ruleUnaryExpression ) ) )* )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3417:1: ( ( (lv_unaryexpression_0_0= ruleUnaryExpression ) ) ( (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_unaryexpression_4_0= ruleUnaryExpression ) ) )* )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3417:2: ( (lv_unaryexpression_0_0= ruleUnaryExpression ) ) ( (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_unaryexpression_4_0= ruleUnaryExpression ) ) )*
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3417:2: ( (lv_unaryexpression_0_0= ruleUnaryExpression ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3418:1: (lv_unaryexpression_0_0= ruleUnaryExpression )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3418:1: (lv_unaryexpression_0_0= ruleUnaryExpression )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3419:3: lv_unaryexpression_0_0= ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryexpressionUnaryExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression8141);
            lv_unaryexpression_0_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"unaryexpression",
                      		lv_unaryexpression_0_0, 
                      		"UnaryExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3435:2: ( (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_unaryexpression_4_0= ruleUnaryExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=87 && LA53_0<=89)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3435:3: (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' ) ( (lv_unaryexpression_4_0= ruleUnaryExpression ) )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3435:3: (otherlv_1= '*' | otherlv_2= '/' | otherlv_3= '%' )
            	    int alt52=3;
            	    switch ( input.LA(1) ) {
            	    case 87:
            	        {
            	        alt52=1;
            	        }
            	        break;
            	    case 88:
            	        {
            	        alt52=2;
            	        }
            	        break;
            	    case 89:
            	        {
            	        alt52=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 52, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt52) {
            	        case 1 :
            	            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3435:5: otherlv_1= '*'
            	            {
            	            otherlv_1=(Token)match(input,87,FOLLOW_87_in_ruleMultiplicativeExpression8155); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_1, grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_1_0_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3440:7: otherlv_2= '/'
            	            {
            	            otherlv_2=(Token)match(input,88,FOLLOW_88_in_ruleMultiplicativeExpression8173); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicativeExpressionAccess().getSolidusKeyword_1_0_1());
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3445:7: otherlv_3= '%'
            	            {
            	            otherlv_3=(Token)match(input,89,FOLLOW_89_in_ruleMultiplicativeExpression8191); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getMultiplicativeExpressionAccess().getPercentSignKeyword_1_0_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3449:2: ( (lv_unaryexpression_4_0= ruleUnaryExpression ) )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3450:1: (lv_unaryexpression_4_0= ruleUnaryExpression )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3450:1: (lv_unaryexpression_4_0= ruleUnaryExpression )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3451:3: lv_unaryexpression_4_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryexpressionUnaryExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression8213);
            	    lv_unaryexpression_4_0=ruleUnaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"unaryexpression",
            	              		lv_unaryexpression_4_0, 
            	              		"UnaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3475:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3476:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3477:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression8251);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression8261); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3484:1: ruleUnaryExpression returns [EObject current=null] : ( (otherlv_0= '+' this_UnaryExpression_1= ruleUnaryExpression ) | (otherlv_2= '-' this_UnaryExpression_3= ruleUnaryExpression ) | (otherlv_4= '++' this_UnaryExpression_5= ruleUnaryExpression ) | (otherlv_6= '--' this_UnaryExpression_7= ruleUnaryExpression ) | this_UnaryExpressionNotPlusMinus_8= ruleUnaryExpressionNotPlusMinus ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_UnaryExpression_1 = null;

        EObject this_UnaryExpression_3 = null;

        EObject this_UnaryExpression_5 = null;

        EObject this_UnaryExpression_7 = null;

        EObject this_UnaryExpressionNotPlusMinus_8 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3487:28: ( ( (otherlv_0= '+' this_UnaryExpression_1= ruleUnaryExpression ) | (otherlv_2= '-' this_UnaryExpression_3= ruleUnaryExpression ) | (otherlv_4= '++' this_UnaryExpression_5= ruleUnaryExpression ) | (otherlv_6= '--' this_UnaryExpression_7= ruleUnaryExpression ) | this_UnaryExpressionNotPlusMinus_8= ruleUnaryExpressionNotPlusMinus ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3488:1: ( (otherlv_0= '+' this_UnaryExpression_1= ruleUnaryExpression ) | (otherlv_2= '-' this_UnaryExpression_3= ruleUnaryExpression ) | (otherlv_4= '++' this_UnaryExpression_5= ruleUnaryExpression ) | (otherlv_6= '--' this_UnaryExpression_7= ruleUnaryExpression ) | this_UnaryExpressionNotPlusMinus_8= ruleUnaryExpressionNotPlusMinus )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3488:1: ( (otherlv_0= '+' this_UnaryExpression_1= ruleUnaryExpression ) | (otherlv_2= '-' this_UnaryExpression_3= ruleUnaryExpression ) | (otherlv_4= '++' this_UnaryExpression_5= ruleUnaryExpression ) | (otherlv_6= '--' this_UnaryExpression_7= ruleUnaryExpression ) | this_UnaryExpressionNotPlusMinus_8= ruleUnaryExpressionNotPlusMinus )
            int alt54=5;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt54=1;
                }
                break;
            case 86:
                {
                alt54=2;
                }
                break;
            case 90:
                {
                alt54=3;
                }
                break;
            case 91:
                {
                alt54=4;
                }
                break;
            case RULE_ID:
            case RULE_FLOATING_POINT_LITERAL:
            case RULE_CHARACTER_LITERAL:
            case RULE_STRING_LITERAL:
            case RULE_HEX_LITERAL:
            case RULE_OCTAL_LITERAL:
            case RULE_DECIMAL_LITERAL:
            case 51:
            case 55:
            case 57:
            case 58:
            case 92:
            case 94:
                {
                alt54=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3488:2: (otherlv_0= '+' this_UnaryExpression_1= ruleUnaryExpression )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3488:2: (otherlv_0= '+' this_UnaryExpression_1= ruleUnaryExpression )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3488:4: otherlv_0= '+' this_UnaryExpression_1= ruleUnaryExpression
                    {
                    otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleUnaryExpression8299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUnaryExpressionAccess().getPlusSignKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleUnaryExpression8321);
                    this_UnaryExpression_1=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnaryExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3502:6: (otherlv_2= '-' this_UnaryExpression_3= ruleUnaryExpression )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3502:6: (otherlv_2= '-' this_UnaryExpression_3= ruleUnaryExpression )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3502:8: otherlv_2= '-' this_UnaryExpression_3= ruleUnaryExpression
                    {
                    otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleUnaryExpression8340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleUnaryExpression8362);
                    this_UnaryExpression_3=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnaryExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3516:6: (otherlv_4= '++' this_UnaryExpression_5= ruleUnaryExpression )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3516:6: (otherlv_4= '++' this_UnaryExpression_5= ruleUnaryExpression )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3516:8: otherlv_4= '++' this_UnaryExpression_5= ruleUnaryExpression
                    {
                    otherlv_4=(Token)match(input,90,FOLLOW_90_in_ruleUnaryExpression8381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getUnaryExpressionAccess().getPlusSignPlusSignKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleUnaryExpression8403);
                    this_UnaryExpression_5=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnaryExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3530:6: (otherlv_6= '--' this_UnaryExpression_7= ruleUnaryExpression )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3530:6: (otherlv_6= '--' this_UnaryExpression_7= ruleUnaryExpression )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3530:8: otherlv_6= '--' this_UnaryExpression_7= ruleUnaryExpression
                    {
                    otherlv_6=(Token)match(input,91,FOLLOW_91_in_ruleUnaryExpression8422); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getUnaryExpressionAccess().getHyphenMinusHyphenMinusKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleUnaryExpression8444);
                    this_UnaryExpression_7=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnaryExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3545:5: this_UnaryExpressionNotPlusMinus_8= ruleUnaryExpressionNotPlusMinus
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionNotPlusMinusParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryExpressionNotPlusMinus_in_ruleUnaryExpression8472);
                    this_UnaryExpressionNotPlusMinus_8=ruleUnaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnaryExpressionNotPlusMinus_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleUnaryExpressionNotPlusMinus"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3561:1: entryRuleUnaryExpressionNotPlusMinus returns [EObject current=null] : iv_ruleUnaryExpressionNotPlusMinus= ruleUnaryExpressionNotPlusMinus EOF ;
    public final EObject entryRuleUnaryExpressionNotPlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpressionNotPlusMinus = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3562:2: (iv_ruleUnaryExpressionNotPlusMinus= ruleUnaryExpressionNotPlusMinus EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3563:2: iv_ruleUnaryExpressionNotPlusMinus= ruleUnaryExpressionNotPlusMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionNotPlusMinusRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryExpressionNotPlusMinus_in_entryRuleUnaryExpressionNotPlusMinus8507);
            iv_ruleUnaryExpressionNotPlusMinus=ruleUnaryExpressionNotPlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpressionNotPlusMinus; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpressionNotPlusMinus8517); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpressionNotPlusMinus"


    // $ANTLR start "ruleUnaryExpressionNotPlusMinus"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3570:1: ruleUnaryExpressionNotPlusMinus returns [EObject current=null] : ( () ( (otherlv_1= '!' ( (lv_unaryexpression_2_0= ruleUnaryExpression ) ) ) | ( (lv_primary_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleUnaryExpressionNotPlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_unaryexpression_2_0 = null;

        EObject lv_primary_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3573:28: ( ( () ( (otherlv_1= '!' ( (lv_unaryexpression_2_0= ruleUnaryExpression ) ) ) | ( (lv_primary_3_0= rulePrimary ) ) ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3574:1: ( () ( (otherlv_1= '!' ( (lv_unaryexpression_2_0= ruleUnaryExpression ) ) ) | ( (lv_primary_3_0= rulePrimary ) ) ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3574:1: ( () ( (otherlv_1= '!' ( (lv_unaryexpression_2_0= ruleUnaryExpression ) ) ) | ( (lv_primary_3_0= rulePrimary ) ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3574:2: () ( (otherlv_1= '!' ( (lv_unaryexpression_2_0= ruleUnaryExpression ) ) ) | ( (lv_primary_3_0= rulePrimary ) ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3574:2: ()
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3575:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnaryExpressionNotPlusMinusAccess().getUnaryExpressionNotPlusMinusAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3580:2: ( (otherlv_1= '!' ( (lv_unaryexpression_2_0= ruleUnaryExpression ) ) ) | ( (lv_primary_3_0= rulePrimary ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==92) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_ID||(LA55_0>=RULE_FLOATING_POINT_LITERAL && LA55_0<=RULE_DECIMAL_LITERAL)||LA55_0==51||LA55_0==55||(LA55_0>=57 && LA55_0<=58)||LA55_0==94) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3580:3: (otherlv_1= '!' ( (lv_unaryexpression_2_0= ruleUnaryExpression ) ) )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3580:3: (otherlv_1= '!' ( (lv_unaryexpression_2_0= ruleUnaryExpression ) ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3580:5: otherlv_1= '!' ( (lv_unaryexpression_2_0= ruleUnaryExpression ) )
                    {
                    otherlv_1=(Token)match(input,92,FOLLOW_92_in_ruleUnaryExpressionNotPlusMinus8565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUnaryExpressionNotPlusMinusAccess().getExclamationMarkKeyword_1_0_0());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3584:1: ( (lv_unaryexpression_2_0= ruleUnaryExpression ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3585:1: (lv_unaryexpression_2_0= ruleUnaryExpression )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3585:1: (lv_unaryexpression_2_0= ruleUnaryExpression )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3586:3: lv_unaryexpression_2_0= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionNotPlusMinusAccess().getUnaryexpressionUnaryExpressionParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleUnaryExpressionNotPlusMinus8586);
                    lv_unaryexpression_2_0=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionNotPlusMinusRule());
                      	        }
                             		set(
                             			current, 
                             			"unaryexpression",
                              		lv_unaryexpression_2_0, 
                              		"UnaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3603:6: ( (lv_primary_3_0= rulePrimary ) )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3603:6: ( (lv_primary_3_0= rulePrimary ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3604:1: (lv_primary_3_0= rulePrimary )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3604:1: (lv_primary_3_0= rulePrimary )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3605:3: lv_primary_3_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionNotPlusMinusAccess().getPrimaryPrimaryParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimary_in_ruleUnaryExpressionNotPlusMinus8614);
                    lv_primary_3_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionNotPlusMinusRule());
                      	        }
                             		set(
                             			current, 
                             			"primary",
                              		lv_primary_3_0, 
                              		"Primary");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpressionNotPlusMinus"


    // $ANTLR start "entryRulePrimary"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3629:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3630:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3631:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary8651);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary8661); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3638:1: rulePrimary returns [EObject current=null] : ( () ( ( (lv_parexpression_1_0= ruleParExpression ) ) | ( (lv_literal_2_0= ruleLiteral ) ) | (otherlv_3= 'this' (otherlv_4= '.' ( (lv_identifier_5_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_6_0= ruleIdentifierSuffix ) )? ) | ( ( (lv_identifier_7_0= RULE_ID ) ) (otherlv_8= '.' ( (lv_identifier_9_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_10_0= ruleIdentifierSuffix ) )? ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_identifier_5_0=null;
        Token lv_identifier_7_0=null;
        Token otherlv_8=null;
        Token lv_identifier_9_0=null;
        EObject lv_parexpression_1_0 = null;

        AntlrDatatypeRuleToken lv_literal_2_0 = null;

        EObject lv_identifiersuffix_6_0 = null;

        EObject lv_identifiersuffix_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3641:28: ( ( () ( ( (lv_parexpression_1_0= ruleParExpression ) ) | ( (lv_literal_2_0= ruleLiteral ) ) | (otherlv_3= 'this' (otherlv_4= '.' ( (lv_identifier_5_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_6_0= ruleIdentifierSuffix ) )? ) | ( ( (lv_identifier_7_0= RULE_ID ) ) (otherlv_8= '.' ( (lv_identifier_9_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_10_0= ruleIdentifierSuffix ) )? ) ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3642:1: ( () ( ( (lv_parexpression_1_0= ruleParExpression ) ) | ( (lv_literal_2_0= ruleLiteral ) ) | (otherlv_3= 'this' (otherlv_4= '.' ( (lv_identifier_5_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_6_0= ruleIdentifierSuffix ) )? ) | ( ( (lv_identifier_7_0= RULE_ID ) ) (otherlv_8= '.' ( (lv_identifier_9_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_10_0= ruleIdentifierSuffix ) )? ) ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3642:1: ( () ( ( (lv_parexpression_1_0= ruleParExpression ) ) | ( (lv_literal_2_0= ruleLiteral ) ) | (otherlv_3= 'this' (otherlv_4= '.' ( (lv_identifier_5_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_6_0= ruleIdentifierSuffix ) )? ) | ( ( (lv_identifier_7_0= RULE_ID ) ) (otherlv_8= '.' ( (lv_identifier_9_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_10_0= ruleIdentifierSuffix ) )? ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3642:2: () ( ( (lv_parexpression_1_0= ruleParExpression ) ) | ( (lv_literal_2_0= ruleLiteral ) ) | (otherlv_3= 'this' (otherlv_4= '.' ( (lv_identifier_5_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_6_0= ruleIdentifierSuffix ) )? ) | ( ( (lv_identifier_7_0= RULE_ID ) ) (otherlv_8= '.' ( (lv_identifier_9_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_10_0= ruleIdentifierSuffix ) )? ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3642:2: ()
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3643:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPrimaryAccess().getPrimaryAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3648:2: ( ( (lv_parexpression_1_0= ruleParExpression ) ) | ( (lv_literal_2_0= ruleLiteral ) ) | (otherlv_3= 'this' (otherlv_4= '.' ( (lv_identifier_5_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_6_0= ruleIdentifierSuffix ) )? ) | ( ( (lv_identifier_7_0= RULE_ID ) ) (otherlv_8= '.' ( (lv_identifier_9_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_10_0= ruleIdentifierSuffix ) )? ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt60=1;
                }
                break;
            case RULE_FLOATING_POINT_LITERAL:
            case RULE_CHARACTER_LITERAL:
            case RULE_STRING_LITERAL:
            case RULE_HEX_LITERAL:
            case RULE_OCTAL_LITERAL:
            case RULE_DECIMAL_LITERAL:
            case 57:
            case 58:
            case 94:
                {
                alt60=2;
                }
                break;
            case 55:
                {
                alt60=3;
                }
                break;
            case RULE_ID:
                {
                alt60=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3648:3: ( (lv_parexpression_1_0= ruleParExpression ) )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3648:3: ( (lv_parexpression_1_0= ruleParExpression ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3649:1: (lv_parexpression_1_0= ruleParExpression )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3649:1: (lv_parexpression_1_0= ruleParExpression )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3650:3: lv_parexpression_1_0= ruleParExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryAccess().getParexpressionParExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParExpression_in_rulePrimary8717);
                    lv_parexpression_1_0=ruleParExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"parexpression",
                              		lv_parexpression_1_0, 
                              		"ParExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3667:6: ( (lv_literal_2_0= ruleLiteral ) )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3667:6: ( (lv_literal_2_0= ruleLiteral ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3668:1: (lv_literal_2_0= ruleLiteral )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3668:1: (lv_literal_2_0= ruleLiteral )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3669:3: lv_literal_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryAccess().getLiteralLiteralParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimary8744);
                    lv_literal_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_2_0, 
                              		"Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3686:6: (otherlv_3= 'this' (otherlv_4= '.' ( (lv_identifier_5_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_6_0= ruleIdentifierSuffix ) )? )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3686:6: (otherlv_3= 'this' (otherlv_4= '.' ( (lv_identifier_5_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_6_0= ruleIdentifierSuffix ) )? )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3686:8: otherlv_3= 'this' (otherlv_4= '.' ( (lv_identifier_5_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_6_0= ruleIdentifierSuffix ) )?
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_55_in_rulePrimary8763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getThisKeyword_1_2_0());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3690:1: (otherlv_4= '.' ( (lv_identifier_5_0= RULE_ID ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==33) ) {
                            int LA56_2 = input.LA(2);

                            if ( (LA56_2==RULE_ID) ) {
                                alt56=1;
                            }


                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3690:3: otherlv_4= '.' ( (lv_identifier_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_33_in_rulePrimary8776); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getFullStopKeyword_1_2_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3694:1: ( (lv_identifier_5_0= RULE_ID ) )
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3695:1: (lv_identifier_5_0= RULE_ID )
                    	    {
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3695:1: (lv_identifier_5_0= RULE_ID )
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3696:3: lv_identifier_5_0= RULE_ID
                    	    {
                    	    lv_identifier_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary8793); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_identifier_5_0, grammarAccess.getPrimaryAccess().getIdentifierIDTerminalRuleCall_1_2_1_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"identifier",
                    	              		lv_identifier_5_0, 
                    	              		"ID");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3712:4: ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_6_0= ruleIdentifierSuffix ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==60) && (synpred3_InternalApricot())) {
                        alt57=1;
                    }
                    else if ( (LA57_0==51) && (synpred3_InternalApricot())) {
                        alt57=1;
                    }
                    else if ( (LA57_0==33) && (synpred3_InternalApricot())) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3712:5: ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_6_0= ruleIdentifierSuffix )
                            {
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3717:1: (lv_identifiersuffix_6_0= ruleIdentifierSuffix )
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3718:3: lv_identifiersuffix_6_0= ruleIdentifierSuffix
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryAccess().getIdentifiersuffixIdentifierSuffixParserRuleCall_1_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIdentifierSuffix_in_rulePrimary8831);
                            lv_identifiersuffix_6_0=ruleIdentifierSuffix();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"identifiersuffix",
                                      		lv_identifiersuffix_6_0, 
                                      		"IdentifierSuffix");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3735:6: ( ( (lv_identifier_7_0= RULE_ID ) ) (otherlv_8= '.' ( (lv_identifier_9_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_10_0= ruleIdentifierSuffix ) )? )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3735:6: ( ( (lv_identifier_7_0= RULE_ID ) ) (otherlv_8= '.' ( (lv_identifier_9_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_10_0= ruleIdentifierSuffix ) )? )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3735:7: ( (lv_identifier_7_0= RULE_ID ) ) (otherlv_8= '.' ( (lv_identifier_9_0= RULE_ID ) ) )* ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_10_0= ruleIdentifierSuffix ) )?
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3735:7: ( (lv_identifier_7_0= RULE_ID ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3736:1: (lv_identifier_7_0= RULE_ID )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3736:1: (lv_identifier_7_0= RULE_ID )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3737:3: lv_identifier_7_0= RULE_ID
                    {
                    lv_identifier_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary8857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_7_0, grammarAccess.getPrimaryAccess().getIdentifierIDTerminalRuleCall_1_3_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_7_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3753:2: (otherlv_8= '.' ( (lv_identifier_9_0= RULE_ID ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==33) ) {
                            int LA58_2 = input.LA(2);

                            if ( (LA58_2==RULE_ID) ) {
                                alt58=1;
                            }


                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3753:4: otherlv_8= '.' ( (lv_identifier_9_0= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,33,FOLLOW_33_in_rulePrimary8875); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getFullStopKeyword_1_3_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3757:1: ( (lv_identifier_9_0= RULE_ID ) )
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3758:1: (lv_identifier_9_0= RULE_ID )
                    	    {
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3758:1: (lv_identifier_9_0= RULE_ID )
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3759:3: lv_identifier_9_0= RULE_ID
                    	    {
                    	    lv_identifier_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary8892); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_identifier_9_0, grammarAccess.getPrimaryAccess().getIdentifierIDTerminalRuleCall_1_3_1_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getPrimaryRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"identifier",
                    	              		lv_identifier_9_0, 
                    	              		"ID");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3775:4: ( ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_10_0= ruleIdentifierSuffix ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==60) && (synpred4_InternalApricot())) {
                        alt59=1;
                    }
                    else if ( (LA59_0==51) && (synpred4_InternalApricot())) {
                        alt59=1;
                    }
                    else if ( (LA59_0==33) && (synpred4_InternalApricot())) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3775:5: ( ( ruleIdentifierSuffix ) )=> (lv_identifiersuffix_10_0= ruleIdentifierSuffix )
                            {
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3780:1: (lv_identifiersuffix_10_0= ruleIdentifierSuffix )
                            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3781:3: lv_identifiersuffix_10_0= ruleIdentifierSuffix
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryAccess().getIdentifiersuffixIdentifierSuffixParserRuleCall_1_3_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIdentifierSuffix_in_rulePrimary8930);
                            lv_identifiersuffix_10_0=ruleIdentifierSuffix();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"identifiersuffix",
                                      		lv_identifiersuffix_10_0, 
                                      		"IdentifierSuffix");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleIdentifierSuffix"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3805:1: entryRuleIdentifierSuffix returns [EObject current=null] : iv_ruleIdentifierSuffix= ruleIdentifierSuffix EOF ;
    public final EObject entryRuleIdentifierSuffix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierSuffix = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3806:2: (iv_ruleIdentifierSuffix= ruleIdentifierSuffix EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3807:2: iv_ruleIdentifierSuffix= ruleIdentifierSuffix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierSuffixRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifierSuffix_in_entryRuleIdentifierSuffix8969);
            iv_ruleIdentifierSuffix=ruleIdentifierSuffix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierSuffix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifierSuffix8979); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifierSuffix"


    // $ANTLR start "ruleIdentifierSuffix"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3814:1: ruleIdentifierSuffix returns [EObject current=null] : ( () ( ( (otherlv_1= '[' otherlv_2= ']' )+ otherlv_3= '.' otherlv_4= 'class' ) | ( (lv_arguments_5_0= ruleArguments ) ) | (otherlv_6= '.' otherlv_7= 'class' ) | (otherlv_8= '.' otherlv_9= 'this' ) | (otherlv_10= '.' otherlv_11= 'super' ( (lv_arguments_12_0= ruleArguments ) ) ) ) ) ;
    public final EObject ruleIdentifierSuffix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3817:28: ( ( () ( ( (otherlv_1= '[' otherlv_2= ']' )+ otherlv_3= '.' otherlv_4= 'class' ) | ( (lv_arguments_5_0= ruleArguments ) ) | (otherlv_6= '.' otherlv_7= 'class' ) | (otherlv_8= '.' otherlv_9= 'this' ) | (otherlv_10= '.' otherlv_11= 'super' ( (lv_arguments_12_0= ruleArguments ) ) ) ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3818:1: ( () ( ( (otherlv_1= '[' otherlv_2= ']' )+ otherlv_3= '.' otherlv_4= 'class' ) | ( (lv_arguments_5_0= ruleArguments ) ) | (otherlv_6= '.' otherlv_7= 'class' ) | (otherlv_8= '.' otherlv_9= 'this' ) | (otherlv_10= '.' otherlv_11= 'super' ( (lv_arguments_12_0= ruleArguments ) ) ) ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3818:1: ( () ( ( (otherlv_1= '[' otherlv_2= ']' )+ otherlv_3= '.' otherlv_4= 'class' ) | ( (lv_arguments_5_0= ruleArguments ) ) | (otherlv_6= '.' otherlv_7= 'class' ) | (otherlv_8= '.' otherlv_9= 'this' ) | (otherlv_10= '.' otherlv_11= 'super' ( (lv_arguments_12_0= ruleArguments ) ) ) ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3818:2: () ( ( (otherlv_1= '[' otherlv_2= ']' )+ otherlv_3= '.' otherlv_4= 'class' ) | ( (lv_arguments_5_0= ruleArguments ) ) | (otherlv_6= '.' otherlv_7= 'class' ) | (otherlv_8= '.' otherlv_9= 'this' ) | (otherlv_10= '.' otherlv_11= 'super' ( (lv_arguments_12_0= ruleArguments ) ) ) )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3818:2: ()
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3819:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIdentifierSuffixAccess().getIdentifierSuffixAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3824:2: ( ( (otherlv_1= '[' otherlv_2= ']' )+ otherlv_3= '.' otherlv_4= 'class' ) | ( (lv_arguments_5_0= ruleArguments ) ) | (otherlv_6= '.' otherlv_7= 'class' ) | (otherlv_8= '.' otherlv_9= 'this' ) | (otherlv_10= '.' otherlv_11= 'super' ( (lv_arguments_12_0= ruleArguments ) ) ) )
            int alt62=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt62=1;
                }
                break;
            case 51:
                {
                alt62=2;
                }
                break;
            case 33:
                {
                switch ( input.LA(2) ) {
                case 93:
                    {
                    alt62=5;
                    }
                    break;
                case 48:
                    {
                    alt62=3;
                    }
                    break;
                case 55:
                    {
                    alt62=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3824:3: ( (otherlv_1= '[' otherlv_2= ']' )+ otherlv_3= '.' otherlv_4= 'class' )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3824:3: ( (otherlv_1= '[' otherlv_2= ']' )+ otherlv_3= '.' otherlv_4= 'class' )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3824:4: (otherlv_1= '[' otherlv_2= ']' )+ otherlv_3= '.' otherlv_4= 'class'
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3824:4: (otherlv_1= '[' otherlv_2= ']' )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==60) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3824:6: otherlv_1= '[' otherlv_2= ']'
                    	    {
                    	    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleIdentifierSuffix9028); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_1, grammarAccess.getIdentifierSuffixAccess().getLeftSquareBracketKeyword_1_0_0_0());
                    	          
                    	    }
                    	    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleIdentifierSuffix9040); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getIdentifierSuffixAccess().getRightSquareBracketKeyword_1_0_0_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt61 >= 1 ) break loop61;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);

                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleIdentifierSuffix9054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIdentifierSuffixAccess().getFullStopKeyword_1_0_1());
                          
                    }
                    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleIdentifierSuffix9066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIdentifierSuffixAccess().getClassKeyword_1_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3841:6: ( (lv_arguments_5_0= ruleArguments ) )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3841:6: ( (lv_arguments_5_0= ruleArguments ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3842:1: (lv_arguments_5_0= ruleArguments )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3842:1: (lv_arguments_5_0= ruleArguments )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3843:3: lv_arguments_5_0= ruleArguments
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIdentifierSuffixAccess().getArgumentsArgumentsParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArguments_in_ruleIdentifierSuffix9094);
                    lv_arguments_5_0=ruleArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIdentifierSuffixRule());
                      	        }
                             		set(
                             			current, 
                             			"arguments",
                              		lv_arguments_5_0, 
                              		"Arguments");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3860:6: (otherlv_6= '.' otherlv_7= 'class' )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3860:6: (otherlv_6= '.' otherlv_7= 'class' )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3860:8: otherlv_6= '.' otherlv_7= 'class'
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleIdentifierSuffix9113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getIdentifierSuffixAccess().getFullStopKeyword_1_2_0());
                          
                    }
                    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleIdentifierSuffix9125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getIdentifierSuffixAccess().getClassKeyword_1_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3869:6: (otherlv_8= '.' otherlv_9= 'this' )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3869:6: (otherlv_8= '.' otherlv_9= 'this' )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3869:8: otherlv_8= '.' otherlv_9= 'this'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleIdentifierSuffix9145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getIdentifierSuffixAccess().getFullStopKeyword_1_3_0());
                          
                    }
                    otherlv_9=(Token)match(input,55,FOLLOW_55_in_ruleIdentifierSuffix9157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getIdentifierSuffixAccess().getThisKeyword_1_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3878:6: (otherlv_10= '.' otherlv_11= 'super' ( (lv_arguments_12_0= ruleArguments ) ) )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3878:6: (otherlv_10= '.' otherlv_11= 'super' ( (lv_arguments_12_0= ruleArguments ) ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3878:8: otherlv_10= '.' otherlv_11= 'super' ( (lv_arguments_12_0= ruleArguments ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleIdentifierSuffix9177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getIdentifierSuffixAccess().getFullStopKeyword_1_4_0());
                          
                    }
                    otherlv_11=(Token)match(input,93,FOLLOW_93_in_ruleIdentifierSuffix9189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getIdentifierSuffixAccess().getSuperKeyword_1_4_1());
                          
                    }
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3886:1: ( (lv_arguments_12_0= ruleArguments ) )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3887:1: (lv_arguments_12_0= ruleArguments )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3887:1: (lv_arguments_12_0= ruleArguments )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3888:3: lv_arguments_12_0= ruleArguments
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIdentifierSuffixAccess().getArgumentsArgumentsParserRuleCall_1_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArguments_in_ruleIdentifierSuffix9210);
                    lv_arguments_12_0=ruleArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIdentifierSuffixRule());
                      	        }
                             		set(
                             			current, 
                             			"arguments",
                              		lv_arguments_12_0, 
                              		"Arguments");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifierSuffix"


    // $ANTLR start "entryRuleArguments"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3912:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3913:2: (iv_ruleArguments= ruleArguments EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3914:2: iv_ruleArguments= ruleArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentsRule()); 
            }
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments9248);
            iv_ruleArguments=ruleArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArguments; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments9258); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3921:1: ruleArguments returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expressionlist_2_0= ruleExpressionList ) )? otherlv_3= ')' ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressionlist_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3924:28: ( ( () otherlv_1= '(' ( (lv_expressionlist_2_0= ruleExpressionList ) )? otherlv_3= ')' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3925:1: ( () otherlv_1= '(' ( (lv_expressionlist_2_0= ruleExpressionList ) )? otherlv_3= ')' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3925:1: ( () otherlv_1= '(' ( (lv_expressionlist_2_0= ruleExpressionList ) )? otherlv_3= ')' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3925:2: () otherlv_1= '(' ( (lv_expressionlist_2_0= ruleExpressionList ) )? otherlv_3= ')'
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3925:2: ()
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3926:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArgumentsAccess().getArgumentsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleArguments9304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3935:1: ( (lv_expressionlist_2_0= ruleExpressionList ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID||(LA63_0>=RULE_FLOATING_POINT_LITERAL && LA63_0<=RULE_DECIMAL_LITERAL)||LA63_0==51||LA63_0==55||(LA63_0>=57 && LA63_0<=58)||(LA63_0>=85 && LA63_0<=86)||(LA63_0>=90 && LA63_0<=92)||LA63_0==94) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3936:1: (lv_expressionlist_2_0= ruleExpressionList )
                    {
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3936:1: (lv_expressionlist_2_0= ruleExpressionList )
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3937:3: lv_expressionlist_2_0= ruleExpressionList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionlistExpressionListParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionList_in_ruleArguments9325);
                    lv_expressionlist_2_0=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArgumentsRule());
                      	        }
                             		set(
                             			current, 
                             			"expressionlist",
                              		lv_expressionlist_2_0, 
                              		"ExpressionList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleArguments9338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleExpressionList"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3965:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3966:2: (iv_ruleExpressionList= ruleExpressionList EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3967:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList9374);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList9384); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3974:1: ruleExpressionList returns [EObject current=null] : ( ( (lv_expression1_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression2_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression1_0_0 = null;

        EObject lv_expression2_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3977:28: ( ( ( (lv_expression1_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression2_2_0= ruleExpression ) ) )* ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3978:1: ( ( (lv_expression1_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression2_2_0= ruleExpression ) ) )* )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3978:1: ( ( (lv_expression1_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression2_2_0= ruleExpression ) ) )* )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3978:2: ( (lv_expression1_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression2_2_0= ruleExpression ) ) )*
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3978:2: ( (lv_expression1_0_0= ruleExpression ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3979:1: (lv_expression1_0_0= ruleExpression )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3979:1: (lv_expression1_0_0= ruleExpression )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3980:3: lv_expression1_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpression1ExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList9430);
            lv_expression1_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
              	        }
                     		set(
                     			current, 
                     			"expression1",
                      		lv_expression1_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3996:2: (otherlv_1= ',' ( (lv_expression2_2_0= ruleExpression ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==52) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3996:4: otherlv_1= ',' ( (lv_expression2_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleExpressionList9443); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4000:1: ( (lv_expression2_2_0= ruleExpression ) )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4001:1: (lv_expression2_2_0= ruleExpression )
            	    {
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4001:1: (lv_expression2_2_0= ruleExpression )
            	    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4002:3: lv_expression2_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpression2ExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList9464);
            	    lv_expression2_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expression2",
            	              		lv_expression2_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleParExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4028:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4029:2: (iv_ruleParExpression= ruleParExpression EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4030:2: iv_ruleParExpression= ruleParExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParExpression_in_entryRuleParExpression9504);
            iv_ruleParExpression=ruleParExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParExpression9514); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParExpression"


    // $ANTLR start "ruleParExpression"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4037:1: ruleParExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4040:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4041:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4041:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4041:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleParExpression9551); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParExpressionAccess().getExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParExpression9573);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleParExpression9584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4066:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4067:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4068:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9621);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9632); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4075:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_FLOATING_POINT_LITERAL_1= RULE_FLOATING_POINT_LITERAL | this_CHARACTER_LITERAL_2= RULE_CHARACTER_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | this_BooleanLiteral_4= ruleBooleanLiteral | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOATING_POINT_LITERAL_1=null;
        Token this_CHARACTER_LITERAL_2=null;
        Token this_STRING_LITERAL_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_IntegerLiteral_0 = null;

        AntlrDatatypeRuleToken this_BooleanLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4078:28: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_FLOATING_POINT_LITERAL_1= RULE_FLOATING_POINT_LITERAL | this_CHARACTER_LITERAL_2= RULE_CHARACTER_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | this_BooleanLiteral_4= ruleBooleanLiteral | kw= 'null' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4079:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_FLOATING_POINT_LITERAL_1= RULE_FLOATING_POINT_LITERAL | this_CHARACTER_LITERAL_2= RULE_CHARACTER_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | this_BooleanLiteral_4= ruleBooleanLiteral | kw= 'null' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4079:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_FLOATING_POINT_LITERAL_1= RULE_FLOATING_POINT_LITERAL | this_CHARACTER_LITERAL_2= RULE_CHARACTER_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | this_BooleanLiteral_4= ruleBooleanLiteral | kw= 'null' )
            int alt65=6;
            switch ( input.LA(1) ) {
            case RULE_HEX_LITERAL:
            case RULE_OCTAL_LITERAL:
            case RULE_DECIMAL_LITERAL:
                {
                alt65=1;
                }
                break;
            case RULE_FLOATING_POINT_LITERAL:
                {
                alt65=2;
                }
                break;
            case RULE_CHARACTER_LITERAL:
                {
                alt65=3;
                }
                break;
            case RULE_STRING_LITERAL:
                {
                alt65=4;
                }
                break;
            case 57:
            case 58:
                {
                alt65=5;
                }
                break;
            case 94:
                {
                alt65=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4080:5: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleLiteral9679);
                    this_IntegerLiteral_0=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IntegerLiteral_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4091:10: this_FLOATING_POINT_LITERAL_1= RULE_FLOATING_POINT_LITERAL
                    {
                    this_FLOATING_POINT_LITERAL_1=(Token)match(input,RULE_FLOATING_POINT_LITERAL,FOLLOW_RULE_FLOATING_POINT_LITERAL_in_ruleLiteral9705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FLOATING_POINT_LITERAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FLOATING_POINT_LITERAL_1, grammarAccess.getLiteralAccess().getFLOATING_POINT_LITERALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4099:10: this_CHARACTER_LITERAL_2= RULE_CHARACTER_LITERAL
                    {
                    this_CHARACTER_LITERAL_2=(Token)match(input,RULE_CHARACTER_LITERAL,FOLLOW_RULE_CHARACTER_LITERAL_in_ruleLiteral9731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CHARACTER_LITERAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CHARACTER_LITERAL_2, grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4107:10: this_STRING_LITERAL_3= RULE_STRING_LITERAL
                    {
                    this_STRING_LITERAL_3=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleLiteral9757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_LITERAL_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_LITERAL_3, grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4116:5: this_BooleanLiteral_4= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral9790);
                    this_BooleanLiteral_4=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BooleanLiteral_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4128:2: kw= 'null'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleLiteral9814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLiteralAccess().getNullKeyword_5()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4141:1: entryRuleIntegerLiteral returns [String current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final String entryRuleIntegerLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerLiteral = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4142:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4143:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral9855);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral9866); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4150:1: ruleIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_LITERAL_0= RULE_HEX_LITERAL | this_OCTAL_LITERAL_1= RULE_OCTAL_LITERAL | this_DECIMAL_LITERAL_2= RULE_DECIMAL_LITERAL ) ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_LITERAL_0=null;
        Token this_OCTAL_LITERAL_1=null;
        Token this_DECIMAL_LITERAL_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4153:28: ( (this_HEX_LITERAL_0= RULE_HEX_LITERAL | this_OCTAL_LITERAL_1= RULE_OCTAL_LITERAL | this_DECIMAL_LITERAL_2= RULE_DECIMAL_LITERAL ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4154:1: (this_HEX_LITERAL_0= RULE_HEX_LITERAL | this_OCTAL_LITERAL_1= RULE_OCTAL_LITERAL | this_DECIMAL_LITERAL_2= RULE_DECIMAL_LITERAL )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4154:1: (this_HEX_LITERAL_0= RULE_HEX_LITERAL | this_OCTAL_LITERAL_1= RULE_OCTAL_LITERAL | this_DECIMAL_LITERAL_2= RULE_DECIMAL_LITERAL )
            int alt66=3;
            switch ( input.LA(1) ) {
            case RULE_HEX_LITERAL:
                {
                alt66=1;
                }
                break;
            case RULE_OCTAL_LITERAL:
                {
                alt66=2;
                }
                break;
            case RULE_DECIMAL_LITERAL:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4154:6: this_HEX_LITERAL_0= RULE_HEX_LITERAL
                    {
                    this_HEX_LITERAL_0=(Token)match(input,RULE_HEX_LITERAL,FOLLOW_RULE_HEX_LITERAL_in_ruleIntegerLiteral9906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_LITERAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_LITERAL_0, grammarAccess.getIntegerLiteralAccess().getHEX_LITERALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4162:10: this_OCTAL_LITERAL_1= RULE_OCTAL_LITERAL
                    {
                    this_OCTAL_LITERAL_1=(Token)match(input,RULE_OCTAL_LITERAL,FOLLOW_RULE_OCTAL_LITERAL_in_ruleIntegerLiteral9932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_OCTAL_LITERAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OCTAL_LITERAL_1, grammarAccess.getIntegerLiteralAccess().getOCTAL_LITERALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4170:10: this_DECIMAL_LITERAL_2= RULE_DECIMAL_LITERAL
                    {
                    this_DECIMAL_LITERAL_2=(Token)match(input,RULE_DECIMAL_LITERAL,FOLLOW_RULE_DECIMAL_LITERAL_in_ruleIntegerLiteral9958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DECIMAL_LITERAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DECIMAL_LITERAL_2, grammarAccess.getIntegerLiteralAccess().getDECIMAL_LITERALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4185:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4186:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4187:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral10004);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral10015); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4194:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4197:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4198:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4198:1: (kw= 'true' | kw= 'false' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==57) ) {
                alt67=1;
            }
            else if ( (LA67_0==58) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4199:2: kw= 'true'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleBooleanLiteral10053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4206:2: kw= 'false'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleBooleanLiteral10072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleDE_LHS"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4219:1: entryRuleDE_LHS returns [EObject current=null] : iv_ruleDE_LHS= ruleDE_LHS EOF ;
    public final EObject entryRuleDE_LHS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDE_LHS = null;


        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4220:2: (iv_ruleDE_LHS= ruleDE_LHS EOF )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4221:2: iv_ruleDE_LHS= ruleDE_LHS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDE_LHSRule()); 
            }
            pushFollow(FOLLOW_ruleDE_LHS_in_entryRuleDE_LHS10112);
            iv_ruleDE_LHS=ruleDE_LHS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDE_LHS; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDE_LHS10122); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDE_LHS"


    // $ANTLR start "ruleDE_LHS"
    // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4228:1: ruleDE_LHS returns [EObject current=null] : (otherlv_0= 'dot' otherlv_1= '(' ( (lv_var1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_var2_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_order_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleDE_LHS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_var1_2_0=null;
        Token otherlv_3=null;
        Token lv_var2_4_0=null;
        Token otherlv_5=null;
        Token lv_order_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4231:28: ( (otherlv_0= 'dot' otherlv_1= '(' ( (lv_var1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_var2_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_order_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4232:1: (otherlv_0= 'dot' otherlv_1= '(' ( (lv_var1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_var2_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_order_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4232:1: (otherlv_0= 'dot' otherlv_1= '(' ( (lv_var1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_var2_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_order_6_0= RULE_INT ) ) otherlv_7= ')' )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4232:3: otherlv_0= 'dot' otherlv_1= '(' ( (lv_var1_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_var2_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_order_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_95_in_ruleDE_LHS10159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDE_LHSAccess().getDotKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleDE_LHS10171); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDE_LHSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4240:1: ( (lv_var1_2_0= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4241:1: (lv_var1_2_0= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4241:1: (lv_var1_2_0= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4242:3: lv_var1_2_0= RULE_ID
            {
            lv_var1_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDE_LHS10188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_var1_2_0, grammarAccess.getDE_LHSAccess().getVar1IDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDE_LHSRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"var1",
                      		lv_var1_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleDE_LHS10205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDE_LHSAccess().getCommaKeyword_3());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4262:1: ( (lv_var2_4_0= RULE_ID ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4263:1: (lv_var2_4_0= RULE_ID )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4263:1: (lv_var2_4_0= RULE_ID )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4264:3: lv_var2_4_0= RULE_ID
            {
            lv_var2_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDE_LHS10222); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_var2_4_0, grammarAccess.getDE_LHSAccess().getVar2IDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDE_LHSRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"var2",
                      		lv_var2_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleDE_LHS10239); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDE_LHSAccess().getCommaKeyword_5());
                  
            }
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4284:1: ( (lv_order_6_0= RULE_INT ) )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4285:1: (lv_order_6_0= RULE_INT )
            {
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4285:1: (lv_order_6_0= RULE_INT )
            // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:4286:3: lv_order_6_0= RULE_INT
            {
            lv_order_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDE_LHS10256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_order_6_0, grammarAccess.getDE_LHSAccess().getOrderINTTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDE_LHSRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"order",
                      		lv_order_6_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleDE_LHS10273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDE_LHSAccess().getRightParenthesisKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDE_LHS"

    // $ANTLR start synpred1_InternalApricot
    public final void synpred1_InternalApricot_fragment() throws RecognitionException {   
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1699:7: ( ruleCast )
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:1699:9: ruleCast
        {
        pushFollow(FOLLOW_ruleCast_in_synpred1_InternalApricot3986);
        ruleCast();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalApricot

    // $ANTLR start synpred2_InternalApricot
    public final void synpred2_InternalApricot_fragment() throws RecognitionException {   
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2700:3: ( ( ruleAssignmentOperator ) )
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2701:1: ( ruleAssignmentOperator )
        {
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2701:1: ( ruleAssignmentOperator )
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:2702:1: ruleAssignmentOperator
        {
        pushFollow(FOLLOW_ruleAssignmentOperator_in_synpred2_InternalApricot6514);
        ruleAssignmentOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalApricot

    // $ANTLR start synpred3_InternalApricot
    public final void synpred3_InternalApricot_fragment() throws RecognitionException {   
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3712:5: ( ( ruleIdentifierSuffix ) )
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3713:1: ( ruleIdentifierSuffix )
        {
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3713:1: ( ruleIdentifierSuffix )
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3714:1: ruleIdentifierSuffix
        {
        pushFollow(FOLLOW_ruleIdentifierSuffix_in_synpred3_InternalApricot8814);
        ruleIdentifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalApricot

    // $ANTLR start synpred4_InternalApricot
    public final void synpred4_InternalApricot_fragment() throws RecognitionException {   
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3775:5: ( ( ruleIdentifierSuffix ) )
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3776:1: ( ruleIdentifierSuffix )
        {
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3776:1: ( ruleIdentifierSuffix )
        // ../org.xtext.fofo.apricot/src-gen/org/xtext/fofo/parser/antlr/internal/InternalApricot.g:3777:1: ruleIdentifierSuffix
        {
        pushFollow(FOLLOW_ruleIdentifierSuffix_in_synpred4_InternalApricot8913);
        ruleIdentifierSuffix();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalApricot

    // Delegated rules

    public final boolean synpred2_InternalApricot() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalApricot_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalApricot() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalApricot_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalApricot() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalApricot_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalApricot() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalApricot_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA39 dfa39 = new DFA39(this);
    static final String DFA17_eotS =
        "\14\uffff";
    static final String DFA17_eofS =
        "\14\uffff";
    static final String DFA17_minS =
        "\11\4\1\uffff\1\36\1\uffff";
    static final String DFA17_maxS =
        "\1\53\10\4\1\uffff\1\63\1\uffff";
    static final String DFA17_acceptS =
        "\11\uffff\1\2\1\uffff\1\1";
    static final String DFA17_specialS =
        "\14\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\35\uffff\2\11\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\12",
            "",
            "\1\13\23\uffff\1\13\1\11",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "841:1: (this_Field_0= ruleField | this_Method_1= ruleMethod )";
        }
    }
    static final String DFA30_eotS =
        "\30\uffff";
    static final String DFA30_eofS =
        "\17\uffff\1\6\10\uffff";
    static final String DFA30_minS =
        "\1\4\3\uffff\1\4\2\uffff\1\41\7\uffff\1\4\10\uffff";
    static final String DFA30_maxS =
        "\1\72\3\uffff\1\136\2\uffff\1\131\7\uffff\1\72\10\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\uffff\7\4\1\uffff\10\4";
    static final String DFA30_specialS =
        "\4\uffff\1\1\12\uffff\1\0\10\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\2\2\5\54\uffff\1\4\3\uffff\1\1\1\3\2\5",
            "",
            "",
            "",
            "\1\7\7\uffff\6\6\23\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1"+
            "\16\7\uffff\1\6\3\uffff\1\6\1\uffff\2\6\32\uffff\2\6\3\uffff"+
            "\3\6\1\uffff\1\6",
            "",
            "",
            "\1\6\20\uffff\2\6\1\uffff\1\17\6\uffff\1\6\5\uffff\30\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21\1\27\1\24\54\uffff\1\23\3\uffff\1\20\1\22\1\25\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1669:1: (this_This_0= ruleThis | this_ParamRef_1= ruleParamRef | this_NewByClass_2= ruleNewByClass | ( ( ruleCast )=>this_Cast_3= ruleCast ) | this_Constant_4= ruleConstant | this_Paren_5= ruleParen )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_15 = input.LA(1);

                         
                        int index30_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_15==EOF) ) {s = 6;}

                        else if ( (LA30_15==55) && (synpred1_InternalApricot())) {s = 16;}

                        else if ( (LA30_15==RULE_ID) && (synpred1_InternalApricot())) {s = 17;}

                        else if ( (LA30_15==56) && (synpred1_InternalApricot())) {s = 18;}

                        else if ( (LA30_15==51) && (synpred1_InternalApricot())) {s = 19;}

                        else if ( (LA30_15==RULE_INT) && (synpred1_InternalApricot())) {s = 20;}

                        else if ( (LA30_15==57) && (synpred1_InternalApricot())) {s = 21;}

                        else if ( (LA30_15==58) && (synpred1_InternalApricot())) {s = 22;}

                        else if ( (LA30_15==RULE_STRING) && (synpred1_InternalApricot())) {s = 23;}

                         
                        input.seek(index30_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_4>=RULE_FLOATING_POINT_LITERAL && LA30_4<=RULE_DECIMAL_LITERAL)||LA30_4==51||LA30_4==55||(LA30_4>=57 && LA30_4<=58)||(LA30_4>=85 && LA30_4<=86)||(LA30_4>=90 && LA30_4<=92)||LA30_4==94) ) {s = 6;}

                        else if ( (LA30_4==RULE_ID) ) {s = 7;}

                        else if ( (LA30_4==37) && (synpred1_InternalApricot())) {s = 8;}

                        else if ( (LA30_4==38) && (synpred1_InternalApricot())) {s = 9;}

                        else if ( (LA30_4==39) && (synpred1_InternalApricot())) {s = 10;}

                        else if ( (LA30_4==40) && (synpred1_InternalApricot())) {s = 11;}

                        else if ( (LA30_4==41) && (synpred1_InternalApricot())) {s = 12;}

                        else if ( (LA30_4==42) && (synpred1_InternalApricot())) {s = 13;}

                        else if ( (LA30_4==43) && (synpred1_InternalApricot())) {s = 14;}

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\14\uffff";
    static final String DFA39_eofS =
        "\1\12\13\uffff";
    static final String DFA39_minS =
        "\1\36\11\0\2\uffff";
    static final String DFA39_maxS =
        "\1\111\11\0\2\uffff";
    static final String DFA39_acceptS =
        "\12\uffff\1\2\1\1";
    static final String DFA39_specialS =
        "\1\uffff\1\10\1\1\1\0\1\3\1\2\1\5\1\4\1\7\1\6\2\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\12\23\uffff\1\1\1\uffff\2\12\10\uffff\1\12\3\uffff\1\2\1"+
            "\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "2700:1: ( ( ( ( ruleAssignmentOperator ) )=> (lv_assignmentoperator_1_0= ruleAssignmentOperator ) ) ( (lv_expression_2_0= ruleExpression ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_3 = input.LA(1);

                         
                        int index39_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalApricot()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index39_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalApricot()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_5 = input.LA(1);

                         
                        int index39_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalApricot()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index39_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_4 = input.LA(1);

                         
                        int index39_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalApricot()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index39_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_7 = input.LA(1);

                         
                        int index39_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalApricot()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index39_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA39_6 = input.LA(1);

                         
                        int index39_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalApricot()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index39_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA39_9 = input.LA(1);

                         
                        int index39_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalApricot()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index39_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA39_8 = input.LA(1);

                         
                        int index39_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalApricot()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index39_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalApricot()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleProgram131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePackageDeclaration212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration233 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePackageDeclaration245 = new BitSet(new long[]{0x0001100C80000002L});
    public static final BitSet FOLLOW_ruleImport_in_rulePackageDeclaration266 = new BitSet(new long[]{0x0001100C80000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration288 = new BitSet(new long[]{0x0001100C00000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefType_in_ruleAbstractElement381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleImport462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport483 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleImport495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard590 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleQualifiedNameWithWildcard609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName703 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleQualifiedName722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName737 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleModifier_in_entryRuleModifier787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifier798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleModifier836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleModifier855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInModifier_in_entryRuleBuiltInModifier896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInModifier907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBuiltInModifier944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefType_in_entryRuleRefType983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefType993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleRefType1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleRefType1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonRefType_in_entryRuleNonRefType1102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonRefType1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleNonRefType1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathType_in_ruleNonRefType1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType1221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBasicType1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBasicType1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBasicType1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBasicType1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBasicType1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathType_in_entryRuleMathType1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathType1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleMathType1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMathType1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface1576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleInterface1628 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleInterface1641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1658 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_ruleInterface1676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterface1699 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleInterface1713 = new BitSet(new long[]{0x08008FFC00000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAbstractInterfaceElement_in_ruleInterface1734 = new BitSet(new long[]{0x08008FFC00000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_47_in_ruleInterface1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleClass1835 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleClass1848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1865 = new BitSet(new long[]{0x0002600000000000L});
    public static final BitSet FOLLOW_45_in_ruleClass1883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass1906 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_49_in_ruleClass1921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClass1944 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleClass1958 = new BitSet(new long[]{0x00008FFC00000010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleClass1979 = new BitSet(new long[]{0x00008FFC00000010L});
    public static final BitSet FOLLOW_47_in_ruleClass1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember2028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleMember2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleMember2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldName_in_entryRuleFieldName2148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldName2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldName2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField2242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseType_in_ruleField2298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldName_in_ruleField2319 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_50_in_ruleField2332 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleVariableInitializer_in_ruleField2353 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleField2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod2403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleMethod2455 = new BitSet(new long[]{0x00000FFC00000010L});
    public static final BitSet FOLLOW_ruleUseType_in_ruleMethod2477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod2494 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleMethod2511 = new BitSet(new long[]{0x00200FFC00000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod2533 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_ruleMethod2546 = new BitSet(new long[]{0x00000FFC00000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod2567 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_53_in_ruleMethod2583 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleMethod2595 = new BitSet(new long[]{0x00400FFC00000010L});
    public static final BitSet FOLLOW_ruleMethodBody_in_ruleMethod2616 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleMethod2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMethod_in_entryRuleAbstractMethod2664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractMethod2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleAbstractMethod2716 = new BitSet(new long[]{0x00000FFC00000010L});
    public static final BitSet FOLLOW_ruleBuiltInModifier_in_ruleAbstractMethod2734 = new BitSet(new long[]{0x00000FFC00000010L});
    public static final BitSet FOLLOW_ruleUseType_in_ruleAbstractMethod2756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstractMethod2773 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleAbstractMethod2790 = new BitSet(new long[]{0x00200FFC00000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAbstractMethod2812 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_ruleAbstractMethod2825 = new BitSet(new long[]{0x00000FFC00000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAbstractMethod2846 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_53_in_ruleAbstractMethod2862 = new BitSet(new long[]{0x0000400040000000L});
    public static final BitSet FOLLOW_46_in_ruleAbstractMethod2875 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ruleAbstractMethodBody_in_ruleAbstractMethod2896 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAbstractMethod2908 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAbstractMethod2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseType_in_entryRuleUseType2958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseType2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseType3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonRefType_in_ruleUseType3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseType_in_ruleParameter3132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodBody_in_entryRuleMethodBody3192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodBody3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVarDec_in_ruleMethodBody3248 = new BitSet(new long[]{0x00400FFC00000010L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleMethodBody3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMethodBody_in_entryRuleAbstractMethodBody3306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractMethodBody3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiresAbstractComposition_in_ruleAbstractMethodBody3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVarName_in_entryRuleLocalVarName3397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVarName3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVarName3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVarDec_in_entryRuleLocalVarDec3491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVarDec3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseType_in_ruleLocalVarDec3547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLocalVarName_in_ruleLocalVarDec3568 = new BitSet(new long[]{0x0004000040000000L});
    public static final BitSet FOLLOW_50_in_ruleLocalVarDec3581 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleVariableInitializer_in_ruleLocalVarDec3602 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleLocalVarDec3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableInitializer_in_entryRuleVariableInitializer3652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableInitializer3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableInitializer3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement3742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleReturnStatement3789 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement3810 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleReturnStatement3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression3858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThis_in_ruleTerminalExpression3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamRef_in_ruleTerminalExpression3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewByClass_in_ruleTerminalExpression3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_ruleTerminalExpression4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleTerminalExpression4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParen_in_ruleTerminalExpression4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThis_in_entryRuleThis4092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThis4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleThis4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamRef_in_entryRuleParamRef4192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamRef4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParamRef4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewByClass_in_entryRuleNewByClass4281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewByClass4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNewByClass4328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewByClass4348 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleNewByClass4360 = new BitSet(new long[]{0x06A800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNewByClass4382 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_ruleNewByClass4395 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNewByClass4416 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_53_in_ruleNewByClass4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast4468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCast4515 = new BitSet(new long[]{0x00000FFC00000010L});
    public static final BitSet FOLLOW_ruleUseType_in_ruleCast4536 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleCast4548 = new BitSet(new long[]{0x0788000000000070L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleCast4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParen_in_entryRuleParen4605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParen4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleParen4652 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParen4674 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleParen4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant4721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstant_in_ruleConstant4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstant_in_ruleConstant4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstant_in_ruleConstant4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstant_in_entryRuleStringConstant4867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstant4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstant4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstant_in_entryRuleIntConstant4958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntConstant4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntConstant5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstant_in_entryRuleBoolConstant5049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolConstant5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBoolConstant5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBoolConstant5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAMOUNT_in_entryRuleAMOUNT5184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAMOUNT5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AMOUNT_GEONE_in_ruleAMOUNT5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AMOUNT_ONE_OR_ZERO_in_ruleAMOUNT5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractInterfaceElement_in_entryRuleAbstractInterfaceElement5306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractInterfaceElement5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractMethod_in_ruleAbstractInterfaceElement5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequires_in_ruleAbstractInterfaceElement5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClockConstraint_in_ruleAbstractInterfaceElement5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractInvariant_in_ruleAbstractInterfaceElement5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequires_in_entryRuleRequires5479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequires5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleRequires5526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequires5543 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleRequires5560 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleAMOUNT_in_ruleRequires5576 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleRequires5587 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleRequires5599 = new BitSet(new long[]{0x00000FFC00000010L});
    public static final BitSet FOLLOW_ruleUseType_in_ruleRequires5620 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRequires5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDynamicSwitch_in_entryRuleAbstractDynamicSwitch5668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDynamicSwitch5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAbstractDynamicSwitch5715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstractDynamicSwitch5735 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_63_in_ruleAbstractDynamicSwitch5748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstractDynamicSwitch5768 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleAbstractDynamicSwitch5782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstractDynamicSwitch5802 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleAbstractDynamicSwitch5814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstractDynamicSwitch5834 = new BitSet(new long[]{0x8020000000000000L});
    public static final BitSet FOLLOW_63_in_ruleAbstractDynamicSwitch5847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstractDynamicSwitch5867 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleAbstractDynamicSwitch5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiresAbstractComposition_in_entryRuleRequiresAbstractComposition5917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiresAbstractComposition5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleRequiresAbstractComposition5964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiresAbstractComposition5981 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleRequiresAbstractComposition5998 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleAMOUNT_in_ruleRequiresAbstractComposition6014 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleRequiresAbstractComposition6025 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ASYACTIONS_in_ruleRequiresAbstractComposition6036 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleRequiresAbstractComposition6047 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleAMOUNT_in_ruleRequiresAbstractComposition6063 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleRequiresAbstractComposition6074 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleRequiresAbstractComposition6086 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleAbstractDynamicSwitch_in_ruleRequiresAbstractComposition6107 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleRequiresAbstractComposition6119 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ABSTRACT_CONDTION_in_ruleRequiresAbstractComposition6130 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleRequiresAbstractComposition6141 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRequiresAbstractComposition6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClockConstraint_in_entryRuleClockConstraint6189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClockConstraint6199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleClockConstraint6245 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_CLOCK_in_ruleClockConstraint6262 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleClockConstraint6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractInvariant_in_entryRuleAbstractInvariant6315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractInvariant6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAbstractInvariant6371 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleAbstractInvariant6383 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAbstractInvariant6395 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAbstractInvariant6407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleExpression6500 = new BitSet(new long[]{0x0004000000000002L,0x00000000000003FCL});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_ruleExpression6531 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_entryRuleAssignmentOperator6591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentOperator6602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAssignmentOperator6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAssignmentOperator6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleAssignmentOperator6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleAssignmentOperator6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleAssignmentOperator6716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAssignmentOperator6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAssignmentOperator6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAssignmentOperator6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAssignmentOperator6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression6832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleConditionalExpression6888 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleConditionalExpression6901 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionalExpression6922 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleConditionalExpression6934 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionalExpression6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression6993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalOrExpression7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression7049 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleConditionalOrExpression7062 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression7083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression7121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAndExpression7131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExclusiveOrExpression_in_ruleConditionalAndExpression7177 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleConditionalAndExpression7190 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleExclusiveOrExpression_in_ruleConditionalAndExpression7211 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleExclusiveOrExpression_in_entryRuleExclusiveOrExpression7249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExclusiveOrExpression7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleExclusiveOrExpression7305 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleExclusiveOrExpression7318 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleExclusiveOrExpression7339 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression7377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression7387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_ruleEqualityExpression7433 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleEqualityExpression7447 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_79_in_ruleEqualityExpression7465 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_ruleEqualityExpression7487 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_entryRuleInstanceOfExpression7525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceOfExpression7535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleInstanceOfExpression7582 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleInstanceOfExpression7594 = new BitSet(new long[]{0x00000FFC00000010L});
    public static final BitSet FOLLOW_ruleUseType_in_ruleInstanceOfExpression7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression7653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression7709 = new BitSet(new long[]{0x0000000000000002L,0x00000000001E0000L});
    public static final BitSet FOLLOW_ruleRelationalOp_in_ruleRelationalExpression7731 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression7752 = new BitSet(new long[]{0x0000000000000002L,0x00000000001E0000L});
    public static final BitSet FOLLOW_ruleRelationalOp_in_entryRuleRelationalOp7791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOp7802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleRelationalOp7840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleRelationalOp7859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleRelationalOp7878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleRelationalOp7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression7937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression7947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_85_in_ruleAdditiveExpression8007 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_86_in_ruleAdditiveExpression8025 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression8047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression8085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression8141 = new BitSet(new long[]{0x0000000000000002L,0x0000000003800000L});
    public static final BitSet FOLLOW_87_in_ruleMultiplicativeExpression8155 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_88_in_ruleMultiplicativeExpression8173 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_89_in_ruleMultiplicativeExpression8191 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression8213 = new BitSet(new long[]{0x0000000000000002L,0x0000000003800000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression8251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression8261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleUnaryExpression8299 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleUnaryExpression8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleUnaryExpression8340 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleUnaryExpression8362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleUnaryExpression8381 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleUnaryExpression8403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleUnaryExpression8422 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleUnaryExpression8444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpressionNotPlusMinus_in_ruleUnaryExpression8472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpressionNotPlusMinus_in_entryRuleUnaryExpressionNotPlusMinus8507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpressionNotPlusMinus8517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleUnaryExpressionNotPlusMinus8565 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleUnaryExpressionNotPlusMinus8586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleUnaryExpressionNotPlusMinus8614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary8651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary8661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_rulePrimary8717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimary8744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePrimary8763 = new BitSet(new long[]{0x1008000200000002L});
    public static final BitSet FOLLOW_33_in_rulePrimary8776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary8793 = new BitSet(new long[]{0x1008000200000002L});
    public static final BitSet FOLLOW_ruleIdentifierSuffix_in_rulePrimary8831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary8857 = new BitSet(new long[]{0x1008000200000002L});
    public static final BitSet FOLLOW_33_in_rulePrimary8875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary8892 = new BitSet(new long[]{0x1008000200000002L});
    public static final BitSet FOLLOW_ruleIdentifierSuffix_in_rulePrimary8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierSuffix_in_entryRuleIdentifierSuffix8969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierSuffix8979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleIdentifierSuffix9028 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleIdentifierSuffix9040 = new BitSet(new long[]{0x1000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleIdentifierSuffix9054 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleIdentifierSuffix9066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleIdentifierSuffix9094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleIdentifierSuffix9113 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleIdentifierSuffix9125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleIdentifierSuffix9145 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleIdentifierSuffix9157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleIdentifierSuffix9177 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleIdentifierSuffix9189 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleIdentifierSuffix9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments9248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments9258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleArguments9304 = new BitSet(new long[]{0x06A800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleArguments9325 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleArguments9338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList9374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList9384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList9430 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExpressionList9443 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList9464 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_entryRuleParExpression9504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParExpression9514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleParExpression9551 = new BitSet(new long[]{0x068800000003F010L,0x000000005C600000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParExpression9573 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleParExpression9584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteral9679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATING_POINT_LITERAL_in_ruleLiteral9705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_LITERAL_in_ruleLiteral9731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleLiteral9757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral9790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleLiteral9814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral9855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_LITERAL_in_ruleIntegerLiteral9906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAL_LITERAL_in_ruleIntegerLiteral9932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_LITERAL_in_ruleIntegerLiteral9958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral10004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral10015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBooleanLiteral10053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBooleanLiteral10072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDE_LHS_in_entryRuleDE_LHS10112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDE_LHS10122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleDE_LHS10159 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleDE_LHS10171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDE_LHS10188 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleDE_LHS10205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDE_LHS10222 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleDE_LHS10239 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDE_LHS10256 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleDE_LHS10273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_synpred1_InternalApricot3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOperator_in_synpred2_InternalApricot6514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierSuffix_in_synpred3_InternalApricot8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifierSuffix_in_synpred4_InternalApricot8913 = new BitSet(new long[]{0x0000000000000002L});

}