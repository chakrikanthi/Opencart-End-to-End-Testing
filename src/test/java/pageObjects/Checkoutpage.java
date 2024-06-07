package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoutpage extends Basepage{
	
	public Checkoutpage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//span[normalize-space()='Checkout']")  WebElement checkout;
	
	public void checkout() {
		checkout.click();
	}
	
	// empty check out info
	@FindBy(xpath="//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")
    WebElement Emptycheckputpagemsg;
	
	public String Emptycheckputpagemsg() {
		return Emptycheckputpagemsg.getText();
	}
	// black cartbutton 
	@FindBy(xpath="//span[@id='cart-total']") 
	WebElement blackcartbtn;
	public void blackcartbtn() {
		blackcartbtn.click();
	}
	
	@FindBy(xpath="//strong[normalize-space()='Checkout']") 
	WebElement checkoutthrublackcrtbtn;
	public void checkoutthrublackcrtbtn() {
		checkoutthrublackcrtbtn.click();
	}
	
	

}
