package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
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
}
