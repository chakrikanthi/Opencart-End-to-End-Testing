package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Currencies extends Basepage {

	public Currencies(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//span[normalize-space()='Currency']")  
	WebElement currencyicon;
	public void currencyicon() {
		currencyicon.click();
	}
	
	@FindBy(xpath="//button[contains(text(),'€Euro')]") 
	WebElement €Euroclick;
	public void €Euroclick() {
		€Euroclick.click();
	}
	
	@FindBy(xpath="//button[normalize-space()='£Pound Sterling']")  
	WebElement £PoundSterlingclick;
	public void £PoundSterlingclick() {
		£PoundSterlingclick.click();
	}
	@FindBy(xpath="//button[normalize-space()='$US Dollar']")  
	WebElement $USDollarclick;
	public void $USDollarclick() {
		$USDollarclick.click();
	}
	
	//macbook prouct price in euro currency
	@FindBy(xpath="//p[contains(text(),'472.33€')]") 
	WebElement macbookeurocurrency;
	public String macbookeurocurrency() {
		return macbookeurocurrency.getText();
	}
	
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//p[2]")  
	WebElement iphonepriceinPoundsterling;
	public String iphonepriceinPoundsterling() {
		return iphonepriceinPoundsterling.getText();
	}
	//canon EOS 5D PRICE IN US DOLLARS
	@FindBy(xpath="//span[normalize-space()='$98.00']")  
	WebElement CanonEOSinUSDollars;
	public String CanonEOSinUSDollars() {
		return CanonEOSinUSDollars.getText();
	}
}
