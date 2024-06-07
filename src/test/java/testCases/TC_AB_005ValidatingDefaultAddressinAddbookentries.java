package testCases;

import org.testng.annotations.Test;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_AB_005ValidatingDefaultAddressinAddbookentries extends Baseclass{
	@Test
	public void ValidatingDefaultAddressinAddbookentries() throws InterruptedException {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com");
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		logger.info("clicked on login button...");
		System.out.println("We are in page:"+driver.getTitle());
		MyAccountPage MA= new MyAccountPage(driver);
		MA.addressBookfromRIGHTcolumn();
		System.out.println("We are in page:"+driver.getTitle());
		String defaultaddress=MA.satvikaddress();
		System.out.println("Default address of the customer is:\n"+defaultaddress);
	
		
		
	}

}
