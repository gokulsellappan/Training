package newpackage;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyClass {
	public static void main(String[] args){
		Scanner brows = new Scanner(System.in);
		System.out.println("Enter browser");
		String obj= brows.nextLine();
		System.out.println(obj);
		System.setProperty("webdriver.chrome.driver","D:/gokul/Testing/selenium/chromedriver.exe");
		System.setProperty("webdriver.ie.driver","D:/gokul/Testing/selenium/IEDriverServer.exe");
		String baseUrl = "https://www.licindia.in/";
	       if(obj.contentEquals("chrome")) {
	    	   WebDriver driver = new ChromeDriver();
			driver.get(baseUrl);
			//WebDriverWait mywait= new WebDriverWait(driver, 10);
			System.out.println(driver.getTitle());
	        driver.close();
	       }
	       else {
			WebDriver driver = new InternetExplorerDriver();
			driver.get(baseUrl);
			WebDriverWait mywait= new WebDriverWait(driver, 10);
			mywait.withTimeout(10, TimeUnit.SECONDS);
			System.out.println(driver.getTitle());
			driver.close();
	        driver.quit();
	}

}
}

