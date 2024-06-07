package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.ReturnsPage;
import testBase.Baseclass;

public class TC_RS_007ReturninfoPgfromProductreturnsPg extends Baseclass{
	@Test
	public void ReturninfoPgfromProductreturnsPg() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		System.out.println("You are in page:"+driver.getTitle());
		ReturnsPage RP= new ReturnsPage(driver);
		RP.returnsfromRIGHTcolumn();
		System.out.println("You are in page:"+driver.getTitle());
		RP.Viewiconofproductreturn5407();
		System.out.println("You are in page:"+driver.getTitle());
		System.out.println(RP.returnIDandDateadded5407());
		
		System.out.println("Reason for returning the product is :"+RP.returninfotablefor5407());
		System.out.println("Product that was returned is:"+RP.returnproductinfo5407());
		System.out.println("Current page Title is:"+driver.getTitle());
		System.out.println("Current page URL is:"+driver.getCurrentUrl());
	}

}
