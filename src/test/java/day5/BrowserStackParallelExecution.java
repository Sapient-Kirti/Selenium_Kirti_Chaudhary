package day5;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserStackParallelExecution {
	
	WebDriver driver;
	//WebDriver driver1;
	@Parameters({"browserName","browserVersion","os","osVersion"})
	
    @BeforeMethod
	public void setUp(String browserName,String browserVersion,String os,String osVersion) 
    {
    	
    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability("browserName", browserName);
    	capabilities.setCapability("browserVersion", browserVersion);
    	capabilities.setCapability("os", os);
    	capabilities.setCapability("osVersion", osVersion);
    	
    	URL url=null;
    	
    	try {
			url=new URL("https://kirtichaudhary_zpYqRg:BJPwLh6RpFPadZFJzibp@hub-cloud.browserstack.com/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
    	driver=new RemoteWebDriver(url,capabilities);
    	
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));	

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
    	driver.manage().window().maximize();
    	Assert.assertTrue(driver.getTitle().contains("Selenium"));
    }
    	

}