package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import WebPages.AddUserPage;
import WebPages.AdminPage;
import WebPages.JobTitlesPage;
import WebPages.LoginPage;

public class JobTiltlesTest 
{
			
						public static LoginPage lgn;
						
						public static AdminPage adn;
						
						public static AddUserPage adubn;
						
						public static JobTitlesPage jn;
	
	
						@BeforeMethod
	
	
					public void initilizing()
					{
	
						BasePage.initilizingTheBrowser();
					
						lgn=new LoginPage();
					
						lgn.title();
			
						lgn.login("Admin","admin123");
					
					}
				
						@Test

					public void verifyJobTitle()
					{
						
						
							adn=new AdminPage();
			
							adn.clickOnUser();
							
							adubn=new AddUserPage();
							
							adubn.clickAddButton();
							
							adubn.addUsr("Fiona Grace","foxnn","foxn12345","foxn12345");
							
							adn.clickJobTitleButton();
					
							jn=new JobTitlesPage();
							
							jn.enterJobTitle();
					
						
					}
				
						@AfterMethod
				
					public void exitTheBrowser()
					{
					
						BasePage.closingTheBrowser();
					}
	


}
