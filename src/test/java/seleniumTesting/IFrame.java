package seleniumTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.paytm.com/");
		Thread.sleep(1500);
		WebElement paytmConsumer = driver.findElement(By.xpath("//a[text()=\"Paytm for Consumer\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(paytmConsumer).build().perform();
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"dropDownData\"]/li[1]/div/div"));
		element.get(0).click();
		Thread.sleep(2000);
		//List<WebElement> element2 = driver.findElements(By.xpath("//*[@id=\"dropDownData\"]/li[1]/div/a"));
		//element2.get(0).click();
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Close']")).click();
	}

}
