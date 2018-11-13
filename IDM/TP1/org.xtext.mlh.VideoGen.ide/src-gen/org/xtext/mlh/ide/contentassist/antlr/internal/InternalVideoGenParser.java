package org.xtext.mlh.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.mlh.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleVideoGen"
    // InternalVideoGen.g:53:1: entryRuleVideoGen : ruleVideoGen EOF ;
    public final void entryRuleVideoGen() throws RecognitionException {
        try {
            // InternalVideoGen.g:54:1: ( ruleVideoGen EOF )
            // InternalVideoGen.g:55:1: ruleVideoGen EOF
            {
             before(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoGen();

            state._fsp--;

             after(grammarAccess.getVideoGenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // InternalVideoGen.g:62:1: ruleVideoGen : ( ( rule__VideoGen__Group__0 ) ) ;
    public final void ruleVideoGen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:66:2: ( ( ( rule__VideoGen__Group__0 ) ) )
            // InternalVideoGen.g:67:2: ( ( rule__VideoGen__Group__0 ) )
            {
            // InternalVideoGen.g:67:2: ( ( rule__VideoGen__Group__0 ) )
            // InternalVideoGen.g:68:3: ( rule__VideoGen__Group__0 )
            {
             before(grammarAccess.getVideoGenAccess().getGroup()); 
            // InternalVideoGen.g:69:3: ( rule__VideoGen__Group__0 )
            // InternalVideoGen.g:69:4: rule__VideoGen__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoGen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuleVideoType"
    // InternalVideoGen.g:78:1: entryRuleVideoType : ruleVideoType EOF ;
    public final void entryRuleVideoType() throws RecognitionException {
        try {
            // InternalVideoGen.g:79:1: ( ruleVideoType EOF )
            // InternalVideoGen.g:80:1: ruleVideoType EOF
            {
             before(grammarAccess.getVideoTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoType();

            state._fsp--;

             after(grammarAccess.getVideoTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoType"


    // $ANTLR start "ruleVideoType"
    // InternalVideoGen.g:87:1: ruleVideoType : ( ( rule__VideoType__Alternatives ) ) ;
    public final void ruleVideoType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:91:2: ( ( ( rule__VideoType__Alternatives ) ) )
            // InternalVideoGen.g:92:2: ( ( rule__VideoType__Alternatives ) )
            {
            // InternalVideoGen.g:92:2: ( ( rule__VideoType__Alternatives ) )
            // InternalVideoGen.g:93:3: ( rule__VideoType__Alternatives )
            {
             before(grammarAccess.getVideoTypeAccess().getAlternatives()); 
            // InternalVideoGen.g:94:3: ( rule__VideoType__Alternatives )
            // InternalVideoGen.g:94:4: rule__VideoType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VideoType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVideoTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoType"


    // $ANTLR start "entryRuleMandatory"
    // InternalVideoGen.g:103:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // InternalVideoGen.g:104:1: ( ruleMandatory EOF )
            // InternalVideoGen.g:105:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_1);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // InternalVideoGen.g:112:1: ruleMandatory : ( ( rule__Mandatory__Group__0 ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:116:2: ( ( ( rule__Mandatory__Group__0 ) ) )
            // InternalVideoGen.g:117:2: ( ( rule__Mandatory__Group__0 ) )
            {
            // InternalVideoGen.g:117:2: ( ( rule__Mandatory__Group__0 ) )
            // InternalVideoGen.g:118:3: ( rule__Mandatory__Group__0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroup()); 
            // InternalVideoGen.g:119:3: ( rule__Mandatory__Group__0 )
            // InternalVideoGen.g:119:4: rule__Mandatory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mandatory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // InternalVideoGen.g:128:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // InternalVideoGen.g:129:1: ( ruleOptional EOF )
            // InternalVideoGen.g:130:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_1);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // InternalVideoGen.g:137:1: ruleOptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:141:2: ( ( ( rule__Optional__Group__0 ) ) )
            // InternalVideoGen.g:142:2: ( ( rule__Optional__Group__0 ) )
            {
            // InternalVideoGen.g:142:2: ( ( rule__Optional__Group__0 ) )
            // InternalVideoGen.g:143:3: ( rule__Optional__Group__0 )
            {
             before(grammarAccess.getOptionalAccess().getGroup()); 
            // InternalVideoGen.g:144:3: ( rule__Optional__Group__0 )
            // InternalVideoGen.g:144:4: rule__Optional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Optional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleAlternatives"
    // InternalVideoGen.g:153:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // InternalVideoGen.g:154:1: ( ruleAlternatives EOF )
            // InternalVideoGen.g:155:1: ruleAlternatives EOF
            {
             before(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getAlternativesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // InternalVideoGen.g:162:1: ruleAlternatives : ( ( rule__Alternatives__Group__0 ) ) ;
    public final void ruleAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:166:2: ( ( ( rule__Alternatives__Group__0 ) ) )
            // InternalVideoGen.g:167:2: ( ( rule__Alternatives__Group__0 ) )
            {
            // InternalVideoGen.g:167:2: ( ( rule__Alternatives__Group__0 ) )
            // InternalVideoGen.g:168:3: ( rule__Alternatives__Group__0 )
            {
             before(grammarAccess.getAlternativesAccess().getGroup()); 
            // InternalVideoGen.g:169:3: ( rule__Alternatives__Group__0 )
            // InternalVideoGen.g:169:4: rule__Alternatives__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleVideoSeq"
    // InternalVideoGen.g:178:1: entryRuleVideoSeq : ruleVideoSeq EOF ;
    public final void entryRuleVideoSeq() throws RecognitionException {
        try {
            // InternalVideoGen.g:179:1: ( ruleVideoSeq EOF )
            // InternalVideoGen.g:180:1: ruleVideoSeq EOF
            {
             before(grammarAccess.getVideoSeqRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getVideoSeqRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoSeq"


    // $ANTLR start "ruleVideoSeq"
    // InternalVideoGen.g:187:1: ruleVideoSeq : ( ( rule__VideoSeq__Group__0 ) ) ;
    public final void ruleVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:191:2: ( ( ( rule__VideoSeq__Group__0 ) ) )
            // InternalVideoGen.g:192:2: ( ( rule__VideoSeq__Group__0 ) )
            {
            // InternalVideoGen.g:192:2: ( ( rule__VideoSeq__Group__0 ) )
            // InternalVideoGen.g:193:3: ( rule__VideoSeq__Group__0 )
            {
             before(grammarAccess.getVideoSeqAccess().getGroup()); 
            // InternalVideoGen.g:194:3: ( rule__VideoSeq__Group__0 )
            // InternalVideoGen.g:194:4: rule__VideoSeq__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoSeq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoSeq"


    // $ANTLR start "entryRuleDescription"
    // InternalVideoGen.g:203:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalVideoGen.g:204:1: ( ruleDescription EOF )
            // InternalVideoGen.g:205:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalVideoGen.g:212:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:216:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalVideoGen.g:217:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalVideoGen.g:217:2: ( ( rule__Description__Group__0 ) )
            // InternalVideoGen.g:218:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalVideoGen.g:219:3: ( rule__Description__Group__0 )
            // InternalVideoGen.g:219:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleDuration"
    // InternalVideoGen.g:228:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // InternalVideoGen.g:229:1: ( ruleDuration EOF )
            // InternalVideoGen.g:230:1: ruleDuration EOF
            {
             before(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getDurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalVideoGen.g:237:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:241:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalVideoGen.g:242:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalVideoGen.g:242:2: ( ( rule__Duration__Group__0 ) )
            // InternalVideoGen.g:243:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // InternalVideoGen.g:244:3: ( rule__Duration__Group__0 )
            // InternalVideoGen.g:244:4: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleDisplay_stats"
    // InternalVideoGen.g:253:1: entryRuleDisplay_stats : ruleDisplay_stats EOF ;
    public final void entryRuleDisplay_stats() throws RecognitionException {
        try {
            // InternalVideoGen.g:254:1: ( ruleDisplay_stats EOF )
            // InternalVideoGen.g:255:1: ruleDisplay_stats EOF
            {
             before(grammarAccess.getDisplay_statsRule()); 
            pushFollow(FOLLOW_1);
            ruleDisplay_stats();

            state._fsp--;

             after(grammarAccess.getDisplay_statsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDisplay_stats"


    // $ANTLR start "ruleDisplay_stats"
    // InternalVideoGen.g:262:1: ruleDisplay_stats : ( ( rule__Display_stats__Group__0 ) ) ;
    public final void ruleDisplay_stats() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:266:2: ( ( ( rule__Display_stats__Group__0 ) ) )
            // InternalVideoGen.g:267:2: ( ( rule__Display_stats__Group__0 ) )
            {
            // InternalVideoGen.g:267:2: ( ( rule__Display_stats__Group__0 ) )
            // InternalVideoGen.g:268:3: ( rule__Display_stats__Group__0 )
            {
             before(grammarAccess.getDisplay_statsAccess().getGroup()); 
            // InternalVideoGen.g:269:3: ( rule__Display_stats__Group__0 )
            // InternalVideoGen.g:269:4: rule__Display_stats__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Display_stats__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisplay_statsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisplay_stats"


    // $ANTLR start "rule__VideoType__Alternatives"
    // InternalVideoGen.g:277:1: rule__VideoType__Alternatives : ( ( ruleMandatory ) | ( ruleOptional ) | ( ruleAlternatives ) );
    public final void rule__VideoType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:281:1: ( ( ruleMandatory ) | ( ruleOptional ) | ( ruleAlternatives ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalVideoGen.g:282:2: ( ruleMandatory )
                    {
                    // InternalVideoGen.g:282:2: ( ruleMandatory )
                    // InternalVideoGen.g:283:3: ruleMandatory
                    {
                     before(grammarAccess.getVideoTypeAccess().getMandatoryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMandatory();

                    state._fsp--;

                     after(grammarAccess.getVideoTypeAccess().getMandatoryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:288:2: ( ruleOptional )
                    {
                    // InternalVideoGen.g:288:2: ( ruleOptional )
                    // InternalVideoGen.g:289:3: ruleOptional
                    {
                     before(grammarAccess.getVideoTypeAccess().getOptionalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOptional();

                    state._fsp--;

                     after(grammarAccess.getVideoTypeAccess().getOptionalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:294:2: ( ruleAlternatives )
                    {
                    // InternalVideoGen.g:294:2: ( ruleAlternatives )
                    // InternalVideoGen.g:295:3: ruleAlternatives
                    {
                     before(grammarAccess.getVideoTypeAccess().getAlternativesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAlternatives();

                    state._fsp--;

                     after(grammarAccess.getVideoTypeAccess().getAlternativesParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoType__Alternatives"


    // $ANTLR start "rule__VideoGen__Group__0"
    // InternalVideoGen.g:304:1: rule__VideoGen__Group__0 : rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 ;
    public final void rule__VideoGen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:308:1: ( rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 )
            // InternalVideoGen.g:309:2: rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VideoGen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__0"


    // $ANTLR start "rule__VideoGen__Group__0__Impl"
    // InternalVideoGen.g:316:1: rule__VideoGen__Group__0__Impl : ( () ) ;
    public final void rule__VideoGen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:320:1: ( ( () ) )
            // InternalVideoGen.g:321:1: ( () )
            {
            // InternalVideoGen.g:321:1: ( () )
            // InternalVideoGen.g:322:2: ()
            {
             before(grammarAccess.getVideoGenAccess().getVideoGenAction_0()); 
            // InternalVideoGen.g:323:2: ()
            // InternalVideoGen.g:323:3: 
            {
            }

             after(grammarAccess.getVideoGenAccess().getVideoGenAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__0__Impl"


    // $ANTLR start "rule__VideoGen__Group__1"
    // InternalVideoGen.g:331:1: rule__VideoGen__Group__1 : rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 ;
    public final void rule__VideoGen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:335:1: ( rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 )
            // InternalVideoGen.g:336:2: rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VideoGen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGen__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__1"


    // $ANTLR start "rule__VideoGen__Group__1__Impl"
    // InternalVideoGen.g:343:1: rule__VideoGen__Group__1__Impl : ( 'VideoGen' ) ;
    public final void rule__VideoGen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:347:1: ( ( 'VideoGen' ) )
            // InternalVideoGen.g:348:1: ( 'VideoGen' )
            {
            // InternalVideoGen.g:348:1: ( 'VideoGen' )
            // InternalVideoGen.g:349:2: 'VideoGen'
            {
             before(grammarAccess.getVideoGenAccess().getVideoGenKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVideoGenAccess().getVideoGenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__1__Impl"


    // $ANTLR start "rule__VideoGen__Group__2"
    // InternalVideoGen.g:358:1: rule__VideoGen__Group__2 : rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 ;
    public final void rule__VideoGen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:362:1: ( rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 )
            // InternalVideoGen.g:363:2: rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VideoGen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGen__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__2"


    // $ANTLR start "rule__VideoGen__Group__2__Impl"
    // InternalVideoGen.g:370:1: rule__VideoGen__Group__2__Impl : ( '{' ) ;
    public final void rule__VideoGen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:374:1: ( ( '{' ) )
            // InternalVideoGen.g:375:1: ( '{' )
            {
            // InternalVideoGen.g:375:1: ( '{' )
            // InternalVideoGen.g:376:2: '{'
            {
             before(grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__2__Impl"


    // $ANTLR start "rule__VideoGen__Group__3"
    // InternalVideoGen.g:385:1: rule__VideoGen__Group__3 : rule__VideoGen__Group__3__Impl rule__VideoGen__Group__4 ;
    public final void rule__VideoGen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:389:1: ( rule__VideoGen__Group__3__Impl rule__VideoGen__Group__4 )
            // InternalVideoGen.g:390:2: rule__VideoGen__Group__3__Impl rule__VideoGen__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__VideoGen__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGen__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__3"


    // $ANTLR start "rule__VideoGen__Group__3__Impl"
    // InternalVideoGen.g:397:1: rule__VideoGen__Group__3__Impl : ( ( rule__VideoGen__VideosAssignment_3 )* ) ;
    public final void rule__VideoGen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:401:1: ( ( ( rule__VideoGen__VideosAssignment_3 )* ) )
            // InternalVideoGen.g:402:1: ( ( rule__VideoGen__VideosAssignment_3 )* )
            {
            // InternalVideoGen.g:402:1: ( ( rule__VideoGen__VideosAssignment_3 )* )
            // InternalVideoGen.g:403:2: ( rule__VideoGen__VideosAssignment_3 )*
            {
             before(grammarAccess.getVideoGenAccess().getVideosAssignment_3()); 
            // InternalVideoGen.g:404:2: ( rule__VideoGen__VideosAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVideoGen.g:404:3: rule__VideoGen__VideosAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__VideoGen__VideosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getVideoGenAccess().getVideosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__3__Impl"


    // $ANTLR start "rule__VideoGen__Group__4"
    // InternalVideoGen.g:412:1: rule__VideoGen__Group__4 : rule__VideoGen__Group__4__Impl ;
    public final void rule__VideoGen__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:416:1: ( rule__VideoGen__Group__4__Impl )
            // InternalVideoGen.g:417:2: rule__VideoGen__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoGen__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__4"


    // $ANTLR start "rule__VideoGen__Group__4__Impl"
    // InternalVideoGen.g:423:1: rule__VideoGen__Group__4__Impl : ( '}' ) ;
    public final void rule__VideoGen__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:427:1: ( ( '}' ) )
            // InternalVideoGen.g:428:1: ( '}' )
            {
            // InternalVideoGen.g:428:1: ( '}' )
            // InternalVideoGen.g:429:2: '}'
            {
             before(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__4__Impl"


    // $ANTLR start "rule__Mandatory__Group__0"
    // InternalVideoGen.g:439:1: rule__Mandatory__Group__0 : rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 ;
    public final void rule__Mandatory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:443:1: ( rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 )
            // InternalVideoGen.g:444:2: rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Mandatory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mandatory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__0"


    // $ANTLR start "rule__Mandatory__Group__0__Impl"
    // InternalVideoGen.g:451:1: rule__Mandatory__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__Mandatory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:455:1: ( ( 'mandatory' ) )
            // InternalVideoGen.g:456:1: ( 'mandatory' )
            {
            // InternalVideoGen.g:456:1: ( 'mandatory' )
            // InternalVideoGen.g:457:2: 'mandatory'
            {
             before(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__0__Impl"


    // $ANTLR start "rule__Mandatory__Group__1"
    // InternalVideoGen.g:466:1: rule__Mandatory__Group__1 : rule__Mandatory__Group__1__Impl ;
    public final void rule__Mandatory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:470:1: ( rule__Mandatory__Group__1__Impl )
            // InternalVideoGen.g:471:2: rule__Mandatory__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mandatory__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__1"


    // $ANTLR start "rule__Mandatory__Group__1__Impl"
    // InternalVideoGen.g:477:1: rule__Mandatory__Group__1__Impl : ( ( rule__Mandatory__VideoseqAssignment_1 ) ) ;
    public final void rule__Mandatory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:481:1: ( ( ( rule__Mandatory__VideoseqAssignment_1 ) ) )
            // InternalVideoGen.g:482:1: ( ( rule__Mandatory__VideoseqAssignment_1 ) )
            {
            // InternalVideoGen.g:482:1: ( ( rule__Mandatory__VideoseqAssignment_1 ) )
            // InternalVideoGen.g:483:2: ( rule__Mandatory__VideoseqAssignment_1 )
            {
             before(grammarAccess.getMandatoryAccess().getVideoseqAssignment_1()); 
            // InternalVideoGen.g:484:2: ( rule__Mandatory__VideoseqAssignment_1 )
            // InternalVideoGen.g:484:3: rule__Mandatory__VideoseqAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mandatory__VideoseqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getVideoseqAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__1__Impl"


    // $ANTLR start "rule__Optional__Group__0"
    // InternalVideoGen.g:493:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:497:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // InternalVideoGen.g:498:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Optional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__0"


    // $ANTLR start "rule__Optional__Group__0__Impl"
    // InternalVideoGen.g:505:1: rule__Optional__Group__0__Impl : ( 'optional' ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:509:1: ( ( 'optional' ) )
            // InternalVideoGen.g:510:1: ( 'optional' )
            {
            // InternalVideoGen.g:510:1: ( 'optional' )
            // InternalVideoGen.g:511:2: 'optional'
            {
             before(grammarAccess.getOptionalAccess().getOptionalKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOptionalAccess().getOptionalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__0__Impl"


    // $ANTLR start "rule__Optional__Group__1"
    // InternalVideoGen.g:520:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:524:1: ( rule__Optional__Group__1__Impl )
            // InternalVideoGen.g:525:2: rule__Optional__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Optional__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__1"


    // $ANTLR start "rule__Optional__Group__1__Impl"
    // InternalVideoGen.g:531:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__VideoseqAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:535:1: ( ( ( rule__Optional__VideoseqAssignment_1 ) ) )
            // InternalVideoGen.g:536:1: ( ( rule__Optional__VideoseqAssignment_1 ) )
            {
            // InternalVideoGen.g:536:1: ( ( rule__Optional__VideoseqAssignment_1 ) )
            // InternalVideoGen.g:537:2: ( rule__Optional__VideoseqAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getVideoseqAssignment_1()); 
            // InternalVideoGen.g:538:2: ( rule__Optional__VideoseqAssignment_1 )
            // InternalVideoGen.g:538:3: rule__Optional__VideoseqAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Optional__VideoseqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getVideoseqAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__0"
    // InternalVideoGen.g:547:1: rule__Alternatives__Group__0 : rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 ;
    public final void rule__Alternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:551:1: ( rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 )
            // InternalVideoGen.g:552:2: rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Alternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternatives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0"


    // $ANTLR start "rule__Alternatives__Group__0__Impl"
    // InternalVideoGen.g:559:1: rule__Alternatives__Group__0__Impl : ( 'alternatives' ) ;
    public final void rule__Alternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:563:1: ( ( 'alternatives' ) )
            // InternalVideoGen.g:564:1: ( 'alternatives' )
            {
            // InternalVideoGen.g:564:1: ( 'alternatives' )
            // InternalVideoGen.g:565:2: 'alternatives'
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0__Impl"


    // $ANTLR start "rule__Alternatives__Group__1"
    // InternalVideoGen.g:574:1: rule__Alternatives__Group__1 : rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 ;
    public final void rule__Alternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:578:1: ( rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 )
            // InternalVideoGen.g:579:2: rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Alternatives__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternatives__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1"


    // $ANTLR start "rule__Alternatives__Group__1__Impl"
    // InternalVideoGen.g:586:1: rule__Alternatives__Group__1__Impl : ( ( rule__Alternatives__IdAssignment_1 ) ) ;
    public final void rule__Alternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:590:1: ( ( ( rule__Alternatives__IdAssignment_1 ) ) )
            // InternalVideoGen.g:591:1: ( ( rule__Alternatives__IdAssignment_1 ) )
            {
            // InternalVideoGen.g:591:1: ( ( rule__Alternatives__IdAssignment_1 ) )
            // InternalVideoGen.g:592:2: ( rule__Alternatives__IdAssignment_1 )
            {
             before(grammarAccess.getAlternativesAccess().getIdAssignment_1()); 
            // InternalVideoGen.g:593:2: ( rule__Alternatives__IdAssignment_1 )
            // InternalVideoGen.g:593:3: rule__Alternatives__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Alternatives__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__2"
    // InternalVideoGen.g:601:1: rule__Alternatives__Group__2 : rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 ;
    public final void rule__Alternatives__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:605:1: ( rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 )
            // InternalVideoGen.g:606:2: rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Alternatives__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternatives__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__2"


    // $ANTLR start "rule__Alternatives__Group__2__Impl"
    // InternalVideoGen.g:613:1: rule__Alternatives__Group__2__Impl : ( '{' ) ;
    public final void rule__Alternatives__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:617:1: ( ( '{' ) )
            // InternalVideoGen.g:618:1: ( '{' )
            {
            // InternalVideoGen.g:618:1: ( '{' )
            // InternalVideoGen.g:619:2: '{'
            {
             before(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__2__Impl"


    // $ANTLR start "rule__Alternatives__Group__3"
    // InternalVideoGen.g:628:1: rule__Alternatives__Group__3 : rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 ;
    public final void rule__Alternatives__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:632:1: ( rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 )
            // InternalVideoGen.g:633:2: rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Alternatives__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternatives__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__3"


    // $ANTLR start "rule__Alternatives__Group__3__Impl"
    // InternalVideoGen.g:640:1: rule__Alternatives__Group__3__Impl : ( ( ( rule__Alternatives__VideoseqsAssignment_3 ) ) ( ( rule__Alternatives__VideoseqsAssignment_3 )* ) ) ;
    public final void rule__Alternatives__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:644:1: ( ( ( ( rule__Alternatives__VideoseqsAssignment_3 ) ) ( ( rule__Alternatives__VideoseqsAssignment_3 )* ) ) )
            // InternalVideoGen.g:645:1: ( ( ( rule__Alternatives__VideoseqsAssignment_3 ) ) ( ( rule__Alternatives__VideoseqsAssignment_3 )* ) )
            {
            // InternalVideoGen.g:645:1: ( ( ( rule__Alternatives__VideoseqsAssignment_3 ) ) ( ( rule__Alternatives__VideoseqsAssignment_3 )* ) )
            // InternalVideoGen.g:646:2: ( ( rule__Alternatives__VideoseqsAssignment_3 ) ) ( ( rule__Alternatives__VideoseqsAssignment_3 )* )
            {
            // InternalVideoGen.g:646:2: ( ( rule__Alternatives__VideoseqsAssignment_3 ) )
            // InternalVideoGen.g:647:3: ( rule__Alternatives__VideoseqsAssignment_3 )
            {
             before(grammarAccess.getAlternativesAccess().getVideoseqsAssignment_3()); 
            // InternalVideoGen.g:648:3: ( rule__Alternatives__VideoseqsAssignment_3 )
            // InternalVideoGen.g:648:4: rule__Alternatives__VideoseqsAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Alternatives__VideoseqsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getVideoseqsAssignment_3()); 

            }

            // InternalVideoGen.g:651:2: ( ( rule__Alternatives__VideoseqsAssignment_3 )* )
            // InternalVideoGen.g:652:3: ( rule__Alternatives__VideoseqsAssignment_3 )*
            {
             before(grammarAccess.getAlternativesAccess().getVideoseqsAssignment_3()); 
            // InternalVideoGen.g:653:3: ( rule__Alternatives__VideoseqsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVideoGen.g:653:4: rule__Alternatives__VideoseqsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Alternatives__VideoseqsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAlternativesAccess().getVideoseqsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__3__Impl"


    // $ANTLR start "rule__Alternatives__Group__4"
    // InternalVideoGen.g:662:1: rule__Alternatives__Group__4 : rule__Alternatives__Group__4__Impl ;
    public final void rule__Alternatives__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:666:1: ( rule__Alternatives__Group__4__Impl )
            // InternalVideoGen.g:667:2: rule__Alternatives__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternatives__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__4"


    // $ANTLR start "rule__Alternatives__Group__4__Impl"
    // InternalVideoGen.g:673:1: rule__Alternatives__Group__4__Impl : ( '}' ) ;
    public final void rule__Alternatives__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:677:1: ( ( '}' ) )
            // InternalVideoGen.g:678:1: ( '}' )
            {
            // InternalVideoGen.g:678:1: ( '}' )
            // InternalVideoGen.g:679:2: '}'
            {
             before(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__4__Impl"


    // $ANTLR start "rule__VideoSeq__Group__0"
    // InternalVideoGen.g:689:1: rule__VideoSeq__Group__0 : rule__VideoSeq__Group__0__Impl rule__VideoSeq__Group__1 ;
    public final void rule__VideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:693:1: ( rule__VideoSeq__Group__0__Impl rule__VideoSeq__Group__1 )
            // InternalVideoGen.g:694:2: rule__VideoSeq__Group__0__Impl rule__VideoSeq__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__VideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoSeq__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__0"


    // $ANTLR start "rule__VideoSeq__Group__0__Impl"
    // InternalVideoGen.g:701:1: rule__VideoSeq__Group__0__Impl : ( 'videoSeq' ) ;
    public final void rule__VideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:705:1: ( ( 'videoSeq' ) )
            // InternalVideoGen.g:706:1: ( 'videoSeq' )
            {
            // InternalVideoGen.g:706:1: ( 'videoSeq' )
            // InternalVideoGen.g:707:2: 'videoSeq'
            {
             before(grammarAccess.getVideoSeqAccess().getVideoSeqKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVideoSeqAccess().getVideoSeqKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__0__Impl"


    // $ANTLR start "rule__VideoSeq__Group__1"
    // InternalVideoGen.g:716:1: rule__VideoSeq__Group__1 : rule__VideoSeq__Group__1__Impl rule__VideoSeq__Group__2 ;
    public final void rule__VideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:720:1: ( rule__VideoSeq__Group__1__Impl rule__VideoSeq__Group__2 )
            // InternalVideoGen.g:721:2: rule__VideoSeq__Group__1__Impl rule__VideoSeq__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VideoSeq__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoSeq__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__1"


    // $ANTLR start "rule__VideoSeq__Group__1__Impl"
    // InternalVideoGen.g:728:1: rule__VideoSeq__Group__1__Impl : ( ( rule__VideoSeq__VidAssignment_1 )? ) ;
    public final void rule__VideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:732:1: ( ( ( rule__VideoSeq__VidAssignment_1 )? ) )
            // InternalVideoGen.g:733:1: ( ( rule__VideoSeq__VidAssignment_1 )? )
            {
            // InternalVideoGen.g:733:1: ( ( rule__VideoSeq__VidAssignment_1 )? )
            // InternalVideoGen.g:734:2: ( rule__VideoSeq__VidAssignment_1 )?
            {
             before(grammarAccess.getVideoSeqAccess().getVidAssignment_1()); 
            // InternalVideoGen.g:735:2: ( rule__VideoSeq__VidAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVideoGen.g:735:3: rule__VideoSeq__VidAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoSeq__VidAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getVidAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__1__Impl"


    // $ANTLR start "rule__VideoSeq__Group__2"
    // InternalVideoGen.g:743:1: rule__VideoSeq__Group__2 : rule__VideoSeq__Group__2__Impl rule__VideoSeq__Group__3 ;
    public final void rule__VideoSeq__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:747:1: ( rule__VideoSeq__Group__2__Impl rule__VideoSeq__Group__3 )
            // InternalVideoGen.g:748:2: rule__VideoSeq__Group__2__Impl rule__VideoSeq__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__VideoSeq__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoSeq__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__2"


    // $ANTLR start "rule__VideoSeq__Group__2__Impl"
    // InternalVideoGen.g:755:1: rule__VideoSeq__Group__2__Impl : ( '{' ) ;
    public final void rule__VideoSeq__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:759:1: ( ( '{' ) )
            // InternalVideoGen.g:760:1: ( '{' )
            {
            // InternalVideoGen.g:760:1: ( '{' )
            // InternalVideoGen.g:761:2: '{'
            {
             before(grammarAccess.getVideoSeqAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVideoSeqAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__2__Impl"


    // $ANTLR start "rule__VideoSeq__Group__3"
    // InternalVideoGen.g:770:1: rule__VideoSeq__Group__3 : rule__VideoSeq__Group__3__Impl rule__VideoSeq__Group__4 ;
    public final void rule__VideoSeq__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:774:1: ( rule__VideoSeq__Group__3__Impl rule__VideoSeq__Group__4 )
            // InternalVideoGen.g:775:2: rule__VideoSeq__Group__3__Impl rule__VideoSeq__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__VideoSeq__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoSeq__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__3"


    // $ANTLR start "rule__VideoSeq__Group__3__Impl"
    // InternalVideoGen.g:782:1: rule__VideoSeq__Group__3__Impl : ( ( rule__VideoSeq__UrlAssignment_3 ) ) ;
    public final void rule__VideoSeq__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:786:1: ( ( ( rule__VideoSeq__UrlAssignment_3 ) ) )
            // InternalVideoGen.g:787:1: ( ( rule__VideoSeq__UrlAssignment_3 ) )
            {
            // InternalVideoGen.g:787:1: ( ( rule__VideoSeq__UrlAssignment_3 ) )
            // InternalVideoGen.g:788:2: ( rule__VideoSeq__UrlAssignment_3 )
            {
             before(grammarAccess.getVideoSeqAccess().getUrlAssignment_3()); 
            // InternalVideoGen.g:789:2: ( rule__VideoSeq__UrlAssignment_3 )
            // InternalVideoGen.g:789:3: rule__VideoSeq__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VideoSeq__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__3__Impl"


    // $ANTLR start "rule__VideoSeq__Group__4"
    // InternalVideoGen.g:797:1: rule__VideoSeq__Group__4 : rule__VideoSeq__Group__4__Impl rule__VideoSeq__Group__5 ;
    public final void rule__VideoSeq__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:801:1: ( rule__VideoSeq__Group__4__Impl rule__VideoSeq__Group__5 )
            // InternalVideoGen.g:802:2: rule__VideoSeq__Group__4__Impl rule__VideoSeq__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__VideoSeq__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoSeq__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__4"


    // $ANTLR start "rule__VideoSeq__Group__4__Impl"
    // InternalVideoGen.g:809:1: rule__VideoSeq__Group__4__Impl : ( ( rule__VideoSeq__DescriptionAssignment_4 )? ) ;
    public final void rule__VideoSeq__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:813:1: ( ( ( rule__VideoSeq__DescriptionAssignment_4 )? ) )
            // InternalVideoGen.g:814:1: ( ( rule__VideoSeq__DescriptionAssignment_4 )? )
            {
            // InternalVideoGen.g:814:1: ( ( rule__VideoSeq__DescriptionAssignment_4 )? )
            // InternalVideoGen.g:815:2: ( rule__VideoSeq__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getVideoSeqAccess().getDescriptionAssignment_4()); 
            // InternalVideoGen.g:816:2: ( rule__VideoSeq__DescriptionAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVideoGen.g:816:3: rule__VideoSeq__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoSeq__DescriptionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__4__Impl"


    // $ANTLR start "rule__VideoSeq__Group__5"
    // InternalVideoGen.g:824:1: rule__VideoSeq__Group__5 : rule__VideoSeq__Group__5__Impl rule__VideoSeq__Group__6 ;
    public final void rule__VideoSeq__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:828:1: ( rule__VideoSeq__Group__5__Impl rule__VideoSeq__Group__6 )
            // InternalVideoGen.g:829:2: rule__VideoSeq__Group__5__Impl rule__VideoSeq__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__VideoSeq__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoSeq__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__5"


    // $ANTLR start "rule__VideoSeq__Group__5__Impl"
    // InternalVideoGen.g:836:1: rule__VideoSeq__Group__5__Impl : ( ( rule__VideoSeq__DurationAssignment_5 )? ) ;
    public final void rule__VideoSeq__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:840:1: ( ( ( rule__VideoSeq__DurationAssignment_5 )? ) )
            // InternalVideoGen.g:841:1: ( ( rule__VideoSeq__DurationAssignment_5 )? )
            {
            // InternalVideoGen.g:841:1: ( ( rule__VideoSeq__DurationAssignment_5 )? )
            // InternalVideoGen.g:842:2: ( rule__VideoSeq__DurationAssignment_5 )?
            {
             before(grammarAccess.getVideoSeqAccess().getDurationAssignment_5()); 
            // InternalVideoGen.g:843:2: ( rule__VideoSeq__DurationAssignment_5 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVideoGen.g:843:3: rule__VideoSeq__DurationAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoSeq__DurationAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getDurationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__5__Impl"


    // $ANTLR start "rule__VideoSeq__Group__6"
    // InternalVideoGen.g:851:1: rule__VideoSeq__Group__6 : rule__VideoSeq__Group__6__Impl rule__VideoSeq__Group__7 ;
    public final void rule__VideoSeq__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:855:1: ( rule__VideoSeq__Group__6__Impl rule__VideoSeq__Group__7 )
            // InternalVideoGen.g:856:2: rule__VideoSeq__Group__6__Impl rule__VideoSeq__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__VideoSeq__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoSeq__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__6"


    // $ANTLR start "rule__VideoSeq__Group__6__Impl"
    // InternalVideoGen.g:863:1: rule__VideoSeq__Group__6__Impl : ( ( rule__VideoSeq__Display_statsAssignment_6 )? ) ;
    public final void rule__VideoSeq__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:867:1: ( ( ( rule__VideoSeq__Display_statsAssignment_6 )? ) )
            // InternalVideoGen.g:868:1: ( ( rule__VideoSeq__Display_statsAssignment_6 )? )
            {
            // InternalVideoGen.g:868:1: ( ( rule__VideoSeq__Display_statsAssignment_6 )? )
            // InternalVideoGen.g:869:2: ( rule__VideoSeq__Display_statsAssignment_6 )?
            {
             before(grammarAccess.getVideoSeqAccess().getDisplay_statsAssignment_6()); 
            // InternalVideoGen.g:870:2: ( rule__VideoSeq__Display_statsAssignment_6 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVideoGen.g:870:3: rule__VideoSeq__Display_statsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoSeq__Display_statsAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getDisplay_statsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__6__Impl"


    // $ANTLR start "rule__VideoSeq__Group__7"
    // InternalVideoGen.g:878:1: rule__VideoSeq__Group__7 : rule__VideoSeq__Group__7__Impl ;
    public final void rule__VideoSeq__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:882:1: ( rule__VideoSeq__Group__7__Impl )
            // InternalVideoGen.g:883:2: rule__VideoSeq__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoSeq__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__7"


    // $ANTLR start "rule__VideoSeq__Group__7__Impl"
    // InternalVideoGen.g:889:1: rule__VideoSeq__Group__7__Impl : ( '}' ) ;
    public final void rule__VideoSeq__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:893:1: ( ( '}' ) )
            // InternalVideoGen.g:894:1: ( '}' )
            {
            // InternalVideoGen.g:894:1: ( '}' )
            // InternalVideoGen.g:895:2: '}'
            {
             before(grammarAccess.getVideoSeqAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVideoSeqAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__7__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalVideoGen.g:905:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:909:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalVideoGen.g:910:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalVideoGen.g:917:1: rule__Description__Group__0__Impl : ( () ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:921:1: ( ( () ) )
            // InternalVideoGen.g:922:1: ( () )
            {
            // InternalVideoGen.g:922:1: ( () )
            // InternalVideoGen.g:923:2: ()
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 
            // InternalVideoGen.g:924:2: ()
            // InternalVideoGen.g:924:3: 
            {
            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalVideoGen.g:932:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:936:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalVideoGen.g:937:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Description__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalVideoGen.g:944:1: rule__Description__Group__1__Impl : ( 'description=' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:948:1: ( ( 'description=' ) )
            // InternalVideoGen.g:949:1: ( 'description=' )
            {
            // InternalVideoGen.g:949:1: ( 'description=' )
            // InternalVideoGen.g:950:2: 'description='
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__2"
    // InternalVideoGen.g:959:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:963:1: ( rule__Description__Group__2__Impl )
            // InternalVideoGen.g:964:2: rule__Description__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2"


    // $ANTLR start "rule__Description__Group__2__Impl"
    // InternalVideoGen.g:970:1: rule__Description__Group__2__Impl : ( ( rule__Description__DescriptionAssignment_2 )? ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:974:1: ( ( ( rule__Description__DescriptionAssignment_2 )? ) )
            // InternalVideoGen.g:975:1: ( ( rule__Description__DescriptionAssignment_2 )? )
            {
            // InternalVideoGen.g:975:1: ( ( rule__Description__DescriptionAssignment_2 )? )
            // InternalVideoGen.g:976:2: ( rule__Description__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAssignment_2()); 
            // InternalVideoGen.g:977:2: ( rule__Description__DescriptionAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVideoGen.g:977:3: rule__Description__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Description__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2__Impl"


    // $ANTLR start "rule__Duration__Group__0"
    // InternalVideoGen.g:986:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:990:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalVideoGen.g:991:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Duration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0"


    // $ANTLR start "rule__Duration__Group__0__Impl"
    // InternalVideoGen.g:998:1: rule__Duration__Group__0__Impl : ( () ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1002:1: ( ( () ) )
            // InternalVideoGen.g:1003:1: ( () )
            {
            // InternalVideoGen.g:1003:1: ( () )
            // InternalVideoGen.g:1004:2: ()
            {
             before(grammarAccess.getDurationAccess().getDurationAction_0()); 
            // InternalVideoGen.g:1005:2: ()
            // InternalVideoGen.g:1005:3: 
            {
            }

             after(grammarAccess.getDurationAccess().getDurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalVideoGen.g:1013:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl rule__Duration__Group__2 ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1017:1: ( rule__Duration__Group__1__Impl rule__Duration__Group__2 )
            // InternalVideoGen.g:1018:2: rule__Duration__Group__1__Impl rule__Duration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Duration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1"


    // $ANTLR start "rule__Duration__Group__1__Impl"
    // InternalVideoGen.g:1025:1: rule__Duration__Group__1__Impl : ( 'duration=' ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1029:1: ( ( 'duration=' ) )
            // InternalVideoGen.g:1030:1: ( 'duration=' )
            {
            // InternalVideoGen.g:1030:1: ( 'duration=' )
            // InternalVideoGen.g:1031:2: 'duration='
            {
             before(grammarAccess.getDurationAccess().getDurationKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDurationAccess().getDurationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__Duration__Group__2"
    // InternalVideoGen.g:1040:1: rule__Duration__Group__2 : rule__Duration__Group__2__Impl ;
    public final void rule__Duration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1044:1: ( rule__Duration__Group__2__Impl )
            // InternalVideoGen.g:1045:2: rule__Duration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__2"


    // $ANTLR start "rule__Duration__Group__2__Impl"
    // InternalVideoGen.g:1051:1: rule__Duration__Group__2__Impl : ( ( rule__Duration__DurationAssignment_2 )? ) ;
    public final void rule__Duration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1055:1: ( ( ( rule__Duration__DurationAssignment_2 )? ) )
            // InternalVideoGen.g:1056:1: ( ( rule__Duration__DurationAssignment_2 )? )
            {
            // InternalVideoGen.g:1056:1: ( ( rule__Duration__DurationAssignment_2 )? )
            // InternalVideoGen.g:1057:2: ( rule__Duration__DurationAssignment_2 )?
            {
             before(grammarAccess.getDurationAccess().getDurationAssignment_2()); 
            // InternalVideoGen.g:1058:2: ( rule__Duration__DurationAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVideoGen.g:1058:3: rule__Duration__DurationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Duration__DurationAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDurationAccess().getDurationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__2__Impl"


    // $ANTLR start "rule__Display_stats__Group__0"
    // InternalVideoGen.g:1067:1: rule__Display_stats__Group__0 : rule__Display_stats__Group__0__Impl rule__Display_stats__Group__1 ;
    public final void rule__Display_stats__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1071:1: ( rule__Display_stats__Group__0__Impl rule__Display_stats__Group__1 )
            // InternalVideoGen.g:1072:2: rule__Display_stats__Group__0__Impl rule__Display_stats__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Display_stats__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display_stats__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display_stats__Group__0"


    // $ANTLR start "rule__Display_stats__Group__0__Impl"
    // InternalVideoGen.g:1079:1: rule__Display_stats__Group__0__Impl : ( () ) ;
    public final void rule__Display_stats__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1083:1: ( ( () ) )
            // InternalVideoGen.g:1084:1: ( () )
            {
            // InternalVideoGen.g:1084:1: ( () )
            // InternalVideoGen.g:1085:2: ()
            {
             before(grammarAccess.getDisplay_statsAccess().getDisplay_statsAction_0()); 
            // InternalVideoGen.g:1086:2: ()
            // InternalVideoGen.g:1086:3: 
            {
            }

             after(grammarAccess.getDisplay_statsAccess().getDisplay_statsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display_stats__Group__0__Impl"


    // $ANTLR start "rule__Display_stats__Group__1"
    // InternalVideoGen.g:1094:1: rule__Display_stats__Group__1 : rule__Display_stats__Group__1__Impl rule__Display_stats__Group__2 ;
    public final void rule__Display_stats__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1098:1: ( rule__Display_stats__Group__1__Impl rule__Display_stats__Group__2 )
            // InternalVideoGen.g:1099:2: rule__Display_stats__Group__1__Impl rule__Display_stats__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Display_stats__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display_stats__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display_stats__Group__1"


    // $ANTLR start "rule__Display_stats__Group__1__Impl"
    // InternalVideoGen.g:1106:1: rule__Display_stats__Group__1__Impl : ( 'display_stats=' ) ;
    public final void rule__Display_stats__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1110:1: ( ( 'display_stats=' ) )
            // InternalVideoGen.g:1111:1: ( 'display_stats=' )
            {
            // InternalVideoGen.g:1111:1: ( 'display_stats=' )
            // InternalVideoGen.g:1112:2: 'display_stats='
            {
             before(grammarAccess.getDisplay_statsAccess().getDisplay_statsKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDisplay_statsAccess().getDisplay_statsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display_stats__Group__1__Impl"


    // $ANTLR start "rule__Display_stats__Group__2"
    // InternalVideoGen.g:1121:1: rule__Display_stats__Group__2 : rule__Display_stats__Group__2__Impl ;
    public final void rule__Display_stats__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1125:1: ( rule__Display_stats__Group__2__Impl )
            // InternalVideoGen.g:1126:2: rule__Display_stats__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Display_stats__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display_stats__Group__2"


    // $ANTLR start "rule__Display_stats__Group__2__Impl"
    // InternalVideoGen.g:1132:1: rule__Display_stats__Group__2__Impl : ( ( rule__Display_stats__Display_statsAssignment_2 )? ) ;
    public final void rule__Display_stats__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1136:1: ( ( ( rule__Display_stats__Display_statsAssignment_2 )? ) )
            // InternalVideoGen.g:1137:1: ( ( rule__Display_stats__Display_statsAssignment_2 )? )
            {
            // InternalVideoGen.g:1137:1: ( ( rule__Display_stats__Display_statsAssignment_2 )? )
            // InternalVideoGen.g:1138:2: ( rule__Display_stats__Display_statsAssignment_2 )?
            {
             before(grammarAccess.getDisplay_statsAccess().getDisplay_statsAssignment_2()); 
            // InternalVideoGen.g:1139:2: ( rule__Display_stats__Display_statsAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVideoGen.g:1139:3: rule__Display_stats__Display_statsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Display_stats__Display_statsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDisplay_statsAccess().getDisplay_statsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display_stats__Group__2__Impl"


    // $ANTLR start "rule__VideoGen__VideosAssignment_3"
    // InternalVideoGen.g:1148:1: rule__VideoGen__VideosAssignment_3 : ( ruleVideoType ) ;
    public final void rule__VideoGen__VideosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1152:1: ( ( ruleVideoType ) )
            // InternalVideoGen.g:1153:2: ( ruleVideoType )
            {
            // InternalVideoGen.g:1153:2: ( ruleVideoType )
            // InternalVideoGen.g:1154:3: ruleVideoType
            {
             before(grammarAccess.getVideoGenAccess().getVideosVideoTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoType();

            state._fsp--;

             after(grammarAccess.getVideoGenAccess().getVideosVideoTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__VideosAssignment_3"


    // $ANTLR start "rule__Mandatory__VideoseqAssignment_1"
    // InternalVideoGen.g:1163:1: rule__Mandatory__VideoseqAssignment_1 : ( ruleVideoSeq ) ;
    public final void rule__Mandatory__VideoseqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1167:1: ( ( ruleVideoSeq ) )
            // InternalVideoGen.g:1168:2: ( ruleVideoSeq )
            {
            // InternalVideoGen.g:1168:2: ( ruleVideoSeq )
            // InternalVideoGen.g:1169:3: ruleVideoSeq
            {
             before(grammarAccess.getMandatoryAccess().getVideoseqVideoSeqParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getVideoseqVideoSeqParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__VideoseqAssignment_1"


    // $ANTLR start "rule__Optional__VideoseqAssignment_1"
    // InternalVideoGen.g:1178:1: rule__Optional__VideoseqAssignment_1 : ( ruleVideoSeq ) ;
    public final void rule__Optional__VideoseqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1182:1: ( ( ruleVideoSeq ) )
            // InternalVideoGen.g:1183:2: ( ruleVideoSeq )
            {
            // InternalVideoGen.g:1183:2: ( ruleVideoSeq )
            // InternalVideoGen.g:1184:3: ruleVideoSeq
            {
             before(grammarAccess.getOptionalAccess().getVideoseqVideoSeqParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getVideoseqVideoSeqParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__VideoseqAssignment_1"


    // $ANTLR start "rule__Alternatives__IdAssignment_1"
    // InternalVideoGen.g:1193:1: rule__Alternatives__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alternatives__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1197:1: ( ( RULE_ID ) )
            // InternalVideoGen.g:1198:2: ( RULE_ID )
            {
            // InternalVideoGen.g:1198:2: ( RULE_ID )
            // InternalVideoGen.g:1199:3: RULE_ID
            {
             before(grammarAccess.getAlternativesAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__IdAssignment_1"


    // $ANTLR start "rule__Alternatives__VideoseqsAssignment_3"
    // InternalVideoGen.g:1208:1: rule__Alternatives__VideoseqsAssignment_3 : ( ruleVideoSeq ) ;
    public final void rule__Alternatives__VideoseqsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1212:1: ( ( ruleVideoSeq ) )
            // InternalVideoGen.g:1213:2: ( ruleVideoSeq )
            {
            // InternalVideoGen.g:1213:2: ( ruleVideoSeq )
            // InternalVideoGen.g:1214:3: ruleVideoSeq
            {
             before(grammarAccess.getAlternativesAccess().getVideoseqsVideoSeqParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getAlternativesAccess().getVideoseqsVideoSeqParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__VideoseqsAssignment_3"


    // $ANTLR start "rule__VideoSeq__VidAssignment_1"
    // InternalVideoGen.g:1223:1: rule__VideoSeq__VidAssignment_1 : ( RULE_ID ) ;
    public final void rule__VideoSeq__VidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1227:1: ( ( RULE_ID ) )
            // InternalVideoGen.g:1228:2: ( RULE_ID )
            {
            // InternalVideoGen.g:1228:2: ( RULE_ID )
            // InternalVideoGen.g:1229:3: RULE_ID
            {
             before(grammarAccess.getVideoSeqAccess().getVidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVideoSeqAccess().getVidIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__VidAssignment_1"


    // $ANTLR start "rule__VideoSeq__UrlAssignment_3"
    // InternalVideoGen.g:1238:1: rule__VideoSeq__UrlAssignment_3 : ( RULE_STRING ) ;
    public final void rule__VideoSeq__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1242:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:1243:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:1243:2: ( RULE_STRING )
            // InternalVideoGen.g:1244:3: RULE_STRING
            {
             before(grammarAccess.getVideoSeqAccess().getUrlSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoSeqAccess().getUrlSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__UrlAssignment_3"


    // $ANTLR start "rule__VideoSeq__DescriptionAssignment_4"
    // InternalVideoGen.g:1253:1: rule__VideoSeq__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__VideoSeq__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1257:1: ( ( ruleDescription ) )
            // InternalVideoGen.g:1258:2: ( ruleDescription )
            {
            // InternalVideoGen.g:1258:2: ( ruleDescription )
            // InternalVideoGen.g:1259:3: ruleDescription
            {
             before(grammarAccess.getVideoSeqAccess().getDescriptionDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getVideoSeqAccess().getDescriptionDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__DescriptionAssignment_4"


    // $ANTLR start "rule__VideoSeq__DurationAssignment_5"
    // InternalVideoGen.g:1268:1: rule__VideoSeq__DurationAssignment_5 : ( ruleDuration ) ;
    public final void rule__VideoSeq__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1272:1: ( ( ruleDuration ) )
            // InternalVideoGen.g:1273:2: ( ruleDuration )
            {
            // InternalVideoGen.g:1273:2: ( ruleDuration )
            // InternalVideoGen.g:1274:3: ruleDuration
            {
             before(grammarAccess.getVideoSeqAccess().getDurationDurationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getVideoSeqAccess().getDurationDurationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__DurationAssignment_5"


    // $ANTLR start "rule__VideoSeq__Display_statsAssignment_6"
    // InternalVideoGen.g:1283:1: rule__VideoSeq__Display_statsAssignment_6 : ( ruleDisplay_stats ) ;
    public final void rule__VideoSeq__Display_statsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1287:1: ( ( ruleDisplay_stats ) )
            // InternalVideoGen.g:1288:2: ( ruleDisplay_stats )
            {
            // InternalVideoGen.g:1288:2: ( ruleDisplay_stats )
            // InternalVideoGen.g:1289:3: ruleDisplay_stats
            {
             before(grammarAccess.getVideoSeqAccess().getDisplay_statsDisplay_statsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDisplay_stats();

            state._fsp--;

             after(grammarAccess.getVideoSeqAccess().getDisplay_statsDisplay_statsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Display_statsAssignment_6"


    // $ANTLR start "rule__Description__DescriptionAssignment_2"
    // InternalVideoGen.g:1298:1: rule__Description__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1302:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:1303:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:1303:2: ( RULE_STRING )
            // InternalVideoGen.g:1304:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__DescriptionAssignment_2"


    // $ANTLR start "rule__Duration__DurationAssignment_2"
    // InternalVideoGen.g:1313:1: rule__Duration__DurationAssignment_2 : ( RULE_INT ) ;
    public final void rule__Duration__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1317:1: ( ( RULE_INT ) )
            // InternalVideoGen.g:1318:2: ( RULE_INT )
            {
            // InternalVideoGen.g:1318:2: ( RULE_INT )
            // InternalVideoGen.g:1319:3: RULE_INT
            {
             before(grammarAccess.getDurationAccess().getDurationINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDurationAccess().getDurationINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__DurationAssignment_2"


    // $ANTLR start "rule__Display_stats__Display_statsAssignment_2"
    // InternalVideoGen.g:1328:1: rule__Display_stats__Display_statsAssignment_2 : ( RULE_INT ) ;
    public final void rule__Display_stats__Display_statsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1332:1: ( ( RULE_INT ) )
            // InternalVideoGen.g:1333:2: ( RULE_INT )
            {
            // InternalVideoGen.g:1333:2: ( RULE_INT )
            // InternalVideoGen.g:1334:3: RULE_INT
            {
             before(grammarAccess.getDisplay_statsAccess().getDisplay_statsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDisplay_statsAccess().getDisplay_statsINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display_stats__Display_statsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});

}