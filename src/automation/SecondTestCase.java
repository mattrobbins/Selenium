package automation;
 
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;    
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
 
public class SecondTestCase {
	public static WebDriver driver;
	
    private static String myTitle;
    private static int myTitleLength;
    private static String myURL;
    private static int myURLLength;
    private static String myPageSource;
    private static int myPageSourceLength;
    
    @Test
    public static void main() {	
   	    	
  
        // 3) Get Page Title name and Title length
        myTitle = driver.getTitle();
        myTitleLength = driver.getTitle().length();
        
        // 4) Print Page Title and Title length on the Eclipse Console.
        System.out.println(myTitle);
        System.out.println("The Character Length of the Title is: " + myTitleLength);
        
	    // 5) Get Page URL and URL length
        myURL = driver.getCurrentUrl();
        myURLLength = driver.getCurrentUrl().length();
        
	    // 6) Print URL and URL length on the Eclipse Console.
	    System.out.println(myURL);
        System.out.println("The Character Length of the URL is: " + myURLLength);
        
	    // 7) Refresh current page
        driver.navigate().refresh();
        	
	    // 8) Get Page Source (HTML Source code) and Page Source length
        
        myPageSource = driver.getPageSource();
        myPageSourceLength = driver.getPageSource().length();
	
	    // 9) Print Page Source and length on Eclipse Console.
	
        //System.out.println(myPageSource);
        System.out.println("The length of the source is: " + myPageSourceLength);        
       
    }
    
    @BeforeMethod
    public void beforeMethod() {
    	// 1) Launch a new Firefox browser.
    	driver = new FirefoxDriver();
    	
    	// Set a wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2) Open ToolsQA.com
        driver.get("http://www.ToolsQA.com");
    }
    
    @AfterMethod
    public void afterMethod() {
    	 // 10) Close the Browser. 
        driver.quit();
    }
 
}