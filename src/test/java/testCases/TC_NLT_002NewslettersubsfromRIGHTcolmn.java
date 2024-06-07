package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.NewletterSubscription;
import testBase.Baseclass;

public class TC_NLT_002NewslettersubsfromRIGHTcolmn extends Baseclass {
	@Test
	public void NewslettersubsfromRIGHTcolmn() throws InterruptedException {
	Homepage hp= new Homepage(driver);
	hp.clickMyAccount();
	hp.clicklogin();
	
	Loginpage lp= new Loginpage(driver);
	lp.setEmail("satvik@gmail.com");
	lp.setPassword("kanthi123"); 
	lp.clicklogin();  
	
	NewletterSubscription NS= new NewletterSubscription(driver); 
	JavascriptExecutor jsexe= (JavascriptExecutor)driver;
	jsexe.executeScript("document.getElementsByTagName('a')[80].style.border='5px red solid';");
	NS.newsletterfromRIGHTcolumn();
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