package testCases;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.NewletterSubscription;
import testBase.Baseclass;

public class TC_NLT_007UpdateSubscrpoptinNewsletterRIGHTopt extends Baseclass {
	@Test
	public void UpdateSubscrpoptinNewsletterRIGHTopt() throws InterruptedException {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com");
		lp.setPassword("kanthi123"); 
		lp.clicklogin();

		NewletterSubscription NS= new NewletterSubscription(driver); 
        NS.newsletterfromRIGHTcolumn();
        Thread.sleep(2000);
        if(NS.YESsubscriptionOPTselected()==true) {
        	System.out.println("intially YES option got selected");
        	NS.NOsubscriptionbtn();
        	System.out.println("Now it changed the selection from YES to NO");
        	 Thread.sleep(2000);
        }
        else {
        	System.out.println("intially NO option got selected");
        	NS.YESsubscriptionBtn();
        	System.out.println("Now it changed the selection from NO to YES");
        	 Thread.sleep(2000);
        }
        NS.NewsltrSubscriptioncontinuebtn();
        System.out.println(NS.successYourNewsletterSubsc());
}
}