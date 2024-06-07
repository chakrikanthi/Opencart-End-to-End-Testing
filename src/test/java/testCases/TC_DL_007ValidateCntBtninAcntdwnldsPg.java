package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Downloads;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_DL_007ValidateCntBtninAcntdwnldsPg extends Baseclass {
	@Test
	public void ValidateCntBtninAcntdwnldsPg() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		Downloads DL= new Downloads(driver);
		DL.downloadsfromRIGHTside();
		String PageTitle=driver.getTitle();
		System.out.println("You are in page:"+PageTitle);
		if(PageTitle.equals("Account Downloads"))
		{
			logger.info("test passed..");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test failed...");
			Assert.fail();
		}
		System.out.println("Message in the current page is:"+DL.youHaveNotMadeAnyPreviousDownloadsMsg());
	
		DL.AccountDownloadscontinuebtn();
		System.out.println("You are in page:"+driver.getTitle());
		System.out.println("Current URL IS:"+driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
	}

}