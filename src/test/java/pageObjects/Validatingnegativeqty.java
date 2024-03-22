package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Validatingnegativeqty extends Basepage {

	public Validatingnegativeqty(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//input[@id='input-quantity']")
	WebElement qty;
	
	public void qty(String quantity) 
	{
		qty.clear();
		qty.sendKeys(quantity);
	}
	
	@FindBy(xpath="//button[@id='button-cart']") 
	WebElement addToCart;
	
	public void addToCart()
	{
		addToCart.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='shopping cart']")  
	WebElement shoppingCartbtn;
	
	public void shoppingCartbtn()
	{
		shoppingCartbtn.click();
	}
	
	@FindBy(xpath="//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]") 
	
	WebElement yourShoppingCartIsEmptymsg;

	public boolean yourShoppingCartIsEmptymsg()
	{
	try
	{
		return(yourShoppingCartIsEmptymsg.isDisplayed());
	}
	catch(Exception e)
	{
	return(false); 
	}

	}
}
