package day5;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingWithBrowserStack {
	
	WebDriver driver;
	
    @BeforeMethod
	public void setUp() 
    {
    	
    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	
    	capabilities.setCapability("browserName", "Chrome");
    	capabilities.setCapability("browserVersion", "latest");
    	HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
    	browserstackOptions.put("os", "Windows");
    	browserstackOptions.put("osVersion", "8");
    	
    	URL url=null;
    	
    	try {
			url=new URL("https://kirtichaudhary_zpYqRg:BJPwLh6RpFPadZFJzibp@hub-cloud.browserstack.com/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

    	driver=new RemoteWebDriver(url,capabilities);

	}
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
    }
    
    @Test
    public void testing()
    {
    	driver.get("https://www.selenium.dev/");
    	Assert.assertTrue(driver.getTitle().contains("Selenium"));
    }

}
