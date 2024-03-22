package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.Baseclass;

public class Logout extends Basepage {

	public Logout(WebDriver driver) {
		super(driver);
		
	}

	
	
	@FindBy(xpath="//span[normalize-space()='My Account']")  WebElement myAccount;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Order History']")
	WebElement orderHistory;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']") 
	
	WebElement logout;
	
	public void setmyAccount()
	{
		myAccount.click();
	}
	public void setlogout()
	{
		logout.click();
	}
	public void testorderHistory()
	{
		orderHistory.click();
	}
	
}
