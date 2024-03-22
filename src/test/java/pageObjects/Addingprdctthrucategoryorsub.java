package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addingprdctthrucategoryorsub  extends Basepage{

	public Addingprdctthrucategoryorsub(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[normalize-space()='Desktops']")  
	WebElement desktopsoption;
	
	public void desktopsoption()
	{
		desktopsoption.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Show AllDesktops']") 
	WebElement showAllDesktopsopt;
	
	public void showalldesktops()
	{
		showAllDesktopsopt.click();
		
	}
	
	@FindBy(xpath="//a[3]") 
	WebElement IMacOPTION;
	
	public void imac()
	{
		IMacOPTION.click();
	}
	@FindBy(xpath="//button[@type='button']//i[@class='fa fa-heart']") 
	WebElement addTowishlist;
	
	public void adddingimactoWL()
	{
		addTowishlist.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='wish list']")  
	WebElement successwishListmsg;
	
	public void clicksuccessmsg()
	{
		successwishListmsg.click();
	}
}
