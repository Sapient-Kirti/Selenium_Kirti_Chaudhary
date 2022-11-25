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

import com.beust.jcommander.Parameter;

public class TestingWithBrowserStack2 {
	
	
	
	WebDriver driver;
	//WebDriver driver1;
	@Parameters({"browserName","browserVersion","os","osVersion"})
	
    @BeforeMethod
	public void setUp(String browserName,String browserVersion,String os,String osVersion) 
    {
    	
    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	DesiredCapabilities capabilities1=new DesiredCapabilities();
    	
    	capabilities1.setCapability("browserName", browserName);
    	capabilities1.setCapability("browserVersion", browserVersion);
    	HashMap<String, Object> browserstackOptions1 = new HashMap<String, Object>();
    	browserstackOptions1.put("os", os);
    	browserstackOptions1.put("osVersion", osVersion);
    	
    	
//    	capabilities.setCapability("browserName", "Safari");
//    	capabilities.setCapability("browserVersion", "16.0");
//    	HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
//    	browserstackOptions.put("os", "OS X");
//    	browserstackOptions.put("osVersion", "Ventura");
//    	browserstackOptions.put("local", "false");
//    	browserstackOptions.put("seleniumVersion", "3.14.0");
    	
    	URL url=null;
    	
    	try {
			url=new URL("https://kirtichaudhary_zpYqRg:BJPwLh6RpFPadZFJzibp@hub-cloud.browserstack.com/wd/hub");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
    	driver=new RemoteWebDriver(url,capabilities);
//    	driver1=new RemoteWebDriver(url,capabilities1);
    	
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
//    	driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
    	

	}
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
//    	driver1.quit();
    }
    
    @Test
    public void testing()
    {
    	driver.get("https://www.selenium.dev/");
    	driver.manage().window().maximize();
    	Assert.assertTrue(driver.getTitle().contains("Selenium"));
    }
    	
    @Test
    
    public void testing1()
    {
    	driver.get("https://www.selenium.dev/");
//    	driver1.manage().window().maximize();
//    	Assert.assertTrue(driver1.getTitle().contains("Selenium"));
    }

}
