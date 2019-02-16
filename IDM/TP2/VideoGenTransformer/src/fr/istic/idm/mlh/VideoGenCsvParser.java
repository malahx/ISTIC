package fr.istic.idm.mlh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoGeneratorModel;

public class VideoGenCsvParser {

	private VideoGeneratorModel videoGeneratorModel;

	public VideoGenCsvParser(VideoGeneratorModel videoGeneratorModel) {
		this.videoGeneratorModel = videoGeneratorModel;
	}

	public List<ParsedMediaList> parse() {
		List<ParsedMediaList> parsedMediaLists = new ArrayList<>();

		List<AlternativesMedia> alternativesMedias = videoGeneratorModel.getMedias().stream()
				.filter(m -> m instanceof AlternativesMedia).map(m -> (AlternativesMedia) m)
				.collect(Collectors.toList());
		List<OptionalMedia> optionals = videoGeneratorModel.getMedias().stream().filter(m -> m instanceof OptionalMedia)
				.map(m -> (OptionalMedia) m).collect(Collectors.toList());
		int alternatives = alternativesMedias.size();
		int totalAlternatives = alternativesMedias.stream().map(m -> m.getMedias().size()).reduce((i1, i2) -> i1 + i2).orElse(0);
		int totalOptionals = optionals.size() * 2;
		int occurence = totalOptionals * totalAlternatives + 1;

		for (int i = 0; i <= occurence; i++) {
			ParsedMediaList parsedMediaList = new ParsedMediaList();
			for (Media m : videoGeneratorModel.getMedias()) {
				parsedMediaList.getParsedMedias().addAll(parsedMedia(m));
			}
			parsedMediaLists.add(parsedMediaList);
		}
		double totalOptionalFactor = Math.pow(2, totalOptionals);
		for (int i = 0; i < totalOptionals; i++) {
			double diff = Math.pow(2, (i + 1));
			for (int j = 0; j < occurence; j++) {
				ParsedMediaList parsedMediaList = parsedMediaLists.get(j); // voir nb d'elements
				if (j % diff >= diff / 2) {
					List<ParsedMedia> parsedMedias = parsedMediaList.getParsedMedias().stream()
							.filter(m -> "OptionalMedia".equals(m.getType())).collect(Collectors.toList());
					parsedMedias.get(i).setActive(true);
				}
				for (int k = 0; k < totalAlternatives; k++) {
					List<ParsedMedia> parsedMedias = parsedMediaList.getParsedMedias().stream()
							.filter(m -> "AlternativesMedia".equals(m.getType())).collect(Collectors.toList());
					ParsedMedia parsedMedia = parsedMedias.get(k);
					double altFactor = totalOptionalFactor * Math.pow(parsedMedia.getTotalAlternative(), k + 1);
					if (j % altFactor >= altFactor / parsedMedia.getTotalAlternative()) {
						parsedMedia.setActive(true);
					}
				}
			}
		}

		return parsedMediaLists;
	}

	private List<ParsedMedia> parsedMedia(Media m) {
		List<ParsedMedia> parsedMedias = new ArrayList<>();
		if (m instanceof MandatoryMedia) {
			MandatoryMedia mandatoryMedia = (MandatoryMedia) m;
			ParsedMedia parsedMedia = new ParsedMedia();
			parsedMedia.setActive(true);
			parsedMedia.setName(mandatoryMedia.getDescription().getLocation());
			parsedMedia.setType("MandatoryMedia");
			parsedMedias.add(parsedMedia);
		}
		if (m instanceof OptionalMedia) {
			OptionalMedia optionalMedia = (OptionalMedia) m;
			ParsedMedia parsedMedia = new ParsedMedia();
			parsedMedia.setActive(false);
			parsedMedia.setName(optionalMedia.getDescription().getLocation());
			parsedMedia.setType("OptionalMedia");
			parsedMedias.add(parsedMedia);
		}
		if (m instanceof AlternativesMedia) {
			AlternativesMedia alternativesMedia = (AlternativesMedia) m;
			int totalAlternative = alternativesMedia.getMedias().size();
			for (MediaDescription media : alternativesMedia.getMedias()) {
				ParsedMedia parsedMedia = new ParsedMedia();
				parsedMedia.setActive(false);
				parsedMedia.setName(media.getLocation());
				parsedMedia.setType("AlternativesMedia");
				parsedMedia.setTotalAlternative(totalAlternative);
				parsedMedias.add(parsedMedia);
				
			}
		}
		return parsedMedias;
	}

	public VideoGeneratorModel getVideoGeneratorModel() {
		return videoGeneratorModel;
	}

	public void setVideoGeneratorModel(VideoGeneratorModel videoGeneratorModel) {
		this.videoGeneratorModel = videoGeneratorModel;
	}

}
