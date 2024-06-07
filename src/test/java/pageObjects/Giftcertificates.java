package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Giftcertificates extends Basepage{

	public Giftcertificates(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[normalize-space()='Gift Certificates']") 
	WebElement giftCertificatesfootertab;
	
	public void giftCertificatesfootertab() {
		giftCertificatesfootertab.click();
	}
	

@FindBy(xpath="//input[@id='input-to-name']") 
WebElement recipientsName;

public void setrecipientsName(String rname) {
	recipientsName.sendKeys(rname);
}
@FindBy(xpath="//input[@id='input-to-email']") 
WebElement recipientsEmail;
public void recipientsEmail(String email) {
	recipientsEmail.sendKeys(email);
}
@FindBy(xpath="//input[@id='input-from-name']")
WebElement yourName;
public void yourName(String urname) {
	yourName.sendKeys(urname);
}

@FindBy(xpath="//input[@id='input-from-email']") 
WebElement yourEmail;
public void yourEmail(String email) {
	yourEmail.sendKeys(email);
}

@FindBy(xpath="//input[@value='7']")
WebElement Birthdaybtn;

public void Birthdaybtn() {
	Birthdaybtn.click();
}
@FindBy(xpath="//input[@value='6']") 
WebElement Christmasbtn;
public void Christmasbtn() {
	Christmasbtn.click();
}

@FindBy(xpath="//input[@value='8']") 
WebElement Genrealbtn;
public void Genrealbtn() {
	Genrealbtn.click();
}

@FindBy(xpath="//textarea[@id='input-message']") 
WebElement message;

public void message(String msg) {
	message.sendKeys(msg);
}
@FindBy(xpath="//input[@id='input-amount']") 
WebElement amount;

public void amount(String amt) {
	amount.sendKeys(amt);
}
@FindBy(xpath="//input[@name='agree']") 
WebElement agree;
public void agree() {
	agree.click();
}

@FindBy(xpath="//input[@value='Continue']")  WebElement continuebtn;
public void purchasegiftcerfcontinuebtn() {
	continuebtn.click();
}
//Success message after gift purchase
@FindBy(xpath="//p[contains(text(),'Thank you for purchasing a gift certificate! Once ')]") 
WebElement thankYouForPurchasingAGif;
public String thankYouForPurchasingAGif() {
	return thankYouForPurchasingAGif.getText();
}
//Continue btn after success msg
@FindBy(xpath="//a[normalize-space()='Continue']") WebElement continuebtnaftersuccmsg;
public void continuebtnaftersuccmsg() {
	continuebtnaftersuccmsg.click();
}

//Check out in shopping cart pg
@FindBy(xpath="//a[contains(text(),'Checkout')]") 
WebElement checkoutbtninShoppingcrtpg;
public void checkoutbtninShoppingcrtpg() {
	checkoutbtninShoppingcrtpg.click();
}

@FindBy(xpath="//input[@id='button-payment-address']") 
WebElement BillingDetailscontinuebtn;
public void BillingDetailscontinuebtn() {
	BillingDetailscontinuebtn.click();
}
//terms n conditions in payment method
@FindBy(xpath="//input[@name='agree']")  
WebElement termsnConditionsinpayemtnmthd;
public void termsnConditionsinpayemtnmthd() {
	termsnConditionsinpayemtnmthd.click();
}
//Continue btn in payment method
@FindBy(xpath="//input[@id='button-payment-method']")  
WebElement continuebtninPaymentmthd;
public void continuebtninPaymentmthd() {
	continuebtninPaymentmthd.click();
}



}
