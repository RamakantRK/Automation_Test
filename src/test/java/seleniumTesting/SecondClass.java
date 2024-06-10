package seleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		Thread.sleep(1500);
		driver.navigate().to("https://www.facebook.com");
		
		String s = driver.getTitle();
		
		if(s.equals("Facebook – log in or sign up")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		Thread.sleep(1500);
		driver.quit();
		
		

	}

}
