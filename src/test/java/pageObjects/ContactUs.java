package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends Basepage {

	public ContactUs(WebDriver driver) {
		super(driver);
		
	}

	//contact us phone icon
	@FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=information/contact']//i") 
	WebElement phoneicon;
	public void phoneicon() {
		phoneicon.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Contact Us']")  
	WebElement contactUsfromFooter;
	
	public void contactUsfromFooter() {
		contactUsfromFooter.click();
	}
	
	//our location page
	@FindBy(xpath="//h3[normalize-space()='Our Location']") 
	WebElement ourLocationheader;
	public boolean ourLocationheader() {
		return ourLocationheader.isDisplayed();
	}
	public String ourLocationheadertext() {
		return ourLocationheader.getText();
	}  
	@FindBy(xpath="//body//div[@id='information-contact']//div[@id='content']//div//div//div//div[1]") 
	WebElement address;
	public boolean addressisdisplayed() {
		return address.isDisplayed();
	}
	public String addresstext() {
		return address.getText();
	} 
	
	@FindBy(xpath="//strong[normalize-space()='Telephone']") 
	WebElement telephone;
	public boolean telephoneisdisplayed() {
		return telephone.isDisplayed();
	}
	public String telephonetext() {
		return telephone.getText();
	} 
	@FindBy(xpath="//legend[normalize-space()='Contact Form']") 
	WebElement contactForm;
	public boolean contactFormisdisplayed() {
		return contactForm.isDisplayed();
	}
	public String contactFormtext() {
		return contactForm.getText();
	} 
	@FindBy(xpath="//label[normalize-space()='Your Name']") 
	WebElement yourName;
	public boolean yourNameisdisplayed() {
		return yourName.isDisplayed();
	}
	@FindBy(xpath="//input[@id='input-name']") 
	WebElement yourNametextbox;
	
	public void yourNametextbox(String name) {
		yourNametextbox.sendKeys(name);
	}
	public String yourNamegettingText() {
		return yourNametextbox.getAttribute("Value");
	}
	
	@FindBy(xpath="//label[normalize-space()='E-Mail Address']") 
	WebElement eMailAddress;
	public boolean eMailAddressisdisplayed() {
		return eMailAddress.isDisplayed();
	}
	
	@FindBy(xpath="//input[@id='input-email']")  
	WebElement eMailAddresstextbox;
	public void eMailAddresstextbox(String email) {
		eMailAddresstextbox.sendKeys(email);
	}
	public String gettingeMailAddress() {
		return eMailAddresstextbox.getAttribute("Value");
	}
	
	@FindBy(xpath="//label[normalize-space()='Enquiry']")
	WebElement enquiryisdisplay;
	public boolean enquiryisdisplay() {
		return enquiryisdisplay.isDisplayed();
	}
	@FindBy(xpath="//textarea[@id='input-enquiry']") 
	WebElement enquirytextbox;
	
	public void enquirytextbox(String text) {
		enquirytextbox.sendKeys(text);
	}
	
	@FindBy(xpath="//input[@value='Submit']") 
	WebElement submitbtn;
	
	public void submitbtn() {
		submitbtn.click();
	}
	//warning messages with out entering text in the fields
	@FindBy(xpath="//div[contains(text(),'Name must be between 3 and 32 characters!')]") 
	WebElement YournameWarningmsg;
	public boolean YournameWarningmsgisdisplayed() {
		return YournameWarningmsg.isDisplayed();
	}
	public String YournameWarningmsgtext() {
		return YournameWarningmsg.getText();
	}
	
	//email warning message
	@FindBy(xpath="//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	WebElement eMailAddresswarningmsg;
	public boolean eMailAddresswarningmsgisdisplayed() {
		return eMailAddresswarningmsg.isDisplayed();
	}
	public String eMailAddresswarningmsgtext() {
		return eMailAddresswarningmsg.getText();
	}
	
	//Enquiry warning msg
	@FindBy(xpath="//div[contains(text(),'Enquiry must be between 10 and 3000 characters!')]")
	WebElement enquirywarningmsg;
	public boolean enquirywarningmsgisdisplayed() {
		return enquirywarningmsg.isDisplayed();
	}
	public String enquirywarningmsgtext() {
		return enquirywarningmsg.getText();
	}
	
	//store owner after order placed
	@FindBy(xpath="//a[normalize-space()='store owner']") 
	WebElement storeOwner;
	public void storeOwner() {
		storeOwner.click();
	}
	
	
}
