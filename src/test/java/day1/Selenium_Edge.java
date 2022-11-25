package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_Edge {
	
	@Test

	public void name() {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Your name");
		String title= driver.getTitle();
		Assert.assertTrue(driver.getCurrentUrl().contains(".com"));
		System.out.println("Tile is "+ title);
		String url=driver.getCurrentUrl();
		System.out.println("your url is"+ url);

	}

}
