package seleniumTesting;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		// Get the total numbers of Windows
		Set<String> allWindowsID = driver.getWindowHandles(); // Extract the Windows ID
		System.out.println(allWindowsID);
		
		Iterator<String> windowsID = allWindowsID.iterator(); // Storing the extracted windows ID
		// Store windows id
		String win1 = windowsID.next(); // return window ID
		String win2 = windowsID.next();
		 // Get to Window
		driver.switchTo().window(win1);
		System.out.println("Print window ID-> " + win1);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(win2);
		System.out.println("New Tab Window -> " + win2);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();
		

		
	}

}
