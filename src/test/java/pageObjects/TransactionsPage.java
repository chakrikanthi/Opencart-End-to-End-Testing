package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransactionsPage extends Basepage {

	public TransactionsPage(WebDriver driver) {
		super(driver);
		
	}

	//transactions fromRight columns
	@FindBy(xpath="//aside[@id='column-right']//a[normalize-space()='Transactions']") 
	WebElement transactionsfromRIGHTcolumn;
	public void transactionsfromRIGHTcolumn() {
		transactionsfromRIGHTcolumn.click();
	}
	//your Transactions from Left Column
	@FindBy(xpath="//a[normalize-space()='Your Transactions']") 
	WebElement yourTransactionsfromLEFTcolumn;
	public void yourTransactionsfromLEFTcolumn() {
		yourTransactionsfromLEFTcolumn.click();
	}
	//My Account
	@FindBy(xpath="(//span[normalize-space()='My Account'])[1]") 
	WebElement myAccountdrpdown;
	public void myAccountdrpdown() {
		myAccountdrpdown.click();
	}
	
	//Transactions from MY ACCOUNT dropdown
	
	@FindBy(xpath="//div[@id='top-links']//a[normalize-space()='Transactions']") 
	WebElement transactionsfromMYAccountdrpdown;
	public void transactionsfromMYAccountdrpdown() {
		transactionsfromMYAccountdrpdown.click();
	}
	//register from my account drop down
	@FindBy(xpath="//div[@id='top-links']//a[normalize-space()='Register']")
	WebElement registerfromMyaccntdropmenu;
	public void registerfromMyaccntdropmenu() {
		registerfromMyaccntdropmenu.click();
	}
	
	//continue button in your Transactions page
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement continuebtninYourTransactionsPg;
	
	public void continuebtninYourTransactionsPg() {
		continuebtninYourTransactionsPg.click();
	}
	//continue btn is enabled
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement continuebtnisenabled;
	public void continuebtnisenabled() {
		continuebtnisenabled.isEnabled();
	}
	
	//Current balance 0.00 message
	@FindBy(xpath="//div[@id='account-transaction']//p[1]") 
	WebElement yourCurrentBalanceIs0msg;
	
	public String yourCurrentBalanceIs0msg() {
		
		return yourCurrentBalanceIs0msg.getText();
	}
	
	//Transactions table header info
	@FindBy(xpath="//div[@id='content']//div//table//thead//tr")  
	WebElement Transactionstableheader;
public String Transactionstableheader() {
		
		return Transactionstableheader.getText();
	}
	
	
}
