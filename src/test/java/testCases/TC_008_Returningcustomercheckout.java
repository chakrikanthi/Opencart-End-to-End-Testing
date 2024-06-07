package testCases;

import org.testng.annotations.Test;


import pageObjects.AddingproductToCart;
import pageObjects.CheckoutInfo;

import pageObjects.Loginpage;
import pageObjects.Logout;

import testBase.Baseclass;


public class TC_008_Returningcustomercheckout extends Baseclass 
{
	@Test(groups={"regression","master"})
public void Returningcustomercheckout() throws InterruptedException
{

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
    chckin.deliveryDetailcontinuebtn();
    chckin.deliveryMETHODcontinuebtn();
    
    chckin.setreturncustshipmethodcontinue();
    Thread.sleep(1000);
    chckin.setagree();
    chckin.setpaycontinuebtn();
    
    Thread.sleep(2000);
    chckin.setconfirmOrder();
    
    /*MyAccountPage myA= new MyAccountPage(driver);
    myA.clickmyAccount();
    myA.clicklogout();*/
    Thread.sleep(1500);
    Logout lg= new Logout(driver);
    lg.setmyAccount();
    lg.testorderHistory();
    Thread.sleep(1500);
    lg.setmyAccount();
    lg.setlogout();
    		
	
}
		

}
