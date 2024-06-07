package testCases;

import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_AFL_004AffiliatedAcntusongPaypal extends Baseclass {
	@Test
	public void AffiliatedAcntusongPaypal() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("kanthi1@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin(); 
		
		
		
		AffiliatedAccounts AA=new AffiliatedAccounts(driver);
		AA.registerForAnAffiliateAcco();
		System.out.println("Page we are in is:"+driver.getTitle());
		AA.company("Emory");
		AA.webSite("www.google.com");
		AA.taxID("1234567");
		AA.paypalpayment();
		AA.payPalEmailAccount("kanthi1@gmail.com");
		AA.agree();
		AA.continuebtninyourAfflinfoPg();
		
		boolean informationpresentstatus=AA.editYourAffiliateInformationpresent();
		boolean trackingstatuslink=AA.customAffiliateTrackingCodepresent();
		System.out.println("edit Your Affiliate Information present status is:"+informationpresentstatus);
		System.out.println("custom Affiliate Tracking Code present status is:"+trackingstatuslink);
		System.out.println("Page we are in is:"+driver.getTitle());
}}
/* output:Page we are in is:Your Affiliate Information
edit Your Affiliate Information present status is:true
custom Affiliate Tracking Code present status is:true
Page we are in is:My Account

//if you want to run this test case again please change the email address and password*/