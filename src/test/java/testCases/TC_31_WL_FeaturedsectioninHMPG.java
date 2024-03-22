package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_31_WL_FeaturedsectioninHMPG extends Baseclass {
	@Test
	public void addprdctWLinfeaturepg() throws InterruptedException
	{
		MyAccountPage mp= new MyAccountPage(driver);
		mp.clickmyAccount();
		mp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("kanthi@gmail.com");
		lp.setPassword("kanthi123");
		lp.clicklogin();
		
		Homepage hp= new Homepage(driver);
		hp.logoHMPG();
		Thread.sleep(3000);
		hp.addToWLinFeaturepg();
		Thread.sleep(3000);
		hp.WLsucessmsg();
		Thread.sleep(3000);
	}

}
