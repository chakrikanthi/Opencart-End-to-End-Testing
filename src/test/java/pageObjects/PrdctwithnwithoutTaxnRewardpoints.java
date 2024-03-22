package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.Baseclass;

public class PrdctwithnwithoutTaxnRewardpoints extends Basepage {

	public PrdctwithnwithoutTaxnRewardpoints(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//h2[normalize-space()='$122.00']")  
	WebElement Pricewithtax122;
	
	@FindBy(xpath="//li[normalize-space()='Ex Tax:$100.00']") 
	WebElement PriceexTax100;
	
	@FindBy(xpath="//li[normalize-space()='Price in reward points:400']")  
	WebElement priceInRewardPoints400;
	
	public String Pricewithtax122() {
		try {
			return (Pricewithtax122.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
	public String PriceexTax100() {
		try {
			return (PriceexTax100.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
	public String priceInRewardPoints400() {
		try {
			return (priceInRewardPoints400.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
	
	
}
