package day5;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoitExample {
	
public static void main(String args[]) throws IOException, InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	Actions act=new Actions(driver);
	
	WebElement w=driver.findElement(By.xpath("//input[@id='file-upload']"));
	act.moveToElement(w).click().perform();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("\"C:\\Users\\kirchaud1\\Desktop\\autoit.exe\"");
	
	driver.findElement(By.id("file-submit")).click();

}

}
