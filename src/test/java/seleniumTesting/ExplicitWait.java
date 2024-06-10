package seleniumTesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://www.facebook.com");
		 
		 // Enter email
		 
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		 
		 System.out.println(driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value"));
		 
		 System.out.println(driver.findElement(By.xpath("//input[@name='email']")).getSize().getHeight());
		 
		 System.out.println(driver.findElement(By.xpath("//input[@name='email']")).getSize().getWidth());
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("passContainer")));
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		 
		 
		 
		 
		 

	}

}
