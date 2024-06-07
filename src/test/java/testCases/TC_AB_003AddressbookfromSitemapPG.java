package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class TC_AB_003AddressbookfromSitemapPG extends Baseclass{
	@Test
	public void AddressbookfromSitemapPG() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		Loginpage lp= new Loginpage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password")); 
		lp.clicklogin();  
		logger.info("clicked on login button...");
		
		MyAccountPage macc=new MyAccountPage(driver);
		macc.siteMap();
		System.out.println("We are in :"+driver.getTitle()+" page");
		macc.sitemapaddressBook();
		boolean pageexiststatus=  macc.Addressbookpageexist();
		System.out.println(pageexiststatus);
		String pagetitle=driver.getTitle()	;
		System.out.println(pagetitle);
		String ActualTitle = "Address Book";
		Assert.assertEquals(pagetitle,ActualTitle);
		
	}

}
/*output:14:42:47.192 [main] INFO  testCases.TC_AB_003AddressbookfromSitemapPG - clicked on login button...
We are in :Site Map page
true
Address Book*/