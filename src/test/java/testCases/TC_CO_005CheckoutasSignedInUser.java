package testCases;

import org.testng.annotations.Test;


import pageObjects.AddingproductToCart;
import pageObjects.CheckoutInfo;

import pageObjects.Loginpage;
import pageObjects.Logout;
import testBase.Baseclass;

public class TC_CO_005CheckoutasSignedInUser extends Baseclass {
	@Test
	public void CheckoutasSignedInUser() throws InterruptedException {
		
		
		AddingproductToCart addpdct= new AddingproductToCart(driver);
		addpdct.dropdownlaptopandbooks();
		addpdct.showAllLaptopsandNotebooks();
		logger.debug("Adding product to the cart...");
		addpdct.addToCart();
		addpdct.finaladdToCart();
		addpdct.shoppingCart();
		addpdct.checkout();
		
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
	    logger.info(" I want to use an existing address radio option..got selectd");
	    chckin.setreturncustshipmethodcontinue();
	    logger.info(" I want to use an existing address radio option..got selectd");
	    Thread.sleep(1000);
	    chckin.setagree();
	    
	    logger.info("Selected Terms n Policies..");	
	    chckin.setpaycontinuebtn();
	    logger.info("payment method continued..");	
	    Thread.sleep(2000);
	    chckin.setconfirmOrder();
	    logger.info("order got placed..");	
	    
	    logger.info(" Your order has been placed! successfully...");
	    Thread.sleep(1500);
	    Logout lg= new Logout(driver);
	    lg.setmyAccount();
	    lg.testorderHistory();
	    Thread.sleep(1500);
	    lg.setmyAccount();
	    lg.setlogout();
	    logger.info("Successfully logged out of the account...");	
	}

}
