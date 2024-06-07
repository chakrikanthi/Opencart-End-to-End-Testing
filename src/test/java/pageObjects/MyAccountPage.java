package pageObjects;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class MyAccountPage extends Basepage {
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
			
	@FindBy(xpath="//span[@class='caret']")  WebElement myAccount;
	//@FindBy(xpath="//h2[normalize-space()='My Account']")  WebElement myAccount;  // my account page heading
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")  WebElement logout;
	//here the logout is the element that is displayed in the my account page on right side corner not from myaccount dropdown
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']") 
	WebElement login;
	
	//Action methods for My account display, Logout
	
	
	public boolean isMyAccountpageexist()  //checking my account page heading display status
	{
		try
		{
			return(myAccount.isDisplayed()); // if it is my account is displayed then it will return true otherwise it will execute catch block
		}
			catch(Exception e)
				{
				return(false); //if my account is not displayed then this return part will execute and return false
				}
	
	}
	public void clickmyAccount()
	{
		myAccount.click();
	}

	public void clicklogout()
	{
		logout.click();
	}
	public void clicklogin()
	{
		login.click();
	}
	//My account tab from top menu dropdown
	@FindBy(xpath="//ul//ul//a[normalize-space()='My Account']")  
	WebElement myAccountafterloggedin;
	public void myAccountafterloggedin()
	{
		myAccountafterloggedin.click();
	}
	

@FindBy(xpath="//input[@id='input-lastname']")  
WebElement editlastName;
public void editlastName(String lname)
{
	editlastName.clear();
	editlastName.sendKeys(lname);
}
@FindBy(xpath="//input[@id='input-firstname']")  
WebElement editfirstName;

public void editfirstName(String fname)
{
	editfirstName.clear();
	editfirstName.sendKeys(fname);
}
@FindBy(xpath="//input[@id='input-email']") 
WebElement editeMail;
public void editeMail(String newemail)
{
	editeMail.clear();
	editeMail.sendKeys(newemail);
}

@FindBy(xpath="//input[@id='input-telephone']")  
WebElement edittelephone;
public void edittelephone(String phonenum)
{
	edittelephone.clear();
	edittelephone.sendKeys(phonenum);
}

@FindBy(xpath="//input[@value='Continue']") 
WebElement continueinaccnteditpage;
public void continueinaccnteditpage()
{
	continueinaccnteditpage.click();;
}

	// order history from My account top bar dropdown after loggedin
	@FindBy(xpath="//div[@id='top-links']//a[normalize-space()='Order History']")  
	WebElement orderHistory;
	
	public void orderHistory() {
		orderHistory.click();
	}
	
	@FindBy(xpath="//aside[@id='column-right']//a[normalize-space()='My Account']") 
	WebElement myAccountfromrightcolumnsidemenu;
	public void myAccountfromrightcolumnsidemenu() {
		myAccountfromrightcolumnsidemenu.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Site Map']") 
	WebElement siteMap;
	public void siteMap() {
		siteMap.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Password']") 
	WebElement passwordlinkinSitemappage;
	
	public void passwordlinkinSitemappage() {
		passwordlinkinSitemappage.click();
	}
	
	@FindBy(xpath="//div[@id='content']//div//div//a[normalize-space()='My Account']") 
	WebElement myAccountinsitemaplink;
	
	public void myAccountinsitemaplink() {
		myAccountinsitemaplink.click();
	}
	@FindBy(xpath="//a[normalize-space()='Account Information']")  
	WebElement accountInfoinSITEMAPpage;
	
	public void accountInfoinSITEMAPpage() {
		accountInfoinSITEMAPpage.click();
	}
	
	//edit Account info from LEFT Column
	@FindBy(xpath="//a[normalize-space()='Edit your account information']") 
	WebElement editYourAccountInfofromLEFTcolumn;
	public void editYourAccountInfofromLEFTcolumn() {
		editYourAccountInfofromLEFTcolumn.click();
	}
	
//cleared all the info in madatory field and pressed enter
@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]") WebElement warningFIRSTNameempty;
public String warningFIRSTNameempty() {
	warningFIRSTNameempty.isDisplayed();
	return warningFIRSTNameempty.getText();
	
}


@FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")  WebElement warningLASTNameempty;
public String warningLASTNameempty() {
	warningLASTNameempty.isDisplayed();
	return warningLASTNameempty.getText();
	
}
@FindBy(xpath="//div[contains(text(),'E-Mail Address does not appear to be valid!')]")  WebElement warningeMailempty;
public String warningeMailempty() {
	warningeMailempty.isDisplayed();
	return warningeMailempty.getText();
	
}
@FindBy(xpath="//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")  WebElement warningtelephoneempty;
public String warningtelephoneempty() {
	warningtelephoneempty.isDisplayed();
	return warningtelephoneempty.getText();
	
}
	//edit Account info from RIGHT Column
	@FindBy(xpath="//a[normalize-space()='Edit Account']")  
	WebElement editAccountfromRIGHTcolumn;
	
	public void editAccountfromRIGHTcolumn() {
		editAccountfromRIGHTcolumn.click();
	}
	
	//Change your password LINK in my account page in LEFT column
	
	@FindBy(xpath="//a[normalize-space()='Change your password']") 
	WebElement changeurPasswordfromleftcolumn;
	public void changeurPasswordfromleftcolumn() {
		changeurPasswordfromleftcolumn.click();;
	}
	//change password fields in change Password page
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement changepasswordfield1;
	
	public void changepasswordfield1(String password) {
		changepasswordfield1.sendKeys(password);;
	}
	@FindBy(xpath="//input[@id='input-confirm']") 
	WebElement passwordConfirmfield2;
	public void passwordConfirmfield2(String confirmpassword) {
		passwordConfirmfield2.sendKeys(confirmpassword);
	}
	@FindBy(xpath="//input[@value='Continue']")  
	WebElement passwordconfirmcontinuebtn;
	public void passwordconfirmcontinuebtn() {
		passwordconfirmcontinuebtn.click();
	}
	//warning message with out entering mandatory fields in the password change page
	@FindBy(xpath="//div[contains(text(),'Password must be between 4 and 20 characters!')]") 
	WebElement passwordMandatoryfieldwarningmsg;
	public String passwordMandatoryfieldwarningmsg() {
		return passwordMandatoryfieldwarningmsg.getText();
	}
	
	//password change confirmation msg
	@FindBy(xpath="//div[contains(text(),'Success: Your password has been successfully updat')]") 
	WebElement successPasswordchangemsg;
	
	public String successPasswordchangemsg() {
		return successPasswordchangemsg.getText();
	}
	
	//password tab--editing password from RIGHT column side
	@FindBy(xpath="//a[normalize-space()='Password']") 
	WebElement changepasswordfromRIGHTcolumnside;
	
	public void changepasswordfromRIGHTcolumnside() {
		changepasswordfromRIGHTcolumnside.click();
	}
	
	//warning message by entering old password
	@FindBy(xpath="//div[contains(text(),'Warning: No match for E-Mail Address and/or Passwo')]")  
	WebElement passwordwarningerrmsg;
	
	public String passwordwarningerrmsg() {
		return passwordwarningerrmsg.getText();
	}
	//Change Password two different passwords not matching
	@FindBy(xpath="//div[contains(text(),'Password confirmation does not match password!')]") 
	WebElement twopasswordConfirmationDoesNotmatch;
	public String twopasswordConfirmationDoesNotmatch() {
		return twopasswordConfirmationDoesNotmatch.getText();
	}
	//modify Address  book from LEFT column
	@FindBy(xpath="//a[normalize-space()='Modify your address book entries']")
	WebElement modifyYourAddressBookfromLeftcolumn;
	
	public void modifyYourAddressBookfromLeftcolumn() {
		modifyYourAddressBookfromLeftcolumn.click();;
	}
	//Address book from RIGHT Column
	@FindBy(xpath="//a[normalize-space()='Address Book']") 
	WebElement addressBookfromRIGHTcolumn;
	
	public void addressBookfromRIGHTcolumn() {
		addressBookfromRIGHTcolumn.click();
	}
	//Adding new address after clicking addressbook from RIGHT column
	@FindBy(xpath="//a[normalize-space()='New Address']")  
	WebElement newAddress;
	public void newAddress() {
		newAddress.click();
	}
	
	
	//Sitemap Address book
	@FindBy(xpath="//a[normalize-space()='Address Book']") 
	WebElement sitemapaddressBook;
	public void sitemapaddressBook() {
		sitemapaddressBook.click();
	}
	@FindBy(xpath="//a[normalize-space()='Address Book']")  
	WebElement RegisteraddressBook;
	public void RegisteraddressBook() {
		RegisteraddressBook.click();
	}
	@FindBy(xpath="//h2[normalize-space()='Address Book Entries']") 
	WebElement addressBookEntriesPAGE;
	public boolean Addressbookpageexist()  //checking my account page heading display status
	{
		try
		{
		
			return(addressBookEntriesPAGE.isDisplayed()); // if it is my account is displayed then it will return true otherwise it will execute catch block
		}
			catch(Exception e)
				{
				return(false); //if my account is not displayed then this return part will execute and return false
				}}
	
	
		//Register tab from top My Account dropdown
		@FindBy(xpath="//div[@id='top-links']//a[normalize-space()='Register']")  
		WebElement registerfromMyAcntdropdown;
		public void registerfromMyAcntdropdown() {
			registerfromMyAcntdropdown.click();
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
	}
