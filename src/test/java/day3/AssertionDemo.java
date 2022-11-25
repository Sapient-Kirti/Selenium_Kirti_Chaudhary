package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	 public void vefifyURL()
	 {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	 }
	@Test
	public void logOut() {
		
		System.out.println("log in succesfull");
		Assert.assertEquals(12, 12);

	}
	
	
	}

