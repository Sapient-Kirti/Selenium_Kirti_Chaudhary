package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingExcel2 {
	
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "testdata")

	public void myTest(String username, String password) {
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h4[@class='welcomeMessage']")).getText().contains("Welcome"));
	}
	
	
	@DataProvider(name = "testdata")
	 public Object [][] getTestData()
	 {
		Object [][] arr=null;
		
		try {
			XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("./testdata/SapientTestData.xlsx")));
			int rows=wb.getSheet("LoginData").getPhysicalNumberOfRows();
			int columns=wb.getSheet("LoginData").getRow(0).getPhysicalNumberOfCells();
			arr=new Object[rows][columns];
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<columns;j++) {
					arr[i][j]=wb.getSheet("LoginData").getRow(i).getCell(j).getStringCellValue();
				}
			}
			
			System.out.println(arr);
//			String username=new XSSFWorkbook(fis).getSheet("LoginData").getRow(0).getCell(0).getStringCellValue();
			wb.close();
		} catch (FileNotFoundException e) {
			System.out.println("Please check data file path"+ e.getMessage());
		} catch (IOException e) {
			System.out.println("Something went wrong IO"+ e.getMessage());
		}
		return arr;

	 }

}
