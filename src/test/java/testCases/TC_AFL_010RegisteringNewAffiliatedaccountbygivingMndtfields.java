package testCases;

import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import pageObjects.Homepage;
import testBase.Baseclass;

public class TC_AFL_010RegisteringNewAffiliatedaccountbygivingMndtfields extends Baseclass {
	@Test
	public void RegisteringNewAffiliatedaccountbygivingMndtfields() {
		Homepage hp= new Homepage(driver);
		
		AffiliatedAccounts AA=new AffiliatedAccounts(driver);
		System.out.println("First page:"+driver.getTitle());
		AA.affiliatefootertab();
		System.out.println("Second page:"+driver.getTitle());
		AA.NewAffiliatecontinuebtn();
		AA.firstName("RANI");
		AA.lastName("SAI");
		AA.eMail("kanthi11@gmail.com");
		AA.telephone("404-404-4000");
		AA.company("ghgjhjh");
		AA.webSite("www.google.com");
		AA.taxID("1234567");
		AA.chequePayeeName("RANI");
		AA.password("kanthi123");
		AA.passwordConfirm("kanthi123");
		AA.agree();
		AA.continuebtninyourAfflinfoPg();
		System.out.println("Third page:"+driver.getTitle());
		AA.myAccountfromRIGHTsidecolumn();
		
		boolean Editinfolinkstatus=AA.editYourAffiliateInformationpresent();
		boolean Customcodestatus=AA.customAffiliateTrackingCodepresent();
		if(Editinfolinkstatus==true) {
			if ( (Customcodestatus==true)) {
			System.out.println("Success: Your account has been successfully updated.");
			System.out.println("'Edit your affiliate information' and 'Custom Affiliate Tracking code' links are available");
		}
	}
			
}
}

/*output:
First page:Your Store
Second page:Affiliate Program
Third page:Your Affiliate Account Has Been Created!
Success: Your account has been successfully updated.
'Edit your affiliate information' and 'Custom Affiliate Tracking code' links are available
//if u want to run this test again try to run with another new mail id*/