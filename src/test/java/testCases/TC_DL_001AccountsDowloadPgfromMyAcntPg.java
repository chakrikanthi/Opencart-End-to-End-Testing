package testCases;

import org.testng.annotations.Test;

import pageObjects.Downloads;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_DL_001AccountsDowloadPgfromMyAcntPg extends Baseclass{
	@Test
	public void AccountsDowloadPgfromMyAcntPg() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		Downloads DL= new Downloads(driver);
		DL.LEFTsidedownloadsinMYAccountpg();
		System.out.println(driver.getTitle());
	}

}
