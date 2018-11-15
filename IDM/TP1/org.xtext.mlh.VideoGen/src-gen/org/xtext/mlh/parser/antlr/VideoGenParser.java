/*
 * generated by Xtext 2.15.0
 */
package org.xtext.mlh.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.mlh.parser.antlr.internal.InternalVideoGenParser;
import org.xtext.mlh.services.VideoGenGrammarAccess;

public class VideoGenParser extends AbstractAntlrParser {

	@Inject
	private VideoGenGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalVideoGenParser createParser(XtextTokenStream stream) {
		return new InternalVideoGenParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "VideoGen";
	}

	public VideoGenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}