package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchboxandIcon extends Basepage{

	public SearchboxandIcon(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//input[@placeholder='Search']")  
	WebElement searchbox;
	@FindBy(xpath="//i[@class='fa fa-search']") 
	WebElement searchIcon;
	
	   //product is HP LP3065
		@FindBy(xpath="//div[@class='caption']//a[contains(text(),'HP LP3065')]") 
		WebElement hPLP3065;
		
		//product mac book air
		@FindBy(xpath="//img[@title='MacBook Air']")  
		WebElement macBookAir;
		
		
		//Product link to Apple Cinema 30 "
		@FindBy(xpath="//div[@class='caption']//h4") 
		WebElement appleCinema30;
		
		//@FindBy(xpath="//a[normalize-space()='Apple Cinema 30"']") 
				//@CacheLookup private WebElement appleCinema30;(this is not working if i use this)
		
		// product Samsung galaxy tab
		@FindBy(xpath="//a[normalize-space()='Samsung Galaxy Tab 10.1']") 
		WebElement samsungGalaxyTab10;
		
		//product iphone
		@FindBy(xpath="//a[normalize-space()='iPhone']") 
		WebElement iPhone;
		
		public void iphonelink()
		{
			iPhone.click();	
		}
		
		//search product for imac
		@FindBy(xpath="//a[normalize-space()='iMac']") 
		WebElement iMac;
		
		public void imac()
		{
			iMac.click();
		}
		
		//related product for imac
		@FindBy(xpath="//div[@class='product-thumb transition']") 
       WebElement appleCinema30relatedprct;
		
		public void relatedproduct()
		{
			appleCinema30relatedprct.click();
		}
		
	public void searchbox(String srchtxt) 
	{
		searchbox.clear();
		searchbox.sendKeys(srchtxt);
		
	}
	public void  searchIcon()
	{
		searchIcon.click();
	}
	public void hPLP3065()
	{
		hPLP3065.click();
	}
	public void macBookAir()
	{
		macBookAir.click();
	}
	public void appleCinema30()
	{
		appleCinema30.click();
	}
	public void samsungGalaxyTab10()
	{
		samsungGalaxyTab10.click();
	}
}
