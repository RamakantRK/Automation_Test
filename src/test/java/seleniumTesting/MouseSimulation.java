package seleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("http://www.flipkart.com");
      
      // Web Element Reference
      WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
      WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
      WebElement mobiles = driver.findElement(By.xpath("//span[text()='Mobiles']"));   
      WebElement hm = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
      Actions act = new Actions(driver);
      
      // Move Hover
      act.moveToElement(electronics).build().perform();
      System.out.println("Electronics Hover Works");
      Thread.sleep(1500);
      act.moveToElement(fashion).build().perform();
      System.out.println("Fashion Hover Works");
      Thread.sleep(1500);
      act.moveToElement(hm).build().perform();
      Thread.sleep(2000);
      
      
      
      // Keyboard Simulations
      act.sendKeys(mobiles, Keys.ENTER).build().perform();
      System.out.println("Mobile button clicked");      
      Thread.sleep(1500);
      
      JavascriptExecutor js = (JavascriptExecutor)driver;		
		Thread.sleep(1500);
		
				// Scroll down
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(1500);
			
		js.executeScript("window.scrollBy(0,-1000)","");
	    Thread.sleep(1500);
	    js.executeScript("window.scrollBy(0,-1000)","");
	    Thread.sleep(1500);
	    js.executeScript("window.scrollBy(0,-1000)","");
	    Thread.sleep(1500);
	    js.executeScript("window.scrollBy(0,-1000)","");
	    Thread.sleep(1500);
	    js.executeScript("window.scrollBy(0,-1000)","");
	    Thread.sleep(1500);
	    js.executeScript("window.scrollBy(0,-1000)","");
	    Thread.sleep(1500);
	    js.executeScript("window.scrollBy(0,-1000)","");
	    Thread.sleep(1500);
	    js.executeScript("window.scrollBy(0,-1000)","");
	    Thread.sleep(1500);
	    js.executeScript("window.scrollBy(0,-1000)","");
	    Thread.sleep(1500);
	    js.executeScript("window.scrollBy(0,-1000)","");
	    Thread.sleep(1500);
	          
        driver.quit();
    
    
      
      
      
      
      
      
      

	}

}
