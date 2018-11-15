import static org.junit.Assert.*;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import fr.istic.idm.mlh.VideoGenParser;
import fr.istic.videoGen.VideoGeneratorModel;

public class VideoGenTest1 {
	
	@Test
	public void testInJava1() {
		
		VideoGeneratorModel videoGen = new VideoGenHelper().loadVideoGenerator(URI.createURI("example.videogen"));
		assertNotNull(videoGen);
		
		VideoGenParser videoGenParser = new VideoGenParser(videoGen);
		videoGenParser.start();
	}


}