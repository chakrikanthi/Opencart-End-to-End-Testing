package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Orderhistory;
import pageObjects.ProductReturnsPage;
import testBase.Baseclass;

public class TC_PR_002Productreturnbyfillingallfields extends Baseclass{
	@Test
	public void Productreturnbyfillingallfields() {
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
		OH.ReturnIcon8112inOrderHisPg();
		System.out.println("You are in page:"+driver.getTitle()+" Page");
		
		ProductReturnsPage prdReturn=new ProductReturnsPage(driver);
		prdReturn.returnReasonReceivingWrongItem();
		prdReturn.Returnsubmitbtn();
		System.out.println("You are in page:"+driver.getTitle()+" Page");
		String Successmsg1=prdReturn.SuccessReturnmsg1();
		String successmsg2=prdReturn.SuccessReturnemailmsg();
		System.out.println(Successmsg1);
		System.out.println(successmsg2);
	}

}
