import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Test;

import fr.istic.VideoGenStandaloneSetup;

public class GenerateXmiTest {

	@Test
	public void exportXMI() {
		// change MyLanguage with your language name
		Injector injector = VideoGenStandaloneSetup.doSetup();
		XtextResourceSet resourceSet =  VideoGenStandaloneSetup.doSetup().getInstance(XtextResourceSet.class);

		// .ext ist the extension of the model file
		String inputURI = "file:///home/malah/Code/ISTIC/Projects/VideoGen/parser/VideoGenTransformer/src/main/resources/fr/istic/VideoGen.xtext";
		String outputURI = "file:///tmp/VideoGen.xmi";
		URI uri = URI.createURI(inputURI);
		Resource xtextResource = resourceSet.getResource(uri, true);

		EcoreUtil.resolveAll(xtextResource);

		Resource xmiResource = resourceSet.createResource(URI.createURI(outputURI));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
