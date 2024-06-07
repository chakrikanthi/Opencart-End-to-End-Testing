package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Downloads;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_DL_003DownloadsFromRightsidecoulmnOpt extends Baseclass{
	@Test
	public void DownloadsFromRightsidecoulmnOpt() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		Downloads DL= new Downloads(driver);
		DL.downloadsfromRIGHTside();
		System.out.println(driver.getTitle());
		String PageTitle=driver.getTitle();
		System.out.println("You are in page:"+PageTitle);
		if(PageTitle.equals("Account Downloads"))
		{
			logger.info("test passed..");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test failed...");
			Assert.fail();
		}
	}

}