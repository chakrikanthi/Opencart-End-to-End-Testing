package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends Basepage {
	
public	WebDriver driver; 
	public AccountRegistrationPage(WebDriver driver) //Constructor for Accountregistartion page
	{
		super(driver);
	}

	
	//Page object Elements /Locators
	@FindBy(xpath="//input[@id='input-firstname']") 
	WebElement txtfirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']") 
	WebElement txtlastName;
	
	@FindBy(xpath="//input[@id='input-email']")  
	WebElement txtEMail;
	
	@FindBy(xpath="//input[@id='input-telephone']")  
	WebElement txttelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")  
	WebElement txtpasswordConfirm;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdpolicy;
	
	@FindBy(xpath="//input[@value='Continue']")  
	WebElement btncontinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	//Action methods for FirstName, Lastname, Email,telephone,Password,ConfirmPassword, Policy, Continue Button

	public void setfirstname(String fname)
	{
		txtfirstName.sendKeys(fname);
	}

	public void setlastname(String lname)
	{
		txtlastName.sendKeys(lname);
	}

	public void setEmail(String Email)
	{
		txtEMail.sendKeys(Email);
	}
	public void settelephone(String tel)
	{
		txttelephone.sendKeys(tel);
	}

	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void setconfirmpassword(String cpwd)
	{
		txtpasswordConfirm.sendKeys(cpwd);
	}
	public void setchkdpolicy()
	{
		chkdpolicy.click();
	}
	public void clickcontinue()
	{
		btncontinue.click();
	}

	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
}
