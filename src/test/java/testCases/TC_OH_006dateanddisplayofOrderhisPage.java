package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Orderhistory;
import testBase.Baseclass;

public class TC_OH_006dateanddisplayofOrderhisPage extends Baseclass{
	@Test
	public void dateanddisplayofOrderhisPage() {
		
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin(); 
		
		Orderhistory OH= new Orderhistory(driver);
		OH.orderHistoryfromRIGHTcolumnoption();
		System.out.println(OH.orderHistoryTableheader());
		System.out.println(OH.order8110info());
		System.out.println(OH.order8111info());
		System.out.println(OH.order8112info());
	}

}

/*output: Order ID Customer No. of Products Status Total Date Added
#8110 satvik reddy 1 Pending $1,305.00 01/05/2024
#8111 satvik reddy 1 Pending $105.00 01/05/2024
#8112 satvik reddy 1 Pending $205.00 01/05/2024
*/