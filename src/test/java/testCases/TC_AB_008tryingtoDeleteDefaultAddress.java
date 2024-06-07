package testCases;

import org.testng.annotations.Test;

import pageObjects.AddressBookEntriespage;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_AB_008tryingtoDeleteDefaultAddress extends Baseclass{
	@Test
	public void tryingtoDeleteDefaultAddress() throws InterruptedException {
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
		
		ABE.Satvikaddressdelete();
		ABE.satvikaddressdeleteWARNINGmsg();
		String warningmsg=ABE.deafultaddressdeletingwarningms();
		System.out.println(warningmsg);
		
		if(warningmsg.equals("Warning: You can not delete your default address!")) {
			System.out.println("Trying to delete default address, it's not allowing and giving warning msg also");
		}
		
		
	}

}
