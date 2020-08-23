package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import WebPages.AdminPage;
import WebPages.LoginPage;

public class AdminTest extends BasePage
{
						
	
					public static LoginPage lgn;
					
					public static AdminPage adn;
					
					
	
	
					@BeforeMethod
	
	
					public void initilizing()
					{
	
							BasePage.initilizingTheBrowser();
							
							
							lgn=new LoginPage();
							
							
							lgn.login("Admin","admin123");
						
							
							
					}

				
						@Test(priority=1)
					
						public void VerifyUserButton()
						{
						
							adn=new AdminPage();
					
							adn.clickOnUser();
						}
					
					
						@AfterMethod
						
						public void exitTheBrowser()
						{
						
							BasePage.closingTheBrowser();
						}
			
					
	
	
}
