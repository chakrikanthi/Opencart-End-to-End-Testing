package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class iphone extends Basepage{

	public iphone(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[normalize-space()='iPhone']") 
	WebElement iPhone;
	
	public void iphonelink()
	{
		iPhone.click();	
	}
	@FindBy(xpath="//button[@class='btn btn-default']//i[@class='fa fa-heart']")  
	WebElement iPhonewishlisticon;
	
	public void addtowishlist()
	{
		iPhonewishlisticon.click();
	}
	@FindBy(xpath="//a[normalize-space()='wish list']")  
	WebElement 	wishListinsucessmsg;
	
	public void clickwishlistinsucessmsg()
	{
		wishListinsucessmsg.click();
	}
	
	@FindBy(xpath="//input[@id='input-email']") 
	WebElement EMailAddress;
	
	public void setemail(String email)
	{
		EMailAddress.sendKeys(email);
	}
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement password;
	
	public void setpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	@FindBy(xpath="//input[@value='Login']") 
	WebElement loginbtn;
	
	public void loginbtn()
	{
		loginbtn.click();
	}
	
}
