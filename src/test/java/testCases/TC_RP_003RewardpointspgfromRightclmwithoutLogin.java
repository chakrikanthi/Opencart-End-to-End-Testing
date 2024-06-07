package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Rewardpoints;
import testBase.Baseclass;

public class TC_RP_003RewardpointspgfromRightclmwithoutLogin extends Baseclass{
	@Test
	public void RewardpointspgfromRightclmwithoutLogin() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		Rewardpoints RP= new Rewardpoints(driver);
		RP.rewardPointsfromRIGHTcolm();

		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();
		System.out.println(driver.getTitle());
}
}