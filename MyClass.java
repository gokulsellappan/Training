package newpackage;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyClass {
	public static void main(String[] args) {
		Scanner brows = new Scanner(System.in);
		System.out.println("Enter browser");
		String obj= brows.nextLine();
		System.out.println(obj);
	       if(obj.contentEquals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:/gokul/Testing/selenium/chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			String baseUrl1 = "https://www.licindia.in/";
			driver1.get(baseUrl1);
	        driver1.close();
	       }
	       else {
			System.setProperty("webdriver.ie.driver","D:/gokul/Testing/selenium/IEDriverServer.exe");
			WebDriver driver2 = new InternetExplorerDriver();
	        String baseUrl2 = "https://www.licindia.in/";
	        driver2.get(baseUrl2);
	        driver2.close();
	
	}

}
}

