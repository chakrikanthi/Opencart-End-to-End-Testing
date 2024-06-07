package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_AB_004AddressbookentriedfromRightclmwithoutLogin extends Baseclass{
	@Test
	public void AddressbookentriedfromRightclmwithoutLogin() {
		
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		MyAccountPage macc=new MyAccountPage(driver);
		
		System.out.println(driver.getTitle());
		macc.addressBookfromRIGHTcolumn();
		System.out.println(driver.getTitle());
		Loginpage lp= new Loginpage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password")); 
		lp.clicklogin();  
		logger.info("clicked on login button...");
		System.out.println(driver.getTitle());
	}

}
/*output:Register Account
Account Login
18:15:04.430 [main] INFO  testCases.TC_AB_004AddressbookentriedfromRightclmwithoutLogin - clicked on login button...
Address Book
*/