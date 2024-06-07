package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Rewardpoints;
import testBase.Baseclass;

public class TC_RP_002RewardpointsfromRightclmopt extends Baseclass {
	@Test
	public void RewardpointsfromRightclmopt() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByTagName('a')[62].style.border='5px green solid';");
		
		Rewardpoints RP= new Rewardpoints(driver);
		RP.rewardPointsfromRIGHTcolm();
		String rewardspage=driver.getTitle();
		if(rewardspage.equals("Your Reward Points")) {
			
		 System.out.println( RP.totalrewardsmsg());
		 System.out.println(RP.Rewardstableheader());
		 System.out.println(RP.rewardsmessageinTABLE());
		
		}
		
		
	}

}
