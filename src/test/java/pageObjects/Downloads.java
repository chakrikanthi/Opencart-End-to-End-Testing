package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Downloads extends Basepage{

	public Downloads(WebDriver driver) {
		super(driver);

	}

	//Downloads on LEFT SIDE in MY Account page after logged in 
	@FindBy(xpath="//div[@id='content']//a[normalize-space()='Downloads']") 
	WebElement LEFTsidedownloadsinMYAccountpg;

	public void LEFTsidedownloadsinMYAccountpg() {
		LEFTsidedownloadsinMYAccountpg.click();
	}

	//My Account from top menu bar
	@FindBy(xpath="//span[normalize-space()='My Account']")  
	WebElement myAccounttopMenubar;
	public void myAccounttopMenubar() {
		myAccounttopMenubar.click();
	}
	//my ACCOUNT(WITHOUT LOGIN)--Register
		@FindBy(xpath="//div[@id='top-links']//a[normalize-space()='Register']") 
		WebElement registerMyAcntDropdwn;

		public void registerMyAcntDropdwn() {
			registerMyAcntDropdwn.click();
		}
	@FindBy(xpath="//div[@id='top-links']//a[normalize-space()='Downloads']") 
	WebElement downloadsfromMYAccountDROPdown;
	
	public void downloadsfromMYAccountDROPdown() {
		downloadsfromMYAccountDROPdown.click();
	}

	@FindBy(xpath="//a[normalize-space()='Site Map']") 
	WebElement siteMap;
	public void siteMap() {
		siteMap.click();
	}
	
	@FindBy(xpath="//div[@id='content']//div//div//a[normalize-space()='Downloads']")  
	WebElement SiteMapdownloads;
	
	public void SiteMapdownloads() {
		SiteMapdownloads.click();
	}

	@FindBy(xpath="//aside[@id='column-right']//a[normalize-space()='Downloads']") 
	WebElement downloadsfromRIGHTside;
	
	public void downloadsfromRIGHTside() {
		downloadsfromRIGHTside.click();
	}
	
	@FindBy(xpath="//a[normalize-space()='Continue']") 
	WebElement AccountDownloadscontinuebtn;
	public void AccountDownloadscontinuebtn() {
		AccountDownloadscontinuebtn.click();
	}
	
	@FindBy(xpath="//p[contains(text(),'You have not made any previous downloadable orders')]")  
	WebElement youHaveNotMadeAnyPreviousDownloadsMsg;
	
	public String youHaveNotMadeAnyPreviousDownloadsMsg() {
		return youHaveNotMadeAnyPreviousDownloadsMsg.getText();
	}
}
