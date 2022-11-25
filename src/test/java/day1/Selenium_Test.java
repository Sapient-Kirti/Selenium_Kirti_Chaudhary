package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_Test {
	
	@Test

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Your name");
		String title=driver.getTitle();
		Assert.assertTrue(driver.getCurrentUrl().contains(title));
		System.out.println("Title is "+ title);
		String url=driver.getCurrentUrl();
		System.out.println("URL is"+url);
		//driver.quit();
	}

}
