package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

 
public class EigthTestCase {
 
    private static WebDriver driver = null;
 
    public static void main(String[] args) {
 
        // Create a new instance of the Firefox driver
 
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
        //2) Open URL “http://www.toolsqa.com/automation-practice-form/” 
        driver.get("http://www.toolsqa.com/automation-practice-form/");
        
        //3) Select the deselected Radio button (female) for category Sex (Use IsSelected method)
        List<WebElement> oGender = driver.findElements(By.name("sex"));
        
        System.out.println(oGender.toString());
        
        boolean bValue = false;
        
        bValue = oGender.get(0).isSelected();
        
        if(bValue = true){
        	//This will select the second radio button
        	oGender.get(1).click();
        }else{
        	//If the first radio button is not selected by default, the first will be selected
        	oGender.get(0).click();
        }
        
        //4) Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
        WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
        rdBtn_Exp.click();
                
        //5) Check the checkbox ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
        //find the Checkbox element
        List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
        
        //This tells us the number of checkboxes
        int iSize = chkBx_Profession.size();
        
        //Start the loop from fist to last checkbox
        for(int i=0; i < iSize ; i++){
        	// Store the checkbox name to the string variable, using 'Value' attribute
        	String sValue = chkBx_Profession.get(i).getAttribute("value");
        	System.out.println("Current Loop value: " + i);
        	//Select the checkbox if the value of the checkbox is what we are looking for.
        	if (sValue.equalsIgnoreCase("Automation Tester")){
        		chkBx_Profession.get(i).click();
        		//End Loop once we find and select what we want.
        		break;
        	}
        }
                
        //6) Check the checkbox ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
        WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
        
        oCheckBox.click();
        
        driver.close();
    }
}