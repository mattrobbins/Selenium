package automation;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.*;
 
import org.openqa.selenium.firefox.FirefoxDriver;

 
public class FifthTestCase {
 
    private static WebDriver driver = null;
 
    public static void main(String[] args) {
 
        // Create a new instance of the Firefox driver
        //1) Launch new Browser 
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
        //2) Open URL http://www.toolsqa.com/automation-practice-form/ 
        driver.get("http://www.toolsqa.com/");
        System.out.println("Opened Browser and went to the ToolsQA homepage");
        
        //3) Click on About link ( On top navigation)
        driver.findElement(By.linkText("ABOUT"));
        System.out.println("Clicked on About");
        
        //4) Come back to Home page (Use ‘Back’ command)
        driver.navigate().back();
        System.out.println("Went Back to Homepage");
        
        //5) Again go back to About page (This time use ‘Forward’ command)
        driver.navigate().forward();
        System.out.println("Went Forward to About page");
        
        //6) Again come back to Home page (This time use ‘To’ command)
        driver.navigate().to("http://www.toolsqa.com/");
        System.out.println("Navigated to the homepage");
        
        //7) Refresh the Browser (Use ‘Refresh’ command)
        driver.navigate().refresh();        
        
        //8) Close the Browser
        driver.close();
    
    }
}