package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Rewardpoints;
import testBase.Baseclass;

public class TC_RP_001RewardsPGfromMyAccountPg extends Baseclass{
	@Test
	public void RewardsPGfromMyAccountPg() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		Rewardpoints RP= new Rewardpoints(driver);
		RP.RewardPointsfromLEFTcolm();
		String rewardspage=driver.getTitle();
		if(rewardspage.equals("Your Reward Points")) {
			
		 System.out.println( RP.totalrewardsmsg());
		 System.out.println(RP.Rewardstableheader());
		 System.out.println(RP.rewardsmessageinTABLE());
		
		}
		
		
	}

}
