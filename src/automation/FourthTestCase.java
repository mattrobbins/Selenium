package automation;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.*;
 
import org.openqa.selenium.firefox.FirefoxDriver;

 
public class FourthTestCase {
 
    private static WebDriver driver = null;
 
    public static void main(String[] args) {
 
        // Create a new instance of the Firefox driver
        //1) Launch new Browser 
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
        //2) Open URL http://www.toolsqa.com/automation-practice-form/ 
        driver.get("http://www.toolsqa.com/automation-practice-form/");
 
        //3) Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
        driver.findElement(By.partialLinkText("Partial")).click();
        System.out.println("Partial Link Test Pass");
        
        //4) Identify Submit button with ‘tagName’, convert it in to string and print it on the console
        String sClass = driver.findElements(By.tagName("button")).toString();
        System.out.println(sClass);
        
        //5) Click on the Link “Link Test” (Use ‘linkTest’ locator)
        driver.findElement(By.linkText("Link Test")).click();
        System.out.println("Link Test Pass");
        
        // Close the driver
        //driver.quit();
 
            }
 
    }