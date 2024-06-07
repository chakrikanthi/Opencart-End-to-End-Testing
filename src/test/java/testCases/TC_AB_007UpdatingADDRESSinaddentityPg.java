package testCases;

import org.testng.annotations.Test;

import pageObjects.AddADDRESpage;
import pageObjects.AddressBookEntriespage;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_AB_007UpdatingADDRESSinaddentityPg extends Baseclass{
	@Test
	public void UpdatingADDRESSinaddentityPg() throws InterruptedException {
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
		Thread.sleep(1200);
		AddressBookEntriespage ABE= new AddressBookEntriespage(driver);
		ABE.satvikeditaddressbtn();
		
		AddADDRESpage AD= new AddADDRESpage(driver);
		System.out.println("We are in page:"+driver.getTitle());
		AD.firstName("Satvik Reddy");
		AD.lastName("Reddy");
		AD.address1("1570 SHERIDAN RD");
		AD.city("ATLANTA");
		AD.country("United States");
		AD.regionorState("Georgia");
		Thread.sleep(1000);
		AD.continuebtn();
		System.out.println("we are in page:"+driver.getTitle());
		
		String EditaddressSuccessmsg=ABE.editAddressSuccessmsg();
		System.out.println("Success message after editing the address:"+EditaddressSuccessmsg);
	}

}
