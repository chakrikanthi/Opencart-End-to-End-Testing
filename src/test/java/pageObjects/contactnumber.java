package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactnumber extends Basepage{

	public contactnumber(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath="//i[@class='fa fa-phone']") 
	WebElement callcontact;
	
	@FindBy(xpath="//input[@id='input-name']")
	WebElement yourName;
	
	@FindBy(xpath="//input[@id='input-email']")  
	WebElement EMailAddress;
	
	@FindBy(xpath="//textarea[@id='input-enquiry']") 
	WebElement enquiryTEXT;
	
	@FindBy(xpath="//input[@value='Submit']") 
	WebElement submit;
	
	@FindBy(xpath="//h1[normalize-space()='Contact Us']") 
	WebElement contactUsmessage;
	
	public void testcallcontact()
	{
		callcontact.click();
	}
	public void setName(String Name)
	{
		yourName.sendKeys(Name);;
	}
	public void setEMail(String email)
	{
		EMailAddress.sendKeys(email);;
	}
	public void enquiryTEXT(String Text)
	{
		enquiryTEXT.sendKeys(Text);;
	}
	public void submit()
	{
		submit.click();
	}
	public String getcontactUsmessage() {
		try {
			return (contactUsmessage.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	
	}
	
	
	
	
	
}
