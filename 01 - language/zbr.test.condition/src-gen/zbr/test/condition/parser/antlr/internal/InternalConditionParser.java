package zbr.test.condition.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import zbr.test.condition.services.ConditionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConditionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'when'", "'('", "')'", "'do'", "'{'", "'}'", "'AND'", "'OR'", "'NOT'", "'TimeInterval'", "'to'", "'SessionInterval'", "'by'", "'Timeout'", "'MaxNumberOfOperation'", "'WeekDaysInterval'", "'MessageContent'", "'<='", "'>='", "'>'", "'<'", "'!='", "'=='", "'.'", "'Sunday'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Second'", "'Minute'", "'Hour'", "'Day'", "'Week'", "'Month'", "'Year'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalConditionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConditionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConditionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCondition.g"; }



     	private ConditionGrammarAccess grammarAccess;

        public InternalConditionParser(TokenStream input, ConditionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ConditionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCondition.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCondition.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalCondition.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCondition.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_condition_0_0= ruleCondition ) ) | ( (lv_conditionalExpression_1_0= ruleConditionalExpression ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_0_0 = null;

        EObject lv_conditionalExpression_1_0 = null;



        	enterRule();

        try {
            // InternalCondition.g:78:2: ( ( ( (lv_condition_0_0= ruleCondition ) ) | ( (lv_conditionalExpression_1_0= ruleConditionalExpression ) ) )* )
            // InternalCondition.g:79:2: ( ( (lv_condition_0_0= ruleCondition ) ) | ( (lv_conditionalExpression_1_0= ruleConditionalExpression ) ) )*
            {
            // InternalCondition.g:79:2: ( ( (lv_condition_0_0= ruleCondition ) ) | ( (lv_conditionalExpression_1_0= ruleConditionalExpression ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=19 && LA1_0<=20)||LA1_0==22||(LA1_0>=24 && LA1_0<=27)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==11||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCondition.g:80:3: ( (lv_condition_0_0= ruleCondition ) )
            	    {
            	    // InternalCondition.g:80:3: ( (lv_condition_0_0= ruleCondition ) )
            	    // InternalCondition.g:81:4: (lv_condition_0_0= ruleCondition )
            	    {
            	    // InternalCondition.g:81:4: (lv_condition_0_0= ruleCondition )
            	    // InternalCondition.g:82:5: lv_condition_0_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getConditionConditionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_condition_0_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"condition",
            	    						lv_condition_0_0,
            	    						"zbr.test.condition.Condition.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCondition.g:100:3: ( (lv_conditionalExpression_1_0= ruleConditionalExpression ) )
            	    {
            	    // InternalCondition.g:100:3: ( (lv_conditionalExpression_1_0= ruleConditionalExpression ) )
            	    // InternalCondition.g:101:4: (lv_conditionalExpression_1_0= ruleConditionalExpression )
            	    {
            	    // InternalCondition.g:101:4: (lv_conditionalExpression_1_0= ruleConditionalExpression )
            	    // InternalCondition.g:102:5: lv_conditionalExpression_1_0= ruleConditionalExpression
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getConditionalExpressionConditionalExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_conditionalExpression_1_0=ruleConditionalExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditionalExpression",
            	    						lv_conditionalExpression_1_0,
            	    						"zbr.test.condition.Condition.ConditionalExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConditionalExpression"
    // InternalCondition.g:123:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // InternalCondition.g:123:62: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // InternalCondition.g:124:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;

             current =iv_ruleConditionalExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCondition.g:130:1: ruleConditionalExpression returns [EObject current=null] : ( ( (lv_beforeSymbol_0_0= ruleLogicalOpeartor ) )? otherlv_1= 'when' otherlv_2= '(' ( (lv_conditionParam_3_0= ruleCondition ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' ( (lv_aftetrSymbol_9_0= ruleLogicalOpeartor ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_beforeSymbol_0_0 = null;

        EObject lv_conditionParam_3_0 = null;

        EObject lv_condition_7_0 = null;

        EObject lv_aftetrSymbol_9_0 = null;



        	enterRule();

        try {
            // InternalCondition.g:136:2: ( ( ( (lv_beforeSymbol_0_0= ruleLogicalOpeartor ) )? otherlv_1= 'when' otherlv_2= '(' ( (lv_conditionParam_3_0= ruleCondition ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' ( (lv_aftetrSymbol_9_0= ruleLogicalOpeartor ) )? ) )
            // InternalCondition.g:137:2: ( ( (lv_beforeSymbol_0_0= ruleLogicalOpeartor ) )? otherlv_1= 'when' otherlv_2= '(' ( (lv_conditionParam_3_0= ruleCondition ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' ( (lv_aftetrSymbol_9_0= ruleLogicalOpeartor ) )? )
            {
            // InternalCondition.g:137:2: ( ( (lv_beforeSymbol_0_0= ruleLogicalOpeartor ) )? otherlv_1= 'when' otherlv_2= '(' ( (lv_conditionParam_3_0= ruleCondition ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' ( (lv_aftetrSymbol_9_0= ruleLogicalOpeartor ) )? )
            // InternalCondition.g:138:3: ( (lv_beforeSymbol_0_0= ruleLogicalOpeartor ) )? otherlv_1= 'when' otherlv_2= '(' ( (lv_conditionParam_3_0= ruleCondition ) ) otherlv_4= ')' otherlv_5= 'do' otherlv_6= '{' ( (lv_condition_7_0= ruleCondition ) ) otherlv_8= '}' ( (lv_aftetrSymbol_9_0= ruleLogicalOpeartor ) )?
            {
            // InternalCondition.g:138:3: ( (lv_beforeSymbol_0_0= ruleLogicalOpeartor ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=17 && LA2_0<=18)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCondition.g:139:4: (lv_beforeSymbol_0_0= ruleLogicalOpeartor )
                    {
                    // InternalCondition.g:139:4: (lv_beforeSymbol_0_0= ruleLogicalOpeartor )
                    // InternalCondition.g:140:5: lv_beforeSymbol_0_0= ruleLogicalOpeartor
                    {

                    					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getBeforeSymbolLogicalOpeartorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_beforeSymbol_0_0=ruleLogicalOpeartor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    					}
                    					set(
                    						current,
                    						"beforeSymbol",
                    						lv_beforeSymbol_0_0,
                    						"zbr.test.condition.Condition.LogicalOpeartor");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalExpressionAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalExpressionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCondition.g:165:3: ( (lv_conditionParam_3_0= ruleCondition ) )
            // InternalCondition.g:166:4: (lv_conditionParam_3_0= ruleCondition )
            {
            // InternalCondition.g:166:4: (lv_conditionParam_3_0= ruleCondition )
            // InternalCondition.g:167:5: lv_conditionParam_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getConditionParamConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_conditionParam_3_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
            					}
            					set(
            						current,
            						"conditionParam",
            						lv_conditionParam_3_0,
            						"zbr.test.condition.Condition.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalExpressionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionalExpressionAccess().getDoKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionalExpressionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalCondition.g:196:3: ( (lv_condition_7_0= ruleCondition ) )
            // InternalCondition.g:197:4: (lv_condition_7_0= ruleCondition )
            {
            // InternalCondition.g:197:4: (lv_condition_7_0= ruleCondition )
            // InternalCondition.g:198:5: lv_condition_7_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getConditionConditionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_condition_7_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_7_0,
            						"zbr.test.condition.Condition.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getConditionalExpressionAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalCondition.g:219:3: ( (lv_aftetrSymbol_9_0= ruleLogicalOpeartor ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCondition.g:220:4: (lv_aftetrSymbol_9_0= ruleLogicalOpeartor )
                    {
                    // InternalCondition.g:220:4: (lv_aftetrSymbol_9_0= ruleLogicalOpeartor )
                    // InternalCondition.g:221:5: lv_aftetrSymbol_9_0= ruleLogicalOpeartor
                    {

                    					newCompositeNode(grammarAccess.getConditionalExpressionAccess().getAftetrSymbolLogicalOpeartorParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_aftetrSymbol_9_0=ruleLogicalOpeartor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    					}
                    					set(
                    						current,
                    						"aftetrSymbol",
                    						lv_aftetrSymbol_9_0,
                    						"zbr.test.condition.Condition.LogicalOpeartor");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
        }
        return current;
    }
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleLogicalOpeartor"
    // InternalCondition.g:242:1: entryRuleLogicalOpeartor returns [EObject current=null] : iv_ruleLogicalOpeartor= ruleLogicalOpeartor EOF ;
    public final EObject entryRuleLogicalOpeartor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOpeartor = null;


        try {
            // InternalCondition.g:242:56: (iv_ruleLogicalOpeartor= ruleLogicalOpeartor EOF )
            // InternalCondition.g:243:2: iv_ruleLogicalOpeartor= ruleLogicalOpeartor EOF
            {
             newCompositeNode(grammarAccess.getLogicalOpeartorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOpeartor=ruleLogicalOpeartor();

            state._fsp--;

             current =iv_ruleLogicalOpeartor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogicalOpeartor"


    // $ANTLR start "ruleLogicalOpeartor"
    // InternalCondition.g:249:1: ruleLogicalOpeartor returns [EObject current=null] : ( ( (lv_symbol_0_0= 'AND' ) ) | ( (lv_symbol_1_0= 'OR' ) ) ) ;
    public final EObject ruleLogicalOpeartor() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;


        	enterRule();

        try {
            // InternalCondition.g:255:2: ( ( ( (lv_symbol_0_0= 'AND' ) ) | ( (lv_symbol_1_0= 'OR' ) ) ) )
            // InternalCondition.g:256:2: ( ( (lv_symbol_0_0= 'AND' ) ) | ( (lv_symbol_1_0= 'OR' ) ) )
            {
            // InternalCondition.g:256:2: ( ( (lv_symbol_0_0= 'AND' ) ) | ( (lv_symbol_1_0= 'OR' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCondition.g:257:3: ( (lv_symbol_0_0= 'AND' ) )
                    {
                    // InternalCondition.g:257:3: ( (lv_symbol_0_0= 'AND' ) )
                    // InternalCondition.g:258:4: (lv_symbol_0_0= 'AND' )
                    {
                    // InternalCondition.g:258:4: (lv_symbol_0_0= 'AND' )
                    // InternalCondition.g:259:5: lv_symbol_0_0= 'AND'
                    {
                    lv_symbol_0_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_0, grammarAccess.getLogicalOpeartorAccess().getSymbolANDKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOpeartorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_0, "AND");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCondition.g:272:3: ( (lv_symbol_1_0= 'OR' ) )
                    {
                    // InternalCondition.g:272:3: ( (lv_symbol_1_0= 'OR' ) )
                    // InternalCondition.g:273:4: (lv_symbol_1_0= 'OR' )
                    {
                    // InternalCondition.g:273:4: (lv_symbol_1_0= 'OR' )
                    // InternalCondition.g:274:5: lv_symbol_1_0= 'OR'
                    {
                    lv_symbol_1_0=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_symbol_1_0, grammarAccess.getLogicalOpeartorAccess().getSymbolORKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOpeartorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_1_0, "OR");
                    				

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
    // $ANTLR end "ruleLogicalOpeartor"


    // $ANTLR start "entryRuleCondition"
    // InternalCondition.g:290:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalCondition.g:290:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalCondition.g:291:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalCondition.g:297:1: ruleCondition returns [EObject current=null] : this_CompositeCondition_0= ruleCompositeCondition ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeCondition_0 = null;



        	enterRule();

        try {
            // InternalCondition.g:303:2: (this_CompositeCondition_0= ruleCompositeCondition )
            // InternalCondition.g:304:2: this_CompositeCondition_0= ruleCompositeCondition
            {

            		newCompositeNode(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CompositeCondition_0=ruleCompositeCondition();

            state._fsp--;


            		current = this_CompositeCondition_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // InternalCondition.g:315:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // InternalCondition.g:315:59: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // InternalCondition.g:316:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
             newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;

             current =iv_ruleCompositeCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // InternalCondition.g:322:1: ruleCompositeCondition returns [EObject current=null] : (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        EObject this_Negation_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalCondition.g:328:2: ( (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* ) )
            // InternalCondition.g:329:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            {
            // InternalCondition.g:329:2: (this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )* )
            // InternalCondition.g:330:3: this_Negation_0= ruleNegation ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompositeConditionAccess().getNegationParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Negation_0=ruleNegation();

            state._fsp--;


            			current = this_Negation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCondition.g:338:3: ( () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==12||(LA6_2>=19 && LA6_2<=20)||LA6_2==22||(LA6_2>=24 && LA6_2<=27)) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==18) ) {
                    int LA6_3 = input.LA(2);

                    if ( (LA6_3==12||(LA6_3>=19 && LA6_3<=20)||LA6_3==22||(LA6_3>=24 && LA6_3<=27)) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalCondition.g:339:4: () ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) ) ( (lv_right_4_0= ruleNegation ) )
            	    {
            	    // InternalCondition.g:339:4: ()
            	    // InternalCondition.g:340:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompositeConditionAccess().getBinaryTermOperatorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCondition.g:346:4: ( ( (lv_symbol_2_0= 'AND' ) ) | ( (lv_symbol_3_0= 'OR' ) ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==17) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==18) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalCondition.g:347:5: ( (lv_symbol_2_0= 'AND' ) )
            	            {
            	            // InternalCondition.g:347:5: ( (lv_symbol_2_0= 'AND' ) )
            	            // InternalCondition.g:348:6: (lv_symbol_2_0= 'AND' )
            	            {
            	            // InternalCondition.g:348:6: (lv_symbol_2_0= 'AND' )
            	            // InternalCondition.g:349:7: lv_symbol_2_0= 'AND'
            	            {
            	            lv_symbol_2_0=(Token)match(input,17,FOLLOW_6); 

            	            							newLeafNode(lv_symbol_2_0, grammarAccess.getCompositeConditionAccess().getSymbolANDKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompositeConditionRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_2_0, "AND");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCondition.g:362:5: ( (lv_symbol_3_0= 'OR' ) )
            	            {
            	            // InternalCondition.g:362:5: ( (lv_symbol_3_0= 'OR' ) )
            	            // InternalCondition.g:363:6: (lv_symbol_3_0= 'OR' )
            	            {
            	            // InternalCondition.g:363:6: (lv_symbol_3_0= 'OR' )
            	            // InternalCondition.g:364:7: lv_symbol_3_0= 'OR'
            	            {
            	            lv_symbol_3_0=(Token)match(input,18,FOLLOW_6); 

            	            							newLeafNode(lv_symbol_3_0, grammarAccess.getCompositeConditionAccess().getSymbolORKeyword_1_1_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompositeConditionRule());
            	            							}
            	            							setWithLastConsumed(current, "symbol", lv_symbol_3_0, "OR");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalCondition.g:377:4: ( (lv_right_4_0= ruleNegation ) )
            	    // InternalCondition.g:378:5: (lv_right_4_0= ruleNegation )
            	    {
            	    // InternalCondition.g:378:5: (lv_right_4_0= ruleNegation )
            	    // InternalCondition.g:379:6: lv_right_4_0= ruleNegation
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeConditionAccess().getRightNegationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_4_0=ruleNegation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"zbr.test.condition.Condition.Negation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
        }
        return current;
    }
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleNegation"
    // InternalCondition.g:401:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalCondition.g:401:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalCondition.g:402:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalCondition.g:408:1: ruleNegation returns [EObject current=null] : (this_Term_0= ruleTerm | ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_condition_3_0= ruleTerm ) ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_2_0=null;
        EObject this_Term_0 = null;

        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalCondition.g:414:2: ( (this_Term_0= ruleTerm | ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_condition_3_0= ruleTerm ) ) ) ) )
            // InternalCondition.g:415:2: (this_Term_0= ruleTerm | ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_condition_3_0= ruleTerm ) ) ) )
            {
            // InternalCondition.g:415:2: (this_Term_0= ruleTerm | ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_condition_3_0= ruleTerm ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12||LA7_0==20||LA7_0==22||(LA7_0>=24 && LA7_0<=27)) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCondition.g:416:3: this_Term_0= ruleTerm
                    {

                    			newCompositeNode(grammarAccess.getNegationAccess().getTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Term_0=ruleTerm();

                    state._fsp--;


                    			current = this_Term_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCondition.g:425:3: ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_condition_3_0= ruleTerm ) ) )
                    {
                    // InternalCondition.g:425:3: ( () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_condition_3_0= ruleTerm ) ) )
                    // InternalCondition.g:426:4: () ( (lv_symbol_2_0= 'NOT' ) ) ( (lv_condition_3_0= ruleTerm ) )
                    {
                    // InternalCondition.g:426:4: ()
                    // InternalCondition.g:427:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNegationAccess().getUnaryTermOperatorAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCondition.g:433:4: ( (lv_symbol_2_0= 'NOT' ) )
                    // InternalCondition.g:434:5: (lv_symbol_2_0= 'NOT' )
                    {
                    // InternalCondition.g:434:5: (lv_symbol_2_0= 'NOT' )
                    // InternalCondition.g:435:6: lv_symbol_2_0= 'NOT'
                    {
                    lv_symbol_2_0=(Token)match(input,19,FOLLOW_12); 

                    						newLeafNode(lv_symbol_2_0, grammarAccess.getNegationAccess().getSymbolNOTKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNegationRule());
                    						}
                    						setWithLastConsumed(current, "symbol", lv_symbol_2_0, "NOT");
                    					

                    }


                    }

                    // InternalCondition.g:447:4: ( (lv_condition_3_0= ruleTerm ) )
                    // InternalCondition.g:448:5: (lv_condition_3_0= ruleTerm )
                    {
                    // InternalCondition.g:448:5: (lv_condition_3_0= ruleTerm )
                    // InternalCondition.g:449:6: lv_condition_3_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getNegationAccess().getConditionTermParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_3_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNegationRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"zbr.test.condition.Condition.Term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleTerm"
    // InternalCondition.g:471:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalCondition.g:471:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalCondition.g:472:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalCondition.g:478:1: ruleTerm returns [EObject current=null] : ( (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' ) | this_SessionInterval_3= ruleSessionInterval | this_WeekDaysInterval_4= ruleWeekDaysInterval | this_TimeInterval_5= ruleTimeInterval | this_Timeout_6= ruleTimeout | this_MaxNumberOfOperation_7= ruleMaxNumberOfOperation | this_MessageContent_8= ruleMessageContent ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Condition_1 = null;

        EObject this_SessionInterval_3 = null;

        EObject this_WeekDaysInterval_4 = null;

        EObject this_TimeInterval_5 = null;

        EObject this_Timeout_6 = null;

        EObject this_MaxNumberOfOperation_7 = null;

        EObject this_MessageContent_8 = null;



        	enterRule();

        try {
            // InternalCondition.g:484:2: ( ( (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' ) | this_SessionInterval_3= ruleSessionInterval | this_WeekDaysInterval_4= ruleWeekDaysInterval | this_TimeInterval_5= ruleTimeInterval | this_Timeout_6= ruleTimeout | this_MaxNumberOfOperation_7= ruleMaxNumberOfOperation | this_MessageContent_8= ruleMessageContent ) )
            // InternalCondition.g:485:2: ( (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' ) | this_SessionInterval_3= ruleSessionInterval | this_WeekDaysInterval_4= ruleWeekDaysInterval | this_TimeInterval_5= ruleTimeInterval | this_Timeout_6= ruleTimeout | this_MaxNumberOfOperation_7= ruleMaxNumberOfOperation | this_MessageContent_8= ruleMessageContent )
            {
            // InternalCondition.g:485:2: ( (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' ) | this_SessionInterval_3= ruleSessionInterval | this_WeekDaysInterval_4= ruleWeekDaysInterval | this_TimeInterval_5= ruleTimeInterval | this_Timeout_6= ruleTimeout | this_MaxNumberOfOperation_7= ruleMaxNumberOfOperation | this_MessageContent_8= ruleMessageContent )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            case 25:
                {
                alt8=6;
                }
                break;
            case 27:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCondition.g:486:3: (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' )
                    {
                    // InternalCondition.g:486:3: (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' )
                    // InternalCondition.g:487:4: otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getTermAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTermAccess().getConditionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_Condition_1=ruleCondition();

                    state._fsp--;


                    				current = this_Condition_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTermAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCondition.g:505:3: this_SessionInterval_3= ruleSessionInterval
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getSessionIntervalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SessionInterval_3=ruleSessionInterval();

                    state._fsp--;


                    			current = this_SessionInterval_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCondition.g:514:3: this_WeekDaysInterval_4= ruleWeekDaysInterval
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getWeekDaysIntervalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WeekDaysInterval_4=ruleWeekDaysInterval();

                    state._fsp--;


                    			current = this_WeekDaysInterval_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCondition.g:523:3: this_TimeInterval_5= ruleTimeInterval
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getTimeIntervalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeInterval_5=ruleTimeInterval();

                    state._fsp--;


                    			current = this_TimeInterval_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCondition.g:532:3: this_Timeout_6= ruleTimeout
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getTimeoutParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Timeout_6=ruleTimeout();

                    state._fsp--;


                    			current = this_Timeout_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCondition.g:541:3: this_MaxNumberOfOperation_7= ruleMaxNumberOfOperation
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getMaxNumberOfOperationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxNumberOfOperation_7=ruleMaxNumberOfOperation();

                    state._fsp--;


                    			current = this_MaxNumberOfOperation_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCondition.g:550:3: this_MessageContent_8= ruleMessageContent
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getMessageContentParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageContent_8=ruleMessageContent();

                    state._fsp--;


                    			current = this_MessageContent_8;
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleTimeInterval"
    // InternalCondition.g:562:1: entryRuleTimeInterval returns [EObject current=null] : iv_ruleTimeInterval= ruleTimeInterval EOF ;
    public final EObject entryRuleTimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeInterval = null;


        try {
            // InternalCondition.g:562:53: (iv_ruleTimeInterval= ruleTimeInterval EOF )
            // InternalCondition.g:563:2: iv_ruleTimeInterval= ruleTimeInterval EOF
            {
             newCompositeNode(grammarAccess.getTimeIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeInterval=ruleTimeInterval();

            state._fsp--;

             current =iv_ruleTimeInterval; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimeInterval"


    // $ANTLR start "ruleTimeInterval"
    // InternalCondition.g:569:1: ruleTimeInterval returns [EObject current=null] : (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleTimeInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_start_2_0=null;
        Token otherlv_3=null;
        Token lv_end_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCondition.g:575:2: ( (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalCondition.g:576:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalCondition.g:576:2: (otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalCondition.g:577:3: otherlv_0= 'TimeInterval' otherlv_1= '(' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeIntervalAccess().getTimeIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCondition.g:585:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalCondition.g:586:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalCondition.g:586:4: (lv_start_2_0= RULE_STRING )
            // InternalCondition.g:587:5: lv_start_2_0= RULE_STRING
            {
            lv_start_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_start_2_0, grammarAccess.getTimeIntervalAccess().getStartSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeIntervalAccess().getToKeyword_3());
            		
            // InternalCondition.g:607:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalCondition.g:608:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalCondition.g:608:4: (lv_end_4_0= RULE_STRING )
            // InternalCondition.g:609:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_end_4_0, grammarAccess.getTimeIntervalAccess().getEndSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeIntervalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTimeIntervalAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleTimeInterval"


    // $ANTLR start "entryRuleSessionInterval"
    // InternalCondition.g:633:1: entryRuleSessionInterval returns [EObject current=null] : iv_ruleSessionInterval= ruleSessionInterval EOF ;
    public final EObject entryRuleSessionInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSessionInterval = null;


        try {
            // InternalCondition.g:633:56: (iv_ruleSessionInterval= ruleSessionInterval EOF )
            // InternalCondition.g:634:2: iv_ruleSessionInterval= ruleSessionInterval EOF
            {
             newCompositeNode(grammarAccess.getSessionIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSessionInterval=ruleSessionInterval();

            state._fsp--;

             current =iv_ruleSessionInterval; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSessionInterval"


    // $ANTLR start "ruleSessionInterval"
    // InternalCondition.g:640:1: ruleSessionInterval returns [EObject current=null] : ( ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' ) | ( (otherlv_12= 'SessionInterval' otherlv_13= '(' ( (lv_frequency_14_0= RULE_INT ) ) ( (lv_timeUnit_15_0= ruleTimeUnit ) ) otherlv_16= 'by' ( (lv_value_17_0= RULE_STRING ) ) ) otherlv_18= ')' ) ) ;
    public final EObject ruleSessionInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_frequency_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_frequency_9_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_frequency_14_0=null;
        Token otherlv_16=null;
        Token lv_value_17_0=null;
        Token otherlv_18=null;
        Enumerator lv_timeUnit_3_0 = null;

        EObject lv_messagecontent_5_0 = null;

        Enumerator lv_timeUnit_10_0 = null;

        Enumerator lv_timeUnit_15_0 = null;



        	enterRule();

        try {
            // InternalCondition.g:646:2: ( ( ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' ) | ( (otherlv_12= 'SessionInterval' otherlv_13= '(' ( (lv_frequency_14_0= RULE_INT ) ) ( (lv_timeUnit_15_0= ruleTimeUnit ) ) otherlv_16= 'by' ( (lv_value_17_0= RULE_STRING ) ) ) otherlv_18= ')' ) ) )
            // InternalCondition.g:647:2: ( ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' ) | ( (otherlv_12= 'SessionInterval' otherlv_13= '(' ( (lv_frequency_14_0= RULE_INT ) ) ( (lv_timeUnit_15_0= ruleTimeUnit ) ) otherlv_16= 'by' ( (lv_value_17_0= RULE_STRING ) ) ) otherlv_18= ')' ) )
            {
            // InternalCondition.g:647:2: ( ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' ) | ( (otherlv_12= 'SessionInterval' otherlv_13= '(' ( (lv_frequency_14_0= RULE_INT ) ) ( (lv_timeUnit_15_0= ruleTimeUnit ) ) otherlv_16= 'by' ( (lv_value_17_0= RULE_STRING ) ) ) otherlv_18= ')' ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalCondition.g:648:3: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' )
                    {
                    // InternalCondition.g:648:3: ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' )
                    // InternalCondition.g:649:4: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')'
                    {
                    // InternalCondition.g:649:4: (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) )
                    // InternalCondition.g:650:5: otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_5); 

                    					newLeafNode(otherlv_0, grammarAccess.getSessionIntervalAccess().getSessionIntervalKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,12,FOLLOW_15); 

                    					newLeafNode(otherlv_1, grammarAccess.getSessionIntervalAccess().getLeftParenthesisKeyword_0_0_1());
                    				
                    // InternalCondition.g:658:5: ( (lv_frequency_2_0= RULE_INT ) )
                    // InternalCondition.g:659:6: (lv_frequency_2_0= RULE_INT )
                    {
                    // InternalCondition.g:659:6: (lv_frequency_2_0= RULE_INT )
                    // InternalCondition.g:660:7: lv_frequency_2_0= RULE_INT
                    {
                    lv_frequency_2_0=(Token)match(input,RULE_INT,FOLLOW_16); 

                    							newLeafNode(lv_frequency_2_0, grammarAccess.getSessionIntervalAccess().getFrequencyINTTerminalRuleCall_0_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSessionIntervalRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"frequency",
                    								lv_frequency_2_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    // InternalCondition.g:676:5: ( (lv_timeUnit_3_0= ruleTimeUnit ) )
                    // InternalCondition.g:677:6: (lv_timeUnit_3_0= ruleTimeUnit )
                    {
                    // InternalCondition.g:677:6: (lv_timeUnit_3_0= ruleTimeUnit )
                    // InternalCondition.g:678:7: lv_timeUnit_3_0= ruleTimeUnit
                    {

                    							newCompositeNode(grammarAccess.getSessionIntervalAccess().getTimeUnitTimeUnitEnumRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_17);
                    lv_timeUnit_3_0=ruleTimeUnit();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSessionIntervalRule());
                    							}
                    							set(
                    								current,
                    								"timeUnit",
                    								lv_timeUnit_3_0,
                    								"zbr.test.condition.Condition.TimeUnit");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getSessionIntervalAccess().getByKeyword_0_0_4());
                    				
                    // InternalCondition.g:699:5: ( (lv_messagecontent_5_0= ruleMessageContent ) )
                    // InternalCondition.g:700:6: (lv_messagecontent_5_0= ruleMessageContent )
                    {
                    // InternalCondition.g:700:6: (lv_messagecontent_5_0= ruleMessageContent )
                    // InternalCondition.g:701:7: lv_messagecontent_5_0= ruleMessageContent
                    {

                    							newCompositeNode(grammarAccess.getSessionIntervalAccess().getMessagecontentMessageContentParserRuleCall_0_0_5_0());
                    						
                    pushFollow(FOLLOW_7);
                    lv_messagecontent_5_0=ruleMessageContent();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSessionIntervalRule());
                    							}
                    							set(
                    								current,
                    								"messagecontent",
                    								lv_messagecontent_5_0,
                    								"zbr.test.condition.Condition.MessageContent");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSessionIntervalAccess().getRightParenthesisKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCondition.g:725:3: (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' )
                    {
                    // InternalCondition.g:725:3: (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' )
                    // InternalCondition.g:726:4: otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getSessionIntervalAccess().getSessionIntervalKeyword_1_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getSessionIntervalAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalCondition.g:734:4: ( (lv_frequency_9_0= RULE_INT ) )
                    // InternalCondition.g:735:5: (lv_frequency_9_0= RULE_INT )
                    {
                    // InternalCondition.g:735:5: (lv_frequency_9_0= RULE_INT )
                    // InternalCondition.g:736:6: lv_frequency_9_0= RULE_INT
                    {
                    lv_frequency_9_0=(Token)match(input,RULE_INT,FOLLOW_16); 

                    						newLeafNode(lv_frequency_9_0, grammarAccess.getSessionIntervalAccess().getFrequencyINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSessionIntervalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"frequency",
                    							lv_frequency_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalCondition.g:752:4: ( (lv_timeUnit_10_0= ruleTimeUnit ) )
                    // InternalCondition.g:753:5: (lv_timeUnit_10_0= ruleTimeUnit )
                    {
                    // InternalCondition.g:753:5: (lv_timeUnit_10_0= ruleTimeUnit )
                    // InternalCondition.g:754:6: lv_timeUnit_10_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getSessionIntervalAccess().getTimeUnitTimeUnitEnumRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_timeUnit_10_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSessionIntervalRule());
                    						}
                    						set(
                    							current,
                    							"timeUnit",
                    							lv_timeUnit_10_0,
                    							"zbr.test.condition.Condition.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getSessionIntervalAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCondition.g:777:3: ( (otherlv_12= 'SessionInterval' otherlv_13= '(' ( (lv_frequency_14_0= RULE_INT ) ) ( (lv_timeUnit_15_0= ruleTimeUnit ) ) otherlv_16= 'by' ( (lv_value_17_0= RULE_STRING ) ) ) otherlv_18= ')' )
                    {
                    // InternalCondition.g:777:3: ( (otherlv_12= 'SessionInterval' otherlv_13= '(' ( (lv_frequency_14_0= RULE_INT ) ) ( (lv_timeUnit_15_0= ruleTimeUnit ) ) otherlv_16= 'by' ( (lv_value_17_0= RULE_STRING ) ) ) otherlv_18= ')' )
                    // InternalCondition.g:778:4: (otherlv_12= 'SessionInterval' otherlv_13= '(' ( (lv_frequency_14_0= RULE_INT ) ) ( (lv_timeUnit_15_0= ruleTimeUnit ) ) otherlv_16= 'by' ( (lv_value_17_0= RULE_STRING ) ) ) otherlv_18= ')'
                    {
                    // InternalCondition.g:778:4: (otherlv_12= 'SessionInterval' otherlv_13= '(' ( (lv_frequency_14_0= RULE_INT ) ) ( (lv_timeUnit_15_0= ruleTimeUnit ) ) otherlv_16= 'by' ( (lv_value_17_0= RULE_STRING ) ) )
                    // InternalCondition.g:779:5: otherlv_12= 'SessionInterval' otherlv_13= '(' ( (lv_frequency_14_0= RULE_INT ) ) ( (lv_timeUnit_15_0= ruleTimeUnit ) ) otherlv_16= 'by' ( (lv_value_17_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_5); 

                    					newLeafNode(otherlv_12, grammarAccess.getSessionIntervalAccess().getSessionIntervalKeyword_2_0_0());
                    				
                    otherlv_13=(Token)match(input,12,FOLLOW_15); 

                    					newLeafNode(otherlv_13, grammarAccess.getSessionIntervalAccess().getLeftParenthesisKeyword_2_0_1());
                    				
                    // InternalCondition.g:787:5: ( (lv_frequency_14_0= RULE_INT ) )
                    // InternalCondition.g:788:6: (lv_frequency_14_0= RULE_INT )
                    {
                    // InternalCondition.g:788:6: (lv_frequency_14_0= RULE_INT )
                    // InternalCondition.g:789:7: lv_frequency_14_0= RULE_INT
                    {
                    lv_frequency_14_0=(Token)match(input,RULE_INT,FOLLOW_16); 

                    							newLeafNode(lv_frequency_14_0, grammarAccess.getSessionIntervalAccess().getFrequencyINTTerminalRuleCall_2_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSessionIntervalRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"frequency",
                    								lv_frequency_14_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    // InternalCondition.g:805:5: ( (lv_timeUnit_15_0= ruleTimeUnit ) )
                    // InternalCondition.g:806:6: (lv_timeUnit_15_0= ruleTimeUnit )
                    {
                    // InternalCondition.g:806:6: (lv_timeUnit_15_0= ruleTimeUnit )
                    // InternalCondition.g:807:7: lv_timeUnit_15_0= ruleTimeUnit
                    {

                    							newCompositeNode(grammarAccess.getSessionIntervalAccess().getTimeUnitTimeUnitEnumRuleCall_2_0_3_0());
                    						
                    pushFollow(FOLLOW_17);
                    lv_timeUnit_15_0=ruleTimeUnit();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSessionIntervalRule());
                    							}
                    							set(
                    								current,
                    								"timeUnit",
                    								lv_timeUnit_15_0,
                    								"zbr.test.condition.Condition.TimeUnit");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_16=(Token)match(input,23,FOLLOW_13); 

                    					newLeafNode(otherlv_16, grammarAccess.getSessionIntervalAccess().getByKeyword_2_0_4());
                    				
                    // InternalCondition.g:828:5: ( (lv_value_17_0= RULE_STRING ) )
                    // InternalCondition.g:829:6: (lv_value_17_0= RULE_STRING )
                    {
                    // InternalCondition.g:829:6: (lv_value_17_0= RULE_STRING )
                    // InternalCondition.g:830:7: lv_value_17_0= RULE_STRING
                    {
                    lv_value_17_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    							newLeafNode(lv_value_17_0, grammarAccess.getSessionIntervalAccess().getValueSTRINGTerminalRuleCall_2_0_5_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSessionIntervalRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_17_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }

                    otherlv_18=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getSessionIntervalAccess().getRightParenthesisKeyword_2_1());
                    			

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
    // $ANTLR end "ruleSessionInterval"


    // $ANTLR start "entryRuleTimeout"
    // InternalCondition.g:856:1: entryRuleTimeout returns [EObject current=null] : iv_ruleTimeout= ruleTimeout EOF ;
    public final EObject entryRuleTimeout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeout = null;


        try {
            // InternalCondition.g:856:48: (iv_ruleTimeout= ruleTimeout EOF )
            // InternalCondition.g:857:2: iv_ruleTimeout= ruleTimeout EOF
            {
             newCompositeNode(grammarAccess.getTimeoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeout=ruleTimeout();

            state._fsp--;

             current =iv_ruleTimeout; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimeout"


    // $ANTLR start "ruleTimeout"
    // InternalCondition.g:863:1: ruleTimeout returns [EObject current=null] : (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleTimeout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCondition.g:869:2: ( (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalCondition.g:870:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalCondition.g:870:2: (otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalCondition.g:871:3: otherlv_0= 'Timeout' otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutAccess().getTimeoutKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeoutAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCondition.g:879:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalCondition.g:880:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalCondition.g:880:4: (lv_value_2_0= RULE_STRING )
            // InternalCondition.g:881:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTimeoutAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeoutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeoutAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleTimeout"


    // $ANTLR start "entryRuleMaxNumberOfOperation"
    // InternalCondition.g:905:1: entryRuleMaxNumberOfOperation returns [EObject current=null] : iv_ruleMaxNumberOfOperation= ruleMaxNumberOfOperation EOF ;
    public final EObject entryRuleMaxNumberOfOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxNumberOfOperation = null;


        try {
            // InternalCondition.g:905:61: (iv_ruleMaxNumberOfOperation= ruleMaxNumberOfOperation EOF )
            // InternalCondition.g:906:2: iv_ruleMaxNumberOfOperation= ruleMaxNumberOfOperation EOF
            {
             newCompositeNode(grammarAccess.getMaxNumberOfOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxNumberOfOperation=ruleMaxNumberOfOperation();

            state._fsp--;

             current =iv_ruleMaxNumberOfOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMaxNumberOfOperation"


    // $ANTLR start "ruleMaxNumberOfOperation"
    // InternalCondition.g:912:1: ruleMaxNumberOfOperation returns [EObject current=null] : (otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' ) ;
    public final EObject ruleMaxNumberOfOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_operationsNumber_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_timeUnit_4_0 = null;



        	enterRule();

        try {
            // InternalCondition.g:918:2: ( (otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' ) )
            // InternalCondition.g:919:2: (otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' )
            {
            // InternalCondition.g:919:2: (otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')' )
            // InternalCondition.g:920:3: otherlv_0= 'MaxNumberOfOperation' otherlv_1= '(' ( (lv_operationsNumber_2_0= RULE_INT ) ) otherlv_3= 'by' ( (lv_timeUnit_4_0= ruleTimeUnit ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxNumberOfOperationAccess().getMaxNumberOfOperationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxNumberOfOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCondition.g:928:3: ( (lv_operationsNumber_2_0= RULE_INT ) )
            // InternalCondition.g:929:4: (lv_operationsNumber_2_0= RULE_INT )
            {
            // InternalCondition.g:929:4: (lv_operationsNumber_2_0= RULE_INT )
            // InternalCondition.g:930:5: lv_operationsNumber_2_0= RULE_INT
            {
            lv_operationsNumber_2_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_operationsNumber_2_0, grammarAccess.getMaxNumberOfOperationAccess().getOperationsNumberINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxNumberOfOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operationsNumber",
            						lv_operationsNumber_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getMaxNumberOfOperationAccess().getByKeyword_3());
            		
            // InternalCondition.g:950:3: ( (lv_timeUnit_4_0= ruleTimeUnit ) )
            // InternalCondition.g:951:4: (lv_timeUnit_4_0= ruleTimeUnit )
            {
            // InternalCondition.g:951:4: (lv_timeUnit_4_0= ruleTimeUnit )
            // InternalCondition.g:952:5: lv_timeUnit_4_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getMaxNumberOfOperationAccess().getTimeUnitTimeUnitEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_timeUnit_4_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxNumberOfOperationRule());
            					}
            					set(
            						current,
            						"timeUnit",
            						lv_timeUnit_4_0,
            						"zbr.test.condition.Condition.TimeUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMaxNumberOfOperationAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleMaxNumberOfOperation"


    // $ANTLR start "entryRuleWeekDaysInterval"
    // InternalCondition.g:977:1: entryRuleWeekDaysInterval returns [EObject current=null] : iv_ruleWeekDaysInterval= ruleWeekDaysInterval EOF ;
    public final EObject entryRuleWeekDaysInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeekDaysInterval = null;


        try {
            // InternalCondition.g:977:57: (iv_ruleWeekDaysInterval= ruleWeekDaysInterval EOF )
            // InternalCondition.g:978:2: iv_ruleWeekDaysInterval= ruleWeekDaysInterval EOF
            {
             newCompositeNode(grammarAccess.getWeekDaysIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWeekDaysInterval=ruleWeekDaysInterval();

            state._fsp--;

             current =iv_ruleWeekDaysInterval; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWeekDaysInterval"


    // $ANTLR start "ruleWeekDaysInterval"
    // InternalCondition.g:984:1: ruleWeekDaysInterval returns [EObject current=null] : (otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) ;
    public final EObject ruleWeekDaysInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_start_2_0 = null;

        Enumerator lv_end_4_0 = null;



        	enterRule();

        try {
            // InternalCondition.g:990:2: ( (otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' ) )
            // InternalCondition.g:991:2: (otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            {
            // InternalCondition.g:991:2: (otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')' )
            // InternalCondition.g:992:3: otherlv_0= 'WeekDaysInterval' otherlv_1= '(' ( (lv_start_2_0= ruleWeekDay ) ) otherlv_3= 'to' ( (lv_end_4_0= ruleWeekDay ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWeekDaysIntervalAccess().getWeekDaysIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getWeekDaysIntervalAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCondition.g:1000:3: ( (lv_start_2_0= ruleWeekDay ) )
            // InternalCondition.g:1001:4: (lv_start_2_0= ruleWeekDay )
            {
            // InternalCondition.g:1001:4: (lv_start_2_0= ruleWeekDay )
            // InternalCondition.g:1002:5: lv_start_2_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getWeekDaysIntervalAccess().getStartWeekDayEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_start_2_0=ruleWeekDay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWeekDaysIntervalRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_2_0,
            						"zbr.test.condition.Condition.WeekDay");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getWeekDaysIntervalAccess().getToKeyword_3());
            		
            // InternalCondition.g:1023:3: ( (lv_end_4_0= ruleWeekDay ) )
            // InternalCondition.g:1024:4: (lv_end_4_0= ruleWeekDay )
            {
            // InternalCondition.g:1024:4: (lv_end_4_0= ruleWeekDay )
            // InternalCondition.g:1025:5: lv_end_4_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getWeekDaysIntervalAccess().getEndWeekDayEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_end_4_0=ruleWeekDay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWeekDaysIntervalRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_4_0,
            						"zbr.test.condition.Condition.WeekDay");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWeekDaysIntervalAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleWeekDaysInterval"


    // $ANTLR start "entryRuleMessageContent"
    // InternalCondition.g:1050:1: entryRuleMessageContent returns [EObject current=null] : iv_ruleMessageContent= ruleMessageContent EOF ;
    public final EObject entryRuleMessageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageContent = null;


        try {
            // InternalCondition.g:1050:55: (iv_ruleMessageContent= ruleMessageContent EOF )
            // InternalCondition.g:1051:2: iv_ruleMessageContent= ruleMessageContent EOF
            {
             newCompositeNode(grammarAccess.getMessageContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageContent=ruleMessageContent();

            state._fsp--;

             current =iv_ruleMessageContent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMessageContent"


    // $ANTLR start "ruleMessageContent"
    // InternalCondition.g:1057:1: ruleMessageContent returns [EObject current=null] : ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_comparisonOperator_13_0= ruleComparisonOperator ) ) ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= ')' ) | (otherlv_16= 'MessageContent' otherlv_17= '(' ( (lv_content_18_0= RULE_STRING ) ) ( (lv_comparisonOperator_19_0= ruleComparisonOperator ) ) ( (lv_value_20_0= RULE_STRING ) ) otherlv_21= 'by' ( (lv_timeUnit_22_0= ruleTimeUnit ) ) otherlv_23= ')' ) ) ;
    public final EObject ruleMessageContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_content_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_content_12_0=null;
        Token lv_value_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_content_18_0=null;
        Token lv_value_20_0=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Enumerator lv_timeUnit_8_0 = null;

        EObject lv_comparisonOperator_13_0 = null;

        EObject lv_comparisonOperator_19_0 = null;

        Enumerator lv_timeUnit_22_0 = null;



        	enterRule();

        try {
            // InternalCondition.g:1063:2: ( ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_comparisonOperator_13_0= ruleComparisonOperator ) ) ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= ')' ) | (otherlv_16= 'MessageContent' otherlv_17= '(' ( (lv_content_18_0= RULE_STRING ) ) ( (lv_comparisonOperator_19_0= ruleComparisonOperator ) ) ( (lv_value_20_0= RULE_STRING ) ) otherlv_21= 'by' ( (lv_timeUnit_22_0= ruleTimeUnit ) ) otherlv_23= ')' ) ) )
            // InternalCondition.g:1064:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_comparisonOperator_13_0= ruleComparisonOperator ) ) ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= ')' ) | (otherlv_16= 'MessageContent' otherlv_17= '(' ( (lv_content_18_0= RULE_STRING ) ) ( (lv_comparisonOperator_19_0= ruleComparisonOperator ) ) ( (lv_value_20_0= RULE_STRING ) ) otherlv_21= 'by' ( (lv_timeUnit_22_0= ruleTimeUnit ) ) otherlv_23= ')' ) )
            {
            // InternalCondition.g:1064:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_comparisonOperator_13_0= ruleComparisonOperator ) ) ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= ')' ) | (otherlv_16= 'MessageContent' otherlv_17= '(' ( (lv_content_18_0= RULE_STRING ) ) ( (lv_comparisonOperator_19_0= ruleComparisonOperator ) ) ( (lv_value_20_0= RULE_STRING ) ) otherlv_21= 'by' ( (lv_timeUnit_22_0= ruleTimeUnit ) ) otherlv_23= ')' ) )
            int alt10=4;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalCondition.g:1065:3: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    {
                    // InternalCondition.g:1065:3: (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' )
                    // InternalCondition.g:1066:4: otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getMessageContentAccess().getMessageContentKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalCondition.g:1074:4: ( (lv_content_2_0= RULE_STRING ) )
                    // InternalCondition.g:1075:5: (lv_content_2_0= RULE_STRING )
                    {
                    // InternalCondition.g:1075:5: (lv_content_2_0= RULE_STRING )
                    // InternalCondition.g:1076:6: lv_content_2_0= RULE_STRING
                    {
                    lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_content_2_0, grammarAccess.getMessageContentAccess().getContentSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCondition.g:1098:3: (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' )
                    {
                    // InternalCondition.g:1098:3: (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' )
                    // InternalCondition.g:1099:4: otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMessageContentAccess().getMessageContentKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalCondition.g:1107:4: ( (lv_content_6_0= RULE_STRING ) )
                    // InternalCondition.g:1108:5: (lv_content_6_0= RULE_STRING )
                    {
                    // InternalCondition.g:1108:5: (lv_content_6_0= RULE_STRING )
                    // InternalCondition.g:1109:6: lv_content_6_0= RULE_STRING
                    {
                    lv_content_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_content_6_0, grammarAccess.getMessageContentAccess().getContentSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getMessageContentAccess().getByKeyword_1_3());
                    			
                    // InternalCondition.g:1129:4: ( (lv_timeUnit_8_0= ruleTimeUnit ) )
                    // InternalCondition.g:1130:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    {
                    // InternalCondition.g:1130:5: (lv_timeUnit_8_0= ruleTimeUnit )
                    // InternalCondition.g:1131:6: lv_timeUnit_8_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getTimeUnitTimeUnitEnumRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_timeUnit_8_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                    						}
                    						set(
                    							current,
                    							"timeUnit",
                    							lv_timeUnit_8_0,
                    							"zbr.test.condition.Condition.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_1_5());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCondition.g:1154:3: (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_comparisonOperator_13_0= ruleComparisonOperator ) ) ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= ')' )
                    {
                    // InternalCondition.g:1154:3: (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_comparisonOperator_13_0= ruleComparisonOperator ) ) ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= ')' )
                    // InternalCondition.g:1155:4: otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_comparisonOperator_13_0= ruleComparisonOperator ) ) ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getMessageContentAccess().getMessageContentKeyword_2_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalCondition.g:1163:4: ( (lv_content_12_0= RULE_STRING ) )
                    // InternalCondition.g:1164:5: (lv_content_12_0= RULE_STRING )
                    {
                    // InternalCondition.g:1164:5: (lv_content_12_0= RULE_STRING )
                    // InternalCondition.g:1165:6: lv_content_12_0= RULE_STRING
                    {
                    lv_content_12_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_content_12_0, grammarAccess.getMessageContentAccess().getContentSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalCondition.g:1181:4: ( (lv_comparisonOperator_13_0= ruleComparisonOperator ) )
                    // InternalCondition.g:1182:5: (lv_comparisonOperator_13_0= ruleComparisonOperator )
                    {
                    // InternalCondition.g:1182:5: (lv_comparisonOperator_13_0= ruleComparisonOperator )
                    // InternalCondition.g:1183:6: lv_comparisonOperator_13_0= ruleComparisonOperator
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getComparisonOperatorComparisonOperatorParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_comparisonOperator_13_0=ruleComparisonOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                    						}
                    						set(
                    							current,
                    							"comparisonOperator",
                    							lv_comparisonOperator_13_0,
                    							"zbr.test.condition.Condition.ComparisonOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCondition.g:1200:4: ( (lv_value_14_0= RULE_STRING ) )
                    // InternalCondition.g:1201:5: (lv_value_14_0= RULE_STRING )
                    {
                    // InternalCondition.g:1201:5: (lv_value_14_0= RULE_STRING )
                    // InternalCondition.g:1202:6: lv_value_14_0= RULE_STRING
                    {
                    lv_value_14_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_value_14_0, grammarAccess.getMessageContentAccess().getValueSTRINGTerminalRuleCall_2_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_2_5());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCondition.g:1224:3: (otherlv_16= 'MessageContent' otherlv_17= '(' ( (lv_content_18_0= RULE_STRING ) ) ( (lv_comparisonOperator_19_0= ruleComparisonOperator ) ) ( (lv_value_20_0= RULE_STRING ) ) otherlv_21= 'by' ( (lv_timeUnit_22_0= ruleTimeUnit ) ) otherlv_23= ')' )
                    {
                    // InternalCondition.g:1224:3: (otherlv_16= 'MessageContent' otherlv_17= '(' ( (lv_content_18_0= RULE_STRING ) ) ( (lv_comparisonOperator_19_0= ruleComparisonOperator ) ) ( (lv_value_20_0= RULE_STRING ) ) otherlv_21= 'by' ( (lv_timeUnit_22_0= ruleTimeUnit ) ) otherlv_23= ')' )
                    // InternalCondition.g:1225:4: otherlv_16= 'MessageContent' otherlv_17= '(' ( (lv_content_18_0= RULE_STRING ) ) ( (lv_comparisonOperator_19_0= ruleComparisonOperator ) ) ( (lv_value_20_0= RULE_STRING ) ) otherlv_21= 'by' ( (lv_timeUnit_22_0= ruleTimeUnit ) ) otherlv_23= ')'
                    {
                    otherlv_16=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getMessageContentAccess().getMessageContentKeyword_3_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getMessageContentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalCondition.g:1233:4: ( (lv_content_18_0= RULE_STRING ) )
                    // InternalCondition.g:1234:5: (lv_content_18_0= RULE_STRING )
                    {
                    // InternalCondition.g:1234:5: (lv_content_18_0= RULE_STRING )
                    // InternalCondition.g:1235:6: lv_content_18_0= RULE_STRING
                    {
                    lv_content_18_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_content_18_0, grammarAccess.getMessageContentAccess().getContentSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_18_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalCondition.g:1251:4: ( (lv_comparisonOperator_19_0= ruleComparisonOperator ) )
                    // InternalCondition.g:1252:5: (lv_comparisonOperator_19_0= ruleComparisonOperator )
                    {
                    // InternalCondition.g:1252:5: (lv_comparisonOperator_19_0= ruleComparisonOperator )
                    // InternalCondition.g:1253:6: lv_comparisonOperator_19_0= ruleComparisonOperator
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getComparisonOperatorComparisonOperatorParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_comparisonOperator_19_0=ruleComparisonOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                    						}
                    						set(
                    							current,
                    							"comparisonOperator",
                    							lv_comparisonOperator_19_0,
                    							"zbr.test.condition.Condition.ComparisonOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCondition.g:1270:4: ( (lv_value_20_0= RULE_STRING ) )
                    // InternalCondition.g:1271:5: (lv_value_20_0= RULE_STRING )
                    {
                    // InternalCondition.g:1271:5: (lv_value_20_0= RULE_STRING )
                    // InternalCondition.g:1272:6: lv_value_20_0= RULE_STRING
                    {
                    lv_value_20_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_value_20_0, grammarAccess.getMessageContentAccess().getValueSTRINGTerminalRuleCall_3_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageContentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_20_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_21, grammarAccess.getMessageContentAccess().getByKeyword_3_5());
                    			
                    // InternalCondition.g:1292:4: ( (lv_timeUnit_22_0= ruleTimeUnit ) )
                    // InternalCondition.g:1293:5: (lv_timeUnit_22_0= ruleTimeUnit )
                    {
                    // InternalCondition.g:1293:5: (lv_timeUnit_22_0= ruleTimeUnit )
                    // InternalCondition.g:1294:6: lv_timeUnit_22_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getMessageContentAccess().getTimeUnitTimeUnitEnumRuleCall_3_6_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_timeUnit_22_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageContentRule());
                    						}
                    						set(
                    							current,
                    							"timeUnit",
                    							lv_timeUnit_22_0,
                    							"zbr.test.condition.Condition.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getMessageContentAccess().getRightParenthesisKeyword_3_7());
                    			

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
    // $ANTLR end "ruleMessageContent"


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalCondition.g:1320:1: entryRuleComparisonOperator returns [EObject current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final EObject entryRuleComparisonOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperator = null;


        try {
            // InternalCondition.g:1320:59: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // InternalCondition.g:1321:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperator=ruleComparisonOperator();

            state._fsp--;

             current =iv_ruleComparisonOperator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalCondition.g:1327:1: ruleComparisonOperator returns [EObject current=null] : ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) ;
    public final EObject ruleComparisonOperator() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;
        Token lv_symbol_2_0=null;
        Token lv_symbol_3_0=null;
        Token lv_symbol_4_0=null;
        Token lv_symbol_5_0=null;


        	enterRule();

        try {
            // InternalCondition.g:1333:2: ( ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) ) )
            // InternalCondition.g:1334:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            {
            // InternalCondition.g:1334:2: ( ( (lv_symbol_0_0= '<=' ) ) | ( (lv_symbol_1_0= '>=' ) ) | ( (lv_symbol_2_0= '>' ) ) | ( (lv_symbol_3_0= '<' ) ) | ( (lv_symbol_4_0= '!=' ) ) | ( (lv_symbol_5_0= '==' ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            case 31:
                {
                alt11=4;
                }
                break;
            case 32:
                {
                alt11=5;
                }
                break;
            case 33:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCondition.g:1335:3: ( (lv_symbol_0_0= '<=' ) )
                    {
                    // InternalCondition.g:1335:3: ( (lv_symbol_0_0= '<=' ) )
                    // InternalCondition.g:1336:4: (lv_symbol_0_0= '<=' )
                    {
                    // InternalCondition.g:1336:4: (lv_symbol_0_0= '<=' )
                    // InternalCondition.g:1337:5: lv_symbol_0_0= '<='
                    {
                    lv_symbol_0_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_symbol_0_0, grammarAccess.getComparisonOperatorAccess().getSymbolLessThanSignEqualsSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_0_0, "<=");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCondition.g:1350:3: ( (lv_symbol_1_0= '>=' ) )
                    {
                    // InternalCondition.g:1350:3: ( (lv_symbol_1_0= '>=' ) )
                    // InternalCondition.g:1351:4: (lv_symbol_1_0= '>=' )
                    {
                    // InternalCondition.g:1351:4: (lv_symbol_1_0= '>=' )
                    // InternalCondition.g:1352:5: lv_symbol_1_0= '>='
                    {
                    lv_symbol_1_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_symbol_1_0, grammarAccess.getComparisonOperatorAccess().getSymbolGreaterThanSignEqualsSignKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_1_0, ">=");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCondition.g:1365:3: ( (lv_symbol_2_0= '>' ) )
                    {
                    // InternalCondition.g:1365:3: ( (lv_symbol_2_0= '>' ) )
                    // InternalCondition.g:1366:4: (lv_symbol_2_0= '>' )
                    {
                    // InternalCondition.g:1366:4: (lv_symbol_2_0= '>' )
                    // InternalCondition.g:1367:5: lv_symbol_2_0= '>'
                    {
                    lv_symbol_2_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_symbol_2_0, grammarAccess.getComparisonOperatorAccess().getSymbolGreaterThanSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_2_0, ">");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCondition.g:1380:3: ( (lv_symbol_3_0= '<' ) )
                    {
                    // InternalCondition.g:1380:3: ( (lv_symbol_3_0= '<' ) )
                    // InternalCondition.g:1381:4: (lv_symbol_3_0= '<' )
                    {
                    // InternalCondition.g:1381:4: (lv_symbol_3_0= '<' )
                    // InternalCondition.g:1382:5: lv_symbol_3_0= '<'
                    {
                    lv_symbol_3_0=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_symbol_3_0, grammarAccess.getComparisonOperatorAccess().getSymbolLessThanSignKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_3_0, "<");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalCondition.g:1395:3: ( (lv_symbol_4_0= '!=' ) )
                    {
                    // InternalCondition.g:1395:3: ( (lv_symbol_4_0= '!=' ) )
                    // InternalCondition.g:1396:4: (lv_symbol_4_0= '!=' )
                    {
                    // InternalCondition.g:1396:4: (lv_symbol_4_0= '!=' )
                    // InternalCondition.g:1397:5: lv_symbol_4_0= '!='
                    {
                    lv_symbol_4_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_symbol_4_0, grammarAccess.getComparisonOperatorAccess().getSymbolExclamationMarkEqualsSignKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_4_0, "!=");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalCondition.g:1410:3: ( (lv_symbol_5_0= '==' ) )
                    {
                    // InternalCondition.g:1410:3: ( (lv_symbol_5_0= '==' ) )
                    // InternalCondition.g:1411:4: (lv_symbol_5_0= '==' )
                    {
                    // InternalCondition.g:1411:4: (lv_symbol_5_0= '==' )
                    // InternalCondition.g:1412:5: lv_symbol_5_0= '=='
                    {
                    lv_symbol_5_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_symbol_5_0, grammarAccess.getComparisonOperatorAccess().getSymbolEqualsSignEqualsSignKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "symbol", lv_symbol_5_0, "==");
                    				

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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCondition.g:1428:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCondition.g:1428:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCondition.g:1429:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCondition.g:1435:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCondition.g:1441:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCondition.g:1442:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCondition.g:1442:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCondition.g:1443:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalCondition.g:1450:3: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCondition.g:1451:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_21); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
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
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleWeekDay"
    // InternalCondition.g:1468:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) ;
    public final Enumerator ruleWeekDay() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalCondition.g:1474:2: ( ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) )
            // InternalCondition.g:1475:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            {
            // InternalCondition.g:1475:2: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt13=1;
                }
                break;
            case 36:
                {
                alt13=2;
                }
                break;
            case 37:
                {
                alt13=3;
                }
                break;
            case 38:
                {
                alt13=4;
                }
                break;
            case 39:
                {
                alt13=5;
                }
                break;
            case 40:
                {
                alt13=6;
                }
                break;
            case 41:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalCondition.g:1476:3: (enumLiteral_0= 'Sunday' )
                    {
                    // InternalCondition.g:1476:3: (enumLiteral_0= 'Sunday' )
                    // InternalCondition.g:1477:4: enumLiteral_0= 'Sunday'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getSUNDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCondition.g:1484:3: (enumLiteral_1= 'Monday' )
                    {
                    // InternalCondition.g:1484:3: (enumLiteral_1= 'Monday' )
                    // InternalCondition.g:1485:4: enumLiteral_1= 'Monday'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getMONDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCondition.g:1492:3: (enumLiteral_2= 'Tuesday' )
                    {
                    // InternalCondition.g:1492:3: (enumLiteral_2= 'Tuesday' )
                    // InternalCondition.g:1493:4: enumLiteral_2= 'Tuesday'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getTUESDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCondition.g:1500:3: (enumLiteral_3= 'Wednesday' )
                    {
                    // InternalCondition.g:1500:3: (enumLiteral_3= 'Wednesday' )
                    // InternalCondition.g:1501:4: enumLiteral_3= 'Wednesday'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getWEDNESDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCondition.g:1508:3: (enumLiteral_4= 'Thursday' )
                    {
                    // InternalCondition.g:1508:3: (enumLiteral_4= 'Thursday' )
                    // InternalCondition.g:1509:4: enumLiteral_4= 'Thursday'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getTHURSDAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCondition.g:1516:3: (enumLiteral_5= 'Friday' )
                    {
                    // InternalCondition.g:1516:3: (enumLiteral_5= 'Friday' )
                    // InternalCondition.g:1517:4: enumLiteral_5= 'Friday'
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getFRIDAYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCondition.g:1524:3: (enumLiteral_6= 'Saturday' )
                    {
                    // InternalCondition.g:1524:3: (enumLiteral_6= 'Saturday' )
                    // InternalCondition.g:1525:4: enumLiteral_6= 'Saturday'
                    {
                    enumLiteral_6=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSATURDAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getWeekDayAccess().getSATURDAYEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleWeekDay"


    // $ANTLR start "ruleTimeUnit"
    // InternalCondition.g:1535:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalCondition.g:1541:2: ( ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) )
            // InternalCondition.g:1542:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            {
            // InternalCondition.g:1542:2: ( (enumLiteral_0= 'Second' ) | (enumLiteral_1= 'Minute' ) | (enumLiteral_2= 'Hour' ) | (enumLiteral_3= 'Day' ) | (enumLiteral_4= 'Week' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt14=1;
                }
                break;
            case 43:
                {
                alt14=2;
                }
                break;
            case 44:
                {
                alt14=3;
                }
                break;
            case 45:
                {
                alt14=4;
                }
                break;
            case 46:
                {
                alt14=5;
                }
                break;
            case 47:
                {
                alt14=6;
                }
                break;
            case 48:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCondition.g:1543:3: (enumLiteral_0= 'Second' )
                    {
                    // InternalCondition.g:1543:3: (enumLiteral_0= 'Second' )
                    // InternalCondition.g:1544:4: enumLiteral_0= 'Second'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCondition.g:1551:3: (enumLiteral_1= 'Minute' )
                    {
                    // InternalCondition.g:1551:3: (enumLiteral_1= 'Minute' )
                    // InternalCondition.g:1552:4: enumLiteral_1= 'Minute'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCondition.g:1559:3: (enumLiteral_2= 'Hour' )
                    {
                    // InternalCondition.g:1559:3: (enumLiteral_2= 'Hour' )
                    // InternalCondition.g:1560:4: enumLiteral_2= 'Hour'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCondition.g:1567:3: (enumLiteral_3= 'Day' )
                    {
                    // InternalCondition.g:1567:3: (enumLiteral_3= 'Day' )
                    // InternalCondition.g:1568:4: enumLiteral_3= 'Day'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCondition.g:1575:3: (enumLiteral_4= 'Week' )
                    {
                    // InternalCondition.g:1575:3: (enumLiteral_4= 'Week' )
                    // InternalCondition.g:1576:4: enumLiteral_4= 'Week'
                    {
                    enumLiteral_4=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCondition.g:1583:3: (enumLiteral_5= 'Month' )
                    {
                    // InternalCondition.g:1583:3: (enumLiteral_5= 'Month' )
                    // InternalCondition.g:1584:4: enumLiteral_5= 'Month'
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTimeUnitAccess().getMONTHEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCondition.g:1591:3: (enumLiteral_6= 'Year' )
                    {
                    // InternalCondition.g:1591:3: (enumLiteral_6= 'Year' )
                    // InternalCondition.g:1592:4: enumLiteral_6= 'Year'
                    {
                    enumLiteral_6=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getYEAREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTimeUnitAccess().getYEAREnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleTimeUnit"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\26\1\14\1\5\1\52\7\15\1\4\3\uffff";
    static final String dfa_3s = "\1\26\1\14\1\5\1\60\7\27\1\33\3\uffff";
    static final String dfa_4s = "\14\uffff\1\2\1\3\1\1";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\14\11\uffff\1\13",
            "\1\14\11\uffff\1\13",
            "\1\14\11\uffff\1\13",
            "\1\14\11\uffff\1\13",
            "\1\14\11\uffff\1\13",
            "\1\14\11\uffff\1\13",
            "\1\14\11\uffff\1\13",
            "\1\15\26\uffff\1\16",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "647:2: ( ( (otherlv_0= 'SessionInterval' otherlv_1= '(' ( (lv_frequency_2_0= RULE_INT ) ) ( (lv_timeUnit_3_0= ruleTimeUnit ) ) otherlv_4= 'by' ( (lv_messagecontent_5_0= ruleMessageContent ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SessionInterval' otherlv_8= '(' ( (lv_frequency_9_0= RULE_INT ) ) ( (lv_timeUnit_10_0= ruleTimeUnit ) ) otherlv_11= ')' ) | ( (otherlv_12= 'SessionInterval' otherlv_13= '(' ( (lv_frequency_14_0= RULE_INT ) ) ( (lv_timeUnit_15_0= ruleTimeUnit ) ) otherlv_16= 'by' ( (lv_value_17_0= RULE_STRING ) ) ) otherlv_18= ')' ) )";
        }
    }
    static final String dfa_7s = "\1\33\1\14\1\4\1\15\1\uffff\6\4\1\uffff\1\15\2\uffff";
    static final String dfa_8s = "\1\33\1\14\1\4\1\41\1\uffff\6\4\1\uffff\1\27\2\uffff";
    static final String dfa_9s = "\4\uffff\1\2\6\uffff\1\1\1\uffff\1\3\1\4";
    static final String[] dfa_10s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\13\11\uffff\1\4\4\uffff\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "",
            "\1\15\11\uffff\1\16",
            "",
            ""
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_5;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "1064:2: ( (otherlv_0= 'MessageContent' otherlv_1= '(' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ')' ) | (otherlv_4= 'MessageContent' otherlv_5= '(' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'by' ( (lv_timeUnit_8_0= ruleTimeUnit ) ) otherlv_9= ')' ) | (otherlv_10= 'MessageContent' otherlv_11= '(' ( (lv_content_12_0= RULE_STRING ) ) ( (lv_comparisonOperator_13_0= ruleComparisonOperator ) ) ( (lv_value_14_0= RULE_STRING ) ) otherlv_15= ')' ) | (otherlv_16= 'MessageContent' otherlv_17= '(' ( (lv_content_18_0= RULE_STRING ) ) ( (lv_comparisonOperator_19_0= ruleComparisonOperator ) ) ( (lv_value_20_0= RULE_STRING ) ) otherlv_21= 'by' ( (lv_timeUnit_22_0= ruleTimeUnit ) ) otherlv_23= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000F5E1802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000F581000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000F501000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001FC0000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000003F800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});

}