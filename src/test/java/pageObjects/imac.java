package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class imac extends Basepage {

	public imac(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")  
	WebElement searchbox;
	
	public void searchbox(String srchtxt) 
	{
		searchbox.clear();
		searchbox.sendKeys(srchtxt);
		
	}
	
	@FindBy(xpath="//i[@class='fa fa-search']") 
	WebElement searchIcon;
	
	public void  searchIcon()
	{
		searchIcon.click();
	}

	       //search product for imac
			@FindBy(xpath="//a[normalize-space()='iMac']") 
			WebElement iMac;
			
			public void imacitem()
			{
				iMac.click();
			}
			
			//black shopping cart icon when there are no items added to shopping cart
			@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']") 
			WebElement BlackShoppingcartbtn;
			public void BlackShoppingcartbtn()
			{
				BlackShoppingcartbtn.click();
			}
			//yourShoppingCartIsEmpty! is displayed as we dont have item in shopping cart
			@FindBy(xpath="//p[@class='text-center']")
			WebElement yourShoppingCartIsEmpty;
			
			public void yourShoppingCartIsEmpty()
			{
				yourShoppingCartIsEmpty.isDisplayed();
				System.out.println(yourShoppingCartIsEmpty.getText());
				yourShoppingCartIsEmpty.click();
				System.out.println("Displayed Home page");
			}
			
			
			
			//Adding imac to wishlist
			@FindBy(xpath="//button[@class='btn btn-default']//i[@class='fa fa-heart']") 
			WebElement addiMactoWL;
			
			public void addimactoWL()
			{
				addiMactoWL.click();	
			}
			
		  
			
			//related product for imac
			@FindBy(xpath="//div[@class='product-thumb transition']") 
	       WebElement appleCinema30relatedprct;
			
			public void relatedproduct()
			{
				appleCinema30relatedprct.click();
			}
			
			//adding related product"Apple Cinema 30"" to wishlist
			@FindBy(xpath="//div[@class='button-group']//i[@class='fa fa-heart']") 
			WebElement Apcm30addToCart;
			
			public void Addingrelatedprdct()
			{
				Apcm30addToCart.click();
			}
			
			//Wishlist link in success message
			@FindBy(xpath="//a[normalize-space()='wish list']")  
			WebElement successwishList;
			
			public void successWLmsg()
			{
				successwishList.click();
			}
			
			@FindBy(xpath="//button[@type='button']//i[@class='fa fa-heart']")  
			WebElement addthrusearchpage;
			
			public void addthrusearchpage()
			{
				addthrusearchpage.click();
			}
			
			//Add imac to Shopping cart
			
			@FindBy(xpath="//button[@id='button-cart']") 
			WebElement addToCart;
			
			public void addtocart()
			{
				addToCart.click();;
			}
			
			
			//successmsg After adding imac to shoppingcart ; "Success: You have added iMac to your shopping cart!" this is the success message displayed..
			
			@FindBy(xpath="//a[normalize-space()='shopping cart']") 
			WebElement shoppingCart;
			
			public void ShopcartlnkinSCmsg()
			{
				shoppingCart.click();
			}
			
			//validate success msg after adding imac to shopping cart
			@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
			WebElement successmsgAddedIMactoSC;
			
			public String SucessmgsafteraddSC()
			{
				try {
					return (successmsgAddedIMactoSC.getText());
				} catch (Exception e) {
					return (e.getMessage());

				}
			}
			
			// clicking on header shopping cart icon
			
			@FindBy(xpath="//span[normalize-space()='Shopping Cart']") 
			WebElement headershoppingCart;
			
			public void headershoppingCart()
			{
				headershoppingCart.click();
			}
			
			//Site map in the footer
			@FindBy(xpath="//a[normalize-space()='Site Map']") 
			WebElement siteMap;
			
			public void sitemap()
			{
				siteMap.click();
			}
			
			// shopping cart in site map
			@FindBy(xpath="//a[contains(text(),'Shopping Cart')]") 
			WebElement shoppingCartinSitemap;
			public void shoppingCartinSitemap()
			{
				shoppingCartinSitemap.click();
			}
			
}
