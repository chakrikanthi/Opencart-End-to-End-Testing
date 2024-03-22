package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CkngProductnameBrandnCode extends Basepage{

	public CkngProductnameBrandnCode(WebDriver driver) 
	{
		super(driver);
				
	}

	@FindBy(xpath="//input[@placeholder='Search']")  
	WebElement searchbox;
	@FindBy(xpath="//i[@class='fa fa-search']")  
	WebElement searchIcon;
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//div[1]//h4[1]//a[1]")  
	WebElement macBooksrcpg;
	@FindBy(xpath="//h1[normalize-space()='MacBook']")  
	WebElement macBookprdctname;
	@FindBy(xpath="//a[normalize-space()='Apple']")  
	WebElement brandapple;
	
	@FindBy(xpath="//li[normalize-space()='Product Code:Product 16']")  
	WebElement mcprdctCode16;
	public void searchbox(String srchtxt) 
	{
		searchbox.sendKeys(srchtxt);
	}
	public void searchIcon() 
	{
		searchIcon.click();
	}
	public void macBooksrcpg()
	{
		macBooksrcpg.click();
	}
	
		public String macBookprdctname() {
			try {
				return (macBookprdctname.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}
		}
			public String brandapple() {
				try {
					return (brandapple.getText());
				} catch (Exception e) {
					return (e.getMessage());

				}
	}
			public String mcprdctCode16() {
				try {
					return (mcprdctCode16.getText());
				} catch (Exception e) {
					return (e.getMessage());

				}
	}
	
}
