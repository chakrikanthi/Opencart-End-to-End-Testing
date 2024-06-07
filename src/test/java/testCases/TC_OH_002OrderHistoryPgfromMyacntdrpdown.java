package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Orderhistory;
import testBase.Baseclass;

public class TC_OH_002OrderHistoryPgfromMyacntdrpdown extends Baseclass {
	@Test
	public void OrderHistoryPgfromMyacntdrpdown() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		Orderhistory OH= new Orderhistory(driver);
		OH.myAccountINTOPlist();
		OH.orderHistoryfromMYAccountDrpdown();
		System.out.println(driver.getTitle());
	}

}
