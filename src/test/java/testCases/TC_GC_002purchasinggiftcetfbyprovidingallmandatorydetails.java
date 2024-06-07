package testCases;

import org.testng.annotations.Test;

import pageObjects.Giftcertificates;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_GC_002purchasinggiftcetfbyprovidingallmandatorydetails extends Baseclass{
	@Test
	public void submittingenquiryafterloggedin()  {
		Giftcertificates GC= new Giftcertificates(driver);
		GC.giftCertificatesfootertab();
		GC.setrecipientsName("Kanthi");
		GC.recipientsEmail("Kanthi1@gmail.com");
		GC.yourName("Satvik");
		GC.yourEmail("satvik@gmail.com");
		GC.Genrealbtn();
		GC.message("Hi..this is a small gift for you from my side");
		GC.amount("25");
		GC.agree();
		GC.purchasegiftcerfcontinuebtn();
		
		
		System.out.println(driver.getTitle());
		System.out.println(GC.thankYouForPurchasingAGif());
		GC.continuebtnaftersuccmsg();
		GC.checkoutbtninShoppingcrtpg();
		Loginpage lp= new Loginpage(driver);
		logger.info("Entering valid email id..");
		lp.setEmail(p.getProperty("email")); //here we are getting email info from config.properties file thru this p object
		logger.info("Entering valid password...");
		lp.setPassword(p.getProperty("password")); // same as above line
		lp.clicklogin();  //Login link button in login page...this is from login page
	    logger.info("clicked on login button...");	
	    
	    
	    Giftcertificates GC1= new Giftcertificates(driver);
	    GC1.BillingDetailscontinuebtn();
	    GC1.termsnConditionsinpayemtnmthd();
	    GC1.continuebtninPaymentmthd();
	    
	    
	    
}
}