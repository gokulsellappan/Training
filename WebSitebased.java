package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSitebased{
	public static void main(String arg[]){
		System.setProperty("webdriver.chrome.driver","D:/gokul/Testing/selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcergo.com/");   
		//driver.findElement(By.className("icon-menu")).click();
    	//driver.findElement(By.partialLinkText("Car Insurance")).click();
    	driver.findElement(By.xpath("//step active[@href=/car-insurance"));
    	
    	//	driver.findElement(By.partialLinkText("Cyber Insurance")).click();
//	    String s1[]= {"Car Insurance","Bike/Scooter Insurance","Health Insurance"};	
//	    for(int i =0;i<s1.length;i++) {
//	    	driver.findElements(By.linkText(s1[i]));
//	    	driver.navigate().back();
//	    	driver.findElement(By.className("icon-menu")).click();
//	    	driver.findElement(By.className("panel-heading")).click();
//	    }
    	driver.close();
 
	}
}
