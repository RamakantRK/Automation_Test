package seleniumTesting;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptInCode {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.facebook.com");
		// JavascriptExecutor Interface
		JavascriptExecutor newDriver = (JavascriptExecutor)driver;		
		Thread.sleep(1500);
		
		newDriver.executeScript("document.getElementById('email').value='abc@gmail.com'");
		Thread.sleep(1500);
		newDriver.executeScript("document.getElementById('pass').value='123456'");
		Thread.sleep(1500);
		// Scroll down
		newDriver.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1500);
		newDriver.executeScript("window.scrollBy(0,-300)");
		

	}

}
