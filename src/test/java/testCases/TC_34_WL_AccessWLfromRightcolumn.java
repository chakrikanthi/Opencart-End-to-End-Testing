package testCases;

import org.testng.annotations.Test;

import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import pageObjects.Wishlisttabindifferentlocation;
import testBase.Baseclass;

public class TC_34_WL_AccessWLfromRightcolumn extends Baseclass{
	@Test
	public void AccessWLtabfromrightsidetab() throws InterruptedException
	{
		MyAccountPage mp= new MyAccountPage(driver);
		mp.clickmyAccount();
		mp.clicklogin();
		Thread.sleep(4000);
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("kanthi@gmail.com");
		lp.setPassword("kanthi123");
		lp.clicklogin();
		Thread.sleep(4000);
		
		Wishlisttabindifferentlocation WLopt= new Wishlisttabindifferentlocation(driver);
		Thread.sleep(4000);
		WLopt.rightsideWLtab();
		Thread.sleep(9000);
		
	}

}
