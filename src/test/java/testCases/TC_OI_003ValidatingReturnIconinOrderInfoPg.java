package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Orderhistory;
import testBase.Baseclass;

public class TC_OI_003ValidatingReturnIconinOrderInfoPg extends Baseclass {
	@Test
	public void ValidatingReturnIconinOrderInfoPg() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		Orderhistory OH= new Orderhistory(driver);
		OH.orderHistoryfromRIGHTcolumnoption();
		OH.viewiconfororder8112();
		System.out.println("Yoe are in page:"+driver.getTitle());
		OH.ReturnIcon8112inOrderHisPg();
	    System.out.println("We are in Page:"+driver.getTitle()+ " Page");
		
	}

}
