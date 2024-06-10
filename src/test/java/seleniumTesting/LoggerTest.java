package seleniumTesting;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggerTest {
	public static Logger log;

	public static void main(String[] args) {
		log = LogManager.getLogger(LoggerTest.class);

		WebDriver driver= new ChromeDriver();
		log.info("Chrome Launched");
		driver.manage().window().maximize();
		log.info("Window Maximized");
		// verify that site open correctly
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		log.info("Implicit Wait");
		driver.get("http://www.fb.com");
		log.info("URL FB Launched");
		driver.getTitle();
		log.info("Tile");
		driver.getCurrentUrl();
		log.info("Current URL");
		// verify that login with invalid user name & password 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		log.info("Email Entered");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		log.info("Password Entered");
		
		driver.quit();
		log.info("Browser Closed");
		System.out.println("All Items Opened");
		
	}

}
