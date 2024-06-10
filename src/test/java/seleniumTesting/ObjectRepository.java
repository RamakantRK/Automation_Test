package seleniumTesting;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
         // File class always specify the location of the property file
		File or1 = new File("C:\\Users\\katar\\eclipse-workspace\\selenuimTesting\\Repository\\config.properties");
		File or2 = new File("C:\\Users\\katar\\eclipse-workspace\\selenuimTesting\\Repository\\locators.properties");
		File or3 = new File("C:\\Users\\katar\\eclipse-workspace\\selenuimTesting\\Repository\\testdata.properties");
		
		// FileInputStream this class loads the file
		FileInputStream config1 = new FileInputStream(or1);
		FileInputStream locator1 = new FileInputStream(or2);
		FileInputStream testdata1 = new FileInputStream(or3);
		
		// Properties this class reads the property file
		Properties config2 = new Properties();
		config2.load(config1);
		Properties locators2 = new Properties();
		locators2.load(locator1);
		Properties testdata2 = new Properties();
		testdata2.load(testdata1);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config2.getProperty("URL"));
		driver.findElement(By.xpath(locators2.getProperty("Email"))).sendKeys(testdata2.getProperty("TestDataEmail"));
		driver.findElement(By.xpath(locators2.getProperty("Password"))).sendKeys(testdata2.getProperty("TestDataPassword"));
	}

}
