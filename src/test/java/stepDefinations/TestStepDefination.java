package stepDefinations;

import org.junit.Assert;
//import org.junit.runner.RunWith;
import Learn.CucumberSelenium.Base;
import io.cucumber.java.en.Then;
//import io.cucumber.junit.Cucumber;
import pageObjects.CheckoutPage;

//@RunWith(Cucumber.class)
public class TestStepDefination extends Base{
	
	CheckoutPage cp;

	//Normal test
//    @Then("^Verify selected \"([^\"]*)\" item is displayed on checkout page$")
//    public void verify_selected_something_item_is_displayed_on_checkout_page(String strArg1) throws Throwable {
//     
//    	cp = new CheckoutPage(driver);
//    	Assert.assertTrue(cp.getProductName().getText().contains(strArg1));
//    	
//    	Thread.sleep(5000);
//    	System.out.println("Expected Item is displayed on checkout page");
//    }
    
    //Parameterized test
    @Then("^Verify selected (.+) item is displayed on checkout page$")
    public void verify_selected_item_is_displayed_on_checkout_page(String name) throws Throwable {
       
    	cp = new CheckoutPage(driver);
    	Assert.assertTrue(cp.getProductName().getText().contains(name));
    	
    	Thread.sleep(5000);
    	System.out.println("Expected Item is displayed on checkout page");
    }
    
    
}




