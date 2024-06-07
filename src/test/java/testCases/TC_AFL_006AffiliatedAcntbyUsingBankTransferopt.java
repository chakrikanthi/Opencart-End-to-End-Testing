package testCases;
import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_AFL_006AffiliatedAcntbyUsingBankTransferopt  extends Baseclass {
	@Test
	public void AffiliatedAcntbyUsingBankTransferopt() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("vivek1@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin(); 
		
		AffiliatedAccounts AA=new AffiliatedAccounts(driver);
		AA.registerForAnAffiliateAcco();
		System.out.println("Page we are in is:"+driver.getTitle());
		AA.company("Emory");
		AA.webSite("www.google.com");
		AA.taxID("1234567");
		AA.banktransfer();
		AA.bankName("SBI");
		AA.aBABSBNumberBranchNumber("12345");
		AA.sWIFTCode("8976");
		AA.accountName("VIVEK");
		AA.accountNumber("1234567890");
		AA.agree();
		AA.continuebtninyourAfflinfoPg();
		System.out.println(driver.getTitle());
		boolean Editinfolinkstatus=AA.editYourAffiliateInformationpresent();
		boolean Customcodestatus=AA.customAffiliateTrackingCodepresent();
		if(Editinfolinkstatus==true) {
			if ( (Customcodestatus==true)) {
			System.out.println("Success: Your account has been successfully updated.");
		}
	}
	}
}

/* output:Page we are in is:Your Affiliate Information
My Account
Success: Your account has been successfully updated.
*/
//if you want run this test case again try with newly registered account details
