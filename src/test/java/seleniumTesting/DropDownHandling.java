package seleniumTesting;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(1500);
		
		// WebElement is Interface
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']//option"));
		System.out.println("Number of dropdown values " + birthMonth.size());
		birthMonth.get(8).click();
		
	// 2nd way
		
		WebElement birthMonth1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(birthMonth1);
		Thread.sleep(1500);
		month.selectByVisibleText("Apr");
		Thread.sleep(1500);
		month.selectByValue("10");
		Thread.sleep(1500);
		month.selectByIndex(11);
		System.out.println(month.getFirstSelectedOption().getText());
		Thread.sleep(1500);
		
		// 3rd way
		List<WebElement> dropdown = month.getOptions();
		String monthName = "Sep";
		for(int i=0;i<dropdown.size();i++) {
			if(dropdown.get(i).getText().equalsIgnoreCase(monthName)) {
				dropdown.get(i).click();
				System.out.println("Desired Month Clicked");
			}
			
		}
		
		// 4th way
	    birthMonth1.sendKeys("Jul");
		Thread.sleep(1500);
		
		// 5th way
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
		
		
	
		driver.quit();
		
		
		
		
	}

}
