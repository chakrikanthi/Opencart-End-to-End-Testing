package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Defaultquantitysetto1 extends Basepage{

	public Defaultquantitysetto1(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//input[@id='input-quantity']") 
	WebElement qty;
	
	public String qty(String quantity) throws InterruptedException
	
	{
		qty.click();
		System.out.println(qty.getText());
		/*try {
			return (qty.getText());
		} catch (Exception e) 
		{
			return (e.getMessage());

		}
	*/
		qty.clear();
		Thread.sleep(5000);
		qty.sendKeys(quantity);
		return quantity;
		
		
		
	}
	
	@FindBy(xpath="//button[@id='button-cart']") 
	WebElement addToCart;
	
	public void addToCart()
	{
		addToCart.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='shopping cart']") 
	WebElement shoppingCart;
	public void shoppingCart()
	{
		shoppingCart.click();
	}
}
