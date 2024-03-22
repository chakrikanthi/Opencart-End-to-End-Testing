package testCases;

import org.testng.annotations.Test;

import pageObjects.AddingproductToCart;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_006_AddingproductToCart extends Baseclass{

	@Test(groups={"regression","master"})
	public void Verify_addingproduct_tocart () throws InterruptedException
	{
	logger.info("!****TC_006_AddingproductToCart***!");
	logger.debug("Adding product log started...");
	
	Homepage hp= new Homepage(driver);  //Create Object for Homepage
	Thread.sleep(2300);
	/*hp.clickMyAccount();
	logger.info("clicked on MyAccount in Homepage..");
	hp.clicklogin(); //Login link under MyAccount...this is from home page
	logger.info("Clicked on Login Button under MyAccount..");
	Loginpage lp= new Loginpage(driver);
	logger.info("Entering valid email id..");
	lp.setEmail(p.getProperty("email")); //here we are getting email info from config.properties file thru this p object
	logger.info("Entering valid password...");
	Thread.sleep(2500);
	lp.setPassword(p.getProperty("password")); // same as above line
	lp.clicklogin();  //Login link button in login page...this is from login page
    logger.info("clicked on login button...");	
    //driver.switchTo().alert().accept();
    Thread.sleep(2500);
    */
    AddingproductToCart addprdt= new AddingproductToCart(driver);
    addprdt.dropdownlaptopandbooks();
    Thread.sleep(2000);
    logger.info("clicked on showAllLaptopsandNotebooks button...");	
    addprdt.showAllLaptopsandNotebooks();
    logger.info("clicked on HP LP3065 button...");	
    addprdt.addToCart();
    logger.info("Added HP LP3065 to cart...");	
    addprdt.finaladdToCart();
    logger.info("Clicked on Shoppingcart...");
    addprdt.shoppingCart();
    logger.info("Clicked on Shoppingcart...");
    Thread.sleep(2500);
    addprdt.checkout();
    
    
    
    
    
	}
	
}
