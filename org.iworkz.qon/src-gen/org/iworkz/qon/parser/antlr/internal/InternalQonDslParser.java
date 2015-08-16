package org.iworkz.qon.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.iworkz.qon.services.QonDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQonDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'$namespace'", "':'", "'$schema'", "'-'", "'>'", "'$imports'", "'['", "','", "']'", "'null'", "'true'", "'false'", "'.'", "'e'", "'E'", "'+'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalQonDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQonDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQonDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g"; }



     	private QonDslGrammarAccess grammarAccess;
     	
        public InternalQonDslParser(TokenStream input, QonDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "QRoot";	
       	}
       	
       	@Override
       	protected QonDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQRoot"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:67:1: entryRuleQRoot returns [EObject current=null] : iv_ruleQRoot= ruleQRoot EOF ;
    public final EObject entryRuleQRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQRoot = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:68:2: (iv_ruleQRoot= ruleQRoot EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:69:2: iv_ruleQRoot= ruleQRoot EOF
            {
             newCompositeNode(grammarAccess.getQRootRule()); 
            pushFollow(FOLLOW_ruleQRoot_in_entryRuleQRoot75);
            iv_ruleQRoot=ruleQRoot();

            state._fsp--;

             current =iv_ruleQRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQRoot85); 

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
    // $ANTLR end "entryRuleQRoot"


    // $ANTLR start "ruleQRoot"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:76:1: ruleQRoot returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '{' ( (lv_systemProperties_3_0= ruleQSystemProperty ) )* ( (lv_properties_4_0= ruleQProperty ) )* otherlv_5= '}' ) ;
    public final EObject ruleQRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_systemProperties_3_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:79:28: ( ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '{' ( (lv_systemProperties_3_0= ruleQSystemProperty ) )* ( (lv_properties_4_0= ruleQProperty ) )* otherlv_5= '}' ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:80:1: ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '{' ( (lv_systemProperties_3_0= ruleQSystemProperty ) )* ( (lv_properties_4_0= ruleQProperty ) )* otherlv_5= '}' )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:80:1: ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '{' ( (lv_systemProperties_3_0= ruleQSystemProperty ) )* ( (lv_properties_4_0= ruleQProperty ) )* otherlv_5= '}' )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:80:2: () ( (otherlv_1= RULE_ID ) )? otherlv_2= '{' ( (lv_systemProperties_3_0= ruleQSystemProperty ) )* ( (lv_properties_4_0= ruleQProperty ) )* otherlv_5= '}'
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:80:2: ()
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQRootAccess().getQObjectAction_0(),
                        current);
                

            }

            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:86:2: ( (otherlv_1= RULE_ID ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:87:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:87:1: (otherlv_1= RULE_ID )
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:88:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQRootRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQRoot139); 

                    		newLeafNode(otherlv_1, grammarAccess.getQRootAccess().getTypeQObjectCrossReference_1_0()); 
                    	

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleQRoot152); 

                	newLeafNode(otherlv_2, grammarAccess.getQRootAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:103:1: ( (lv_systemProperties_3_0= ruleQSystemProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==15||LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:104:1: (lv_systemProperties_3_0= ruleQSystemProperty )
            	    {
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:104:1: (lv_systemProperties_3_0= ruleQSystemProperty )
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:105:3: lv_systemProperties_3_0= ruleQSystemProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQRootAccess().getSystemPropertiesQSystemPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQSystemProperty_in_ruleQRoot173);
            	    lv_systemProperties_3_0=ruleQSystemProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"systemProperties",
            	            		lv_systemProperties_3_0, 
            	            		"QSystemProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:121:3: ( (lv_properties_4_0= ruleQProperty ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:122:1: (lv_properties_4_0= ruleQProperty )
            	    {
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:122:1: (lv_properties_4_0= ruleQProperty )
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:123:3: lv_properties_4_0= ruleQProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQRootAccess().getPropertiesQPropertyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQProperty_in_ruleQRoot195);
            	    lv_properties_4_0=ruleQProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_4_0, 
            	            		"QProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleQRoot208); 

                	newLeafNode(otherlv_5, grammarAccess.getQRootAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQRoot"


    // $ANTLR start "entryRuleQObject"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:151:1: entryRuleQObject returns [EObject current=null] : iv_ruleQObject= ruleQObject EOF ;
    public final EObject entryRuleQObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQObject = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:152:2: (iv_ruleQObject= ruleQObject EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:153:2: iv_ruleQObject= ruleQObject EOF
            {
             newCompositeNode(grammarAccess.getQObjectRule()); 
            pushFollow(FOLLOW_ruleQObject_in_entryRuleQObject244);
            iv_ruleQObject=ruleQObject();

            state._fsp--;

             current =iv_ruleQObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQObject254); 

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
    // $ANTLR end "entryRuleQObject"


    // $ANTLR start "ruleQObject"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:160:1: ruleQObject returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '{' ( (lv_properties_3_0= ruleQProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleQObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:163:28: ( ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '{' ( (lv_properties_3_0= ruleQProperty ) )* otherlv_4= '}' ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:164:1: ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '{' ( (lv_properties_3_0= ruleQProperty ) )* otherlv_4= '}' )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:164:1: ( () ( (otherlv_1= RULE_ID ) )? otherlv_2= '{' ( (lv_properties_3_0= ruleQProperty ) )* otherlv_4= '}' )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:164:2: () ( (otherlv_1= RULE_ID ) )? otherlv_2= '{' ( (lv_properties_3_0= ruleQProperty ) )* otherlv_4= '}'
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:164:2: ()
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:165:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQObjectAccess().getQObjectAction_0(),
                        current);
                

            }

            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:170:2: ( (otherlv_1= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:171:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:171:1: (otherlv_1= RULE_ID )
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:172:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQObjectRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQObject308); 

                    		newLeafNode(otherlv_1, grammarAccess.getQObjectAccess().getTypeQObjectCrossReference_1_0()); 
                    	

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleQObject321); 

                	newLeafNode(otherlv_2, grammarAccess.getQObjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:187:1: ( (lv_properties_3_0= ruleQProperty ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:188:1: (lv_properties_3_0= ruleQProperty )
            	    {
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:188:1: (lv_properties_3_0= ruleQProperty )
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:189:3: lv_properties_3_0= ruleQProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQObjectAccess().getPropertiesQPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQProperty_in_ruleQObject342);
            	    lv_properties_3_0=ruleQProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_3_0, 
            	            		"QProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleQObject355); 

                	newLeafNode(otherlv_4, grammarAccess.getQObjectAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQObject"


    // $ANTLR start "entryRuleQSystemProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:217:1: entryRuleQSystemProperty returns [EObject current=null] : iv_ruleQSystemProperty= ruleQSystemProperty EOF ;
    public final EObject entryRuleQSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQSystemProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:218:2: (iv_ruleQSystemProperty= ruleQSystemProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:219:2: iv_ruleQSystemProperty= ruleQSystemProperty EOF
            {
             newCompositeNode(grammarAccess.getQSystemPropertyRule()); 
            pushFollow(FOLLOW_ruleQSystemProperty_in_entryRuleQSystemProperty391);
            iv_ruleQSystemProperty=ruleQSystemProperty();

            state._fsp--;

             current =iv_ruleQSystemProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQSystemProperty401); 

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
    // $ANTLR end "entryRuleQSystemProperty"


    // $ANTLR start "ruleQSystemProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:226:1: ruleQSystemProperty returns [EObject current=null] : (this_NamespaceProperty_0= ruleNamespaceProperty | this_SchemaProperty_1= ruleSchemaProperty | this_ImportProperty_2= ruleImportProperty ) ;
    public final EObject ruleQSystemProperty() throws RecognitionException {
        EObject current = null;

        EObject this_NamespaceProperty_0 = null;

        EObject this_SchemaProperty_1 = null;

        EObject this_ImportProperty_2 = null;


         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:229:28: ( (this_NamespaceProperty_0= ruleNamespaceProperty | this_SchemaProperty_1= ruleSchemaProperty | this_ImportProperty_2= ruleImportProperty ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:230:1: (this_NamespaceProperty_0= ruleNamespaceProperty | this_SchemaProperty_1= ruleSchemaProperty | this_ImportProperty_2= ruleImportProperty )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:230:1: (this_NamespaceProperty_0= ruleNamespaceProperty | this_SchemaProperty_1= ruleSchemaProperty | this_ImportProperty_2= ruleImportProperty )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:231:5: this_NamespaceProperty_0= ruleNamespaceProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQSystemPropertyAccess().getNamespacePropertyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNamespaceProperty_in_ruleQSystemProperty448);
                    this_NamespaceProperty_0=ruleNamespaceProperty();

                    state._fsp--;

                     
                            current = this_NamespaceProperty_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:241:5: this_SchemaProperty_1= ruleSchemaProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQSystemPropertyAccess().getSchemaPropertyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSchemaProperty_in_ruleQSystemProperty475);
                    this_SchemaProperty_1=ruleSchemaProperty();

                    state._fsp--;

                     
                            current = this_SchemaProperty_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:251:5: this_ImportProperty_2= ruleImportProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQSystemPropertyAccess().getImportPropertyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImportProperty_in_ruleQSystemProperty502);
                    this_ImportProperty_2=ruleImportProperty();

                    state._fsp--;

                     
                            current = this_ImportProperty_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQSystemProperty"


    // $ANTLR start "entryRuleNamespaceProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:267:1: entryRuleNamespaceProperty returns [EObject current=null] : iv_ruleNamespaceProperty= ruleNamespaceProperty EOF ;
    public final EObject entryRuleNamespaceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:268:2: (iv_ruleNamespaceProperty= ruleNamespaceProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:269:2: iv_ruleNamespaceProperty= ruleNamespaceProperty EOF
            {
             newCompositeNode(grammarAccess.getNamespacePropertyRule()); 
            pushFollow(FOLLOW_ruleNamespaceProperty_in_entryRuleNamespaceProperty537);
            iv_ruleNamespaceProperty=ruleNamespaceProperty();

            state._fsp--;

             current =iv_ruleNamespaceProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceProperty547); 

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
    // $ANTLR end "entryRuleNamespaceProperty"


    // $ANTLR start "ruleNamespaceProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:276:1: ruleNamespaceProperty returns [EObject current=null] : (otherlv_0= '$namespace' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleNamespaceProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:279:28: ( (otherlv_0= '$namespace' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:280:1: (otherlv_0= '$namespace' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:280:1: (otherlv_0= '$namespace' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:280:3: otherlv_0= '$namespace' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleNamespaceProperty584); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespacePropertyAccess().getNamespaceKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleNamespaceProperty596); 

                	newLeafNode(otherlv_1, grammarAccess.getNamespacePropertyAccess().getColonKeyword_1());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:288:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:289:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:289:1: (lv_value_2_0= RULE_STRING )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:290:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNamespaceProperty613); 

            			newLeafNode(lv_value_2_0, grammarAccess.getNamespacePropertyAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamespacePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespaceProperty"


    // $ANTLR start "entryRuleSchemaProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:314:1: entryRuleSchemaProperty returns [EObject current=null] : iv_ruleSchemaProperty= ruleSchemaProperty EOF ;
    public final EObject entryRuleSchemaProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:315:2: (iv_ruleSchemaProperty= ruleSchemaProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:316:2: iv_ruleSchemaProperty= ruleSchemaProperty EOF
            {
             newCompositeNode(grammarAccess.getSchemaPropertyRule()); 
            pushFollow(FOLLOW_ruleSchemaProperty_in_entryRuleSchemaProperty654);
            iv_ruleSchemaProperty=ruleSchemaProperty();

            state._fsp--;

             current =iv_ruleSchemaProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemaProperty664); 

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
    // $ANTLR end "entryRuleSchemaProperty"


    // $ANTLR start "ruleSchemaProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:323:1: ruleSchemaProperty returns [EObject current=null] : (otherlv_0= '$schema' otherlv_1= '-' otherlv_2= '>' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleSchemaProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:326:28: ( (otherlv_0= '$schema' otherlv_1= '-' otherlv_2= '>' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:327:1: (otherlv_0= '$schema' otherlv_1= '-' otherlv_2= '>' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:327:1: (otherlv_0= '$schema' otherlv_1= '-' otherlv_2= '>' ( (otherlv_3= RULE_STRING ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:327:3: otherlv_0= '$schema' otherlv_1= '-' otherlv_2= '>' ( (otherlv_3= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSchemaProperty701); 

                	newLeafNode(otherlv_0, grammarAccess.getSchemaPropertyAccess().getSchemaKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSchemaProperty713); 

                	newLeafNode(otherlv_1, grammarAccess.getSchemaPropertyAccess().getHyphenMinusKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSchemaProperty725); 

                	newLeafNode(otherlv_2, grammarAccess.getSchemaPropertyAccess().getGreaterThanSignKeyword_2());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:339:1: ( (otherlv_3= RULE_STRING ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:340:1: (otherlv_3= RULE_STRING )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:340:1: (otherlv_3= RULE_STRING )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:341:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSchemaPropertyRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSchemaProperty745); 

            		newLeafNode(otherlv_3, grammarAccess.getSchemaPropertyAccess().getLinkQObjectCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemaProperty"


    // $ANTLR start "entryRuleImportProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:360:1: entryRuleImportProperty returns [EObject current=null] : iv_ruleImportProperty= ruleImportProperty EOF ;
    public final EObject entryRuleImportProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:361:2: (iv_ruleImportProperty= ruleImportProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:362:2: iv_ruleImportProperty= ruleImportProperty EOF
            {
             newCompositeNode(grammarAccess.getImportPropertyRule()); 
            pushFollow(FOLLOW_ruleImportProperty_in_entryRuleImportProperty781);
            iv_ruleImportProperty=ruleImportProperty();

            state._fsp--;

             current =iv_ruleImportProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportProperty791); 

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
    // $ANTLR end "entryRuleImportProperty"


    // $ANTLR start "ruleImportProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:369:1: ruleImportProperty returns [EObject current=null] : ( () otherlv_1= '$imports' otherlv_2= ':' otherlv_3= '[' ( ( (lv_values_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleImport ) ) )* )? otherlv_7= ']' ) ;
    public final EObject ruleImportProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_values_4_0 = null;

        EObject lv_values_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:372:28: ( ( () otherlv_1= '$imports' otherlv_2= ':' otherlv_3= '[' ( ( (lv_values_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleImport ) ) )* )? otherlv_7= ']' ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:373:1: ( () otherlv_1= '$imports' otherlv_2= ':' otherlv_3= '[' ( ( (lv_values_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleImport ) ) )* )? otherlv_7= ']' )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:373:1: ( () otherlv_1= '$imports' otherlv_2= ':' otherlv_3= '[' ( ( (lv_values_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleImport ) ) )* )? otherlv_7= ']' )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:373:2: () otherlv_1= '$imports' otherlv_2= ':' otherlv_3= '[' ( ( (lv_values_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleImport ) ) )* )? otherlv_7= ']'
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:373:2: ()
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:374:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportPropertyAccess().getImportPropertyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleImportProperty837); 

                	newLeafNode(otherlv_1, grammarAccess.getImportPropertyAccess().getImportsKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleImportProperty849); 

                	newLeafNode(otherlv_2, grammarAccess.getImportPropertyAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleImportProperty861); 

                	newLeafNode(otherlv_3, grammarAccess.getImportPropertyAccess().getLeftSquareBracketKeyword_3());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:391:1: ( ( (lv_values_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleImport ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:391:2: ( (lv_values_4_0= ruleImport ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleImport ) ) )*
                    {
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:391:2: ( (lv_values_4_0= ruleImport ) )
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:392:1: (lv_values_4_0= ruleImport )
                    {
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:392:1: (lv_values_4_0= ruleImport )
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:393:3: lv_values_4_0= ruleImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportPropertyAccess().getValuesImportParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImport_in_ruleImportProperty883);
                    lv_values_4_0=ruleImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImportPropertyRule());
                    	        }
                           		add(
                           			current, 
                           			"values",
                            		lv_values_4_0, 
                            		"Import");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:409:2: (otherlv_5= ',' ( (lv_values_6_0= ruleImport ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:409:4: otherlv_5= ',' ( (lv_values_6_0= ruleImport ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleImportProperty896); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getImportPropertyAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:413:1: ( (lv_values_6_0= ruleImport ) )
                    	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:414:1: (lv_values_6_0= ruleImport )
                    	    {
                    	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:414:1: (lv_values_6_0= ruleImport )
                    	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:415:3: lv_values_6_0= ruleImport
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImportPropertyAccess().getValuesImportParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleImport_in_ruleImportProperty917);
                    	    lv_values_6_0=ruleImport();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImportPropertyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"values",
                    	            		lv_values_6_0, 
                    	            		"Import");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleImportProperty933); 

                	newLeafNode(otherlv_7, grammarAccess.getImportPropertyAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportProperty"


    // $ANTLR start "entryRuleImport"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:443:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:444:2: (iv_ruleImport= ruleImport EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:445:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport969);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport979); 

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
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:452:1: ruleImport returns [EObject current=null] : ( (lv_importedNamespace_0_0= RULE_STRING ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importedNamespace_0_0=null;

         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:455:28: ( ( (lv_importedNamespace_0_0= RULE_STRING ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:456:1: ( (lv_importedNamespace_0_0= RULE_STRING ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:456:1: ( (lv_importedNamespace_0_0= RULE_STRING ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:457:1: (lv_importedNamespace_0_0= RULE_STRING )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:457:1: (lv_importedNamespace_0_0= RULE_STRING )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:458:3: lv_importedNamespace_0_0= RULE_STRING
            {
            lv_importedNamespace_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport1020); 

            			newLeafNode(lv_importedNamespace_0_0, grammarAccess.getImportAccess().getImportedNamespaceSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleQProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:482:1: entryRuleQProperty returns [EObject current=null] : iv_ruleQProperty= ruleQProperty EOF ;
    public final EObject entryRuleQProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:483:2: (iv_ruleQProperty= ruleQProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:484:2: iv_ruleQProperty= ruleQProperty EOF
            {
             newCompositeNode(grammarAccess.getQPropertyRule()); 
            pushFollow(FOLLOW_ruleQProperty_in_entryRuleQProperty1060);
            iv_ruleQProperty=ruleQProperty();

            state._fsp--;

             current =iv_ruleQProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQProperty1070); 

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
    // $ANTLR end "entryRuleQProperty"


    // $ANTLR start "ruleQProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:491:1: ruleQProperty returns [EObject current=null] : (this_QValueProperty_0= ruleQValueProperty | this_QLinkProperty_1= ruleQLinkProperty ) ;
    public final EObject ruleQProperty() throws RecognitionException {
        EObject current = null;

        EObject this_QValueProperty_0 = null;

        EObject this_QLinkProperty_1 = null;


         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:494:28: ( (this_QValueProperty_0= ruleQValueProperty | this_QLinkProperty_1= ruleQLinkProperty ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:495:1: (this_QValueProperty_0= ruleQValueProperty | this_QLinkProperty_1= ruleQLinkProperty )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:495:1: (this_QValueProperty_0= ruleQValueProperty | this_QLinkProperty_1= ruleQLinkProperty )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==14) ) {
                    alt9=1;
                }
                else if ( (LA9_1==16) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:496:5: this_QValueProperty_0= ruleQValueProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQPropertyAccess().getQValuePropertyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleQValueProperty_in_ruleQProperty1117);
                    this_QValueProperty_0=ruleQValueProperty();

                    state._fsp--;

                     
                            current = this_QValueProperty_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:506:5: this_QLinkProperty_1= ruleQLinkProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQPropertyAccess().getQLinkPropertyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQLinkProperty_in_ruleQProperty1144);
                    this_QLinkProperty_1=ruleQLinkProperty();

                    state._fsp--;

                     
                            current = this_QLinkProperty_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQProperty"


    // $ANTLR start "entryRuleQLinkProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:522:1: entryRuleQLinkProperty returns [EObject current=null] : iv_ruleQLinkProperty= ruleQLinkProperty EOF ;
    public final EObject entryRuleQLinkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQLinkProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:523:2: (iv_ruleQLinkProperty= ruleQLinkProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:524:2: iv_ruleQLinkProperty= ruleQLinkProperty EOF
            {
             newCompositeNode(grammarAccess.getQLinkPropertyRule()); 
            pushFollow(FOLLOW_ruleQLinkProperty_in_entryRuleQLinkProperty1179);
            iv_ruleQLinkProperty=ruleQLinkProperty();

            state._fsp--;

             current =iv_ruleQLinkProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQLinkProperty1189); 

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
    // $ANTLR end "entryRuleQLinkProperty"


    // $ANTLR start "ruleQLinkProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:531:1: ruleQLinkProperty returns [EObject current=null] : (this_QLinkObjectProperty_0= ruleQLinkObjectProperty | this_QLinkArrayProperty_1= ruleQLinkArrayProperty ) ;
    public final EObject ruleQLinkProperty() throws RecognitionException {
        EObject current = null;

        EObject this_QLinkObjectProperty_0 = null;

        EObject this_QLinkArrayProperty_1 = null;


         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:534:28: ( (this_QLinkObjectProperty_0= ruleQLinkObjectProperty | this_QLinkArrayProperty_1= ruleQLinkArrayProperty ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:535:1: (this_QLinkObjectProperty_0= ruleQLinkObjectProperty | this_QLinkArrayProperty_1= ruleQLinkArrayProperty )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:535:1: (this_QLinkObjectProperty_0= ruleQLinkObjectProperty | this_QLinkArrayProperty_1= ruleQLinkArrayProperty )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==16) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==17) ) {
                        int LA10_3 = input.LA(4);

                        if ( (LA10_3==19) ) {
                            alt10=2;
                        }
                        else if ( (LA10_3==RULE_STRING) ) {
                            alt10=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:536:5: this_QLinkObjectProperty_0= ruleQLinkObjectProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQLinkPropertyAccess().getQLinkObjectPropertyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleQLinkObjectProperty_in_ruleQLinkProperty1236);
                    this_QLinkObjectProperty_0=ruleQLinkObjectProperty();

                    state._fsp--;

                     
                            current = this_QLinkObjectProperty_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:546:5: this_QLinkArrayProperty_1= ruleQLinkArrayProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQLinkPropertyAccess().getQLinkArrayPropertyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQLinkArrayProperty_in_ruleQLinkProperty1263);
                    this_QLinkArrayProperty_1=ruleQLinkArrayProperty();

                    state._fsp--;

                     
                            current = this_QLinkArrayProperty_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQLinkProperty"


    // $ANTLR start "entryRuleQLinkObjectProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:562:1: entryRuleQLinkObjectProperty returns [EObject current=null] : iv_ruleQLinkObjectProperty= ruleQLinkObjectProperty EOF ;
    public final EObject entryRuleQLinkObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQLinkObjectProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:563:2: (iv_ruleQLinkObjectProperty= ruleQLinkObjectProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:564:2: iv_ruleQLinkObjectProperty= ruleQLinkObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getQLinkObjectPropertyRule()); 
            pushFollow(FOLLOW_ruleQLinkObjectProperty_in_entryRuleQLinkObjectProperty1298);
            iv_ruleQLinkObjectProperty=ruleQLinkObjectProperty();

            state._fsp--;

             current =iv_ruleQLinkObjectProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQLinkObjectProperty1308); 

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
    // $ANTLR end "entryRuleQLinkObjectProperty"


    // $ANTLR start "ruleQLinkObjectProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:571:1: ruleQLinkObjectProperty returns [EObject current=null] : ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= '-' otherlv_2= '>' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleQLinkObjectProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:574:28: ( ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= '-' otherlv_2= '>' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:575:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= '-' otherlv_2= '>' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:575:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= '-' otherlv_2= '>' ( (otherlv_3= RULE_STRING ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:575:2: ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= '-' otherlv_2= '>' ( (otherlv_3= RULE_STRING ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:575:2: ( (lv_propertyName_0_0= RULE_ID ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:576:1: (lv_propertyName_0_0= RULE_ID )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:576:1: (lv_propertyName_0_0= RULE_ID )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:577:3: lv_propertyName_0_0= RULE_ID
            {
            lv_propertyName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQLinkObjectProperty1350); 

            			newLeafNode(lv_propertyName_0_0, grammarAccess.getQLinkObjectPropertyAccess().getPropertyNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQLinkObjectPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleQLinkObjectProperty1367); 

                	newLeafNode(otherlv_1, grammarAccess.getQLinkObjectPropertyAccess().getHyphenMinusKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleQLinkObjectProperty1379); 

                	newLeafNode(otherlv_2, grammarAccess.getQLinkObjectPropertyAccess().getGreaterThanSignKeyword_2());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:601:1: ( (otherlv_3= RULE_STRING ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:602:1: (otherlv_3= RULE_STRING )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:602:1: (otherlv_3= RULE_STRING )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:603:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQLinkObjectPropertyRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQLinkObjectProperty1399); 

            		newLeafNode(otherlv_3, grammarAccess.getQLinkObjectPropertyAccess().getLinkQObjectCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQLinkObjectProperty"


    // $ANTLR start "entryRuleQLinkArrayProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:622:1: entryRuleQLinkArrayProperty returns [EObject current=null] : iv_ruleQLinkArrayProperty= ruleQLinkArrayProperty EOF ;
    public final EObject entryRuleQLinkArrayProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQLinkArrayProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:623:2: (iv_ruleQLinkArrayProperty= ruleQLinkArrayProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:624:2: iv_ruleQLinkArrayProperty= ruleQLinkArrayProperty EOF
            {
             newCompositeNode(grammarAccess.getQLinkArrayPropertyRule()); 
            pushFollow(FOLLOW_ruleQLinkArrayProperty_in_entryRuleQLinkArrayProperty1435);
            iv_ruleQLinkArrayProperty=ruleQLinkArrayProperty();

            state._fsp--;

             current =iv_ruleQLinkArrayProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQLinkArrayProperty1445); 

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
    // $ANTLR end "entryRuleQLinkArrayProperty"


    // $ANTLR start "ruleQLinkArrayProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:631:1: ruleQLinkArrayProperty returns [EObject current=null] : ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= '-' otherlv_2= '>' otherlv_3= '[' ( ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* )? otherlv_7= ']' ) ;
    public final EObject ruleQLinkArrayProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:634:28: ( ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= '-' otherlv_2= '>' otherlv_3= '[' ( ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* )? otherlv_7= ']' ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:635:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= '-' otherlv_2= '>' otherlv_3= '[' ( ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* )? otherlv_7= ']' )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:635:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= '-' otherlv_2= '>' otherlv_3= '[' ( ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* )? otherlv_7= ']' )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:635:2: ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= '-' otherlv_2= '>' otherlv_3= '[' ( ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* )? otherlv_7= ']'
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:635:2: ( (lv_propertyName_0_0= RULE_ID ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:636:1: (lv_propertyName_0_0= RULE_ID )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:636:1: (lv_propertyName_0_0= RULE_ID )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:637:3: lv_propertyName_0_0= RULE_ID
            {
            lv_propertyName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQLinkArrayProperty1487); 

            			newLeafNode(lv_propertyName_0_0, grammarAccess.getQLinkArrayPropertyAccess().getPropertyNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQLinkArrayPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleQLinkArrayProperty1504); 

                	newLeafNode(otherlv_1, grammarAccess.getQLinkArrayPropertyAccess().getHyphenMinusKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleQLinkArrayProperty1516); 

                	newLeafNode(otherlv_2, grammarAccess.getQLinkArrayPropertyAccess().getGreaterThanSignKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleQLinkArrayProperty1528); 

                	newLeafNode(otherlv_3, grammarAccess.getQLinkArrayPropertyAccess().getLeftSquareBracketKeyword_3());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:665:1: ( ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:665:2: ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
                    {
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:665:2: ( (otherlv_4= RULE_STRING ) )
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:666:1: (otherlv_4= RULE_STRING )
                    {
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:666:1: (otherlv_4= RULE_STRING )
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:667:3: otherlv_4= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQLinkArrayPropertyRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQLinkArrayProperty1549); 

                    		newLeafNode(otherlv_4, grammarAccess.getQLinkArrayPropertyAccess().getLinksQObjectCrossReference_4_0_0()); 
                    	

                    }


                    }

                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:678:2: (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==20) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:678:4: otherlv_5= ',' ( (otherlv_6= RULE_STRING ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleQLinkArrayProperty1562); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getQLinkArrayPropertyAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:682:1: ( (otherlv_6= RULE_STRING ) )
                    	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:683:1: (otherlv_6= RULE_STRING )
                    	    {
                    	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:683:1: (otherlv_6= RULE_STRING )
                    	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:684:3: otherlv_6= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getQLinkArrayPropertyRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQLinkArrayProperty1582); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getQLinkArrayPropertyAccess().getLinksQObjectCrossReference_4_1_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleQLinkArrayProperty1598); 

                	newLeafNode(otherlv_7, grammarAccess.getQLinkArrayPropertyAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQLinkArrayProperty"


    // $ANTLR start "entryRuleQValueProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:707:1: entryRuleQValueProperty returns [EObject current=null] : iv_ruleQValueProperty= ruleQValueProperty EOF ;
    public final EObject entryRuleQValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQValueProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:708:2: (iv_ruleQValueProperty= ruleQValueProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:709:2: iv_ruleQValueProperty= ruleQValueProperty EOF
            {
             newCompositeNode(grammarAccess.getQValuePropertyRule()); 
            pushFollow(FOLLOW_ruleQValueProperty_in_entryRuleQValueProperty1634);
            iv_ruleQValueProperty=ruleQValueProperty();

            state._fsp--;

             current =iv_ruleQValueProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQValueProperty1644); 

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
    // $ANTLR end "entryRuleQValueProperty"


    // $ANTLR start "ruleQValueProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:716:1: ruleQValueProperty returns [EObject current=null] : (this_QStringValueProperty_0= ruleQStringValueProperty | this_QNumberValueProperty_1= ruleQNumberValueProperty | this_QBooleanValueProperty_2= ruleQBooleanValueProperty | this_QNullValueProperty_3= ruleQNullValueProperty | this_QObjectProperty_4= ruleQObjectProperty | this_QStringArrayProperty_5= ruleQStringArrayProperty | this_QObjectArrayProperty_6= ruleQObjectArrayProperty | this_QNumberArrayProperty_7= ruleQNumberArrayProperty | this_QEmptyArrayProperty_8= ruleQEmptyArrayProperty ) ;
    public final EObject ruleQValueProperty() throws RecognitionException {
        EObject current = null;

        EObject this_QStringValueProperty_0 = null;

        EObject this_QNumberValueProperty_1 = null;

        EObject this_QBooleanValueProperty_2 = null;

        EObject this_QNullValueProperty_3 = null;

        EObject this_QObjectProperty_4 = null;

        EObject this_QStringArrayProperty_5 = null;

        EObject this_QObjectArrayProperty_6 = null;

        EObject this_QNumberArrayProperty_7 = null;

        EObject this_QEmptyArrayProperty_8 = null;


         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:719:28: ( (this_QStringValueProperty_0= ruleQStringValueProperty | this_QNumberValueProperty_1= ruleQNumberValueProperty | this_QBooleanValueProperty_2= ruleQBooleanValueProperty | this_QNullValueProperty_3= ruleQNullValueProperty | this_QObjectProperty_4= ruleQObjectProperty | this_QStringArrayProperty_5= ruleQStringArrayProperty | this_QObjectArrayProperty_6= ruleQObjectArrayProperty | this_QNumberArrayProperty_7= ruleQNumberArrayProperty | this_QEmptyArrayProperty_8= ruleQEmptyArrayProperty ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:720:1: (this_QStringValueProperty_0= ruleQStringValueProperty | this_QNumberValueProperty_1= ruleQNumberValueProperty | this_QBooleanValueProperty_2= ruleQBooleanValueProperty | this_QNullValueProperty_3= ruleQNullValueProperty | this_QObjectProperty_4= ruleQObjectProperty | this_QStringArrayProperty_5= ruleQStringArrayProperty | this_QObjectArrayProperty_6= ruleQObjectArrayProperty | this_QNumberArrayProperty_7= ruleQNumberArrayProperty | this_QEmptyArrayProperty_8= ruleQEmptyArrayProperty )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:720:1: (this_QStringValueProperty_0= ruleQStringValueProperty | this_QNumberValueProperty_1= ruleQNumberValueProperty | this_QBooleanValueProperty_2= ruleQBooleanValueProperty | this_QNullValueProperty_3= ruleQNullValueProperty | this_QObjectProperty_4= ruleQObjectProperty | this_QStringArrayProperty_5= ruleQStringArrayProperty | this_QObjectArrayProperty_6= ruleQObjectArrayProperty | this_QNumberArrayProperty_7= ruleQNumberArrayProperty | this_QEmptyArrayProperty_8= ruleQEmptyArrayProperty )
            int alt13=9;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:721:5: this_QStringValueProperty_0= ruleQStringValueProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQValuePropertyAccess().getQStringValuePropertyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleQStringValueProperty_in_ruleQValueProperty1691);
                    this_QStringValueProperty_0=ruleQStringValueProperty();

                    state._fsp--;

                     
                            current = this_QStringValueProperty_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:731:5: this_QNumberValueProperty_1= ruleQNumberValueProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQValuePropertyAccess().getQNumberValuePropertyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQNumberValueProperty_in_ruleQValueProperty1718);
                    this_QNumberValueProperty_1=ruleQNumberValueProperty();

                    state._fsp--;

                     
                            current = this_QNumberValueProperty_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:741:5: this_QBooleanValueProperty_2= ruleQBooleanValueProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQValuePropertyAccess().getQBooleanValuePropertyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleQBooleanValueProperty_in_ruleQValueProperty1745);
                    this_QBooleanValueProperty_2=ruleQBooleanValueProperty();

                    state._fsp--;

                     
                            current = this_QBooleanValueProperty_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:751:5: this_QNullValueProperty_3= ruleQNullValueProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQValuePropertyAccess().getQNullValuePropertyParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleQNullValueProperty_in_ruleQValueProperty1772);
                    this_QNullValueProperty_3=ruleQNullValueProperty();

                    state._fsp--;

                     
                            current = this_QNullValueProperty_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:761:5: this_QObjectProperty_4= ruleQObjectProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQValuePropertyAccess().getQObjectPropertyParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleQObjectProperty_in_ruleQValueProperty1799);
                    this_QObjectProperty_4=ruleQObjectProperty();

                    state._fsp--;

                     
                            current = this_QObjectProperty_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:771:5: this_QStringArrayProperty_5= ruleQStringArrayProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQValuePropertyAccess().getQStringArrayPropertyParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleQStringArrayProperty_in_ruleQValueProperty1826);
                    this_QStringArrayProperty_5=ruleQStringArrayProperty();

                    state._fsp--;

                     
                            current = this_QStringArrayProperty_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:781:5: this_QObjectArrayProperty_6= ruleQObjectArrayProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQValuePropertyAccess().getQObjectArrayPropertyParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleQObjectArrayProperty_in_ruleQValueProperty1853);
                    this_QObjectArrayProperty_6=ruleQObjectArrayProperty();

                    state._fsp--;

                     
                            current = this_QObjectArrayProperty_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:791:5: this_QNumberArrayProperty_7= ruleQNumberArrayProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQValuePropertyAccess().getQNumberArrayPropertyParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleQNumberArrayProperty_in_ruleQValueProperty1880);
                    this_QNumberArrayProperty_7=ruleQNumberArrayProperty();

                    state._fsp--;

                     
                            current = this_QNumberArrayProperty_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:801:5: this_QEmptyArrayProperty_8= ruleQEmptyArrayProperty
                    {
                     
                            newCompositeNode(grammarAccess.getQValuePropertyAccess().getQEmptyArrayPropertyParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleQEmptyArrayProperty_in_ruleQValueProperty1907);
                    this_QEmptyArrayProperty_8=ruleQEmptyArrayProperty();

                    state._fsp--;

                     
                            current = this_QEmptyArrayProperty_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQValueProperty"


    // $ANTLR start "entryRuleQObjectProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:817:1: entryRuleQObjectProperty returns [EObject current=null] : iv_ruleQObjectProperty= ruleQObjectProperty EOF ;
    public final EObject entryRuleQObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQObjectProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:818:2: (iv_ruleQObjectProperty= ruleQObjectProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:819:2: iv_ruleQObjectProperty= ruleQObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getQObjectPropertyRule()); 
            pushFollow(FOLLOW_ruleQObjectProperty_in_entryRuleQObjectProperty1942);
            iv_ruleQObjectProperty=ruleQObjectProperty();

            state._fsp--;

             current =iv_ruleQObjectProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQObjectProperty1952); 

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
    // $ANTLR end "entryRuleQObjectProperty"


    // $ANTLR start "ruleQObjectProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:826:1: ruleQObjectProperty returns [EObject current=null] : ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleQObject ) ) ) ;
    public final EObject ruleQObjectProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:829:28: ( ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleQObject ) ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:830:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleQObject ) ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:830:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleQObject ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:830:2: ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleQObject ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:830:2: ( (lv_propertyName_0_0= RULE_ID ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:831:1: (lv_propertyName_0_0= RULE_ID )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:831:1: (lv_propertyName_0_0= RULE_ID )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:832:3: lv_propertyName_0_0= RULE_ID
            {
            lv_propertyName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQObjectProperty1994); 

            			newLeafNode(lv_propertyName_0_0, grammarAccess.getQObjectPropertyAccess().getPropertyNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQObjectPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleQObjectProperty2011); 

                	newLeafNode(otherlv_1, grammarAccess.getQObjectPropertyAccess().getColonKeyword_1());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:852:1: ( (lv_value_2_0= ruleQObject ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:853:1: (lv_value_2_0= ruleQObject )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:853:1: (lv_value_2_0= ruleQObject )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:854:3: lv_value_2_0= ruleQObject
            {
             
            	        newCompositeNode(grammarAccess.getQObjectPropertyAccess().getValueQObjectParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQObject_in_ruleQObjectProperty2032);
            lv_value_2_0=ruleQObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQObjectPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"QObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQObjectProperty"


    // $ANTLR start "entryRuleQStringValueProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:878:1: entryRuleQStringValueProperty returns [EObject current=null] : iv_ruleQStringValueProperty= ruleQStringValueProperty EOF ;
    public final EObject entryRuleQStringValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQStringValueProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:879:2: (iv_ruleQStringValueProperty= ruleQStringValueProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:880:2: iv_ruleQStringValueProperty= ruleQStringValueProperty EOF
            {
             newCompositeNode(grammarAccess.getQStringValuePropertyRule()); 
            pushFollow(FOLLOW_ruleQStringValueProperty_in_entryRuleQStringValueProperty2068);
            iv_ruleQStringValueProperty=ruleQStringValueProperty();

            state._fsp--;

             current =iv_ruleQStringValueProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQStringValueProperty2078); 

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
    // $ANTLR end "entryRuleQStringValueProperty"


    // $ANTLR start "ruleQStringValueProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:887:1: ruleQStringValueProperty returns [EObject current=null] : ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleQStringValueProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:890:28: ( ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:891:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:891:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:891:2: ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:891:2: ( (lv_propertyName_0_0= RULE_ID ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:892:1: (lv_propertyName_0_0= RULE_ID )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:892:1: (lv_propertyName_0_0= RULE_ID )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:893:3: lv_propertyName_0_0= RULE_ID
            {
            lv_propertyName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQStringValueProperty2120); 

            			newLeafNode(lv_propertyName_0_0, grammarAccess.getQStringValuePropertyAccess().getPropertyNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQStringValuePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleQStringValueProperty2137); 

                	newLeafNode(otherlv_1, grammarAccess.getQStringValuePropertyAccess().getColonKeyword_1());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:913:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:914:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:914:1: (lv_value_2_0= RULE_STRING )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:915:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQStringValueProperty2154); 

            			newLeafNode(lv_value_2_0, grammarAccess.getQStringValuePropertyAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQStringValuePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQStringValueProperty"


    // $ANTLR start "entryRuleQNumberValueProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:939:1: entryRuleQNumberValueProperty returns [EObject current=null] : iv_ruleQNumberValueProperty= ruleQNumberValueProperty EOF ;
    public final EObject entryRuleQNumberValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQNumberValueProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:940:2: (iv_ruleQNumberValueProperty= ruleQNumberValueProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:941:2: iv_ruleQNumberValueProperty= ruleQNumberValueProperty EOF
            {
             newCompositeNode(grammarAccess.getQNumberValuePropertyRule()); 
            pushFollow(FOLLOW_ruleQNumberValueProperty_in_entryRuleQNumberValueProperty2195);
            iv_ruleQNumberValueProperty=ruleQNumberValueProperty();

            state._fsp--;

             current =iv_ruleQNumberValueProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNumberValueProperty2205); 

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
    // $ANTLR end "entryRuleQNumberValueProperty"


    // $ANTLR start "ruleQNumberValueProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:948:1: ruleQNumberValueProperty returns [EObject current=null] : ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleNumber ) ) ) ;
    public final EObject ruleQNumberValueProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:951:28: ( ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleNumber ) ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:952:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleNumber ) ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:952:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleNumber ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:952:2: ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleNumber ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:952:2: ( (lv_propertyName_0_0= RULE_ID ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:953:1: (lv_propertyName_0_0= RULE_ID )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:953:1: (lv_propertyName_0_0= RULE_ID )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:954:3: lv_propertyName_0_0= RULE_ID
            {
            lv_propertyName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNumberValueProperty2247); 

            			newLeafNode(lv_propertyName_0_0, grammarAccess.getQNumberValuePropertyAccess().getPropertyNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQNumberValuePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleQNumberValueProperty2264); 

                	newLeafNode(otherlv_1, grammarAccess.getQNumberValuePropertyAccess().getColonKeyword_1());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:974:1: ( (lv_value_2_0= ruleNumber ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:975:1: (lv_value_2_0= ruleNumber )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:975:1: (lv_value_2_0= ruleNumber )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:976:3: lv_value_2_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getQNumberValuePropertyAccess().getValueNumberParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleQNumberValueProperty2285);
            lv_value_2_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQNumberValuePropertyRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQNumberValueProperty"


    // $ANTLR start "entryRuleQBooleanValueProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1000:1: entryRuleQBooleanValueProperty returns [EObject current=null] : iv_ruleQBooleanValueProperty= ruleQBooleanValueProperty EOF ;
    public final EObject entryRuleQBooleanValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQBooleanValueProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1001:2: (iv_ruleQBooleanValueProperty= ruleQBooleanValueProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1002:2: iv_ruleQBooleanValueProperty= ruleQBooleanValueProperty EOF
            {
             newCompositeNode(grammarAccess.getQBooleanValuePropertyRule()); 
            pushFollow(FOLLOW_ruleQBooleanValueProperty_in_entryRuleQBooleanValueProperty2321);
            iv_ruleQBooleanValueProperty=ruleQBooleanValueProperty();

            state._fsp--;

             current =iv_ruleQBooleanValueProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQBooleanValueProperty2331); 

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
    // $ANTLR end "entryRuleQBooleanValueProperty"


    // $ANTLR start "ruleQBooleanValueProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1009:1: ruleQBooleanValueProperty returns [EObject current=null] : ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanValue ) ) ) ;
    public final EObject ruleQBooleanValueProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1012:28: ( ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanValue ) ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1013:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanValue ) ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1013:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanValue ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1013:2: ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleBooleanValue ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1013:2: ( (lv_propertyName_0_0= RULE_ID ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1014:1: (lv_propertyName_0_0= RULE_ID )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1014:1: (lv_propertyName_0_0= RULE_ID )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1015:3: lv_propertyName_0_0= RULE_ID
            {
            lv_propertyName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQBooleanValueProperty2373); 

            			newLeafNode(lv_propertyName_0_0, grammarAccess.getQBooleanValuePropertyAccess().getPropertyNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQBooleanValuePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleQBooleanValueProperty2390); 

                	newLeafNode(otherlv_1, grammarAccess.getQBooleanValuePropertyAccess().getColonKeyword_1());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1035:1: ( (lv_value_2_0= ruleBooleanValue ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1036:1: (lv_value_2_0= ruleBooleanValue )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1036:1: (lv_value_2_0= ruleBooleanValue )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1037:3: lv_value_2_0= ruleBooleanValue
            {
             
            	        newCompositeNode(grammarAccess.getQBooleanValuePropertyAccess().getValueBooleanValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanValue_in_ruleQBooleanValueProperty2411);
            lv_value_2_0=ruleBooleanValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQBooleanValuePropertyRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"BooleanValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQBooleanValueProperty"


    // $ANTLR start "entryRuleQNullValueProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1061:1: entryRuleQNullValueProperty returns [EObject current=null] : iv_ruleQNullValueProperty= ruleQNullValueProperty EOF ;
    public final EObject entryRuleQNullValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQNullValueProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1062:2: (iv_ruleQNullValueProperty= ruleQNullValueProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1063:2: iv_ruleQNullValueProperty= ruleQNullValueProperty EOF
            {
             newCompositeNode(grammarAccess.getQNullValuePropertyRule()); 
            pushFollow(FOLLOW_ruleQNullValueProperty_in_entryRuleQNullValueProperty2447);
            iv_ruleQNullValueProperty=ruleQNullValueProperty();

            state._fsp--;

             current =iv_ruleQNullValueProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNullValueProperty2457); 

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
    // $ANTLR end "entryRuleQNullValueProperty"


    // $ANTLR start "ruleQNullValueProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1070:1: ruleQNullValueProperty returns [EObject current=null] : ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'null' ) ;
    public final EObject ruleQNullValueProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1073:28: ( ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'null' ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1074:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'null' )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1074:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'null' )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1074:2: ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'null'
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1074:2: ( (lv_propertyName_0_0= RULE_ID ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1075:1: (lv_propertyName_0_0= RULE_ID )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1075:1: (lv_propertyName_0_0= RULE_ID )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1076:3: lv_propertyName_0_0= RULE_ID
            {
            lv_propertyName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNullValueProperty2499); 

            			newLeafNode(lv_propertyName_0_0, grammarAccess.getQNullValuePropertyAccess().getPropertyNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQNullValuePropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleQNullValueProperty2516); 

                	newLeafNode(otherlv_1, grammarAccess.getQNullValuePropertyAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleQNullValueProperty2528); 

                	newLeafNode(otherlv_2, grammarAccess.getQNullValuePropertyAccess().getNullKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQNullValueProperty"


    // $ANTLR start "entryRuleQObjectArrayProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1108:1: entryRuleQObjectArrayProperty returns [EObject current=null] : iv_ruleQObjectArrayProperty= ruleQObjectArrayProperty EOF ;
    public final EObject entryRuleQObjectArrayProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQObjectArrayProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1109:2: (iv_ruleQObjectArrayProperty= ruleQObjectArrayProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1110:2: iv_ruleQObjectArrayProperty= ruleQObjectArrayProperty EOF
            {
             newCompositeNode(grammarAccess.getQObjectArrayPropertyRule()); 
            pushFollow(FOLLOW_ruleQObjectArrayProperty_in_entryRuleQObjectArrayProperty2564);
            iv_ruleQObjectArrayProperty=ruleQObjectArrayProperty();

            state._fsp--;

             current =iv_ruleQObjectArrayProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQObjectArrayProperty2574); 

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
    // $ANTLR end "entryRuleQObjectArrayProperty"


    // $ANTLR start "ruleQObjectArrayProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1117:1: ruleQObjectArrayProperty returns [EObject current=null] : ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= ruleQObject ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleQObject ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleQObjectArrayProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_values_3_0 = null;

        EObject lv_values_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1120:28: ( ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= ruleQObject ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleQObject ) ) )* otherlv_6= ']' ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1121:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= ruleQObject ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleQObject ) ) )* otherlv_6= ']' )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1121:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= ruleQObject ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleQObject ) ) )* otherlv_6= ']' )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1121:2: ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= ruleQObject ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleQObject ) ) )* otherlv_6= ']'
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1121:2: ( (lv_propertyName_0_0= RULE_ID ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1122:1: (lv_propertyName_0_0= RULE_ID )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1122:1: (lv_propertyName_0_0= RULE_ID )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1123:3: lv_propertyName_0_0= RULE_ID
            {
            lv_propertyName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQObjectArrayProperty2616); 

            			newLeafNode(lv_propertyName_0_0, grammarAccess.getQObjectArrayPropertyAccess().getPropertyNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQObjectArrayPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleQObjectArrayProperty2633); 

                	newLeafNode(otherlv_1, grammarAccess.getQObjectArrayPropertyAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQObjectArrayProperty2645); 

                	newLeafNode(otherlv_2, grammarAccess.getQObjectArrayPropertyAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1147:1: ( (lv_values_3_0= ruleQObject ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1148:1: (lv_values_3_0= ruleQObject )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1148:1: (lv_values_3_0= ruleQObject )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1149:3: lv_values_3_0= ruleQObject
            {
             
            	        newCompositeNode(grammarAccess.getQObjectArrayPropertyAccess().getValuesQObjectParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQObject_in_ruleQObjectArrayProperty2666);
            lv_values_3_0=ruleQObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQObjectArrayPropertyRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"QObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1165:2: (otherlv_4= ',' ( (lv_values_5_0= ruleQObject ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1165:4: otherlv_4= ',' ( (lv_values_5_0= ruleQObject ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleQObjectArrayProperty2679); 

            	        	newLeafNode(otherlv_4, grammarAccess.getQObjectArrayPropertyAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1169:1: ( (lv_values_5_0= ruleQObject ) )
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1170:1: (lv_values_5_0= ruleQObject )
            	    {
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1170:1: (lv_values_5_0= ruleQObject )
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1171:3: lv_values_5_0= ruleQObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQObjectArrayPropertyAccess().getValuesQObjectParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQObject_in_ruleQObjectArrayProperty2700);
            	    lv_values_5_0=ruleQObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQObjectArrayPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_5_0, 
            	            		"QObject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleQObjectArrayProperty2714); 

                	newLeafNode(otherlv_6, grammarAccess.getQObjectArrayPropertyAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQObjectArrayProperty"


    // $ANTLR start "entryRuleQStringArrayProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1199:1: entryRuleQStringArrayProperty returns [EObject current=null] : iv_ruleQStringArrayProperty= ruleQStringArrayProperty EOF ;
    public final EObject entryRuleQStringArrayProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQStringArrayProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1200:2: (iv_ruleQStringArrayProperty= ruleQStringArrayProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1201:2: iv_ruleQStringArrayProperty= ruleQStringArrayProperty EOF
            {
             newCompositeNode(grammarAccess.getQStringArrayPropertyRule()); 
            pushFollow(FOLLOW_ruleQStringArrayProperty_in_entryRuleQStringArrayProperty2750);
            iv_ruleQStringArrayProperty=ruleQStringArrayProperty();

            state._fsp--;

             current =iv_ruleQStringArrayProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQStringArrayProperty2760); 

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
    // $ANTLR end "entryRuleQStringArrayProperty"


    // $ANTLR start "ruleQStringArrayProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1208:1: ruleQStringArrayProperty returns [EObject current=null] : ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleQStringArrayProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1211:28: ( ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= ']' ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1212:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= ']' )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1212:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= ']' )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1212:2: ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= ']'
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1212:2: ( (lv_propertyName_0_0= RULE_ID ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1213:1: (lv_propertyName_0_0= RULE_ID )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1213:1: (lv_propertyName_0_0= RULE_ID )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1214:3: lv_propertyName_0_0= RULE_ID
            {
            lv_propertyName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQStringArrayProperty2802); 

            			newLeafNode(lv_propertyName_0_0, grammarAccess.getQStringArrayPropertyAccess().getPropertyNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQStringArrayPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleQStringArrayProperty2819); 

                	newLeafNode(otherlv_1, grammarAccess.getQStringArrayPropertyAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQStringArrayProperty2831); 

                	newLeafNode(otherlv_2, grammarAccess.getQStringArrayPropertyAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1238:1: ( (lv_values_3_0= RULE_STRING ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1239:1: (lv_values_3_0= RULE_STRING )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1239:1: (lv_values_3_0= RULE_STRING )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1240:3: lv_values_3_0= RULE_STRING
            {
            lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQStringArrayProperty2848); 

            			newLeafNode(lv_values_3_0, grammarAccess.getQStringArrayPropertyAccess().getValuesSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQStringArrayPropertyRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1256:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1256:4: otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleQStringArrayProperty2866); 

            	        	newLeafNode(otherlv_4, grammarAccess.getQStringArrayPropertyAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1260:1: ( (lv_values_5_0= RULE_STRING ) )
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1261:1: (lv_values_5_0= RULE_STRING )
            	    {
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1261:1: (lv_values_5_0= RULE_STRING )
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1262:3: lv_values_5_0= RULE_STRING
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQStringArrayProperty2883); 

            	    			newLeafNode(lv_values_5_0, grammarAccess.getQStringArrayPropertyAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQStringArrayPropertyRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_5_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleQStringArrayProperty2902); 

                	newLeafNode(otherlv_6, grammarAccess.getQStringArrayPropertyAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQStringArrayProperty"


    // $ANTLR start "entryRuleQNumberArrayProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1290:1: entryRuleQNumberArrayProperty returns [EObject current=null] : iv_ruleQNumberArrayProperty= ruleQNumberArrayProperty EOF ;
    public final EObject entryRuleQNumberArrayProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQNumberArrayProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1291:2: (iv_ruleQNumberArrayProperty= ruleQNumberArrayProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1292:2: iv_ruleQNumberArrayProperty= ruleQNumberArrayProperty EOF
            {
             newCompositeNode(grammarAccess.getQNumberArrayPropertyRule()); 
            pushFollow(FOLLOW_ruleQNumberArrayProperty_in_entryRuleQNumberArrayProperty2938);
            iv_ruleQNumberArrayProperty=ruleQNumberArrayProperty();

            state._fsp--;

             current =iv_ruleQNumberArrayProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNumberArrayProperty2948); 

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
    // $ANTLR end "entryRuleQNumberArrayProperty"


    // $ANTLR start "ruleQNumberArrayProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1299:1: ruleQNumberArrayProperty returns [EObject current=null] : ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= ruleNumber ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleNumber ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleQNumberArrayProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_values_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1302:28: ( ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= ruleNumber ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleNumber ) ) )* otherlv_6= ']' ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1303:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= ruleNumber ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleNumber ) ) )* otherlv_6= ']' )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1303:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= ruleNumber ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleNumber ) ) )* otherlv_6= ']' )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1303:2: ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_values_3_0= ruleNumber ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleNumber ) ) )* otherlv_6= ']'
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1303:2: ( (lv_propertyName_0_0= RULE_ID ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1304:1: (lv_propertyName_0_0= RULE_ID )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1304:1: (lv_propertyName_0_0= RULE_ID )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1305:3: lv_propertyName_0_0= RULE_ID
            {
            lv_propertyName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNumberArrayProperty2990); 

            			newLeafNode(lv_propertyName_0_0, grammarAccess.getQNumberArrayPropertyAccess().getPropertyNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQNumberArrayPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleQNumberArrayProperty3007); 

                	newLeafNode(otherlv_1, grammarAccess.getQNumberArrayPropertyAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQNumberArrayProperty3019); 

                	newLeafNode(otherlv_2, grammarAccess.getQNumberArrayPropertyAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1329:1: ( (lv_values_3_0= ruleNumber ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1330:1: (lv_values_3_0= ruleNumber )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1330:1: (lv_values_3_0= ruleNumber )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1331:3: lv_values_3_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getQNumberArrayPropertyAccess().getValuesNumberParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleQNumberArrayProperty3040);
            lv_values_3_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQNumberArrayPropertyRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"Number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1347:2: (otherlv_4= ',' ( (lv_values_5_0= ruleNumber ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1347:4: otherlv_4= ',' ( (lv_values_5_0= ruleNumber ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleQNumberArrayProperty3053); 

            	        	newLeafNode(otherlv_4, grammarAccess.getQNumberArrayPropertyAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1351:1: ( (lv_values_5_0= ruleNumber ) )
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1352:1: (lv_values_5_0= ruleNumber )
            	    {
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1352:1: (lv_values_5_0= ruleNumber )
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1353:3: lv_values_5_0= ruleNumber
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQNumberArrayPropertyAccess().getValuesNumberParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNumber_in_ruleQNumberArrayProperty3074);
            	    lv_values_5_0=ruleNumber();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQNumberArrayPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_5_0, 
            	            		"Number");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleQNumberArrayProperty3088); 

                	newLeafNode(otherlv_6, grammarAccess.getQNumberArrayPropertyAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQNumberArrayProperty"


    // $ANTLR start "entryRuleQEmptyArrayProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1381:1: entryRuleQEmptyArrayProperty returns [EObject current=null] : iv_ruleQEmptyArrayProperty= ruleQEmptyArrayProperty EOF ;
    public final EObject entryRuleQEmptyArrayProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQEmptyArrayProperty = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1382:2: (iv_ruleQEmptyArrayProperty= ruleQEmptyArrayProperty EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1383:2: iv_ruleQEmptyArrayProperty= ruleQEmptyArrayProperty EOF
            {
             newCompositeNode(grammarAccess.getQEmptyArrayPropertyRule()); 
            pushFollow(FOLLOW_ruleQEmptyArrayProperty_in_entryRuleQEmptyArrayProperty3124);
            iv_ruleQEmptyArrayProperty=ruleQEmptyArrayProperty();

            state._fsp--;

             current =iv_ruleQEmptyArrayProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQEmptyArrayProperty3134); 

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
    // $ANTLR end "entryRuleQEmptyArrayProperty"


    // $ANTLR start "ruleQEmptyArrayProperty"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1390:1: ruleQEmptyArrayProperty returns [EObject current=null] : ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' otherlv_3= ']' ) ;
    public final EObject ruleQEmptyArrayProperty() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1393:28: ( ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' otherlv_3= ']' ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1394:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' otherlv_3= ']' )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1394:1: ( ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' otherlv_3= ']' )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1394:2: ( (lv_propertyName_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' otherlv_3= ']'
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1394:2: ( (lv_propertyName_0_0= RULE_ID ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1395:1: (lv_propertyName_0_0= RULE_ID )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1395:1: (lv_propertyName_0_0= RULE_ID )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1396:3: lv_propertyName_0_0= RULE_ID
            {
            lv_propertyName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQEmptyArrayProperty3176); 

            			newLeafNode(lv_propertyName_0_0, grammarAccess.getQEmptyArrayPropertyAccess().getPropertyNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQEmptyArrayPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"propertyName",
                    		lv_propertyName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleQEmptyArrayProperty3193); 

                	newLeafNode(otherlv_1, grammarAccess.getQEmptyArrayPropertyAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQEmptyArrayProperty3205); 

                	newLeafNode(otherlv_2, grammarAccess.getQEmptyArrayPropertyAccess().getLeftSquareBracketKeyword_2());
                
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleQEmptyArrayProperty3217); 

                	newLeafNode(otherlv_3, grammarAccess.getQEmptyArrayPropertyAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQEmptyArrayProperty"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1432:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1433:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1434:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3253);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue3263); 

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1441:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_true_0_0= 'true' ) ) | ( (lv_false_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_true_0_0=null;
        Token lv_false_1_0=null;

         enterRule(); 
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1444:28: ( ( ( (lv_true_0_0= 'true' ) ) | ( (lv_false_1_0= 'false' ) ) ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1445:1: ( ( (lv_true_0_0= 'true' ) ) | ( (lv_false_1_0= 'false' ) ) )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1445:1: ( ( (lv_true_0_0= 'true' ) ) | ( (lv_false_1_0= 'false' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            else if ( (LA17_0==24) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1445:2: ( (lv_true_0_0= 'true' ) )
                    {
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1445:2: ( (lv_true_0_0= 'true' ) )
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1446:1: (lv_true_0_0= 'true' )
                    {
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1446:1: (lv_true_0_0= 'true' )
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1447:3: lv_true_0_0= 'true'
                    {
                    lv_true_0_0=(Token)match(input,23,FOLLOW_23_in_ruleBooleanValue3306); 

                            newLeafNode(lv_true_0_0, grammarAccess.getBooleanValueAccess().getTrueTrueKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanValueRule());
                    	        }
                           		setWithLastConsumed(current, "true", true, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1461:6: ( (lv_false_1_0= 'false' ) )
                    {
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1461:6: ( (lv_false_1_0= 'false' ) )
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1462:1: (lv_false_1_0= 'false' )
                    {
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1462:1: (lv_false_1_0= 'false' )
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1463:3: lv_false_1_0= 'false'
                    {
                    lv_false_1_0=(Token)match(input,24,FOLLOW_24_in_ruleBooleanValue3343); 

                            newLeafNode(lv_false_1_0, grammarAccess.getBooleanValueAccess().getFalseFalseKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanValueRule());
                    	        }
                           		setWithLastConsumed(current, "false", true, "false");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleNumber"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1484:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1488:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1489:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber3399);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber3410); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1499:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_INT_8= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_8=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1503:28: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_INT_8= RULE_INT )? ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1504:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_INT_8= RULE_INT )? )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1504:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_INT_8= RULE_INT )? )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1504:2: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_INT_8= RULE_INT )?
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1504:2: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1505:2: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleNumber3453); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3470); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1517:1: (kw= '.' this_INT_3= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1518:2: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleNumber3489); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3504); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getNumberAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }

            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1530:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_INT_8= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=26 && LA22_0<=27)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1530:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_INT_8= RULE_INT
                    {
                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1530:4: (kw= 'e' | kw= 'E' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==26) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==27) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1531:2: kw= 'e'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleNumber3526); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_3_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1538:2: kw= 'E'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleNumber3545); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_3_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1543:2: (kw= '+' | kw= '-' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==28) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==16) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1544:2: kw= '+'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleNumber3560); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getPlusSignKeyword_3_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1551:2: kw= '-'
                            {
                            kw=(Token)match(input,16,FOLLOW_16_in_ruleNumber3579); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_3_1_1()); 
                                

                            }
                            break;

                    }

                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3595); 

                    		current.merge(this_INT_8);
                        
                     
                        newLeafNode(this_INT_8, grammarAccess.getNumberAccess().getINTTerminalRuleCall_3_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1574:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1578:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1579:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3653);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3664); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1589:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1593:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1594:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1594:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1594:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3708); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1601:1: (kw= '.' this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==25) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.iworkz.qon/src-gen/org/iworkz/qon/parser/antlr/internal/InternalQonDsl.g:1602:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleQualifiedName3727); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3742); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\15\uffff";
    static final String DFA13_eofS =
        "\15\uffff";
    static final String DFA13_minS =
        "\1\4\1\16\1\4\1\uffff\1\4\10\uffff";
    static final String DFA13_maxS =
        "\1\4\1\16\1\30\1\uffff\1\25\10\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\3\1\uffff\1\1\1\4\1\2\1\5\1\6\1\10\1\11\1\7";
    static final String DFA13_specialS =
        "\15\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1",
            "\1\2",
            "\1\10\1\5\1\7\4\uffff\1\10\4\uffff\1\7\2\uffff\1\4\2\uffff\1\6\2\3",
            "",
            "\1\14\1\11\1\12\4\uffff\1\14\4\uffff\1\12\4\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "720:1: (this_QStringValueProperty_0= ruleQStringValueProperty | this_QNumberValueProperty_1= ruleQNumberValueProperty | this_QBooleanValueProperty_2= ruleQBooleanValueProperty | this_QNullValueProperty_3= ruleQNullValueProperty | this_QObjectProperty_4= ruleQObjectProperty | this_QStringArrayProperty_5= ruleQStringArrayProperty | this_QObjectArrayProperty_6= ruleQObjectArrayProperty | this_QNumberArrayProperty_7= ruleQNumberArrayProperty | this_QEmptyArrayProperty_8= ruleQEmptyArrayProperty )";
        }
    }
 

    public static final BitSet FOLLOW_ruleQRoot_in_entryRuleQRoot75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQRoot85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQRoot139 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleQRoot152 = new BitSet(new long[]{0x000000000004B010L});
    public static final BitSet FOLLOW_ruleQSystemProperty_in_ruleQRoot173 = new BitSet(new long[]{0x000000000004B010L});
    public static final BitSet FOLLOW_ruleQProperty_in_ruleQRoot195 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleQRoot208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQObject_in_entryRuleQObject244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQObject254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQObject308 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleQObject321 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleQProperty_in_ruleQObject342 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleQObject355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQSystemProperty_in_entryRuleQSystemProperty391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQSystemProperty401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceProperty_in_ruleQSystemProperty448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaProperty_in_ruleQSystemProperty475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportProperty_in_ruleQSystemProperty502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceProperty_in_entryRuleNamespaceProperty537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceProperty547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleNamespaceProperty584 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNamespaceProperty596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNamespaceProperty613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaProperty_in_entryRuleSchemaProperty654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemaProperty664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSchemaProperty701 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSchemaProperty713 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSchemaProperty725 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSchemaProperty745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportProperty_in_entryRuleImportProperty781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportProperty791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImportProperty837 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImportProperty849 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleImportProperty861 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_ruleImport_in_ruleImportProperty883 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleImportProperty896 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleImport_in_ruleImportProperty917 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleImportProperty933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQProperty_in_entryRuleQProperty1060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQProperty1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQValueProperty_in_ruleQProperty1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQLinkProperty_in_ruleQProperty1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQLinkProperty_in_entryRuleQLinkProperty1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQLinkProperty1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQLinkObjectProperty_in_ruleQLinkProperty1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQLinkArrayProperty_in_ruleQLinkProperty1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQLinkObjectProperty_in_entryRuleQLinkObjectProperty1298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQLinkObjectProperty1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQLinkObjectProperty1350 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQLinkObjectProperty1367 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQLinkObjectProperty1379 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQLinkObjectProperty1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQLinkArrayProperty_in_entryRuleQLinkArrayProperty1435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQLinkArrayProperty1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQLinkArrayProperty1487 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQLinkArrayProperty1504 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQLinkArrayProperty1516 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQLinkArrayProperty1528 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQLinkArrayProperty1549 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleQLinkArrayProperty1562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQLinkArrayProperty1582 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleQLinkArrayProperty1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQValueProperty_in_entryRuleQValueProperty1634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQValueProperty1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQStringValueProperty_in_ruleQValueProperty1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNumberValueProperty_in_ruleQValueProperty1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQBooleanValueProperty_in_ruleQValueProperty1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNullValueProperty_in_ruleQValueProperty1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQObjectProperty_in_ruleQValueProperty1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQStringArrayProperty_in_ruleQValueProperty1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQObjectArrayProperty_in_ruleQValueProperty1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNumberArrayProperty_in_ruleQValueProperty1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQEmptyArrayProperty_in_ruleQValueProperty1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQObjectProperty_in_entryRuleQObjectProperty1942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQObjectProperty1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQObjectProperty1994 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQObjectProperty2011 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleQObject_in_ruleQObjectProperty2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQStringValueProperty_in_entryRuleQStringValueProperty2068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQStringValueProperty2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQStringValueProperty2120 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQStringValueProperty2137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQStringValueProperty2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNumberValueProperty_in_entryRuleQNumberValueProperty2195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNumberValueProperty2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNumberValueProperty2247 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQNumberValueProperty2264 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleQNumberValueProperty2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQBooleanValueProperty_in_entryRuleQBooleanValueProperty2321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQBooleanValueProperty2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQBooleanValueProperty2373 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQBooleanValueProperty2390 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleQBooleanValueProperty2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNullValueProperty_in_entryRuleQNullValueProperty2447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNullValueProperty2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNullValueProperty2499 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQNullValueProperty2516 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQNullValueProperty2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQObjectArrayProperty_in_entryRuleQObjectArrayProperty2564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQObjectArrayProperty2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQObjectArrayProperty2616 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQObjectArrayProperty2633 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQObjectArrayProperty2645 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleQObject_in_ruleQObjectArrayProperty2666 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleQObjectArrayProperty2679 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleQObject_in_ruleQObjectArrayProperty2700 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleQObjectArrayProperty2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQStringArrayProperty_in_entryRuleQStringArrayProperty2750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQStringArrayProperty2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQStringArrayProperty2802 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQStringArrayProperty2819 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQStringArrayProperty2831 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQStringArrayProperty2848 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleQStringArrayProperty2866 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQStringArrayProperty2883 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleQStringArrayProperty2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNumberArrayProperty_in_entryRuleQNumberArrayProperty2938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNumberArrayProperty2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNumberArrayProperty2990 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQNumberArrayProperty3007 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQNumberArrayProperty3019 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleQNumberArrayProperty3040 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleQNumberArrayProperty3053 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleQNumberArrayProperty3074 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleQNumberArrayProperty3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQEmptyArrayProperty_in_entryRuleQEmptyArrayProperty3124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQEmptyArrayProperty3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQEmptyArrayProperty3176 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQEmptyArrayProperty3193 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQEmptyArrayProperty3205 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQEmptyArrayProperty3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBooleanValue3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBooleanValue3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber3399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNumber3453 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3470 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_25_in_ruleNumber3489 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3504 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_ruleNumber3526 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_27_in_ruleNumber3545 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleNumber3560 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16_in_ruleNumber3579 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3708 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleQualifiedName3727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3742 = new BitSet(new long[]{0x0000000002000002L});

}