package day5;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "C:\\Users\\kirchaud1\\Desktop\\files");

		options.setExperimentalOption("prefs", prefs);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[normalize-space()='input.json']")).click();
		//File f=new File("C:\\Users\\kirchaud1\\Desktop\\files");
		//String a[]=f.list();
	   int l=0;
	   while(l==0) {
		   File f=new File("C:\\Users\\kirchaud1\\Desktop\\files");
			String a[]=f.list();
		   l=a.length;
	   }
	   System.out.println(l);

	}

}
