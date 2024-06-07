package testCases;

import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_AFL_002RegisterofanaffiliatedAcntbyprovidingalldetails extends Baseclass{
	@Test
	public void RegisterofanaffiliatedAcntbyprovidingalldetails() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin(); 
		
		
		
		AffiliatedAccounts AA=new AffiliatedAccounts(driver);
		AA.registerForAnAffiliateAcco();
		AA.company("Emory");
		AA.webSite("www.google.com");
		AA.taxID("1234567");
		//AA.banktransfer();
		AA.chequePayeeName("satvik");
		AA.agree();
		AA.continuebtninyourAfflinfoPg();
	}
}
//if you want to run this test case again please try with newly registered  email address and password*/