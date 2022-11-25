package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestScript3 {
	@Test

	public void admin() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		Thread.sleep(2000);
    	driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
    	Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//select[@id='systemUser_userType'])[1]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("121 qaAa 12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("ABCDE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='systemUser_status']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("Kirti@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("Kirti@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Thread.sleep(2000);
//		WebElement welcomDropDown= driver.findElement(By.xpath("//a[@id='welcome']"));
//        Select select= new Select(welcomDropDown);
//        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
//       
		
		

	}

}
