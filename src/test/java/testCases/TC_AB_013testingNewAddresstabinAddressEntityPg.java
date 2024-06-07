package testCases;

import org.testng.annotations.Test;

import pageObjects.AddADDRESpage;
import pageObjects.AddressBookEntriespage;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_AB_013testingNewAddresstabinAddressEntityPg extends Baseclass{
	@Test
	public void testingNewAddresstabinAddressEntityPg() throws InterruptedException {
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
		ABE.newAddressbttn();
		
		AddADDRESpage AD= new AddADDRESpage(driver);
		AD.firstName("VIVEK REDDY");
		AD.lastName("CHENNAREDDY");
		AD.address1("5170 SHERIDAN RD");
		AD.city("Atlanta");
		AD.country("United States");
		AD.regionorState("Georgia");
		AD.continuebtn();
		System.out.println("Now we are in :"+ driver.getTitle());
		
	}

}
