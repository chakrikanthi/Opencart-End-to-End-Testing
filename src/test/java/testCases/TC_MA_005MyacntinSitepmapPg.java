package testCases;


import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_MA_005MyacntinSitepmapPg extends Baseclass{
	@Test
	
	public void MyacntinSitepmapPg() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		logger.info("clicked on MyAccount in Homepage..");
		hp.clicklogin(); //Login link under MyAccount...this is from home page
		logger.info("Clicked on Login Button under MyAccount..");
		
		Loginpage lp= new Loginpage(driver);
		logger.info("Entering valid email id..");
		lp.setEmail(p.getProperty("email")); //here we are getting email info from config.properties file thru this p object
		logger.info("Entering valid password...");
		lp.setPassword(p.getProperty("password")); // same as above line
		lp.clicklogin();  //Login link button in login page...this is from login page
	    logger.info("clicked on login button...");	
	    
	    MyAccountPage macc=new MyAccountPage(driver);
	    macc.siteMap();
	    System.out.println("Right now we are in:"+driver.getTitle()+" page");
	    macc.myAccountinsitemaplink();
	    System.out.println("Finally we are in :"+driver.getTitle()+" page");
	}

}
