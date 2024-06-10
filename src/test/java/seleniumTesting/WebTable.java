package seleniumTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
	 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]   //*[@id="leftcontainer"]/table/tbody/tr[1]/td[2]  
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[3]  //*[@id="leftcontainer"]/table/tbody/tr[1]/td[4]		
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[5]
		
	 /*   WebElement element = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]"));
	    System.out.print(element.getText() + " ");
	    
	    WebElement element1 = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[2]"));
	    System.out.print(element1.getText() + " ");
	    
	    WebElement element2 = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[3]"));
	    System.out.print(element2.getText() + " ");
	    
	    WebElement element3 = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[4]"));
	    System.out.print(element3.getText() + " ");
	    
	    WebElement element4 = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[5]"));
	    System.out.print(element4.getText() + " ");*/
		
		List<WebElement> rowTable0 = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr"));
		List<WebElement> columnTable0 = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		
		for(int r =1;r<=rowTable0.size();r++ ) {
			for(int c =1;c<=columnTable0.size();c++) {
				String table1 = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/thead/tr[" + r + "]/th[" + c + "]")).getText();
				System.out.print(" " + table1);
			}
			System.out.println(" ");
		
		}
		
	    List<WebElement> rowTable = driver.findElements(By.xpath("//table[@class='dataTable']//tr[2]"));
	    System.out.println("rows: " + rowTable.size());
	    List<WebElement> columnTable = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[2]/td"));
	    System.out.println("column: " + columnTable.size());
	    
	    for(int i =1;i<=rowTable.size();i++) {
	    	for(int j =1;j<=columnTable.size();j++) {
	    		String table = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
	    		System.out.print(" " + table);
	    	}
	    }
	    
			
			
			
		}
		
		
		
		
		
				
		}
		
		
		
		
	
		
	
	


