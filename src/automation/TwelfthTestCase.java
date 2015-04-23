package automation;

    import java.util.concurrent.TimeUnit;
 
    import org.openqa.selenium.*;
 
    import org.openqa.selenium.firefox.FirefoxDriver;

 
public class TwelfthTestCase {
 
    private static WebDriver driver = null;
 
    public static void main(String[] args) {
 
        // Create a new instance of the Firefox driver
 
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website http://www.toolsqa.com/automation-practice-table/
 
        driver.get("http://www.toolsqa.com/automation-practice-table/");
        
        //3) Get the value from cell ‘Dubai’ using dynamic numbers and print it on the console
        
        int iRow = 1;
        int iColumn = 2;
        
        //String cellText = driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[1]/div/div/table/tbody/tr[0]/td[1]")).getText();
        String cellText = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[1]/table/tbody/tr[" + iRow + "]/td[" + iColumn + "]")).getText();
        ///div[2]/div[1]/div/div/table/tbody/tr[0]/td[1]
        System.out.println("This is the table text: " + cellText);
        
        //4) Print all the column values of row ‘Clock Tower Hotel’
        
        
        String sRowValue = "CLOCK TOWER HOTEL";
        
        int i;
        int j;
        
        //Need to loop through each row until we find the correct row.
        
        for ( i=1 ; i<5 ; i++ ) {
        	String sGetCellText = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[1]/table/tbody/tr[" + i + "]/th")).getText();
        	//System.out.println(sGetCellText);
        	
        	if(sGetCellText.equalsIgnoreCase(sRowValue)){
        		for (j=1;j<=6;j++){
        			String sColumnData = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[1]/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
        			System.out.println(sColumnData);
        		}
        		break;
        		
        	}
        }
        
        driver.close();
    }
}

///html/body/div[2]/header/div/div[2]/div/nav/ul/li[8]/a/span

////html.js.no-touch.cssanimations.csstransforms.csstransforms3d.csstransitions.cssfilters.mobile-false body.page.page-id-1715.page-template.page-template-tutorial_center_right_left-php.image-blur.btn-ios.wpb-js-composer.js-comp-ver-4.2.3.vc_responsive.no-mobile.not-webkit div#page header#header.logo-center div.wf-wrap div.navigation-holder div nav#navigation ul#main-nav.fancy-rollovers.wf-mobile-hidden.menu-frame-on li.menu-item.menu-item-type-custom.menu-item-object-custom.current-menu-ancestor.current-menu-parent.menu-item-has-children.menu-item-17611.dt-mega-menu.mega-auto-width.mega-column-1.act.has-children a span
