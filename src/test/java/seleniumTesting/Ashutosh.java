package seleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ashutosh {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		// verify that site open correctly
		driver.get("http://www.fb.com");
		System.out.println("Title - " + driver.getTitle());
		System.out.println("URL - " + driver.getCurrentUrl());
		// verify that login with invalid user name & password 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(1500);
		// showing invalid password or id go back
		driver.navigate().back();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(1500);
		// verify that login with numbers
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123456@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("124563");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(1500);
		// verify that login with null value
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(" ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1500);
		// verify that click to forgot password link
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
		driver.navigate().back();
		
		JavascriptExecutor newDriver = (JavascriptExecutor)driver;
		newDriver.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1500);
		newDriver.executeScript("window.scrollBy(0,-300)"); 
		Thread.sleep(1500);
		// create new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Ramakant");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("katariya");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8791306388");
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Ranu@8557188");
		List<WebElement> date = driver.findElements(By.xpath("//select[@id='day']//option"));
		date.get(1).click();
		List<WebElement> month = driver.findElements(By.xpath("//select[@title='Month']//option"));
		month.get(3).click();
		driver.findElement(By.xpath("//select[@title='Year']")).sendKeys("1996");
		
		List<WebElement> gender = driver.findElements(By.xpath("//span[@data-name=\"gender_wrapper\"]//label"));
		System.out.println("Types of Gender- " + gender.size());
		gender.get(1).click();
		Thread.sleep(1500);
		driver.quit();
		
		
		

	}

}
