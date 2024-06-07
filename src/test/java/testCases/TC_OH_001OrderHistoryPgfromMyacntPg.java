package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Orderhistory;
import testBase.Baseclass;

public class TC_OH_001OrderHistoryPgfromMyacntPg extends Baseclass{
	@Test
	public void OrderHistoryPgfromMyacntPg() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		Orderhistory OH= new Orderhistory(driver);
		OH.viewYourOrderHistoryfromLEFTcolumn();
		String Orderhistpg=driver.getTitle();
		
		if(Orderhistpg.equals("Order History")) {
			System.out.println("you are in :"+Orderhistpg+" page");
		}
		
	}

}
