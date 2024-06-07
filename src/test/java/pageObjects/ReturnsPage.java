package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnsPage extends Basepage{

	public ReturnsPage(WebDriver driver) {
		super(driver);
		
	}

	//Returns from MYaCCOUNT PAGE lEFT COLUMN
	@FindBy(xpath="//a[normalize-space()='View your return requests']") 
	WebElement ReturnRequestsfromLEFTcolumn;
	public void ReturnRequestsfromLEFTcolumn() {
		ReturnRequestsfromLEFTcolumn.click();
	}
	//Returns from MYaCCOUNT PAGE RIGHT COLUMN
	@FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=account/return'][normalize-space()='Returns']") 
	WebElement returnsfromRIGHTcolumn;
	public void returnsfromRIGHTcolumn() {
		returnsfromRIGHTcolumn.click();
	}
	
	//Empty Product Returns message
	
	@FindBy(xpath="//p[normalize-space()='You have not made any previous returns!']") 
	WebElement youHaveNotMadeAnyreturnsMsg;
	public String youHaveNotMadeAnyreturnsMsg() {
		return youHaveNotMadeAnyreturnsMsg.getText();
	}
	
	//Continue btn in Products returns page
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement continuebtninProductreturnsPg;
	public void continuebtninProductreturnsPg() {
		continuebtninProductreturnsPg.click();
	}
	
	//return table header...kanthi1account
	@FindBy(xpath="//div[@id='content']//div//table//thead//tr") 
	WebElement returntableheader;
	public String returntableheader() {
		return returntableheader.getText();
	}
	//Return table data for order 5408
	@FindBy(xpath="//td[normalize-space()='#5408']") 
	WebElement returndetailsof5408;
	public String returndetailsof5408() {
		return returndetailsof5408.getText();
	}
	//View icon of product return 5408
	@FindBy(xpath="//tbody//tr//td//a") 
	WebElement Viewiconofproductreturn5408;
	public String Viewiconofproductreturn5408() {
		return Viewiconofproductreturn5408.getText();
	}
	
	//return table data of order 5407
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]")
	WebElement returndetails5407;
	public String returndetails5407() {
		return returndetails5407.getText();
	}
	//View icon of product return 5407
	@FindBy(xpath="//tbody/tr[1]/td[6]/a[1]") 
	WebElement Viewiconofproductreturn5407;
		
		public void Viewiconofproductreturn5407() {
			Viewiconofproductreturn5407.click();;
		}
		//total table data
		@FindBy(xpath="//tbody")  WebElement totaltabledata;
		public String totaltabledata() {
			return totaltabledata.getText();
		}
		
		//Return Id and Date added
		@FindBy(xpath="//td[contains(text(),'#5407')]") 
		WebElement returnIDandDateadded5407;
		public String returnIDandDateadded5407() {
			return returnIDandDateadded5407.getText();
		}
		
		//return product info
		@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]") 
		WebElement returnproductinfo5407;
		public String returnproductinfo5407() {
			return returnproductinfo5407.getText();
		}
		
		//reason table info for item 5407
		@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]")
		WebElement returninfotablefor5407;
		
		public String returninfotablefor5407() {
			return returninfotablefor5407.getText();
		}
}

