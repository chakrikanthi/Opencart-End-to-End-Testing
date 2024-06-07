package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutInfo extends Basepage {
	
	public CheckoutInfo(WebDriver driver)
	{
		super(driver);
	}

	
	//@FindBy(xpath="//input[@id='input-payment-firstname']")  
	//WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-payment-firstname']") 
	WebElement BillingfirstName;
	public void BillingfirstName(String fname)
	{
		BillingfirstName.sendKeys(fname);
	}
	
	@FindBy(xpath="//input[@id='input-payment-lastname']")  
	WebElement BillinglastName;
	public void BillinglastName(String lname)
	{
		BillinglastName.sendKeys(lname);
	}
	
	@FindBy(xpath="//input[@id='input-payment-company']")
	WebElement Billingcompany;
	public void Billingcompany(String comp)
	{
		Billingcompany.sendKeys(comp);
	}
	
	@FindBy(xpath="//input[@id='input-payment-address-1']")  
	WebElement Billingaddress1;
	public void Billingaddress1(String add1)
	{
		Billingaddress1.sendKeys(add1);
	}
	
	
	@FindBy(xpath="//input[@id='input-payment-address-2']")  
	WebElement Billingaddress2;
	@FindBy(xpath="//input[@id='input-payment-city']")  
	WebElement Billingcity;
	public void Billingcity(String city)
	{
		Billingcity.sendKeys(city);
	}
	
	
	@FindBy(xpath="//input[@id='input-payment-postcode']")  
	WebElement BillingpostCode;
	public void BillingpostCode(String pcode)
	{
		BillingpostCode.sendKeys(pcode);
	}
	
	
	@FindBy(xpath="//select[@id='input-payment-country']") 
	WebElement Billingdrpcountry;
	public void Billingdrpcountry(String country1)
	{
		new Select(Billingdrpcountry).selectByVisibleText(country1);
	}
	@FindBy(xpath="//select[@id='input-payment-zone']")  
	WebElement BillingdrpregionorState;
	
	public void BillingdrpregionorState(String state)
	{
		new Select(BillingdrpregionorState).selectByVisibleText(state);
	}
	//billing continue btn
	
	@FindBy(xpath="//input[@id='button-payment-address']")  
	WebElement Billingcontinuebtn;
	public void Billingcontinuebtn() {
		Billingcontinuebtn.click();
	}
	@FindBy(xpath="//input[@id='input-payment-email']") 
	WebElement EMail;
	
	@FindBy(xpath="//input[@id='input-payment-telephone']") 
	WebElement telephone;
	
	@FindBy(xpath="//input[@id='button-guest']") 
	WebElement continuebtn;
	
	//shipping continue button
	@FindBy(xpath="//input[@id='button-shipping-method']") 
	WebElement shippingcontinuebtn;
	
	//payment method privacy policy
	@FindBy(xpath="//input[@name='agree']") 
	WebElement agree;
	
	@FindBy(xpath="//input[@id='button-payment-method']") 
	WebElement paycontinuebtn;
	
	
	//confirm order
	@FindBy(xpath="//input[@id='button-confirm']") 
	WebElement confirmOrder;
	//input[@id='button-confirm']
	//order confirmation message
	@FindBy(xpath="//h1[normalize-space()='Your order has been placed!']")
	WebElement confirmationmsg;
	
	//after order placed successfully...clicking on continue button
	@FindBy(xpath="//a[normalize-space()='Continue']") 
	WebElement successordercontinuebtn;
	//Billing details tab
	@FindBy(xpath="//a[normalize-space()='Step 2: Billing Details']") 
	WebElement 	BillingDetails;
	public void BillingDetails()
	{
		BillingDetails.click();
	}
	
	//I want to use a new address--Billing details
	@FindBy(xpath="//input[@value='new']") 
	WebElement newBillingAddress;
	public void newBillingAddress() {
		newBillingAddress.click();
	}
	@FindBy(xpath="//input[@id='button-payment-address']")  
	WebElement newbillingcontinuebtn;
	public void newbillingcontinuebtn() {
		newbillingcontinuebtn.click();;
	}
	
	//Delivery Address
	@FindBy(xpath="//a[normalize-space()='Step 3: Delivery Details']")
	WebElement step3DeliveryDetails;
	public void step3DeliveryDetails() {
		step3DeliveryDetails.click();;
	}
	
	
	@FindBy(xpath="//label[normalize-space()='I want to use a new address']//input[@name='shipping_address']") 
	WebElement newshippingAddress;
	public void newshippingAddress() {
		newshippingAddress.click();
	}
	@FindBy(xpath="//input[@id='button-shipping-address']") 
    WebElement newshippingcontinuebtn;
	public void newshippingcontinuebtn() {
		newshippingcontinuebtn.click();
	}
	

@FindBy(xpath="//input[@id='input-shipping-lastname']")  WebElement deliverylastName;
@FindBy(xpath="//input[@id='input-shipping-firstname']")  WebElement deliveryfirstName;
@FindBy(xpath="//input[@id='input-shipping-company']") WebElement deliverycompany;
@FindBy(xpath="//input[@id='input-shipping-address-1']") WebElement deliveryaddress1;
@FindBy(xpath="//input[@id='input-shipping-city']")  WebElement deliverycity;
@FindBy(xpath="//input[@id='input-shipping-postcode']")  WebElement deliverypostCode;
@FindBy(xpath="//select[@id='input-shipping-country']")  WebElement deliverycountry;
@FindBy(xpath="//select[@id='input-shipping-zone']")  WebElement deliveryregionorState;
public void deliveryfirstName(String fsname)
	{
	deliveryfirstName.sendKeys(fsname);
	}

	public void deliverylastName(String lsname)
	{
		deliverylastName.sendKeys(lsname);
	}

	public void deliverycompany(String Comp)
	{
		deliverycompany.sendKeys(Comp);
	}
	public void deliveryaddress1(String add1)
	{
		deliveryaddress1.sendKeys(add1);
	}
	public void deliverycity(String city) {
		deliverycity.sendKeys(city);
	}
	public void deliverypostCode(String code) {
		deliverypostCode.sendKeys("30097");
	}
	public void  deliverycountry(String country) {
		new Select(deliverycountry).selectByVisibleText(country);
	}


	public void deliveryregionorState(String regionorState) {
		new Select(deliveryregionorState).selectByVisibleText(regionorState);
	}


	//Delivery method
	
	@FindBy(xpath="//div[@id='collapse-shipping-method']//div//textarea[@name='comment']")
	WebElement deliverymthdcommentbx;
	public void deliverymthdcommentbx(String comment) {
		newBillingAddress.sendKeys(comment);
	}
	@FindBy(xpath="//input[@id='button-shipping-method']") 
	WebElement deliveryMETHODcontinuebtn;
	public void deliveryMETHODcontinuebtn() {
		deliveryMETHODcontinuebtn.click();
	}
	
	
	@FindBy(xpath="//input[@id='button-payment-address']") 
	WebElement returncustpaycontinue;
	
	@FindBy(xpath="//input[@id='button-shipping-address']") 
	WebElement deliveryDetailcontinuebtn;
	public void deliveryDetailcontinuebtn() {
		deliveryDetailcontinuebtn.click();
	}
	
	@FindBy(xpath="//input[@id='button-shipping-method']") 
	WebElement returncustshipmethodcontinue;
	
	//@FindBy(xpath="//input[@name='agree']") 
	//WebElement returncustagree;
   
  
	
	
	
	public void setaddress2(String add2)
	{
		Billingaddress2.sendKeys(add2);
	}
	public void setcity(String cty)
	{
		Billingcity.sendKeys(cty);
	}
	public void setpostCode(String pstd)
	{
		BillingpostCode.sendKeys(pstd);
	}
	public void setEmail(String Email)
	{
		EMail.sendKeys(Email);
		
	}
	public void settelephone(String tel)
	{
		telephone.sendKeys(tel);
	}
	


	
	
	
	public void setshippingcontinuebtn()
	{
		shippingcontinuebtn.click();
	}
	public void setagree()
	{
		agree.click();
	}
	public void setpaycontinuebtn()
	{
		paycontinuebtn.click();
	}
	public void setconfirmOrder()
	{
		confirmOrder.click();
	}
	public String setconfirmationmsg()
	{
		return confirmationmsg.getText();
	}
 public void setreturncustpaycontinue()
 {
	 returncustpaycontinue.click();
 }
 
 public void setreturncustshipmethodcontinue()
 {
	 returncustshipmethodcontinue.click();
 }
 
 /*public void setreturncustagree()
 {
	 returncustagree.click();
	 
 }*/
 // warning msgs when proper values are not entered in mandatory fiels in when we select --I want to use new address
 @FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]") 
 WebElement ErrorwarningfirstNamemsg;
 public String ErrorwarningfirstNamemsg()
 {
	 return ErrorwarningfirstNamemsg.getText();
 }
 
 @FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")  
 WebElement warninglastNamemsg;
 public String warninglastNamemsg()
 {
	 return warninglastNamemsg.getText();
 }
 @FindBy(xpath="//div[contains(text(),'Address 1 must be between 3 and 128 characters!')]")
 WebElement addresswarningmsg;
 public String addresswarningmsg()
 {
	 return addresswarningmsg.getText();
 }
 
 @FindBy(xpath="//div[contains(text(),'City must be between 2 and 128 characters!')]") 
 WebElement citywarningmsg;
 public String citywarningmsg()
 {
	 return citywarningmsg.getText();
 }
 
 // My Account in order success page
 @FindBy(xpath="//a[normalize-space()='my account']")  
 WebElement myAccountinordersuccesspg;
 
 public void myAccountinordersuccesspg() {
	 myAccountinordersuccesspg.click();
 }
  /*String confirmmsg= confirmationmsg.getText();

	public boolean isOrderPlaced() throws InterruptedException
	{
		try
		{
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		confirmOrder.click();
		Thread.sleep(3000);
		System.out.println(confirmationmsg.getText());
		if(confirmationmsg.getText().equals("Your order has been placed!"))
		{
			System.out.println("order is placed successfully..");
		}
		else {
			System.out.println("order is not placed ..");
		}}
		catch(Exception e)
		{
			return false;
		}
}*/

}