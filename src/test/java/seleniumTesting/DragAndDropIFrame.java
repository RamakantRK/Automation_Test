package seleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropIFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		
		// IFrame handling using Index
		driver.switchTo().frame(0);
		System.out.println("Moves in IFrame");
		
		// Goes back to main frame
		//driver.switchTo().parentFrame();
		
		WebElement drag = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
		

	}

}
