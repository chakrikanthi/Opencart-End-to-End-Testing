package testCases;



import org.testng.annotations.Test;

import pageObjects.AddingproductToCart;
import pageObjects.CheckoutInfo;

import testBase.Baseclass;

public class TC_007_GuestCheckoutInfotest extends Baseclass {
	

	@Test(groups={"regression","master"})
	public void Verify_CheckoutInfo() throws InterruptedException 
	{
		
		AddingproductToCart addpdct= new AddingproductToCart(driver);
		addpdct.dropdownlaptopandbooks();
		addpdct.showAllLaptopsandNotebooks();
		logger.debug("Adding product to the cart...");
		addpdct.addToCart();
		addpdct.finaladdToCart();
		addpdct.shoppingCart();
		addpdct.checkout();
		addpdct.guestCheckout();
		Thread.sleep(1000);
		addpdct.continuebtn();
				
			
		logger.info("!****TC_007_CheckoutInfoTest***!");
		logger.debug("Checkout info enetering...");
	

		CheckoutInfo chckin= new CheckoutInfo(driver);
		Thread.sleep(2000);
		chckin.BillingfirstName(randomstring().toUpperCase());
		logger.info("Entered First name...");
		chckin.BillinglastName(randomstring().toUpperCase());
		logger.info("Entered Last name...");
		chckin.Billingcompany(randomstring().toUpperCase());
		logger.info("Entered company name...");
		chckin.Billingaddress1(randomstring().toUpperCase());
		logger.info("Entered address1...");
		
		chckin.setcity(randomstring().toUpperCase());
		logger.info("Entered city name...");
		chckin.setpostCode(randomNumber());
		logger.info("Entered post code...");
		chckin.setEmail(randomstring()+"@gmail.com");
		logger.info("Entered mail id...");
		chckin.settelephone(randomNumber());
		logger.info("Entered telephone number...");
		Thread.sleep(1000);
		chckin.Billingdrpcountry("India");
	
		logger.info("Selected the country...");
		Thread.sleep(1000);
		chckin.BillingdrpregionorState("Andhra Pradesh");
		logger.info("Selected state...");
		Thread.sleep(1000);
		chckin.Billingcontinuebtn();
		Thread.sleep(1000);
		chckin.setshippingcontinuebtn();
		Thread.sleep(1000);
		chckin.setagree();
		Thread.sleep(1000);
		chckin.setpaycontinuebtn();
		Thread.sleep(2000);
		chckin.setconfirmOrder();
		Thread.sleep(2000);
		logger.info("order placed...");
		chckin.setconfirmationmsg();
		logger.info("Your order has been placed!  successfully...");
		
		
				
	}
}
