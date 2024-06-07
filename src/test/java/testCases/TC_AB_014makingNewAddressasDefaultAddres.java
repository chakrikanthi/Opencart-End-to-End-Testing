package testCases;

import org.testng.annotations.Test;

import pageObjects.AddADDRESpage;
import pageObjects.AddressBookEntriespage;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_AB_014makingNewAddressasDefaultAddres extends Baseclass{
	@Test
	public void makingNewAddressasDefaultAddres() throws InterruptedException {
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
		ABE.VivekAddresseditbtn();
		AddADDRESpage AD= new AddADDRESpage(driver);
		AD.country("United States");
		AD.regionorState("Georgia");
		Thread.sleep(1500);
		AD.defaultadressYESopt();
		Thread.sleep(2000);
		AD.continuebtn();
		
	}

}
