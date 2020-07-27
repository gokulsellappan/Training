package way2automation_project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hamcrest.core.CombinableMatcher.CombinableBothMatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Accordian {

	public static void main(String[] args) {
		Date date=new Date();
		String dat=date.toLocaleString();
		System.setProperty("webdriver.chrome.driver","D:/gokul/Testing/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
	    driver.findElement(By.name("firstname")).sendKeys("Gokul");
		driver.findElement(By.name("lastname")).sendKeys("Sellappan");
	    driver.findElement(By.id("sex-0")).click();
		List<WebElement> exp=driver.findElements(By.name("exp"));
		int count=exp.size();
		for(int i=0;i<count;i++) {	
			exp.get(i).click();
		}
		WebElement dd=driver.findElement(By.id("datepicker"));
		dd.sendKeys(dat);
		String s1[]={"profession","tool"};		
		for(int i=0;i<s1.length;i++) {
			List<WebElement> check1 =driver.findElements(By.name(s1[i]));
			for(int j=0;j<check1.size();j++) {
				check1.get(j).click();
		}
		}
		String txt[]= {"continents","selenium_commands"};
		Select combo=new Select(driver.findElement(By.id(txt[0])));
		Select combo1=new Select(driver.findElement(By.id(txt[1])));
		combo.selectByVisibleText("South America");
		combo1.selectByVisibleText("WebElement Commands");
		WebElement photo=driver.findElement(By.id("photo"));
		//photo.click();
		photo.sendKeys("C:/Users/Nilan/Downloads/pp.jpg");			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("time out");
	}


}
