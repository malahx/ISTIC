package org.xtext.mlh.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mlh.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'{'", "'}'", "'mandatory'", "'optional'", "'alternatives'", "'videoSeq'", "'description='", "'duration='", "'display_stats='"
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
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalVideoGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideoGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideoGenParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVideoGen.g"; }



     	private VideoGenGrammarAccess grammarAccess;

        public InternalVideoGenParser(TokenStream input, VideoGenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "VideoGen";
       	}

       	@Override
       	protected VideoGenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVideoGen"
    // InternalVideoGen.g:64:1: entryRuleVideoGen returns [EObject current=null] : iv_ruleVideoGen= ruleVideoGen EOF ;
    public final EObject entryRuleVideoGen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoGen = null;


        try {
            // InternalVideoGen.g:64:49: (iv_ruleVideoGen= ruleVideoGen EOF )
            // InternalVideoGen.g:65:2: iv_ruleVideoGen= ruleVideoGen EOF
            {
             newCompositeNode(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideoGen=ruleVideoGen();

            state._fsp--;

             current =iv_ruleVideoGen; 
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
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // InternalVideoGen.g:71:1: ruleVideoGen returns [EObject current=null] : ( () otherlv_1= 'VideoGen' otherlv_2= '{' ( (lv_videos_3_0= ruleVideoType ) )* otherlv_4= '}' ) ;
    public final EObject ruleVideoGen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_videos_3_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:77:2: ( ( () otherlv_1= 'VideoGen' otherlv_2= '{' ( (lv_videos_3_0= ruleVideoType ) )* otherlv_4= '}' ) )
            // InternalVideoGen.g:78:2: ( () otherlv_1= 'VideoGen' otherlv_2= '{' ( (lv_videos_3_0= ruleVideoType ) )* otherlv_4= '}' )
            {
            // InternalVideoGen.g:78:2: ( () otherlv_1= 'VideoGen' otherlv_2= '{' ( (lv_videos_3_0= ruleVideoType ) )* otherlv_4= '}' )
            // InternalVideoGen.g:79:3: () otherlv_1= 'VideoGen' otherlv_2= '{' ( (lv_videos_3_0= ruleVideoType ) )* otherlv_4= '}'
            {
            // InternalVideoGen.g:79:3: ()
            // InternalVideoGen.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVideoGenAccess().getVideoGenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVideoGenAccess().getVideoGenKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoGen.g:94:3: ( (lv_videos_3_0= ruleVideoType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVideoGen.g:95:4: (lv_videos_3_0= ruleVideoType )
            	    {
            	    // InternalVideoGen.g:95:4: (lv_videos_3_0= ruleVideoType )
            	    // InternalVideoGen.g:96:5: lv_videos_3_0= ruleVideoType
            	    {

            	    					newCompositeNode(grammarAccess.getVideoGenAccess().getVideosVideoTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_videos_3_0=ruleVideoType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVideoGenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"videos",
            	    						lv_videos_3_0,
            	    						"org.xtext.mlh.VideoGen.VideoType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuleVideoType"
    // InternalVideoGen.g:121:1: entryRuleVideoType returns [EObject current=null] : iv_ruleVideoType= ruleVideoType EOF ;
    public final EObject entryRuleVideoType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoType = null;


        try {
            // InternalVideoGen.g:121:50: (iv_ruleVideoType= ruleVideoType EOF )
            // InternalVideoGen.g:122:2: iv_ruleVideoType= ruleVideoType EOF
            {
             newCompositeNode(grammarAccess.getVideoTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideoType=ruleVideoType();

            state._fsp--;

             current =iv_ruleVideoType; 
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
    // $ANTLR end "entryRuleVideoType"


    // $ANTLR start "ruleVideoType"
    // InternalVideoGen.g:128:1: ruleVideoType returns [EObject current=null] : (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternatives_2= ruleAlternatives ) ;
    public final EObject ruleVideoType() throws RecognitionException {
        EObject current = null;

        EObject this_Mandatory_0 = null;

        EObject this_Optional_1 = null;

        EObject this_Alternatives_2 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:134:2: ( (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternatives_2= ruleAlternatives ) )
            // InternalVideoGen.g:135:2: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternatives_2= ruleAlternatives )
            {
            // InternalVideoGen.g:135:2: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternatives_2= ruleAlternatives )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalVideoGen.g:136:3: this_Mandatory_0= ruleMandatory
                    {

                    			newCompositeNode(grammarAccess.getVideoTypeAccess().getMandatoryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mandatory_0=ruleMandatory();

                    state._fsp--;


                    			current = this_Mandatory_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:145:3: this_Optional_1= ruleOptional
                    {

                    			newCompositeNode(grammarAccess.getVideoTypeAccess().getOptionalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Optional_1=ruleOptional();

                    state._fsp--;


                    			current = this_Optional_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:154:3: this_Alternatives_2= ruleAlternatives
                    {

                    			newCompositeNode(grammarAccess.getVideoTypeAccess().getAlternativesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Alternatives_2=ruleAlternatives();

                    state._fsp--;


                    			current = this_Alternatives_2;
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
    // $ANTLR end "ruleVideoType"


    // $ANTLR start "entryRuleMandatory"
    // InternalVideoGen.g:166:1: entryRuleMandatory returns [EObject current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final EObject entryRuleMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatory = null;


        try {
            // InternalVideoGen.g:166:50: (iv_ruleMandatory= ruleMandatory EOF )
            // InternalVideoGen.g:167:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory; 
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
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // InternalVideoGen.g:173:1: ruleMandatory returns [EObject current=null] : (otherlv_0= 'mandatory' ( (lv_videoseq_1_0= ruleVideoSeq ) ) ) ;
    public final EObject ruleMandatory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_videoseq_1_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:179:2: ( (otherlv_0= 'mandatory' ( (lv_videoseq_1_0= ruleVideoSeq ) ) ) )
            // InternalVideoGen.g:180:2: (otherlv_0= 'mandatory' ( (lv_videoseq_1_0= ruleVideoSeq ) ) )
            {
            // InternalVideoGen.g:180:2: (otherlv_0= 'mandatory' ( (lv_videoseq_1_0= ruleVideoSeq ) ) )
            // InternalVideoGen.g:181:3: otherlv_0= 'mandatory' ( (lv_videoseq_1_0= ruleVideoSeq ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMandatoryAccess().getMandatoryKeyword_0());
            		
            // InternalVideoGen.g:185:3: ( (lv_videoseq_1_0= ruleVideoSeq ) )
            // InternalVideoGen.g:186:4: (lv_videoseq_1_0= ruleVideoSeq )
            {
            // InternalVideoGen.g:186:4: (lv_videoseq_1_0= ruleVideoSeq )
            // InternalVideoGen.g:187:5: lv_videoseq_1_0= ruleVideoSeq
            {

            					newCompositeNode(grammarAccess.getMandatoryAccess().getVideoseqVideoSeqParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_videoseq_1_0=ruleVideoSeq();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMandatoryRule());
            					}
            					set(
            						current,
            						"videoseq",
            						lv_videoseq_1_0,
            						"org.xtext.mlh.VideoGen.VideoSeq");
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
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // InternalVideoGen.g:208:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // InternalVideoGen.g:208:49: (iv_ruleOptional= ruleOptional EOF )
            // InternalVideoGen.g:209:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
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
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // InternalVideoGen.g:215:1: ruleOptional returns [EObject current=null] : (otherlv_0= 'optional' ( (lv_videoseq_1_0= ruleVideoSeq ) ) ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_videoseq_1_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:221:2: ( (otherlv_0= 'optional' ( (lv_videoseq_1_0= ruleVideoSeq ) ) ) )
            // InternalVideoGen.g:222:2: (otherlv_0= 'optional' ( (lv_videoseq_1_0= ruleVideoSeq ) ) )
            {
            // InternalVideoGen.g:222:2: (otherlv_0= 'optional' ( (lv_videoseq_1_0= ruleVideoSeq ) ) )
            // InternalVideoGen.g:223:3: otherlv_0= 'optional' ( (lv_videoseq_1_0= ruleVideoSeq ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getOptionalKeyword_0());
            		
            // InternalVideoGen.g:227:3: ( (lv_videoseq_1_0= ruleVideoSeq ) )
            // InternalVideoGen.g:228:4: (lv_videoseq_1_0= ruleVideoSeq )
            {
            // InternalVideoGen.g:228:4: (lv_videoseq_1_0= ruleVideoSeq )
            // InternalVideoGen.g:229:5: lv_videoseq_1_0= ruleVideoSeq
            {

            					newCompositeNode(grammarAccess.getOptionalAccess().getVideoseqVideoSeqParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_videoseq_1_0=ruleVideoSeq();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionalRule());
            					}
            					set(
            						current,
            						"videoseq",
            						lv_videoseq_1_0,
            						"org.xtext.mlh.VideoGen.VideoSeq");
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
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleAlternatives"
    // InternalVideoGen.g:250:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // InternalVideoGen.g:250:53: (iv_ruleAlternatives= ruleAlternatives EOF )
            // InternalVideoGen.g:251:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
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
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // InternalVideoGen.g:257:1: ruleAlternatives returns [EObject current=null] : (otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseqs_3_0= ruleVideoSeq ) )+ otherlv_4= '}' ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_videoseqs_3_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:263:2: ( (otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseqs_3_0= ruleVideoSeq ) )+ otherlv_4= '}' ) )
            // InternalVideoGen.g:264:2: (otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseqs_3_0= ruleVideoSeq ) )+ otherlv_4= '}' )
            {
            // InternalVideoGen.g:264:2: (otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseqs_3_0= ruleVideoSeq ) )+ otherlv_4= '}' )
            // InternalVideoGen.g:265:3: otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseqs_3_0= ruleVideoSeq ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getAlternativesKeyword_0());
            		
            // InternalVideoGen.g:269:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalVideoGen.g:270:4: (lv_id_1_0= RULE_ID )
            {
            // InternalVideoGen.g:270:4: (lv_id_1_0= RULE_ID )
            // InternalVideoGen.g:271:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_id_1_0, grammarAccess.getAlternativesAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlternativesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoGen.g:291:3: ( (lv_videoseqs_3_0= ruleVideoSeq ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVideoGen.g:292:4: (lv_videoseqs_3_0= ruleVideoSeq )
            	    {
            	    // InternalVideoGen.g:292:4: (lv_videoseqs_3_0= ruleVideoSeq )
            	    // InternalVideoGen.g:293:5: lv_videoseqs_3_0= ruleVideoSeq
            	    {

            	    					newCompositeNode(grammarAccess.getAlternativesAccess().getVideoseqsVideoSeqParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_videoseqs_3_0=ruleVideoSeq();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternativesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"videoseqs",
            	    						lv_videoseqs_3_0,
            	    						"org.xtext.mlh.VideoGen.VideoSeq");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleVideoSeq"
    // InternalVideoGen.g:318:1: entryRuleVideoSeq returns [EObject current=null] : iv_ruleVideoSeq= ruleVideoSeq EOF ;
    public final EObject entryRuleVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoSeq = null;


        try {
            // InternalVideoGen.g:318:49: (iv_ruleVideoSeq= ruleVideoSeq EOF )
            // InternalVideoGen.g:319:2: iv_ruleVideoSeq= ruleVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getVideoSeqRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideoSeq=ruleVideoSeq();

            state._fsp--;

             current =iv_ruleVideoSeq; 
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
    // $ANTLR end "entryRuleVideoSeq"


    // $ANTLR start "ruleVideoSeq"
    // InternalVideoGen.g:325:1: ruleVideoSeq returns [EObject current=null] : (otherlv_0= 'videoSeq' ( (lv_vid_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_url_3_0= RULE_STRING ) ) ( (lv_description_4_0= ruleDescription ) )? ( (lv_duration_5_0= ruleDuration ) )? ( (lv_display_stats_6_0= ruleDisplay_stats ) )? otherlv_7= '}' ) ;
    public final EObject ruleVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_vid_1_0=null;
        Token otherlv_2=null;
        Token lv_url_3_0=null;
        Token otherlv_7=null;
        EObject lv_description_4_0 = null;

        EObject lv_duration_5_0 = null;

        EObject lv_display_stats_6_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:331:2: ( (otherlv_0= 'videoSeq' ( (lv_vid_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_url_3_0= RULE_STRING ) ) ( (lv_description_4_0= ruleDescription ) )? ( (lv_duration_5_0= ruleDuration ) )? ( (lv_display_stats_6_0= ruleDisplay_stats ) )? otherlv_7= '}' ) )
            // InternalVideoGen.g:332:2: (otherlv_0= 'videoSeq' ( (lv_vid_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_url_3_0= RULE_STRING ) ) ( (lv_description_4_0= ruleDescription ) )? ( (lv_duration_5_0= ruleDuration ) )? ( (lv_display_stats_6_0= ruleDisplay_stats ) )? otherlv_7= '}' )
            {
            // InternalVideoGen.g:332:2: (otherlv_0= 'videoSeq' ( (lv_vid_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_url_3_0= RULE_STRING ) ) ( (lv_description_4_0= ruleDescription ) )? ( (lv_duration_5_0= ruleDuration ) )? ( (lv_display_stats_6_0= ruleDisplay_stats ) )? otherlv_7= '}' )
            // InternalVideoGen.g:333:3: otherlv_0= 'videoSeq' ( (lv_vid_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_url_3_0= RULE_STRING ) ) ( (lv_description_4_0= ruleDescription ) )? ( (lv_duration_5_0= ruleDuration ) )? ( (lv_display_stats_6_0= ruleDisplay_stats ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoSeqAccess().getVideoSeqKeyword_0());
            		
            // InternalVideoGen.g:337:3: ( (lv_vid_1_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVideoGen.g:338:4: (lv_vid_1_0= RULE_ID )
                    {
                    // InternalVideoGen.g:338:4: (lv_vid_1_0= RULE_ID )
                    // InternalVideoGen.g:339:5: lv_vid_1_0= RULE_ID
                    {
                    lv_vid_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(lv_vid_1_0, grammarAccess.getVideoSeqAccess().getVidIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVideoSeqRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"vid",
                    						lv_vid_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getVideoSeqAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoGen.g:359:3: ( (lv_url_3_0= RULE_STRING ) )
            // InternalVideoGen.g:360:4: (lv_url_3_0= RULE_STRING )
            {
            // InternalVideoGen.g:360:4: (lv_url_3_0= RULE_STRING )
            // InternalVideoGen.g:361:5: lv_url_3_0= RULE_STRING
            {
            lv_url_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_url_3_0, grammarAccess.getVideoSeqAccess().getUrlSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVideoSeqRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVideoGen.g:377:3: ( (lv_description_4_0= ruleDescription ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVideoGen.g:378:4: (lv_description_4_0= ruleDescription )
                    {
                    // InternalVideoGen.g:378:4: (lv_description_4_0= ruleDescription )
                    // InternalVideoGen.g:379:5: lv_description_4_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getVideoSeqAccess().getDescriptionDescriptionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_description_4_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVideoSeqRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"org.xtext.mlh.VideoGen.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVideoGen.g:396:3: ( (lv_duration_5_0= ruleDuration ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVideoGen.g:397:4: (lv_duration_5_0= ruleDuration )
                    {
                    // InternalVideoGen.g:397:4: (lv_duration_5_0= ruleDuration )
                    // InternalVideoGen.g:398:5: lv_duration_5_0= ruleDuration
                    {

                    					newCompositeNode(grammarAccess.getVideoSeqAccess().getDurationDurationParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_duration_5_0=ruleDuration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVideoSeqRule());
                    					}
                    					set(
                    						current,
                    						"duration",
                    						lv_duration_5_0,
                    						"org.xtext.mlh.VideoGen.Duration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVideoGen.g:415:3: ( (lv_display_stats_6_0= ruleDisplay_stats ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVideoGen.g:416:4: (lv_display_stats_6_0= ruleDisplay_stats )
                    {
                    // InternalVideoGen.g:416:4: (lv_display_stats_6_0= ruleDisplay_stats )
                    // InternalVideoGen.g:417:5: lv_display_stats_6_0= ruleDisplay_stats
                    {

                    					newCompositeNode(grammarAccess.getVideoSeqAccess().getDisplay_statsDisplay_statsParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_display_stats_6_0=ruleDisplay_stats();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVideoSeqRule());
                    					}
                    					set(
                    						current,
                    						"display_stats",
                    						lv_display_stats_6_0,
                    						"org.xtext.mlh.VideoGen.Display_stats");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVideoSeqAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleVideoSeq"


    // $ANTLR start "entryRuleDescription"
    // InternalVideoGen.g:442:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalVideoGen.g:442:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalVideoGen.g:443:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalVideoGen.g:449:1: ruleDescription returns [EObject current=null] : ( () otherlv_1= 'description=' ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;


        	enterRule();

        try {
            // InternalVideoGen.g:455:2: ( ( () otherlv_1= 'description=' ( (lv_description_2_0= RULE_STRING ) )? ) )
            // InternalVideoGen.g:456:2: ( () otherlv_1= 'description=' ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // InternalVideoGen.g:456:2: ( () otherlv_1= 'description=' ( (lv_description_2_0= RULE_STRING ) )? )
            // InternalVideoGen.g:457:3: () otherlv_1= 'description=' ( (lv_description_2_0= RULE_STRING ) )?
            {
            // InternalVideoGen.g:457:3: ()
            // InternalVideoGen.g:458:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getDescriptionKeyword_1());
            		
            // InternalVideoGen.g:468:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVideoGen.g:469:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalVideoGen.g:469:4: (lv_description_2_0= RULE_STRING )
                    // InternalVideoGen.g:470:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDescriptionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleDuration"
    // InternalVideoGen.g:490:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalVideoGen.g:490:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalVideoGen.g:491:2: iv_ruleDuration= ruleDuration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDuration=ruleDuration();

            state._fsp--;

             current =iv_ruleDuration; 
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
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalVideoGen.g:497:1: ruleDuration returns [EObject current=null] : ( () otherlv_1= 'duration=' ( (lv_duration_2_0= RULE_INT ) )? ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_duration_2_0=null;


        	enterRule();

        try {
            // InternalVideoGen.g:503:2: ( ( () otherlv_1= 'duration=' ( (lv_duration_2_0= RULE_INT ) )? ) )
            // InternalVideoGen.g:504:2: ( () otherlv_1= 'duration=' ( (lv_duration_2_0= RULE_INT ) )? )
            {
            // InternalVideoGen.g:504:2: ( () otherlv_1= 'duration=' ( (lv_duration_2_0= RULE_INT ) )? )
            // InternalVideoGen.g:505:3: () otherlv_1= 'duration=' ( (lv_duration_2_0= RULE_INT ) )?
            {
            // InternalVideoGen.g:505:3: ()
            // InternalVideoGen.g:506:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDurationAccess().getDurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDurationAccess().getDurationKeyword_1());
            		
            // InternalVideoGen.g:516:3: ( (lv_duration_2_0= RULE_INT ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVideoGen.g:517:4: (lv_duration_2_0= RULE_INT )
                    {
                    // InternalVideoGen.g:517:4: (lv_duration_2_0= RULE_INT )
                    // InternalVideoGen.g:518:5: lv_duration_2_0= RULE_INT
                    {
                    lv_duration_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_duration_2_0, grammarAccess.getDurationAccess().getDurationINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDurationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"duration",
                    						lv_duration_2_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleDisplay_stats"
    // InternalVideoGen.g:538:1: entryRuleDisplay_stats returns [EObject current=null] : iv_ruleDisplay_stats= ruleDisplay_stats EOF ;
    public final EObject entryRuleDisplay_stats() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplay_stats = null;


        try {
            // InternalVideoGen.g:538:54: (iv_ruleDisplay_stats= ruleDisplay_stats EOF )
            // InternalVideoGen.g:539:2: iv_ruleDisplay_stats= ruleDisplay_stats EOF
            {
             newCompositeNode(grammarAccess.getDisplay_statsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisplay_stats=ruleDisplay_stats();

            state._fsp--;

             current =iv_ruleDisplay_stats; 
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
    // $ANTLR end "entryRuleDisplay_stats"


    // $ANTLR start "ruleDisplay_stats"
    // InternalVideoGen.g:545:1: ruleDisplay_stats returns [EObject current=null] : ( () otherlv_1= 'display_stats=' ( (lv_display_stats_2_0= RULE_INT ) )? ) ;
    public final EObject ruleDisplay_stats() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_display_stats_2_0=null;


        	enterRule();

        try {
            // InternalVideoGen.g:551:2: ( ( () otherlv_1= 'display_stats=' ( (lv_display_stats_2_0= RULE_INT ) )? ) )
            // InternalVideoGen.g:552:2: ( () otherlv_1= 'display_stats=' ( (lv_display_stats_2_0= RULE_INT ) )? )
            {
            // InternalVideoGen.g:552:2: ( () otherlv_1= 'display_stats=' ( (lv_display_stats_2_0= RULE_INT ) )? )
            // InternalVideoGen.g:553:3: () otherlv_1= 'display_stats=' ( (lv_display_stats_2_0= RULE_INT ) )?
            {
            // InternalVideoGen.g:553:3: ()
            // InternalVideoGen.g:554:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDisplay_statsAccess().getDisplay_statsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDisplay_statsAccess().getDisplay_statsKeyword_1());
            		
            // InternalVideoGen.g:564:3: ( (lv_display_stats_2_0= RULE_INT ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVideoGen.g:565:4: (lv_display_stats_2_0= RULE_INT )
                    {
                    // InternalVideoGen.g:565:4: (lv_display_stats_2_0= RULE_INT )
                    // InternalVideoGen.g:566:5: lv_display_stats_2_0= RULE_INT
                    {
                    lv_display_stats_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_display_stats_2_0, grammarAccess.getDisplay_statsAccess().getDisplay_statsINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDisplay_statsRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"display_stats",
                    						lv_display_stats_2_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

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
    // $ANTLR end "ruleDisplay_stats"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});

}