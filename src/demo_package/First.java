package demo_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Firefox driver
		//WebDriver driver = new FirefoxDriver();
	String exePath = "E:\\Sample workspace\\Demo project\\Lib\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
		
        //Launch the Online Store Website
		System.out.println("Hello");
		driver.get("http://www.facebook.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		//Wait for 5 Sec
		Thread.sleep(5);
		
        // Close the driver
        driver.quit();
    }
}