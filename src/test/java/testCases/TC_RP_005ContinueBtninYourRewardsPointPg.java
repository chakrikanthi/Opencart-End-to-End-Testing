package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Rewardpoints;
import testBase.Baseclass;

public class TC_RP_005ContinueBtninYourRewardsPointPg extends Baseclass {
	@Test
	public void ContinueBtninYourRewardsPointPg() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		Rewardpoints RP= new Rewardpoints(driver);
		RP.rewardPointsfromRIGHTcolm();
		RP.continuebtninRewardspg();
		String Myaccountpg= driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		if(Myaccountpg.equals("My Account"))
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
