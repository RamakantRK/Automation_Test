package seleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class VerifyFB {
	WebDriver driver;
	@Test
	public void verifyURL() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.getTitle();
		driver.findElement(By.xpath("//input[@id='email']"));
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.facebook.com/";
		
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("URL Verified");
		
	}
	@Test(priority=2)
	public void verifyTitle() {
		String expectedTitle = "Facebook – log in or sign up";
		Assert.assertTrue(true, expectedTitle);
		System.out.println("Title Verified");
	}
	@Test(priority=3)
	public void verifyEmail() {
		boolean email = driver.findElement(By.id("email")).isDisplayed();
		Assert.assertEquals(email, true);
		System.out.println("Email field verified");
				
	}
	@Test(priority=4)
	public void verifyPass() {
		//boolean pass = driver.findElement(By.id("pass")).isDisplayed();
		Assert.assertTrue(driver.findElement(By.id("pass")).isDisplayed());
		System.out.println("Pass field verified");
	}
	@Test(priority=5)
	public void verifyLogin() {
		boolean login = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		Assert.assertEquals(login, true);
		System.out.println("LogIn field verified");
		
	}
	@Test(priority=6)
	public void verifyCreateAccount() {
		boolean createButton = driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).isEnabled();
		Assert.assertEquals(createButton, true);
		System.out.println("Create Button field verified");
}
	@AfterTest
	public void quit() {
		driver.quit();
	}
}

