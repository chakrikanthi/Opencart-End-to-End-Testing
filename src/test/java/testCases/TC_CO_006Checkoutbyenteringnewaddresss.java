package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.CheckoutInfo;
import pageObjects.HPLP3065;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_CO_006Checkoutbyenteringnewaddresss extends Baseclass {
	@Test
	public void Checkoutbyenteringnewaddresss() throws InterruptedException {
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
		
		//chckin.BillingDetails();
		
		chckin.newBillingAddress();
		
		chckin.BillingfirstName("kanthi");
		chckin.BillinglastName("sri");
		chckin.Billingcompany("ncr");
		chckin.Billingaddress1("5170 State bridge rd");
		chckin.setcity("Duluth");
		chckin.setpostCode("30097");
		chckin.Billingdrpcountry("United States");
		
		chckin.BillingdrpregionorState("Georgia");
		chckin.newbillingcontinuebtn();
		
		Thread.sleep(2000
				
				
				
				
				);
		//chckin.step3DeliveryDetails();
		chckin.newshippingAddress();
		chckin.deliveryfirstName("Kanthi");
		chckin.deliverylastName("Sri");
		chckin.deliverycompany("ncr");
		chckin.deliveryaddress1("5170 state bridge rd");
		chckin.deliverycity("Duluth");
		chckin.deliverypostCode("30097");
		chckin.deliverycountry("United States");
		chckin.deliveryregionorState("Georgia");
		chckin.newshippingcontinuebtn();
		
		
		//chckin.deliverymthdcommentbx("This is for testing purpose only");
		chckin.deliveryDetailcontinuebtn();
		chckin.setagree();
		chckin.setpaycontinuebtn();
		chckin.setconfirmOrder();
		String Confirmationmsg=chckin.setconfirmationmsg();
		System.out.println(Confirmationmsg);
		Assert.assertEquals(Confirmationmsg, "Your order has been placed!");
		System.out.println("Assert value is true: Test got passed");
		
		
		
}
}