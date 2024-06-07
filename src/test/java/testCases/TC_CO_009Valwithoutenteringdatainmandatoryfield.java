package testCases;

import org.testng.annotations.Test;

import pageObjects.CheckoutInfo;
import pageObjects.HPLP3065;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_CO_009Valwithoutenteringdatainmandatoryfield extends Baseclass{
	@Test
	public void Valwithoutenteringdatainmandatoryfield() throws InterruptedException {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		logger.info("clicked on MyAccount in Homepage..");
		hp.clicklogin(); //Login link under MyAccount...this is from home page
		logger.info("Clicked on Login Button under MyAccount..");
		
		Loginpage lp=new Loginpage(driver);
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
		
		chckin.newBillingAddress();
		
		chckin.newbillingcontinuebtn();
		
		Thread.sleep(2000);
		String FErrorMSG=chckin.ErrorwarningfirstNamemsg();
		if (FErrorMSG.equals("First Name must be between 1 and 32 characters!")) {
			System.out.println("You didn't enter your FIRSTNAME please enter it:");
		}
		String 	LErrorMSG=chckin.warninglastNamemsg();
		if (LErrorMSG.equals("Last Name must be between 1 and 32 characters!")) {
			System.out.println("You didn't enter your LASTNAME please enter it:");
		}
		String 	ADDErrorMSG=chckin.addresswarningmsg();
		if (ADDErrorMSG.equals("Address 1 must be between 3 and 128 characters!")) {
			System.out.println("You didn't enter your ADDRESS please enter it:");
		}
		System.out.println("Please enter all the mandatory fields to continue");
	}

}
