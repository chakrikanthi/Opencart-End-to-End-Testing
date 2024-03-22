package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import testBase.Baseclass;

public class AddingproductToCart extends Basepage{
	
	public AddingproductToCart(WebDriver driver)
	{
		super(driver);
	}


@FindBy(xpath="//a[@class='dropdown-toggle'][normalize-space()='Laptops & Notebooks']")
WebElement dropdownlaptopandbooks;

@FindBy(xpath="//a[normalize-space()='Show AllLaptops & Notebooks']")  
WebElement showAllLaptopsandNotebooks;

@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]") 
WebElement addToCart;

@FindBy(xpath="//button[@id='button-cart']")
WebElement finaladdToCart;

@FindBy(xpath="//span[normalize-space()='Shopping Cart']") 
WebElement shoppingCart;

@FindBy(xpath="//a[@class='btn btn-primary']") 
WebElement checkout;
//check out new customer--Register account/ Guest Checkout

@FindBy(xpath="//label[normalize-space()='Register Account']")
WebElement registerAccount;

@FindBy(xpath="//label[normalize-space()='Guest Checkout']") 
WebElement guestCheckout;

@FindBy(xpath="//input[@id='button-account']") 
WebElement continuebtn;

public void  dropdownlaptopandbooks()
{
	dropdownlaptopandbooks.click();
}

public void showAllLaptopsandNotebooks()
{
	showAllLaptopsandNotebooks.click();
}

public void addToCart()
{
	addToCart.click();
}

public void finaladdToCart()
{
	finaladdToCart.click();
	
}
public void shoppingCart()
{
	shoppingCart.click();
	
}
public void guestCheckout()
{
	guestCheckout.click();
	
}

public void continuebtn()
{
	continuebtn.click();
	
}
public void checkout()
{
	checkout.click();
	
}
public void registerAccount()
{
	registerAccount.click();
	
}



}
