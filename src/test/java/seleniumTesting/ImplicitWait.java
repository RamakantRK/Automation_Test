package seleniumTesting;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How Stuff works");
		
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		String expSuggestions = "how stuff works quiz";
		for(int i= 0; i<autoSuggestions.size();i++) {			 
				if(autoSuggestions.get(i).getText().equalsIgnoreCase(expSuggestions)); {
					autoSuggestions.get(i).click();
				}
				
			
			
		

	}
	}

}
