package Log4jSamples;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4j {
	private static WebDriver driver;
	private static Logger Log = Logger.getLogger(Log4j.class.getName());
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		Log.info("New driver instantiated");
		//Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
		Log.info("Web application launched");
		
		// Find & click on the My Account link to login.
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		Log.info("Clicked on 'My Account'");
		
		// Find the element that's ID attribute is 'log' (matt_test).
		// Enter Username on the element found by above desc.
		driver.findElement(By.id("log")).sendKeys("matt_test");
		Log.info("Username - matt_test, entered in the Username text box");
		
		// Find the element that's ID attribute is 'pwd' (Password)
		// Enter Password on the element found by the above desc.
		driver.findElement(By.id("pwd")).sendKeys("TE4NFmtsVpBG");
		Log.info("Password entered in the Password text box");
		
		// Now submit the form. WebDriver will find the form for us from the element.
		driver.findElement(By.id("login")).click();
		Log.info("Click action performed on Submit button");
		
		// Print a Log In message to the screen
		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
		
		// Find the element that's ID attribute is 'account_logout' (Log Out)
		driver.findElement(By.xpath("/html/body/div[2]/div/div/header/div[1]")).click();
		//driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
		
		Log.info("Click action performed on Log out link");
		
		// Close the driver
		driver.quit();
		Log.info("Browser closed");
	}	
}