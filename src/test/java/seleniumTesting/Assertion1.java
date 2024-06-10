package seleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Assertion1 {
	WebDriver driver;
	@BeforeTest
	public void test1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.facebook.com/");
	}
	 @Test
	public void validateText() {
		 String expectedText = "Facebook helps you connect and share with the people in your life.";
		 Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='_8eso']")).isDisplayed());
	//	 String actualText = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
	//	 Assert.assertEquals(actualText, expectedText);
		 System.out.println("Test case Passed");
		
	}
	 @AfterTest
	 public void quit() {
		 driver.quit();
	 }

}
