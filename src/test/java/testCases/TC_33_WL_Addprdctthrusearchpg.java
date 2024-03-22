package testCases;

import org.testng.annotations.Test;

import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import pageObjects.imac;
import testBase.Baseclass;

public class TC_33_WL_Addprdctthrusearchpg extends Baseclass{
	@Test
	public void addthrusearchpage() throws InterruptedException
	{
		MyAccountPage mp= new MyAccountPage(driver);
		mp.clickmyAccount();
		mp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("kanthi@gmail.com");
		lp.setPassword("kanthi123");
		lp.clicklogin();
		
		imac imacprct= new imac(driver);
		imacprct.searchbox("imac");
		imacprct.searchIcon();
		imacprct.addthrusearchpage();
		Thread.sleep(3000);
		imacprct.successWLmsg();
	}

}
