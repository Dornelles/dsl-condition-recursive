/*
 * generated by Xtext 2.28.0
 */
package zbr.test.condition;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ConditionStandaloneSetup extends ConditionStandaloneSetupGenerated {

	public static void doSetup() {
		new ConditionStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}