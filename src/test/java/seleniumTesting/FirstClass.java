package seleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		SessionId s = ((RemoteWebDriver)driver).getSessionId();
		System.out.println("Session Id " + s);
		
		
		Thread.sleep(1000); //stop the opertion for the given time
		driver.manage().window().maximize(); // maximize the window
		
		Thread.sleep(1000);
		driver.manage().deleteAllCookies(); // delete all cookies
		
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com"); // navigate to the provided URL
		
		Thread.sleep(1500);
		driver.navigate().back();  // Back to the previous page
		
		Thread.sleep(1500);
		driver.navigate().forward();  // Back to the forward page		
		
		Thread.sleep(2000);
		driver.navigate().refresh(); // Refresh the page
		
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		
		//driver.close(); //closes the current window
		driver.quit(); // closes all the windows
		
		

	}

}
