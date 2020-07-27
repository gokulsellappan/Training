package way2automation_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class login_check {
	
	public static void main(String arg[]) throws IOException, EncryptedDocumentException, InvalidFormatException {
		System.setProperty("webdriver.chrome.driver","D:/gokul/Testing/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		File f=new File("D:\\FileInput\\input01.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book= WorkbookFactory.create(fi);
		Sheet sheet0=book.getSheetAt(0);
		//Row row=sheet0.getRow(0);
		//Cell cell=row.getCell(0);
		//System.out.println(cell);		
		List<Object> list =new ArrayList<Object>();
		for(Row r1:sheet0)
		for(Cell c1:r1) {
			list.add(c1);
		}
		System.out.println(list);
		fi.close();
		for(int i=0;i<list.size();i++) {
			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			driver.manage().window().maximize();
			WebElement email=driver.findElement(By.id("email"));
			WebElement password=driver.findElement(By.id("passwd"));
			Object sr=list.get(i);
			String s1=sr.toString();
			CharSequence cs=s1;
			email.sendKeys(cs);
			Object sr1=list.get(i+1);
			String s2=sr1.toString();
			CharSequence cs1=s2;
			password.sendKeys(cs1);
			i++;
			
		}
		driver.close();
		
	}

}
