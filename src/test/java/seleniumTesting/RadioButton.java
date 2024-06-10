package seleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		//Navigate to FB.com
		//Click on create new account
		//Click on Male radio button
		//verify that the radio button is enabled
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Navigate to FB
		driver.get("https://www.facebook.com/");
			
		// Click on create new account
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(2000);
		
		// Click on Male Radio button
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(1500);
		
		// verify that the radio button is enabled
		System.out.println(driver.findElement(By.xpath("//input[@value='2']")).isEnabled());
		
		
		// 2nd Method
		
		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Number of Radio Buttons " + radioButton.size());
		driver.quit();
	}
	
	

}
