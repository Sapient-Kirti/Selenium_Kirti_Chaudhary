package day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleAutoSuggestions4 {
	@Test

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    	Alert element=wait.until(ExpectedConditions.alertIsPresent());
    	
    	Alert alt= driver.switchTo().alert();
//  	alt.accept();
  	alt.getText();
    	
    	for(int i=0;i<20;i++)
	{
			try 
			{
			if(alt.getText().contains("Selenium")) {
				alt.accept();
			}
			}
			catch(Exception e){	
			}
    	//driver.quit();
		}
	}
}


