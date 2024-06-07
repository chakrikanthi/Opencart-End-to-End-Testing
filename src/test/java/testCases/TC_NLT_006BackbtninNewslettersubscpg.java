package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.NewletterSubscription;
import testBase.Baseclass;

public class TC_NLT_006BackbtninNewslettersubscpg extends Baseclass{
	@Test
	public void BackbtninNewslettersubscpg() throws InterruptedException {
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
        driver.navigate().back();
        String currentpage= driver.getTitle();

		if(currentpage.equals("My Account"))
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