package testCases;

import org.testng.annotations.Test;

import pageObjects.AddADDRESpage;
import pageObjects.AddressBookEntriespage;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_AB_011BackbuttoninEditaddress extends Baseclass{
	
	@Test
	public void BackbuttoninEditaddress() throws InterruptedException {
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
		driver.navigate().back();
		System.out.println("Now we are in page: "+ driver.getTitle());
		AddressBookEntriespage ABE1= new AddressBookEntriespage(driver);
		String satvikaddress=ABE1.satvikaddress();
		System.out.println(satvikaddress);
		
	}

}
