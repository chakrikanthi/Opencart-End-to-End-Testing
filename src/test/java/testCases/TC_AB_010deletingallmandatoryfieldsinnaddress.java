package testCases;

import org.testng.annotations.Test;

import pageObjects.AddADDRESpage;
import pageObjects.AddressBookEntriespage;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_AB_010deletingallmandatoryfieldsinnaddress extends Baseclass {
	@Test
	public void deletingallmandatoryfieldsinnaddress() throws InterruptedException {
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
		AD.firstName("");
		AD.lastName("");
		AD.address1("");
		AD.city("");
		AD.continuebtn();
		
		AddressBookEntriespage ADbook= new AddressBookEntriespage(driver);
		System.out.println("First name warning msg is:"+ADbook.firstNameMustBeBetween1A());
		ADbook.firstnamewarningmsgdisplyedornot();
		System.out.println("Last name warning msg is:"+ADbook.lastNameMustBeBetween1An());
		ADbook.lastnamewarningmsgdisplyedornot();
		System.out.println("Address warning msg is:"+ADbook.addresswarningmsg());
		ADbook.addresswarningmsgdisplyedornot();
		System.out.println("City warning msg is:"+ADbook.citywarningmsg());
		ADbook.citywarningmsgdisplyedornot();
		
	}

}
