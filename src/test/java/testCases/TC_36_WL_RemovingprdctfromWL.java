package testCases;

import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import pageObjects.Wishlisttabindifferentlocation;
import testBase.Baseclass;

public class TC_36_WL_RemovingprdctfromWL  extends Baseclass{
	
	public void removingprdctWL()
	{
		MyAccountPage mp= new MyAccountPage(driver);
		mp.clickmyAccount();
		mp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("kanthi@gmail.com");
		lp.setPassword("kanthi123");
		lp.clicklogin();
		
		
		Wishlisttabindifferentlocation wl=new Wishlisttabindifferentlocation(driver);
		wl.rightsideWLtab();
		wl.RemoveAppleCinematab();
		
	}

}
