package Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper 

{

					public static WebDriver driver;
	
					public static WebElement elementToBeWait(WebDriver driver,WebElement element,int time)
		
					{	
				
						WebDriverWait elementwait=new WebDriverWait(driver, time);
				
						elementwait.until(ExpectedConditions.visibilityOf(element));
				
						return element;
				
					}	
			
					public static void performActionToElement(WebDriver driver,WebElement element)
					{
				
				
				
							Actions actn=new Actions(driver);
							
							actn.moveToElement(element).build().perform();
					}
					
			
			
			
					public static void performDropDown(WebElement element,String text)
					{
				
				
							Select drpdwn=new Select(element);
									
							drpdwn.selectByVisibleText(text);
					}
			
			
			
			

}
