package day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleAutoSuggestions5 {
	@Test

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    	driver.findElement(By.xpath("//button[@id='menu1']")).click();
    	
    	WebElement tutorialDropDown=driver.findElement(By.xpath("//a[normalize-space()='CSS']"));
    	
//    	Select select=new Select(tutorialDropDown);
//    	select.selectByVisibleText("CSS");
//    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//   	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='passnew']")));
//   	element.sendKeys("Kirti");
//   	driver.quit();
//		}
			
	}

	}


