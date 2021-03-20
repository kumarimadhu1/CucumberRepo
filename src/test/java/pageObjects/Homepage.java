package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
  public WebDriver driver;
	
   public Homepage(WebDriver driver) {
	   
	   this.driver = driver;
   }
	
	
	
	By search = By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/form/input");
			
	public WebElement getSearch() {
		
		return driver.findElement(search);
	}

}

