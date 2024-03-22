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
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-payment-lastname']")  
	WebElement lastName;
	@FindBy(xpath="//input[@id='input-payment-company']")
	WebElement company;
	@FindBy(xpath="//input[@id='input-payment-address-1']")  
	WebElement address1;
	@FindBy(xpath="//input[@id='input-payment-address-2']")  
	WebElement address2;
	@FindBy(xpath="//input[@id='input-payment-city']")  
	WebElement city;
	@FindBy(xpath="//input[@id='input-payment-postcode']")  
	WebElement postCode;
	@FindBy(xpath="//select[@id='input-payment-country']") 
	WebElement drpcountry;
	@FindBy(xpath="//select[@id='input-payment-zone']")  
	WebElement drpregionorState;
	
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
	
	@FindBy(xpath="//input[@id='button-payment-address']") 
	WebElement returncustpaycontinue;
	
	@FindBy(xpath="//input[@id='button-shipping-address']") 
	WebElement returncustshipaddresscontinue;
	
	@FindBy(xpath="//input[@id='button-shipping-method']") 
	WebElement returncustshipmethodcontinue;
	
	//@FindBy(xpath="//input[@name='agree']") 
	//WebElement returncustagree;
    public void setfirstname(String fsname)
	{
		firstName.sendKeys(fsname);
	}

	public void setlastname(String lsname)
	{
		lastName.sendKeys(lsname);
	}

	public void setcompany(String Comp)
	{
		company.sendKeys(Comp);
	}
	public void setaddress1(String add1)
	{
		address1.sendKeys(add1);
	}

	public void setaddress2(String add2)
	{
		address2.sendKeys(add2);
	}
	public void setcity(String cty)
	{
		city.sendKeys(cty);
	}
	public void setpostCode(String pstd)
	{
		postCode.sendKeys(pstd);
	}
	public void setEmail(String Email)
	{
		EMail.sendKeys(Email);
		
	}
	public void settelephone(String tel)
	{
		telephone.sendKeys(tel);
	}
	/*public void setcountry(String cntry)
	{
		country.sendKeys(cntry);
	}
	
	public void setregionorState(String regst)
	{
		regionorState.sendKeys(regst);
	}*/
	public void setCountry(String country) {
		new Select(drpcountry).selectByVisibleText(country);
	}


	public void setregionorState(String regionorState) {
		new Select(drpregionorState).selectByVisibleText(regionorState);
	}
	public void setcontinuebtn()
	{
		continuebtn.click();
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
 public void setreturncustshipaddresscontinue()
 {
	 returncustshipaddresscontinue.click();
 }
 public void setreturncustshipmethodcontinue()
 {
	 returncustshipmethodcontinue.click();
 }
 
 /*public void setreturncustagree()
 {
	 returncustagree.click();
	 
 }*/

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