/*
 * generated by Xtext 2.15.0
 */
package org.xtext.mlh.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.mlh.VideoGen.ui.internal.VideoGenActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class VideoGenExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(VideoGenActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		VideoGenActivator activator = VideoGenActivator.getInstance();
		return activator != null ? activator.getInjector(VideoGenActivator.ORG_XTEXT_MLH_VIDEOGEN) : null;
	}

}
