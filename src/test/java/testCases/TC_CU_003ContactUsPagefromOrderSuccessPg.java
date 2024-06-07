package testCases;

import org.testng.annotations.Test;

import pageObjects.CheckoutInfo;
import pageObjects.ContactUs;
import pageObjects.HPLP3065;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_CU_003ContactUsPagefromOrderSuccessPg  extends Baseclass {
	@Test
	public void ContactUsPagefromOrderSuccessPg() throws InterruptedException {
		HPLP3065 HP= new HPLP3065(driver);
		HP.searchbox("HP LP");
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
	    CheckoutInfo chckin= new CheckoutInfo(driver);
	    chckin.setreturncustpaycontinue();
	    chckin.deliveryDetailcontinuebtn();
	    chckin.deliveryMETHODcontinuebtn();
	    
	    chckin.setreturncustshipmethodcontinue();
	    Thread.sleep(1000);
	    chckin.setagree();
	    chckin.setpaycontinuebtn();
	    
	    Thread.sleep(2000);
	    chckin.setconfirmOrder();
	    
	    ContactUs contUs=new ContactUs(driver);
	    contUs.storeOwner();
	    String Contactuspage=driver.getTitle();
		if (Contactuspage.equals("Contact Us")) {
			System.out.println("Test got passed..You are in Contact Us Page");
		}
	    System.out.println("Successfully order got placed and now we are in Contact Us page");
	

}
	
}

/*output:09:59:30.938 [main] INFO  testCases.TC_CU_003ContactUsPagefromOrderSuccessPg - Entering valid email id..
09:59:31.504 [main] INFO  testCases.TC_CU_003ContactUsPagefromOrderSuccessPg - Entering valid password...
09:59:31.667 [main] INFO  testCases.TC_CU_003ContactUsPagefromOrderSuccessPg - clicked on login button...
Test got passed..You are in Contact Us Page
Successfully order got placed and now we are in Contact Us page*/