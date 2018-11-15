/*
 * generated by Xtext 2.15.0
 */
package org.xtext.mlh.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.mlh.VideoGenRuntimeModule
import org.xtext.mlh.VideoGenStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class VideoGenIdeSetup extends VideoGenStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new VideoGenRuntimeModule, new VideoGenIdeModule))
	}
	
}