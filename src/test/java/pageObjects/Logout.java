package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	//continue btn after logout
	@FindBy(xpath="//a[normalize-space()='Continue']")  
	WebElement continuebtnafterlogout;
	
	public void continuebtnafterlogout()
	{
		continuebtnafterlogout.click();
	}
	
	//Logout from Right column
	@FindBy(xpath="//aside[@id='column-right']//a[normalize-space()='Logout']") 
	WebElement logoutfromrightcolumn;
	public void logoutfromrightcolumn()
	{
		logoutfromrightcolumn.click();
	}
}
