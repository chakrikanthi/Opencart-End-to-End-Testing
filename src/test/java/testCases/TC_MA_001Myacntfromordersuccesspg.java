package testCases;

import org.testng.annotations.Test;

import pageObjects.CheckoutInfo;
import pageObjects.HPLP3065;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_MA_001Myacntfromordersuccesspg extends Baseclass{
	@Test
	
	public void Myacntfromordersuccesspg() throws InterruptedException {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		logger.info("clicked on MyAccount in Homepage..");
		hp.clicklogin(); //Login link under MyAccount...this is from home page
		logger.info("Clicked on Login Button under MyAccount..");
		
		
		//Created an object for Loginpage and performing actions
		//Here we have to capture login info from config.properties file, As we created properties file in base class, we can refer object p
		Loginpage lp= new Loginpage(driver);
		logger.info("Entering valid email id..");
		lp.setEmail(p.getProperty("email")); //here we are getting email info from config.properties file thru this p object
		logger.info("Entering valid password...");
		lp.setPassword(p.getProperty("password")); // same as above line
		lp.clicklogin();  //Login link button in login page...this is from login page
	    logger.info("clicked on login button...");	
	    
	    HPLP3065 HP=new HPLP3065(driver);
		HP.searchbox("hp lp 3065");
		HP.searchIcon();
		HP.hPLP3065();
		HP.addtocartbtn();
		HP.successmsgshoppingCart();
		HP.checkoutbtninSHPage();
		
		CheckoutInfo chckin= new CheckoutInfo(driver);
		chckin.setreturncustpaycontinue();
		chckin.setreturncustpaycontinue();

		chckin.setreturncustshipmethodcontinue();
		Thread.sleep(1000);
		chckin.setagree();
		chckin.setpaycontinuebtn();

		Thread.sleep(2000);
		chckin.setconfirmOrder();
		chckin.myAccountinordersuccesspg();
		System.out.println("We are in "+driver.getTitle()+" Page");
	}

}
