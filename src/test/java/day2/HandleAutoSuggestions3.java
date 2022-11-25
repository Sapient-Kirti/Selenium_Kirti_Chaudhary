package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class HandleAutoSuggestions3 {
	@Test

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html\r\n");
    	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='25']")).click();
    	
    	Thread.sleep(3000);
    	List<WebElement> allElement=driver.findElements(By.xpath("//table[contains(@class,'calendar')]//td//a"));
		for(WebElement ele:allElement) {
			if(ele.getText().contains("26")) {
				ele.click();
				break;
			}
			
			
		}

	}

}
