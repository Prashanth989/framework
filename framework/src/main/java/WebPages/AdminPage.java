package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import Utility.Helper;


public class AdminPage  extends BasePage
{
		
			@FindBy(xpath="//b[text()='Admin']")
					 WebElement Adminbutton;
			

			
			@FindBy(xpath="//a[text()='Users']")
					WebElement Userbutton;
		
			
			@FindBy(xpath="//a[text()='User Management']")
					WebElement Userbuttn;
	
		
			@FindBy(xpath="//a[text()='Job']")
					WebElement Jobbuttn;
			
			
			@FindBy(xpath="//a[text()='Job Titles']")
			 		WebElement Jobtitlebutn;
			
			
		
			
			
			
			
			public AdminPage()
			{
				
				PageFactory.initElements(driver, this);
				
			}
		
			
			
			public String title()
			{
				
				
				String title=driver.getTitle();
				
				return title;
			}
			
			
			public void clickOnUser()
			{
				
				
				Helper.elementToBeWait(driver, Adminbutton, 9);
				
				Helper.performActionToElement(driver, Adminbutton);
				
				Helper.elementToBeWait(driver, Userbuttn, 9);
				
				Helper.performActionToElement(driver, Userbuttn);
				
				this.Userbutton.click();
			}
			
			
			public void clickJobTitleButton()
			{
				

				
				
				Helper.performActionToElement(driver, Jobbuttn);
		

				
				this.Jobtitlebutn.click();
				
			}
			
			
	
}
