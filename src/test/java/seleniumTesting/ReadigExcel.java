package seleniumTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadigExcel {

	public static void main(String[] args) throws Exception {
		
		// Specifying the location
		File f1 = new File("C:\\Users\\katar\\eclipse-workspace\\selenuimTesting\\Excel\\Test Sheet.xlsx");
		
		//load file
		FileInputStream workbook = new FileInputStream(f1);
		
		//load worksheet
		XSSFWorkbook wb = new XSSFWorkbook(workbook);
		
		//load sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		
		double cellValue = sheet.getRow(2).getCell(1).getNumericCellValue();
		System.out.println((int)cellValue);
		
		// Total numbers of rows
		System.out.println(sheet.getPhysicalNumberOfRows());
		
		// Total numbers of cell .... cell called as columns
		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// verify that site open correctly
		driver.get("http://www.fb.com");
		// verify that login with invalid user name & password 
		//Enter email through excel
		String email = sheet.getRow(2).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		
		double pass = sheet.getRow(2).getCell(1).getNumericCellValue();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(String.valueOf(pass));
		
		
	}

}
