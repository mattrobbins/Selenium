package automation;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
 
public class NinthTestCase {
 
    private static WebDriver driver = null;
 
    public static void main(String[] args) throws InterruptedException {
 
        // Create a new instance of the Firefox driver
 
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
        //2) Open URL “http://www.toolsqa.com/automation-practice-form/” 
        driver.get("http://www.toolsqa.com/automation-practice-form/");

        //3) Select ‘Continents’ Drop down ( Use Id to identify the element )
        // Find the Select element
        Select oSelection = new Select(driver.findElement(By.id("continents")));
                
        //4) Select option ‘Europe’ (Use selectByIndex)
        oSelection.selectByVisibleText("Europe");
        Thread.sleep(2000);
        
        //5) Select option ‘Africa’ now (Use selectByVisibleText)
        oSelection.selectByIndex(2);
        Thread.sleep(2000);
        
        //6) Print all the options for the selected drop down and select one option of your choice
        List oSize = oSelection.getOptions();
        
        int iListSize = oSize.size();
        
        for(int i = 0; i < iListSize ; i++ ){
        	
        	String sValue = oSelection.getOptions().get(i).getText();
        	
        	System.out.println(sValue);
        	
        	if(sValue.equals("Africa")){
        		oSelection.selectByIndex(i);
        		
        		break;
        		
        	}
        }
        
        //7) Close the browser
        driver.close();
        
    }
}