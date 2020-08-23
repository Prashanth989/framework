package Test;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import Base.BasePage;
import WebPages.AddUserPage;
import WebPages.AdminPage;

import WebPages.LoginPage;

public class AddUserTest extends BasePage
{
						
								public static LoginPage lgn;
								
								public static AdminPage adn;
								
								public static AddUserPage adubn;
								
	
							@BeforeMethod
	
	
							public void initilizing()
							{

								BasePage.initilizingTheBrowser();
			
								lgn=new LoginPage();
			
								lgn.login("Admin","admin123");
										
								adn=new AdminPage();
										
								adn.clickOnUser();
	
							}
							
							public void VerifyUser(String En,String Un,String Paswrd,String Cpaswrd)
							{
			
								adubn=new AddUserPage();
							
								adubn.clickAddButton();
								
								adubn.addUsr(En,Un,Paswrd,Cpaswrd);
		
							}
									
										
							@AfterMethod
							
							public void exitTheBrowser()
							{
							
								BasePage.closingTheBrowser();
									
							}

										
			
}
