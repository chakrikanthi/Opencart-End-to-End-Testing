package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewletterSubscription extends Basepage{

	public NewletterSubscription(WebDriver driver) {
		super(driver);
		
	}

	//Newsletter subscription from LEFT column 
	@FindBy(xpath="//a[normalize-space()='Subscribe / unsubscribe to newsletter']") 
	WebElement subscribeUnsubscribeNewsLetter;
	public void subscribeUnsubscribeNewsLetter() {
		subscribeUnsubscribeNewsLetter.click();
	}
	
	//Newsletter tab from RIGHT COLUMN
	@FindBy(xpath="//aside[@id='column-right']//a[normalize-space()='Newsletter']") 
	WebElement newsletterfromRIGHTcolumn;
	public void newsletterfromRIGHTcolumn() {
		newsletterfromRIGHTcolumn.click();
	}
	//Newsletter footer option
	@FindBy(xpath="//body//footer//div//div//div//ul//li//a[normalize-space()='Newsletter']")
	WebElement newsletterfooteropt;
	public void newsletterfooteropt() {
		newsletterfooteropt.click();
	}
	
	//Subscription YES button
	@FindBy(xpath="//input[@value='1']") 
	WebElement YESsubscriptionBtn;
	public void YESsubscriptionBtn() {
		YESsubscriptionBtn.click();
	}
	public boolean YESsubscriptionOPTselected() {
		return YESsubscriptionBtn.isSelected();
	}
	@FindBy(xpath="//input[@value='0']")  
	WebElement NOsubscriptionbtn;
	public void NOsubscriptionbtn() {
		NOsubscriptionbtn.click();
	}
	public boolean NOsubscriptionOPTselected() {
		return NOsubscriptionbtn.isSelected();
	}
	
	//continue btn in newsletter subscrition page
	@FindBy(xpath="//input[@value='Continue']") 
	WebElement NewsltrSubscriptioncontinuebtn;
	public void NewsltrSubscriptioncontinuebtn() {
		NewsltrSubscriptioncontinuebtn.click();
	}
	//Success msg after subscription update
	@FindBy(xpath="//div[contains(text(),'Success: Your newsletter subscription has been suc')]") 
	WebElement successYourNewsletterSubsc;
	public String successYourNewsletterSubsc() {
		return successYourNewsletterSubsc.getText();
	}
	 
	//registration page webelements

@FindBy(xpath="//input[@id='input-firstname']")
WebElement firstName;
public void firstName(String fname)
{
	firstName.sendKeys(fname);
}

@FindBy(xpath="//input[@id='input-lastname']") 
WebElement lastName;
public void lastName(String lname)
{
	lastName.sendKeys(lname);
}

@FindBy(xpath="//input[@id='input-email']") 
WebElement eMailid;
public void eMailid(String email)
{
	eMailid.sendKeys(email);
}

@FindBy(xpath="//input[@id='input-telephone']") 
WebElement telephone;
public void telephone(String tno)
{
	telephone.sendKeys(tno);
}


@FindBy(xpath="//input[@id='input-password']") 
WebElement password;
public void password(String pwd)
{
	password.sendKeys(pwd);
}

@FindBy(xpath="//input[@id='input-confirm']") 
WebElement passwordConfirm;
public void passwordConfirm(String conpwd)
{
	passwordConfirm.sendKeys(conpwd);
}
@FindBy(xpath="//label[normalize-space()='Yes']") 
WebElement YESnewsletter;
public void YESnewsletter() {
	YESnewsletter.click();
}
@FindBy(xpath="//input[@name='agree']") 
WebElement agree;
public void agree() {
	agree.click();
}
@FindBy(xpath="//input[@value='Continue']")
WebElement continuebtn;
public void continuebtn() {
	continuebtn.click();
}
	
}
