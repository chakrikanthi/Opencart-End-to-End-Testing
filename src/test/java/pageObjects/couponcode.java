package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class couponcode extends Basepage {
	
	public couponcode(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[normalize-space()='Use Coupon Code']")
	WebElement useCouponCode;
	
	
	public void useCouponCode()
	{
		useCouponCode.click();
	}
	
	@FindBy(xpath="//input[@id='input-coupon']") 
	WebElement enterYourCouponHere;
	
	public void enterYourCouponHere(String Text)
	{
		enterYourCouponHere.sendKeys(Text);
	}
	
	@FindBy(xpath="//input[@id='button-coupon']") 
	WebElement applyCouponbtb;
	
	public void applyCouponbtb()
	{
		applyCouponbtb.click();
	}
	
	@FindBy(xpath="//div[contains(text(),'Warning: Coupon is either invalid, expired or reac')]")
	WebElement Couponwarningmsg;
	public String Couponwarningmsg()
	{
		String Message=Couponwarningmsg.getText();
		System.out.println(Message);
		if (Message.equals(" Warning: Coupon is either invalid, expired or reached its usage limit!")) {
			System.out.println("Invalid Coupon had been entered");
			 Assert.assertTrue(true);
		}
		return Message;
		
		
	}
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/i[1]") 
	WebElement warningmsgPleaseEnterACoupon;

	
	public String warningmsgPleaseEnterACoupon()
	{
		return warningmsgPleaseEnterACoupon.getText();
		 
		
	}
	@FindBy(xpath="//button[normalize-space()='×']")
	WebElement Closecpnwarningmsg;
	
	public void Closecpnwarningmsg()
	{
		Closecpnwarningmsg.click();
	}
}
