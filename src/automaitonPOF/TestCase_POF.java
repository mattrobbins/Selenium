package automaitonPOF;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.PageFactory;
	
	public class TestCase_POF {
		
		static WebDriver driver;
		
		//In order to use the PageFactory, first declare some fields on a PageObject 
		//	that are WebElements
		static WebElement log;
		static WebElement pwd;
		static WebElement submit;
	
	public static void main(String[] args) throws InterruptedException{
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.get("http://store.demoqa.com");
		
		// In orderf for this code to work and not throw a NullPointerException because 
		//	the "log", "pwd" and "submit" fields aren't instantiated, we need to initialize the PageObject
		PageFactory.initElements(driver,  TestCase_POF.class);
		
		// Once instantiated, we can now use the above created WebElements
		log.sendKeys("matt_test");
		pwd.sendKeys("TE4NFmtsVpBG");
		submit.click();
		driver.quit();
	}
	
}
