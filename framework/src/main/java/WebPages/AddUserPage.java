package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Base.BasePage;
import Utility.Helper;


public class AddUserPage extends BasePage
{

				@FindBy(xpath="//input[@name='btnAdd']")
						WebElement Addbutton;



				@FindBy(xpath="//select[@name='systemUser[userType]']")
						WebElement UserRole;


				@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
						WebElement EmployeName;


				@FindBy(xpath="//input[@id='systemUser_userName']")
						WebElement UserName;
				

				@FindBy(xpath="//select[@id='systemUser_status']")
						WebElement Status;


				@FindBy(xpath="//input[@id='systemUser_password']")
						WebElement Pasword;


				@FindBy(xpath="//input[@id='systemUser_confirmPassword']")
						WebElement ConfirmPasword;


				@FindBy(xpath="//input[@id='btnSave']")
						WebElement Savebutton;

				

				public AddUserPage()
				{


					PageFactory.initElements(driver, this);

				}



				public void clickAddButton()
				{

					if(this.Addbutton.isEnabled())
					{

						this.Addbutton.click();
					}

					else
						
					{

						System.out.print("Add button is  not Enabled");
					}




				}


				public void addUsr(String Emplyename,String Usern,String Paswrd,String Confirmpaswrd)
				{


					Helper.elementToBeWait(driver, UserRole, 9);

					Helper.performDropDown(UserRole,"Admin");


					Helper.elementToBeWait(driver, EmployeName,2);
	 			

					this.EmployeName.sendKeys(Emplyename);

					Helper.elementToBeWait(driver, Status, 4);

					Helper.performDropDown(Status, "Enabled");
	 			
	 			
					Helper.elementToBeWait(driver, UserName, 9);

					this.UserName.sendKeys(Usern);

					Helper.elementToBeWait(driver, Pasword, 2);


					this.Pasword.sendKeys(Paswrd);

					Helper.elementToBeWait(driver, ConfirmPasword, 9);

					this.ConfirmPasword.sendKeys(Confirmpaswrd);


					this.Savebutton.submit();


				}
	}

