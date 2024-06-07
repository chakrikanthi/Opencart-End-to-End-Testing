package testCases;

import org.testng.annotations.Test;

import pageObjects.AffiliatedAccounts;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_AFL_024ValdeditingearlierregisAffiliateinfo extends Baseclass {
	@Test
	public void PageURLnPagetitle() throws InterruptedException {
	Homepage hp= new Homepage(driver);
	hp.clickMyAccount();
	hp.clicklogin();
	Loginpage lp= new Loginpage(driver);
	lp.setEmail("satvik@gmail.com");
	lp.setPassword("kanthi123"); 
	lp.clicklogin();  
	AffiliatedAccounts AA=new AffiliatedAccounts(driver);
	AA.editYourAffiliateInformationlink();
	AA.company("University");
	AA.continuebtninyourAfflinfoPg();
	boolean successmsg=AA.successYourAccountHasBeeneditedpresent();
	if(successmsg==true) {
	System.out.println(AA.successYourAccountHasBeenedited());
	}
	else {
		System.out.println("Account info is not updated properly");
	}
	System.out.println("Currently your are in page:"+driver.getTitle());
}
}