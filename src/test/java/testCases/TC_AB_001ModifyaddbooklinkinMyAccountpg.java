package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_AB_001ModifyaddbooklinkinMyAccountpg extends Baseclass{
	@Test
	public void ModifyaddbooklinkinMyAccountpg() {
		
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		Loginpage lp= new Loginpage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password")); 
		lp.clicklogin();  
		logger.info("clicked on login button...");
		
		MyAccountPage macc=new MyAccountPage(driver);
		macc.clickmyAccount();
		macc.modifyYourAddressBookfromLeftcolumn();
		String pagetitle=driver.getTitle()	;
	     if (pagetitle.equals("Address Book")) {
	    	 
	    	 System.out.println("We clicked on Modify your address book entries from LEFT column");
	    	 System.out.println("We are in page "+ pagetitle);
	     }
		
	}

}

//output:We clicked on Modify your address book entries from LEFT column
//We are in page Address Book