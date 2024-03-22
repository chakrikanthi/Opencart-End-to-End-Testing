package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wishlisttabindifferentlocation extends Basepage {

	public Wishlisttabindifferentlocation(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Wish List']") 
	WebElement rightcoloumnwishList;
	
	public void rightsideWLtab()
	{
		rightcoloumnwishList.click();
	}
		
	@FindBy(xpath="//span[normalize-space()='Wish List (3)']") 
     WebElement Topwishlisttab;
	
	public void topcornerWLtab()
	{
		Topwishlisttab.click();
	}
	
	
	@FindBy(xpath="//ul[@class='list-unstyled']//a[normalize-space()='Wish List']") 
	WebElement footerwishListtab;
	public void footerWLtab()
	{
		footerwishListtab.click();
	}
	
	@FindBy(xpath="//a[@class='btn btn-danger']") 
	WebElement removetab;
	
	//for apple cinema 30
	public void RemoveAppleCinematab()
	{
	
		removetab.click();
	}
	
	//"Success: You have modified your wish list!"  message displayed after removing product from WL
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement successModifiedWL;
	
	public String modifiedWLmsg()
	{
		try {
			return (successModifiedWL.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
	
	public boolean successRemovemsg() {
		return successModifiedWL.isDisplayed();
	}
	//Success: You have modified your wish list!
	
	@FindBy(xpath="//p[normalize-space()='Your wish list is empty.']") 
	WebElement yourWishListIsEmpty;
	
	//"Your wish list is empty." message displayed after emptying the WL
	public String WLemptyMSG()
	{
		try {
			return(yourWishListIsEmpty.getText());
		}catch(Exception e) {
		return(e.getMessage());
	}}
	// apple cinema 30 add to cart from WL
		@FindBy(xpath="//button[@class='btn btn-primary']//i[@class='fa fa-shopping-cart']")
		WebElement AddApplecinematocartfromWL;
		
		public void addApplecinWLprcttocart()
		{
			AddApplecinematocartfromWL.click();;
		}
	
		// add imac from WL to cart
		@FindBy(xpath="//tbody/tr[1]/td[6]/button[1]/i[1]") 
		WebElement AddimacfromWLtocart;
		
		public void addimactocart()
		{
			AddimacfromWLtocart.click();
		}
		
		//add imac to cart success msg
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
		WebElement successaddimacmsg;
		
		
		public String successimacaddmsg()
		{
			try {
				return(successaddimacmsg.getText());
			}catch(Exception e) {
			return(e.getMessage());
		}
		}	
		
}
