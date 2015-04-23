//Practice Exercise - 2 (Multiple Selection Box/List)
package automation;

    import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

 
public class TenthTestCase {
 
    private static WebDriver driver = null;
 
    public static void main(String[] args) throws InterruptedException {
 
        // Create a new instance of the Firefox driver
 
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website http://www.toolsqa.com/automation-practice-form/
 
        driver.get("http://www.toolsqa.com/automation-practice-form/");
        
        //3) Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
        Select ms_box = new Select(driver.findElement(By.name("selenium_commands")));      
        
        //4) Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
        ms_box.selectByIndex(0);
        Thread.sleep(2000);
        ms_box.deselectByIndex(0);
        
        //5) Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
        ms_box.selectByVisibleText("Navigation Commands");
        Thread.sleep(2000);
        ms_box.deselectByVisibleText("Navigation Commands");
        
        //6) Print and select all the options for the selected Multiple selection list.
        List oList = ms_box.getOptions();
        
        int iListSize = oList.size();
        
        //Set up the loop to list through and print them out.
        for (int i=0; i < iListSize; i++) {
        	String sValue = ms_box.getOptions().get(i).getText();
        	System.out.println(sValue);
        	ms_box.selectByIndex(i);
        	Thread.sleep(2000);
        }
        
        //7) Deselect all options
        ms_box.deselectAll();
        
        //8) Close the browser
        driver.close();
    }
}