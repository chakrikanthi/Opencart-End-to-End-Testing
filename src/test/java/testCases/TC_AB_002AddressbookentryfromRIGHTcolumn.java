package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_AB_002AddressbookentryfromRIGHTcolumn extends Baseclass {
	@Test
	public void AddressbookentryfromRIGHTcolumn() {
		
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		Loginpage lp= new Loginpage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password")); 
		lp.clicklogin();  
		logger.info("clicked on login button...");
		
		MyAccountPage macc=new MyAccountPage(driver);
		macc.addressBookfromRIGHTcolumn();
		String pagetitle=driver.getTitle()	;
		System.out.println(pagetitle);
		String ActualTitle = "Address Book";
		Assert.assertEquals(pagetitle,ActualTitle);
	     if (pagetitle.equals(ActualTitle)) {
	    	 
	    	 System.out.println("We clicked on Address Book from RIGHT column");
	    	 System.out.println("We are in page "+ pagetitle);
	     }
	boolean pageexiststatus=  macc.Addressbookpageexist();
	System.out.println(pageexiststatus);
	}

}
/*OUTPUT: Address Book
We clicked on Address Book from RIGHT column
We are in page Address Book
true*/