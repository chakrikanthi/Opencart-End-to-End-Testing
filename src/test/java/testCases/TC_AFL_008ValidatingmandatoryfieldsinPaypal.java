package testCases;

import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_AFL_008ValidatingmandatoryfieldsinPaypal extends Baseclass {
	@Test
	public void ValidatingmandatoryfieldsinPaypal() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik1@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin(); 
		
		AffiliatedAccounts AA=new AffiliatedAccounts(driver);
		AA.registerForAnAffiliateAcco();
		AA.paypalpayment();
		System.out.println("Page we are in is:"+driver.getTitle());
		AA.continuebtninyourAfflinfoPg();
		boolean errormsg=AA.payPalEmailAddressDoesNot();
		if(errormsg==true) {
			System.out.println("You didn't enter the valid credentials to the account ..the following error message is displayed in the page:");
		}
		System.err.println(AA.errormsgTextpayPalEmailAddressDoesNot());
		
	}

}
