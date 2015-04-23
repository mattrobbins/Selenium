package automation;

    import java.util.concurrent.TimeUnit;
 
    import org.openqa.selenium.*;
 
    import org.openqa.selenium.firefox.FirefoxDriver;

 
public class EleventhTestCase {
 
    private static WebDriver driver = null;
 
    public static void main(String[] args) {
 
        // Create a new instance of the Firefox driver
 
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website http://www.toolsqa.com/automation-practice-table/
 
        driver.get("http://www.toolsqa.com/automation-practice-table/");
        
        //3) Get the value from cell ‘Dubai’ and print it on the console
        //String cellText = driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[1]/div/div/table/tbody/tr[0]/td[1]")).getText();
        String cellText = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[2]")).getText();
        ///div[2]/div[1]/div/div/table/tbody/tr[0]/td[1]
        System.out.println("This is the table text: " + cellText);
        
        //4) Click on the link ‘Detail’ of the first row and last column
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[5]")).click();
        
        //driver.close();
    }
}
