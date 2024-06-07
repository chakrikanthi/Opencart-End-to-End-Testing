package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.NewletterSubscription;
import testBase.Baseclass;

public class TC_NLT_004NewsletterFooterOpt  extends Baseclass{
	@Test
	public void NewsletterFooterOpt() throws InterruptedException {
	
		
		NewletterSubscription NS= new NewletterSubscription(driver); 
		NS.newsletterfooteropt();
       
       Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com");
		lp.setPassword("kanthi123"); 
		lp.clicklogin();
		
		String currentpage= driver.getTitle();
		
		if(currentpage.equals("Newsletter Subscription"))
		{
			logger.info("test passed..");
			System.out.println("We are in page:"+currentpage);
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test failed...");
			Assert.fail();
		}
}
}