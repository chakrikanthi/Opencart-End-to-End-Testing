package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PdctInstockOutstockPreorder extends Basepage{

	public PdctInstockOutstockPreorder(WebDriver driver) {
		super(driver);		
	}
	@FindBy(xpath="//input[@placeholder='Search']")  
	WebElement searchbox;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")  
	WebElement searchbtn;
	@FindBy(xpath="//a[normalize-space()='MacBook']")  
	WebElement macBookpdct;
	@FindBy(xpath="//li[normalize-space()='Availability:In Stock']")  
	WebElement macInStockstatus;
	@FindBy(xpath="//a[normalize-space()='iPhone']")  
	WebElement iPhonepdct;
	@FindBy(xpath="//li[normalize-space()='Availability:Out Of Stock']")  
	WebElement iphoneOutOfStock;
	@FindBy(xpath="//a[normalize-space()='Samsung Galaxy Tab 10.1']")  
	WebElement samGalaxyTabpdct;
	@FindBy(xpath="//li[normalize-space()='Availability:Pre-Order']")  
	WebElement GalaxyPreOrder;
	public void searchbox(String srchtxt) 
	{
		searchbox.sendKeys(srchtxt);
	}
	public void searchbtn()
	{
		searchbtn.click();
	}
	public void macBookpdct()
	{
		macBookpdct.click();
		searchbox.clear();
	}
	
		public String macInStockstatus() {
			try {
				return (macInStockstatus.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}
		}
		
		public void iPhonepdct()
		{
			iPhonepdct.click();
			searchbox.clear();
			
		}
		
		public String iphoneOutOfStock() {
		try {
			return(iphoneOutOfStock.getText());
		}catch (Exception e) {
			return(e.getMessage());
		}
		}
		
		public void samGalaxyTabpdct()
		{
			samGalaxyTabpdct.click();
		}
		
		public String GalaxyPreOrder()
		{
			try {
				return (GalaxyPreOrder.getText());
			}
			catch(Exception e)
			{
				return(e.getMessage());
			}
		}
		
	
}
