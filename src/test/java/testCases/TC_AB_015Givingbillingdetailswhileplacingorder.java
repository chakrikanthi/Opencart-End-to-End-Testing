package testCases;

import org.testng.annotations.Test;



import pageObjects.CheckoutInfo;
import pageObjects.HPLP3065;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;

import testBase.Baseclass;

public class TC_AB_015Givingbillingdetailswhileplacingorder extends Baseclass {
	@Test
	public void Givingbillingdetailswhileplacingorder() throws InterruptedException {
		
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com");
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		logger.info("clicked on login button...");
		System.out.println("We are in page:"+driver.getTitle());
		HPLP3065 HPLP= new HPLP3065(driver);
		HPLP.searchbox("HP LP ");
		HPLP.searchIcon();
		HPLP.hPLP3065();
		HPLP.addtocartbtn();
		HPLP.successmsgshoppingCart();
		HPLP.checkoutbtninSHPage();
		CheckoutInfo CI= new CheckoutInfo(driver);
		CI.newBillingAddress();
		
		CheckoutInfo CI1= new CheckoutInfo(driver);
		//CI1.newshippingAddress();
		CI1.BillingfirstName("KANTHI");
		CI1.BillinglastName("SRI");
		CI1.Billingaddress1("6005 STATE BRIDGE RD");
		CI1.Billingcity("DULUTH");
		CI1.BillingpostCode("30098");
		CI1.Billingdrpcountry("United States");
		CI1.BillingdrpregionorState("Georgia");
		CI1.Billingcontinuebtn();
		
		CI1.deliveryDetailcontinuebtn();
		CI1.deliveryMETHODcontinuebtn();
		Thread.sleep(1500);
		CI1.setagree();
		CI1.setpaycontinuebtn();
		CI1.setconfirmOrder();
		CI1.setconfirmationmsg();
		System.out.println("Order has been placed successfully");
		System.out.println(driver.getTitle());
		
		MyAccountPage MyAcnt= new MyAccountPage(driver);
		
		MyAcnt.clickmyAccount();
		MyAcnt.myAccountafterloggedin();
		MyAcnt.addressBookfromRIGHTcolumn();
		System.out.println(driver.getTitle());
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
