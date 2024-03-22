package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wishlistafteraddingprdct extends Basepage {

	public Wishlistafteraddingprdct(WebDriver driver) {
		super(driver);
		
	}

	//after adding iphone
	@FindBy(xpath="//i[@class='fa fa-heart']")
    WebElement wishList1;
	
	public void wishList1()
	{
		wishList1.click();
	}
	
	//iphone image in wishlist
	@FindBy(xpath="//img[@title='iPhone']") 
	WebElement iPhoneimage;
	
	public void iphoneimage()
	{
		iPhoneimage.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='iPhone']")  
	WebElement iPhoneproductname;
	
	public void iphoneproductname()
	{
		iPhoneproductname.click();
	}
}
