package Learn.CucumberSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("F:\\Udemy_cucumber 13 Feb\\Cucumber workspace\\CucumberSelenium\\src\\test\\java\\Learn\\CucumberSelenium\\global.properties");
		
		prop.load(fis);
		
       System.setProperty("webdriver.chrome.driver", "F:\\Udemy_cucumber 13 Feb\\chrome_driver_v87\\chromedriver.exe");
    	
    	driver = new ChromeDriver();
    	
    	driver.get(prop.getProperty("url"));
    	
    	return driver;
	}

}
