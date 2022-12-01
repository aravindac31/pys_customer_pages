package pys.enums;

import org.testng.annotations.BeforeMethod;
import org.testng.reporters.*;


public class BaseTest{
	
	protected BaseTest() {
		
	}
	@BeforeMethod
	public void launchapp() {
		UiDriver.initializedriver(PropertyManager.getBrowserTypeProperty());
		
	}
}