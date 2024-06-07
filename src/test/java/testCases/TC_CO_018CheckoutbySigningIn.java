package testCases;

import org.testng.annotations.Test;



import pageObjects.CheckoutInfo;
import pageObjects.HPLP3065;
import pageObjects.Loginpage;
import pageObjects.Logout;
import testBase.Baseclass;

public class TC_CO_018CheckoutbySigningIn extends Baseclass{
	@Test

	public void CheckoutbySigningIn() throws InterruptedException
	{
		HPLP3065 HP=new HPLP3065(driver);
		HP.searchbox("hp lp 3065");
		HP.searchIcon();
		HP.hPLP3065();
		HP.addtocartbtn();
		HP.successmsgshoppingCart();
		HP.checkoutbtninSHPage();

		Loginpage lp=new Loginpage(driver);
		logger.info("Entering valid email id..");
		lp.setEmail(p.getProperty("email")); //here we are getting email info from config.properties file thru this p object
		logger.info("Entering valid password...");
		lp.setPassword(p.getProperty("password")); // same as above line
		lp.clicklogin();  //Login link button in login page...this is from login page
		logger.info("clicked on login button...");	
		//driver.switchTo().alert().accept();
		//Thread.sleep(2000);
		CheckoutInfo chckin= new CheckoutInfo(driver);
		chckin.setreturncustpaycontinue();
		chckin.setreturncustpaycontinue();

		chckin.setreturncustshipmethodcontinue();
		Thread.sleep(1000);
		chckin.setagree();
		chckin.setpaycontinuebtn();

		Thread.sleep(2000);
		chckin.setconfirmOrder();

		
		Thread.sleep(1500);
		Logout lg= new Logout(driver);
		lg.setmyAccount();
		lg.testorderHistory();
		Thread.sleep(1500);
		lg.setmyAccount();
		lg.setlogout();
		 
	}

}
