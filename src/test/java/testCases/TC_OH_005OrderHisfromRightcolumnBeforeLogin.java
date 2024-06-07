package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Orderhistory;
import testBase.Baseclass;

public class TC_OH_005OrderHisfromRightcolumnBeforeLogin extends Baseclass{
	@Test
	public void OrderHisfromRightcolumnBeforeLogin() {
		
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		Orderhistory OH= new Orderhistory(driver);
		OH.orderHistoryfromRIGHTcolumnoption();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		System.out.println(driver.getTitle());
		
	}

}
