package testCases;

import org.testng.annotations.Test;

import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import pageObjects.Wishlisttabindifferentlocation;
import testBase.Baseclass;

public class TC_35_WL_AccessWLfromFooter extends Baseclass{
	@Test
	public void accessWLfromfooter() throws InterruptedException
	{
	MyAccountPage mp= new MyAccountPage(driver);
	mp.clickmyAccount();
	mp.clicklogin();
	
	Loginpage lp= new Loginpage(driver);
	lp.setEmail("kanthi@gmail.com");
	lp.setPassword("kanthi123");
	lp.clicklogin();
	
	
	Wishlisttabindifferentlocation wl=new Wishlisttabindifferentlocation(driver);
	Thread.sleep(6000);
	wl.footerWLtab();
	
	
	
	}
}
