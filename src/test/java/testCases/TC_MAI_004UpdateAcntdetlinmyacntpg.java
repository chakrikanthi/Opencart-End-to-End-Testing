package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Logout;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_MAI_004UpdateAcntdetlinmyacntpg extends Baseclass {
	@Test
	public void UpdateAcntdetlinmyacntpg() throws InterruptedException {
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
		
		macc.editYourAccountInfofromLEFTcolumn();
		macc.editfirstName("kanthisri");
		macc.editlastName("venkata");
		macc.editeMail("kanthi1@gmail.com");
		macc.edittelephone("404-404-0000");
		macc.continueinaccnteditpage();
		
		Logout LO=new Logout(driver);
		LO.setmyAccount();
		LO.setlogout();
		System.out.println("Logged out of the account");
		macc.clickmyAccount();
	    macc.clicklogin();
	    Thread.sleep(2500);
	    Loginpage lp1= new Loginpage(driver);
	    lp1.setEmail("kanthi1@gmail.com");
	    lp1.setPassword("kanthi123");
	    lp1.clicklogin(); 
	}

}
