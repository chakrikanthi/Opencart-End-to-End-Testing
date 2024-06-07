package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;
import utilities.DataProviders;

public class TC_AFL_005ValidatingAffiliatedAcntwithInvaliddata extends Baseclass {
	
	@Test(dataProvider="Affiliatedtestdata",dataProviderClass=DataProviders.class)
	public void ValidatingAffiliatedAcntwithInvaliddata(String email) {
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
		AA.paypalpayment();
		AA.payPalEmailAccount(email);
		AA.agree();
		AA.continuebtninyourAfflinfoPg();
		boolean status=AA.ErrormsgchequePayeedisplayed();
		if(status==true) {
			
			AA.payPalEmailAccount(email);
			AA.agree();
			AA.continuebtninyourAfflinfoPg();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		}

}
