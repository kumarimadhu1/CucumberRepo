package stepDefinations;

import Learn.CucumberSelenium.Base;
import io.cucumber.java.After;

public class Hooks extends Base {
	
	
	@After("@SmokeTest or @SeleniumTest")
	public void afterSeleniumTest() {
		
		driver.close();
		
	}

}
