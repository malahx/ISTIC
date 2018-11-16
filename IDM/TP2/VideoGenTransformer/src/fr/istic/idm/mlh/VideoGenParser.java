package fr.istic.idm.mlh;

import java.util.List;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoGeneratorModel;

public class VideoGenParser {

	private VideoGeneratorModel videoGeneratorModel;

	public VideoGenParser(VideoGeneratorModel videoGeneratorModel) {
		this.videoGeneratorModel = videoGeneratorModel;
	}

	public void start() {
		parseMedia(videoGeneratorModel.getMedias());
	}
	
	private void parseMedia(List<Media> medias) {
		medias.forEach(m -> {
			if (m instanceof MandatoryMedia) {
				MandatoryMedia mandatoryMedia = (MandatoryMedia) m;
				System.out.println(mandatoryMedia.getDescription().getLocation());
			}
			if (m instanceof OptionalMedia) {
				OptionalMedia optionalMedia = (OptionalMedia) m;
				System.out.println(optionalMedia.getDescription().getLocation());
			}
			if (m instanceof AlternativesMedia) {
				AlternativesMedia alternativesMedia = (AlternativesMedia) m;
				parseMediaDescriptions(alternativesMedia.getMedias());
			}
		});
	}
	
	private void parseMediaDescriptions(List<MediaDescription> mediaDescriptions) {
		mediaDescriptions.forEach(m -> System.out.println(m.getLocation()));
	}
}
