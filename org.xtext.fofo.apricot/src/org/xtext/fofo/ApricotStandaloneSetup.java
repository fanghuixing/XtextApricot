/*
* generated by Xtext
*/
package org.xtext.fofo;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ApricotStandaloneSetup extends ApricotStandaloneSetupGenerated{

	public static void doSetup() {
		new ApricotStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

