package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestScript2 {
	@Test
	
	
	public void addValue() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("New user? Signup")).click();
////		Assert.assertTrue(driver.getCurrentUrl().contains("signup"));
//		
//		driver.findElement(By.xpath("//a[normalize-space()='New user? Signup']")).click();
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sapient");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sapient1@gmail.com");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abcdef@1");
//		driver.findElement(By.xpath("(//label[normalize-space()='Testing'])[1]")).click();
//		driver.findElement(By.xpath("(//input[@id='gender'])[1]")).click();
//		
//	  WebElement stateDropDown= driver.findElement(By.xpath("//select[@id='state']"));
//      Select select= new Select(stateDropDown);
//       select.selectByVisibleText("Karnataka");
//		
//       
//        driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
//        
//       
//        
		

	}

}
