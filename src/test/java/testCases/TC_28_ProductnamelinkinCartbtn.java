package testCases;

import org.testng.annotations.Test;

import pageObjects.HPLP3065;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_28_ProductnamelinkinCartbtn extends Baseclass{
	@Test
	public void verify_productnamelinkincart() throws InterruptedException
	{
		
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.setEmail("kanthi@gmail.com");
		lp.setPassword("kanthi123");
		lp.clicklogin();
		
		HPLP3065 HP= new HPLP3065(driver);
		HP.searchbox("HP LP 3065");
		HP.searchIcon();
		HP.hPLP3065();
		HP.addtocartbtn();
		Thread.sleep(3500);
		HP.addtocarttogglebox();
		Thread.sleep(3500);
		HP.hPLPprdctnameintogglebox();
		Thread.sleep(3500);
	}

}
