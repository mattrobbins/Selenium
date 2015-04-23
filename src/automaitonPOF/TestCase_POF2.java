package automaitonPOF;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class TestCase_POF2 {

	static WebDriver driver;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='account']/a")
	static WebElement lnk_MyAccount;
	
	@FindBy(how = How.ID, using = "log")
	static WebElement txtbx_UserName;
	
	@FindBy(how = How.ID, using = "pwd")
	static WebElement txtbx_Password;
	
	@FindBy(how = How.ID_OR_NAME, using = "submit")
	static WebElement btn_Login;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='account_logout']/a")
	static WebElement lnk_LogOut;
	
	public static void main(String[] args) throws InterruptedException{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://store.demoqa.com");
		
		PageFactory.initElements(driver, TestCase_POF2.class);
		lnk_MyAccount.click();
		
		txtbx_UserName.sendKeys("matt_test");
		txtbx_Password.sendKeys("TE4NFmtsVpBG");
		btn_Login.click();
		
		System.out.println(" Login Successfully, now it is time to log off buddy");
		lnk_LogOut.click();
		
		driver.quit();
		
	}
	
}
