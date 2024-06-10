package seleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG5 {
	WebDriver driver;
	@BeforeTest
	public void setEnviornment() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.facebook.com/");
		
	}
 
	@DataProvider
	public Object[][] dataSet(){
		Object arr[][]= new Object[3][2];
		arr[0][0] = "admin";
		arr[1][0] = "12345";
		
		arr[1][0] = "ranu@gmail.com";
		arr[1][1] = "147852";
		
		arr[2][0] = "Username2";
		arr[2][1] = "Password3";
		return arr;
		
		}
	@Test(dataProvider = "dataSet")
	public void loginCheck(String username , String password) {
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(String.valueOf(password));
		
	}
	@AfterTest
	public void exit() {
		driver.quit();
	}
}
