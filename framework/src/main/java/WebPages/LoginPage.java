package WebPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;



public class LoginPage extends BasePage

{	
				@FindBy(name="txtUsername")
					WebElement UserName;
	
				@FindBy(name="txtPassword")
					WebElement Pasword;
			
			
				@FindBy(name="Submit")
					WebElement Submit;
			
	
			
				public LoginPage()
				{
				
					PageFactory.initElements(driver, this);
				
				}
			
			

			
		
				public String title()
				{
				
					String title=driver.getTitle();
				
					return title;
				}
			
				public void login(String Usern,String Paswrd)
				{
				
				
					if(this.UserName.isEnabled()&& this.Pasword.isEnabled())
					{
						this.UserName.sendKeys(Usern);
						
						this.Pasword.sendKeys(Paswrd);
						
						
						System.out.println("Fields are Enabled");
						
					}
					
					else
					{
					
							
						System.out.println("Fields are not Enabled");
					}
					
					this.Submit.submit();
				
				}
			
	
	
			
}
