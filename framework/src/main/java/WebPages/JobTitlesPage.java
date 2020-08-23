package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import Utility.Helper;



public class JobTitlesPage extends BasePage
{

		
		
		
					@FindBy(xpath="//input[@name='btnAdd']")
						WebElement JobAdbuttn;
		
		
					@FindBy(xpath="//input[@type='text']")
						WebElement JobTitle;
		
		
					@FindBy(xpath="//input[@name='btnSave']")
						WebElement Jobbtn;
		
					
					
					public JobTitlesPage()
					{
		
						PageFactory.initElements(driver, this);
		
					}
		
		
		
		
					public String title()
					{
						
			
						String title=driver.getTitle();
			
						return title;
					}
		
		
		
		
					public void enterJobTitle()
					{
			
						Helper.elementToBeWait(driver, JobAdbuttn, 9);
			
						this.JobAdbuttn.click();
						
						Helper.elementToBeWait(driver, JobTitle, 9);
			
						this.JobTitle.sendKeys("finantier");
			
						Helper.elementToBeWait(driver, Jobbtn, 9);
			
						this.Jobbtn.submit();
			
			
					}
	

}
