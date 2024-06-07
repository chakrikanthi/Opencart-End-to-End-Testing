package testCases;

import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_AFL_019VerifyingAffiliatefooterlinkwhenuserisalreadyloggedin extends Baseclass {
	@Test
	public void VerifyingAffiliatefooterlinkwhenuserisalreadyloggedin() throws InterruptedException {
		
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com");
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		AffiliatedAccounts AA=new AffiliatedAccounts(driver);
		System.out.println("First page:"+driver.getTitle());
		AA.affiliatefootertab();
		System.out.println("Successfully clicked on Affiliate footer link");
		System.out.println("You are in page:"+driver.getTitle());
		
}}
