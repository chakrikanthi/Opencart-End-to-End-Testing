package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookEntriespage extends Basepage{

	public AddressBookEntriespage(WebDriver driver) {
		super(driver);
		
	}

	//satvik address book entry
			@FindBy(xpath="//tbody//tr//td[1]")  
			WebElement satvikaddress;
			public String satvikaddress() {
				return satvikaddress.getText();
			}
			
			@FindBy(xpath="//a[normalize-space()='Delete']") 
			WebElement Satvikaddressdelete;
			public void Satvikaddressdelete() {
				Satvikaddressdelete.click();
			}
			
			//warning message when trying to delete satvik's default address
			@FindBy(xpath="//div[normalize-space()='Warning: You can not delete your default address!']") 
			WebElement satvikaddressdeleteWARNINGmsg;
			public boolean satvikaddressdeleteWARNINGmsg()  
			{
				try
				{
					return(satvikaddressdeleteWARNINGmsg.isDisplayed());
					
					
				}
					catch(Exception e)
						{
						return(false); 
						}
			}
			
			//edit address button
			@FindBy(xpath="//a[normalize-space()='Edit']")  
			WebElement satvikeditaddressbtn;
			
			public void satvikeditaddressbtn() {
				satvikeditaddressbtn.click();
			}
			
			//success msg after editing address
			@FindBy(xpath="//div[normalize-space()='Your address has been successfully updated']") 
			WebElement editAddressSuccessmsg;
			public String editAddressSuccessmsg() {
				return editAddressSuccessmsg.getText();
			}
			//warning message when deleting default address
			@FindBy(xpath="//div[normalize-space()='Warning: You can not delete your default address!']") 
			WebElement deafultaddressdeletingwarningms;
			public String deafultaddressdeletingwarningms() {
				return deafultaddressdeletingwarningms.getText();
			}
			
//with out filling mandatory fields in edit address text boxes...below warning msgs are displaying
			
@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]")  
WebElement firstNameMustBeBetween1A;
public String firstNameMustBeBetween1A() {
	return firstNameMustBeBetween1A.getText();
}
public boolean firstnamewarningmsgdisplyedornot()  
{
	try
	{
		return(firstNameMustBeBetween1A.isDisplayed());
		
		
	}
		catch(Exception e)
			{
			return(false); 
			}
}

@FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
WebElement lastNameMustBeBetween1An;
public String lastNameMustBeBetween1An() {
	return lastNameMustBeBetween1An.getText();
}
public boolean lastnamewarningmsgdisplyedornot()  
{
	try
	{
		return(lastNameMustBeBetween1An.isDisplayed());
		
		
	}
		catch(Exception e)
			{
			return(false); 
			}
}
@FindBy(xpath="//div[contains(text(),'Address must be between 3 and 128 characters!')]")
WebElement addresswarningmsg;
public String addresswarningmsg() {
	return addresswarningmsg.getText();
}
public boolean addresswarningmsgdisplyedornot()  
{
	try
	{
		return(addresswarningmsg.isDisplayed());
		
		
	}
		catch(Exception e)
			{
			return(false); 
			}
}

@FindBy(xpath="//div[contains(text(),'City must be between 2 and 128 characters!')]")
WebElement citywarningmsg;
public String citywarningmsg() {
	return citywarningmsg.getText();
}
public boolean citywarningmsgdisplyedornot()  
{
	try
	{
		return(citywarningmsg.isDisplayed());
		
		
	}
		catch(Exception e)
			{
			return(false); 
			}
}

//New Address button
@FindBy(xpath="//a[normalize-space()='New Address']")  
WebElement newAddressbttn;
public void newAddressbttn() {
	newAddressbttn.click();
}
//vivek address edit btn
@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]") 
WebElement VivekAddresseditbtn;
public void VivekAddresseditbtn() {
	VivekAddresseditbtn.click();
}
@FindBy(xpath="//input[@value='1']")  
WebElement defaultadressYESopt;
public void defaultadressYESopt() {
	defaultadressYESopt.click();
}
@FindBy(xpath="//input[@value='0']") 
WebElement defaultaddressNOoption;
public void defaultaddressNOoption() {
	defaultaddressNOoption.click();
}
@FindBy(xpath="//input[@value='Continue']")  
WebElement continuebtn;
public void continuebtn() {
	continuebtn.click();
}
}
