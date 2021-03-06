








package automation;

    import java.util.concurrent.TimeUnit;
 
    import org.openqa.selenium.*;
 
    import org.openqa.selenium.firefox.FirefoxDriver;

 
public class ThirdTestCase {
 
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
 
        // Find the element that's ID attribute is 'account'(My Account) 
        //3) Type Name & Last Name (Use Name locator)
        
        driver.findElement(By.name("firstname")).sendKeys("Matt");
        
        driver.findElement(By.name("lastname")).sendKeys("BillyBob");
        
      //4) Click on Submit button (Use ID locator)
        
        driver.findElement(By.id("submit")).click();
        
        
        //driver.findElement(By.id("log")).sendKeys("matt_test"); 
 
        // Find the element that's ID attribute is 'pwd' (Password)
 
        // Enter Password on the element found by the above desc.
 
        //driver.findElement(By.id("pwd")).sendKeys("TE4NFmtsVpBG");
 
        // Now submit the form. WebDriver will find the form for us from the element 
 
        //driver.findElement(By.id("login")).click();      
        
        // Print a Log In message to the screen
 
        //System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
 
        // Refresh the browser
 
        //driver.navigate().refresh();
        
        // Find the element that's ID attribute is 'account_logout' (Log Out)
        
        //driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
 
        // Close the driver
 
        driver.quit();
 
            }
 
    }