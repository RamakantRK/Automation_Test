package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		// Switch to alert text
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		String expectText = "Press a Button !";
		if(alertText.equals(expectText)) {
			System.out.println("Alert Text Verified");
		} else {
			System.out.println("Failed");
		}
		Thread.sleep(1500);
		// Click to Ok button
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		// click to cancel button
		//driver.switchTo().alert().dismiss();

	}

}
