package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Orderhistory;
import testBase.Baseclass;

public class TC_OI_004ContinueBtninOrderInfopage extends Baseclass{
	@Test
	public void ContinueBtninOrderInfopage() {
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
		System.out.println("You are in page:"+driver.getTitle()+" Page");
		OH.continuebtninOrderHisPage();
		System.out.println("You are in page:"+driver.getTitle()+" Page");
}
}
/*output:You are in page:Order Information Page
You are in page:Order History Page*/