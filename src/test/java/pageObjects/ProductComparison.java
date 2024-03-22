package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparison extends Basepage {

	public ProductComparison(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//input[@placeholder='Search']")  
	WebElement searchbox;
	
	@FindBy(xpath="//i[@class='fa fa-search']")  
	WebElement searchIcon;
	
	@FindBy(xpath="//img[@title='MacBook Air']")  
	WebElement macBookAir;
	
	
	@FindBy(xpath="//button[2]")  
	WebElement comparebutton;
	
	@FindBy(xpath="//a[normalize-space()='product comparison']")  
	WebElement productComparison;
	
	public void searchbox(String searchtxt) 
	{
		
		
		searchbox.sendKeys(searchtxt);
				
	}
	public void searchIcon()
	{
		searchIcon.click();
				
	}
	public void macBookAir()
	{
		macBookAir.click();
	}
	public void comparebutton()
	{
		comparebutton.click();
	}
	public void productComparison() {
		productComparison.click();
	}
	

}
