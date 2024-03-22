package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThreeProductsComparison extends Basepage {

	public ThreeProductsComparison(WebDriver driver) 
	{
		super(driver);
		
	}
	@FindBy(xpath="//input[@placeholder='Search']")  
	WebElement searchbox;
	
	@FindBy(xpath="//i[@class='fa fa-search']")  
	WebElement searchIcon;
	
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]//i[1]") 
	WebElement Macbookcomparisonbtn;
	
	@FindBy(xpath="//i[@class='fa fa-exchange']")  
	WebElement HPcomparisonbtn;
	
	@FindBy(xpath="//button[3]")  
	WebElement macbookaircomparisonbtn;
	
	@FindBy(xpath="//a[normalize-space()='product comparison']")  
	WebElement successprdtCmpsmsg;
	
	@FindBy(xpath="//h1[normalize-space()='Product Comparison']") 
	WebElement productComparisontitlepage;
	public void searchbox(String searchtxt)
	{
		searchbox.sendKeys(searchtxt);
	}
	
	public void searchIcon()
	{
		searchIcon.click();
		
	}
	public void Macbookcomparisonbtn()
	{
		Macbookcomparisonbtn.click();
		searchbox.clear();
	}
	public void HPcomparisonbtn()
	{
		HPcomparisonbtn.click();
		searchbox.clear();
	}
	public void macbookaircomparisonbtn()
	{
		macbookaircomparisonbtn.click();
		searchbox.clear();
	}
	public void successprdtCmpsmsg()
	{
		successprdtCmpsmsg.click();
	}
	public void productComparisontitlepage()
	{
		productComparisontitlepage.click();
	}

	
	
}
