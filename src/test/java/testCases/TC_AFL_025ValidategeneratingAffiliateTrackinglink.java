package testCases;

import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_AFL_025ValidategeneratingAffiliateTrackinglink extends Baseclass {
	@Test
	public void ValidategeneratingAffiliateTrackinglink() throws InterruptedException {
	Homepage hp= new Homepage(driver);
	hp.clickMyAccount();
	hp.clicklogin();
	Loginpage lp= new Loginpage(driver);
	lp.setEmail("satvik@gmail.com");
	lp.setPassword("kanthi123"); 
	lp.clicklogin();  
	AffiliatedAccounts AA=new AffiliatedAccounts(driver);
	AA.customAffiliateTrackingCodelink();
	System.out.println("Header text in Affiliated Tracking page:"+AA.AffiliatedTrackingheadertext());
	System.out.println("Your Tracking code text:"+AA.yourTrackingCodeintextbox());
	System.out.println("we are in page:"+driver.getTitle());
	System.out.println("Current URL is:"+driver.getCurrentUrl());
	AA.trackingLinkGenerator();
	Thread.sleep(2000);
	AA.iMacintrackinglinkgenertor();
	Thread.sleep(2000);
	System.out.println("Tracking Link:"+AA.trackingLink());
    AA.AffiliateTrackingcontinuebtn();	
	System.out.println("we are in page:"+driver.getTitle());
}
}