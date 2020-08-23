package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BasePage implements FixedVariables
{
		
					public static WebDriver driver;

	
					
					
					public static void initilizingTheBrowser()
						{
						
								if(NameOfTheBrowser=="Chrome")
									{
				
									System.setProperty(Key,Valve);
								
									driver=new ChromeDriver();
									}
							
									
									driver.manage().window().maximize();
				
									
									driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
									
									
									driver.get(ApplicationUrl);
									
									
		
									}
		
					
							public static void closingTheBrowser()
							{
							
								driver.quit();
							}			
			

}
