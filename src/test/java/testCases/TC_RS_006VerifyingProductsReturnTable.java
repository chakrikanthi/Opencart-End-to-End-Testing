package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.ReturnsPage;
import testBase.Baseclass;

public class TC_RS_006VerifyingProductsReturnTable extends Baseclass {
	@Test
	public void VerifyingProductsReturnTable() {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("satvik@gmail.com"); 
		lp.setPassword("kanthi123"); 
		lp.clicklogin();  
		
		
		ReturnsPage RP= new ReturnsPage(driver);
		RP.returnsfromRIGHTcolumn();
		
		System.out.println(RP.returntableheader());
		System.out.println(RP.returndetails5407());
	}

}
