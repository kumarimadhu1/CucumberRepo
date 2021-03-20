package stepDefinations;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Learn.CucumberSelenium.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.Homepage;

@RunWith(Cucumber.class)
public class LoginDefination {
	
	public WebDriver driver;
	Homepage h;
    
    @Given("^User is on Greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
        System.out.println("on greencart landing page");
        
        driver = Base.getDriver();
    
    }
   
    //Normal calling -no parameterization
//    @When("^User search for \"([^\"]*)\" vegetable$")
//    public void user_search_for_something_vegetable(String strArg1) throws Throwable {
//    	
//    	h = new Homepage(driver);
//    	h.getSearch().sendKeys(strArg1);
//    	Thread.sleep(3000);
//    	System.out.println("search done");
//    }
    
    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    	System.out.println("search results displayed");
    
    }
    
    
    //Parameterized test
    @When("^User search for (.+) vegetable$")
    public void user_search_for_vegetables(String name) throws Throwable {
    	
    	h = new Homepage(driver);
    	h.getSearch().sendKeys(name);
    	Thread.sleep(3000);
    	System.out.println("search done");
    
    }   
    

    //second scenario
    @And("^Added item to cart$")
    public void added_item_to_cart() throws Throwable {
    	
    	driver.findElement(By.cssSelector("a.increment")).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).click();
    	System.out.println("Item qty raised to 2 and added to cart");
        
    }

    @And("^User proceed to checkout page$")
    public void user_proceed_to_checkout_page() throws Throwable {
       
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
    	System.out.println("Proceed to checkout done");
    }
    
//    @Then("^Verify selected \"([^\"]*)\" item is displayed on checkout page$")
//    public void verify_selected_something_item_is_displayed_on_checkout_page(String strArg1) throws Throwable {
//     
//    	Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
//    	Thread.sleep(5000);
//    	System.out.println("Expected Item is displayed on checkout page");
//    }
    
    
   

}










