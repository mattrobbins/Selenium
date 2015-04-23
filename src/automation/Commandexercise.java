package automation;
 
    import java.util.concurrent.TimeUnit;
 
    import org.openqa.selenium.*;
 
    import org.openqa.selenium.firefox.FirefoxDriver;

public class Commandexercise {
	private static WebDriver driver = null;
	
	public static void main(String [] args) {
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.toolsqa.com");
		
		String sTitle = driver.getTitle();
		
		int sTitleLength = sTitle.length();
		
		System.out.println(sTitle);
		
		System.out.println(sTitleLength);
		
		String sURL = driver.getCurrentUrl();
		
		int sURLLength = sURL.length();
		
		System.out.println(sURL);
		
		System.out.println(sURLLength);
		
		driver.navigate().refresh();
		
		String sSource = driver.getPageSource();
		
		int sSourceLength = sSource.length();
		
		//System.out.println(sSource);
		
		System.out.println(sSourceLength);
		
		driver.quit();
		
	}
}