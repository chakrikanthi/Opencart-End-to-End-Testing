package testCases;

import org.testng.annotations.Test;


import pageObjects.Loginpage;
import pageObjects.MyAccountPage;

import pageObjects.imac;
import testBase.Baseclass;

public class TC_30_WL_Relatedproductsindsplpage extends Baseclass {
	@Test
	public void validaterelatedproductsinWL() throws InterruptedException
	{
		MyAccountPage mp= new MyAccountPage(driver);
		mp.clickmyAccount();
		mp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("kanthi@gmail.com");
		lp.setPassword("kanthi123");
		lp.clicklogin();
		
		imac imacprd=new imac(driver);
		imacprd.searchbox("imac");
		imacprd.searchIcon();
		imacprd.imacitem();
		Thread.sleep(4000);
		imacprd.Addingrelatedprdct();
		Thread.sleep(4000);
		imacprd.successWLmsg();
		Thread.sleep(4000);
		
	}

}
