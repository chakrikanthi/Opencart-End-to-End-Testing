package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shoppingcart extends Basepage{
	
	public Shoppingcart(WebDriver driver) {
		super(driver);
		
	}
	// empty shopping cart icon
	//Shopping cart header option
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']") 
	WebElement shoppingCart;
	
	public void shoppingCart() {
		shoppingCart.click();
		
	}
	
	//shopping cart toggle box(blackbox button)
	@FindBy(xpath="//span[@id='cart-total']") 
	WebElement shoppingcarttogglebox;
	
	public void shoppingcarttogglebox() {
		shoppingcarttogglebox.click();
		
	}
	@FindBy(xpath="//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]") 
	WebElement yourShoppingCartIsEmpty;
	
	public String yourShoppingCartIsEmpty() {
		
		
		return yourShoppingCartIsEmpty.getText();
		
		
	}
	
	

}
