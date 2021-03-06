/*
 * generated by Xtext 2.15.0
 */
package org.xtext.mlh.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.mlh.ide.contentassist.antlr.internal.InternalVideoGenParser;
import org.xtext.mlh.services.VideoGenGrammarAccess;

public class VideoGenParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(VideoGenGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, VideoGenGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getVideoTypeAccess().getAlternatives(), "rule__VideoType__Alternatives");
			builder.put(grammarAccess.getVideoGenAccess().getGroup(), "rule__VideoGen__Group__0");
			builder.put(grammarAccess.getMandatoryAccess().getGroup(), "rule__Mandatory__Group__0");
			builder.put(grammarAccess.getOptionalAccess().getGroup(), "rule__Optional__Group__0");
			builder.put(grammarAccess.getAlternativesAccess().getGroup(), "rule__Alternatives__Group__0");
			builder.put(grammarAccess.getVideoSeqAccess().getGroup(), "rule__VideoSeq__Group__0");
			builder.put(grammarAccess.getDescriptionAccess().getGroup(), "rule__Description__Group__0");
			builder.put(grammarAccess.getDurationAccess().getGroup(), "rule__Duration__Group__0");
			builder.put(grammarAccess.getDisplay_statsAccess().getGroup(), "rule__Display_stats__Group__0");
			builder.put(grammarAccess.getVideoGenAccess().getVideosAssignment_3(), "rule__VideoGen__VideosAssignment_3");
			builder.put(grammarAccess.getMandatoryAccess().getVideoseqAssignment_1(), "rule__Mandatory__VideoseqAssignment_1");
			builder.put(grammarAccess.getOptionalAccess().getVideoseqAssignment_1(), "rule__Optional__VideoseqAssignment_1");
			builder.put(grammarAccess.getAlternativesAccess().getIdAssignment_1(), "rule__Alternatives__IdAssignment_1");
			builder.put(grammarAccess.getAlternativesAccess().getVideoseqsAssignment_3(), "rule__Alternatives__VideoseqsAssignment_3");
			builder.put(grammarAccess.getVideoSeqAccess().getVidAssignment_1(), "rule__VideoSeq__VidAssignment_1");
			builder.put(grammarAccess.getVideoSeqAccess().getUrlAssignment_3(), "rule__VideoSeq__UrlAssignment_3");
			builder.put(grammarAccess.getVideoSeqAccess().getDescriptionAssignment_4(), "rule__VideoSeq__DescriptionAssignment_4");
			builder.put(grammarAccess.getVideoSeqAccess().getDurationAssignment_5(), "rule__VideoSeq__DurationAssignment_5");
			builder.put(grammarAccess.getVideoSeqAccess().getDisplay_statsAssignment_6(), "rule__VideoSeq__Display_statsAssignment_6");
			builder.put(grammarAccess.getDescriptionAccess().getDescriptionAssignment_2(), "rule__Description__DescriptionAssignment_2");
			builder.put(grammarAccess.getDurationAccess().getDurationAssignment_2(), "rule__Duration__DurationAssignment_2");
			builder.put(grammarAccess.getDisplay_statsAccess().getDisplay_statsAssignment_2(), "rule__Display_stats__Display_statsAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private VideoGenGrammarAccess grammarAccess;

	@Override
	protected InternalVideoGenParser createParser() {
		InternalVideoGenParser result = new InternalVideoGenParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public VideoGenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
