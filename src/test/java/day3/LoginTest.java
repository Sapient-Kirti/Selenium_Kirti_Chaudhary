package day3;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;	
	@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
//		driver.findElement(By.linkText("Username"));
//		driver.findElement(By.linkText("Password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Running After Method- Browser closed");
	}
	
	@Test
	public void verifyUrl() {
		Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
	}
	
	@Test
	public void verifLoginWithValidCredentials() {
		WebElement u=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		u.sendKeys("Admin");
		WebElement p=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		p.sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
	@Test
	public void verifyWithWrongUsername() {
		WebElement u=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		u.sendKeys("adm");
		WebElement p=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		p.sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#spanMessage")).getText().contains("Invalid credentials"));
//		Assert.assertTrue(driver.getCurrentUrl().contains("validateCredentials"));
		
	}
	public void verifyWithWrongPassword() {
		WebElement u=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		u.sendKeys("Admin");
		WebElement p=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		p.sendKeys("ASDFwhuhpp3lhdz3k");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#spanMessage")).getText().contains("Invalid credentials"));
		Assert.assertTrue(driver.getCurrentUrl().contains("validateCredentials"));
		
	}
	@Test
	
	
	public void verifywithBalank() {
		
		WebElement u=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		u.sendKeys("");
		WebElement p=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		p.sendKeys("");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#spanMessage")).getText().contains("Username cannot be empty"));
		
	}
	
	}

