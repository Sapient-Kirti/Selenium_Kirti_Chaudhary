package day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Handle {
	@Test

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.get("https://ineuron-courses.vercel.app/login");
		
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("ineuron");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement src= driver.findElement(By.xpath("//span[normalize-space()='Manage']"));

//		WebElement destination=driver.findElement(By.xpath("//span[normalize-space()='Manage']"));
	
        Actions act=new Actions(driver);
		act.moveToElement(src).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//span[normalize-space()='Manage Categories']")).click();
		
        String parent=driver.getWindowHandle();
        
        Set<String> allWindowHandle=driver.getWindowHandles();
        List<String> manage= new ArrayList<String>(allWindowHandle);
        
        String pages=manage.get(0);
        String categoryPage=manage.get(1);
        driver.switchTo().window(categoryPage);
        
        driver.findElement(By.xpath("//button[normalize-space()='Add New Category']")).click();
      
        Alert key=driver.switchTo().alert();
        key.sendKeys("Kirti");
        key.accept();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//td[text()='SwitchTbas']/following::button[1]")).click();

	}

}
