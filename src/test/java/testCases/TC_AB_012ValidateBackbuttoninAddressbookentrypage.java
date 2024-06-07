package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_AB_012ValidateBackbuttoninAddressbookentrypage extends Baseclass {
	@Test
	public void ValidateBackbuttoninAddressbookentrypage() throws InterruptedException {
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
		
		driver.navigate().back();
		
		String currentpage=driver.getTitle();
		if (currentpage.equals("My Account"))
		{
			System.out.println("We moved back from Address Book entries page to My Account page");
		}

	}

}
