package Test;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import WebPages.LoginPage;

public class LoginTest extends BasePage
{
	
	
					public LoginPage lgn;
			
						@BeforeMethod
				
			
						public void initilizing()
						{
				
							BasePage.initilizingTheBrowser();
						}
				
				
						@Test(priority=2)


						public void verifylogin()
						{	
							lgn.login("Admin","admin123");
						
						}
						
						
						
						@Test(priority=1)
					

						public void verifytitle()
		
						{
				
							lgn=new LoginPage();
							
							String expectedtiltle=lgn.title();
						
							Assert.assertEquals(expectedtiltle, "OrangeHrm");
						}
	
						@AfterMethod
					
						public void exitTheBrowser()
						{
						
							BasePage.closingTheBrowser();
						}
		
			
}


