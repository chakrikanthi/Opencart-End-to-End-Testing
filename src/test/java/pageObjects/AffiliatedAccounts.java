package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliatedAccounts extends Basepage{

	public AffiliatedAccounts(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[normalize-space()='Register for an affiliate account']") 
	WebElement registerForAnAffiliateAcco;
	public void registerForAnAffiliateAcco() {
		registerForAnAffiliateAcco.click();
	}

@FindBy(xpath="//input[@id='input-company']") 
WebElement company;
public void company(String comp) {
	company.sendKeys(comp);;
}
@FindBy(xpath="//input[@id='input-website']") 
WebElement webSite;
public void webSite(String website) {
	webSite.sendKeys(website);;
}
@FindBy(xpath="//input[@id='input-tax']") 
WebElement taxID;
public void taxID(String taxid) {
	taxID.sendKeys(taxid);;
}
@FindBy(xpath="//input[@value='cheque']") 
WebElement chequepayment;
public void chequepayment() {
	chequepayment.click();
}
//Error msg with out entering any text in the cheque name field
@FindBy(xpath="//div[contains(text(),'Cheque Payee Name required!')]") 
WebElement ErrormsgchequePayeeNameRequired;
public boolean ErrormsgchequePayeedisplayed() {
	return ErrormsgchequePayeeNameRequired.isDisplayed();
}
public String gettingTextofErrormsgchequePayee() {
	return ErrormsgchequePayeeNameRequired.getText();
	
}
@FindBy(xpath="//input[@value='paypal']") 
WebElement paypalpayment;
public void paypalpayment() {
	paypalpayment.click();
}

@FindBy(xpath="//input[@value='bank']") 
WebElement banktransfer;
public void banktransfer() {
	banktransfer.click();
}


@FindBy(xpath="//input[@id='input-bank-account-name']") 
WebElement accountName;

public void accountName(String Aname) {
	accountName.sendKeys(Aname);
}

@FindBy(xpath="//input[@id='input-bank-name']")
WebElement bankName;
public void bankName(String Bname) {
	bankName.sendKeys(Bname);
}

@FindBy(xpath="//input[@id='input-bank-branch-number']") 
WebElement aBABSBNumberBranchNumber;
public void aBABSBNumberBranchNumber(String ABAnumber) {
	aBABSBNumberBranchNumber.sendKeys(ABAnumber);
}

@FindBy(xpath="//input[@id='input-bank-swift-code']")
WebElement sWIFTCode;
public void sWIFTCode(String swcode) {
	sWIFTCode.sendKeys(swcode);
}

@FindBy(xpath="//input[@id='input-bank-account-number']") 
WebElement accountNumber;
public void accountNumber(String ACnum) {
	accountNumber.sendKeys(ACnum);
}

@FindBy(xpath="//input[@id='input-cheque']") 
WebElement chequePayeeName;
public void chequePayeeName(String pname) {
	chequePayeeName.sendKeys(pname);;
}
//Error messages for BANK TRANSFER payment method without entering credentials
@FindBy(xpath="//div[contains(text(),'Account Name required!')]") 
WebElement erraccountNameRequired;
public boolean erraccountNameRequireddisplay() {
	return erraccountNameRequired.isDisplayed();
}

public String erraccountNameRequiredText() {
	return erraccountNameRequired.getText();
}

@FindBy(xpath="//div[contains(text(),'Account Number required!')]") 
WebElement accountNumberRequired;
public boolean erraccountNumberRequireddisplay() {
	return accountNumberRequired.isDisplayed();
}

public String erraccountNumberRequiredText() {
	return accountNumberRequired.getText();
}
@FindBy(xpath="//input[@name='agree']") 
WebElement agree;

public void agree() {
	agree.click();
}
@FindBy(xpath="//input[@value='Continue']")  
WebElement continuebtninyourAfflinfoPg;
public void continuebtninyourAfflinfoPg() {
	continuebtninyourAfflinfoPg.click();
}
//Edit your Affiliated Information
@FindBy(xpath="//a[normalize-space()='Edit your affiliate information']") 
WebElement editYourAffiliateInformationpresent;

public boolean editYourAffiliateInformationpresent() {
	return editYourAffiliateInformationpresent.isDisplayed();
}
public void editYourAffiliateInformationlink() {
	editYourAffiliateInformationpresent.click();
}

@FindBy(xpath="//a[normalize-space()='Custom Affiliate Tracking Code']") 
WebElement customAffiliateTrackingCodepresent;

public boolean customAffiliateTrackingCodepresent() {
	return customAffiliateTrackingCodepresent.isDisplayed();
	}
public void customAffiliateTrackingCodelink() {
	customAffiliateTrackingCodepresent.click();
}
//Affiliated tracking header text
@FindBy(xpath="//p[contains(text(),'To make sure you get paid for referrals you send t')]")  
WebElement AffiliatedTrackingheadertext;
public String AffiliatedTrackingheadertext() {
	return AffiliatedTrackingheadertext.getText();
}

@FindBy(xpath="//input[@id='input-paypal']") 
WebElement payPalEmailAccount;

public void payPalEmailAccount(String email) {
	payPalEmailAccount.clear();
	payPalEmailAccount.sendKeys(email);
}
//Invalid email address in papypal email text box
@FindBy(xpath="//div[contains(text(),'PayPal Email Address does not appear to be valid!')]") 
WebElement errormsgpayPalEmailAddressDoesNot;

public boolean payPalEmailAddressDoesNot() {
	return errormsgpayPalEmailAddressDoesNot.isDisplayed();
}

public String errormsgTextpayPalEmailAddressDoesNot() {
 return errormsgpayPalEmailAddressDoesNot.getText();
}
//Affiliate footer tab

@FindBy(xpath="//a[normalize-space()='Affiliate']") 
WebElement affiliatefootertab;

public void affiliatefootertab() {
	affiliatefootertab.click();
}
//New Affiliate continue btn
@FindBy(xpath="//a[normalize-space()='Continue']") 
WebElement NewAffiliatecontinuebtn;

public void NewAffiliatecontinuebtn() {
	NewAffiliatecontinuebtn.click();
}
//Affiliated program page elements

@FindBy(xpath="//input[@id='input-firstname']") 
WebElement firstName;

public void firstName(String fname) {
	firstName.sendKeys(fname);
}
@FindBy(xpath="//input[@id='input-lastname']") 
WebElement lastName;

public void lastName(String lname) {
	lastName.sendKeys(lname);
}
@FindBy(xpath="//input[@id='input-email']")  
WebElement eMail;
public void eMail(String mailid) {
	eMail.sendKeys(mailid);
}

@FindBy(xpath="//input[@id='input-telephone']") 
WebElement telephone;
public void telephone(String tnum) {
	telephone.sendKeys(tnum);
}
@FindBy(xpath="//input[@id='input-password']")
WebElement password;
public void password(String pwd) {
	password.sendKeys(pwd);
}

@FindBy(xpath="//input[@id='input-confirm']") 
WebElement passwordConfirm;
public void passwordConfirm(String pwd) {
	passwordConfirm.sendKeys(pwd);
}
//My Account from Right side column
@FindBy(xpath="//aside[@id='column-right']//a[normalize-space()='My Account']")
WebElement myAccountfromRIGHTsidecolumn;

public void myAccountfromRIGHTsidecolumn() {
	myAccountfromRIGHTsidecolumn.click();
}
//Warning email msg of already registered acnt

@FindBy(xpath="//div[normalize-space()='Warning: E-Mail Address is already registered!']") 
WebElement warningEMailAddressexist;
public  String warningEMailAddressexist() {
	return warningEMailAddressexist.getText();
}
public boolean warningEMailAddressexiststatus() {
	return warningEMailAddressexist.isDisplayed();
}

//password field and password comfirm field having different values

@FindBy(xpath="//div[contains(text(),'Password confirmation does not match password!')]") 
WebElement passwordConfirmationDoesNotmatch;
public  String passwordConfirmationDoesNotmatchtxt() {
	return passwordConfirmationDoesNotmatch.getText();
}
public boolean passwordConfirmationDoesNotmatchdisplay() {
	return passwordConfirmationDoesNotmatch.isDisplayed();
}

//Login page link in Affiliated program page
@FindBy(xpath="//a[normalize-space()='login page']")  
WebElement loginPagelinkinaffiliatedprgpg;

public void loginPagelinkinaffiliatedprgpg() {
	loginPagelinkinaffiliatedprgpg.click();
}
//aBOUT US LINK
@FindBy(xpath="//b[normalize-space()='About Us']") 
WebElement aboutUsLINK;

public void aboutUsLINK() {
	aboutUsLINK.click();
}
//CLOSING aBOUT US DIALOG BOX
@FindBy(xpath="//button[normalize-space()='×']") 
WebElement ClosingAboutUsdialogbox;

public void ClosingAboutUsdialogbox() {
	
	ClosingAboutUsdialogbox.click();
}

//Affiliate email login
@FindBy(xpath="//input[@id='input-email']")  
WebElement affiliateEMaillogin;
public void affiliateEMaillogin(String email) {
	
	affiliateEMaillogin.sendKeys(email);
}
//Affiliate password
@FindBy(xpath="//input[@id='input-password']")  
WebElement affiliatepassword;
public void affiliatepassword(String pwd) {
	
	affiliatepassword.sendKeys(pwd);
}
//click login in affliated login
@FindBy(xpath="//input[@value='Login']") 
WebElement affiliatedloginbtn;

public void affiliatedloginbtn() {
	
	affiliatedloginbtn.click();
}
//Success message after updating info in edit your affiliation info page
@FindBy(xpath="//div[contains(text(),'Success: Your account has been successfully update')]") 
WebElement successYourAccountHasBeenedited;
public String successYourAccountHasBeenedited() {
	return successYourAccountHasBeenedited.getText();
}

public boolean successYourAccountHasBeeneditedpresent() {
	return successYourAccountHasBeenedited.isDisplayed();
}
//Your tracking code
@FindBy(xpath="//textarea[@id='input-code']") 
WebElement yourTrackingCodeintextbox;
public String yourTrackingCodeintextbox() {
	return yourTrackingCodeintextbox.getText();
}

//tracking link generator
@FindBy(xpath="//input[@id='input-generator']") 
WebElement trackingLinkGenerator;

public void trackingLinkGenerator() {
	trackingLinkGenerator.click();
}
//imac in tracking link generator
@FindBy(xpath="//body//div[@id='account-tracking']//div//li[1]")  
WebElement iMacintrackinglinkgenertor;
public void iMacintrackinglinkgenertor() {
	iMacintrackinglinkgenertor.click();
}

//tracking link 
@FindBy(xpath="//textarea[@id='input-link']") 
WebElement trackingLink;
public String trackingLink() {
	return trackingLink.getText();
}
//Affiliate tracking continue btn
@FindBy(xpath="//a[normalize-space()='Continue']")  
WebElement AffiliateTrackingcontinuebtn;
public void AffiliateTrackingcontinuebtn() {
	AffiliateTrackingcontinuebtn.click();
}
}