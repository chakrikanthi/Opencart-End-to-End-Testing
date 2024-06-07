package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Recurringpayment extends Basepage{

	public Recurringpayment(WebDriver driver) {
		super(driver);
		
	}

	//recurring payment in LEFT Hand side
	@FindBy(xpath="//div[@id='content']//a[normalize-space()='Recurring payments']")
	WebElement recurringPaymentsfromLEFThandside;
	
	public void recurringPaymentsfromLEFThandside() {
		recurringPaymentsfromLEFThandside.click();
	}
	
	//recurring payment in RIGHT Hand side
	@FindBy(xpath="//aside[@id='column-right']//a[normalize-space()='Recurring payments']") 
	WebElement recurringPaymentsRIGHTSide;
	public void recurringPaymentsRIGHTSide() {
		recurringPaymentsRIGHTSide.click();
	}
	
	//Continue btn in Recurring Payments page
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement continuebtninRecurringpymntsPg;
	public void continuebtninRecurringpymntsPg() {
		continuebtninRecurringpymntsPg.click();
	}
	
	//No recurring payments message
	@FindBy(xpath="//p[normalize-space()='No recurring payments found!']") 
	WebElement noRecurringPaymentsFoundmsg;
	
	public String noRecurringPaymentsFoundmsg() {
		return noRecurringPaymentsFoundmsg.getText();
	}
	
	
}
