package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Orderhistory;
import testBase.Baseclass;

public class TC_OI_002ValidatingREORDERiconinOrderinfoPg extends Baseclass {
	@Test
	public void ValidatingREORDERiconinOrderinfoPg()
	{
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
		OH.reordercartIcon();
		System.out.println("Reorder success msg is:"+OH.Reorder8112successmsg());
		OH.shoppingCartlinkinreordersucmsg();
		String quantity=OH.ProductQntyafterreordering();
		System.out.println("After reordering now the product quantity is:"+quantity);
		
	}

}
