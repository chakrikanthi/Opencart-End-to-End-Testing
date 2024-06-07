package testCases;

import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_AFL_021PageURLnPagetitle  extends Baseclass {
	@Test
	public void PageURLnPagetitle() throws InterruptedException {
	Homepage hp= new Homepage(driver);
	hp.clickMyAccount();
	hp.clicklogin();
	Loginpage lp= new Loginpage(driver);
	lp.setEmail("baba@gmail.com");
	lp.setPassword("kanthi123"); 
	lp.clicklogin();  
	AffiliatedAccounts AA=new AffiliatedAccounts(driver);
	AA.registerForAnAffiliateAcco();
	System.out.println("Current page Title is:"+driver.getTitle());
	System.out.println("Current page URL is:"+driver.getCurrentUrl());
}
}