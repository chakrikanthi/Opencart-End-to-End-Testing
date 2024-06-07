package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_HMF_003ValidatingRemovebtnfromShoppingcartblock  extends Baseclass {
	@Test
	public void ValidatingCurrencyHeaderOption() throws InterruptedException  {
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clicklogin(); 
		
		
		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		HMF.blackcartbtn();
		HMF.RemoveiPhonefromshoppingcart();
		System.out.println("iPHONE GOT REMOVED SUCCESSFULLY FROM THE SHOPPING CART LIST ");
		
}
}

//output:iPHONE GOT REMOVED SUCCESSFULLY FROM THE SHOPPING CART LIST 
//if u want to re run this test case again please ad iphone to the shopping before running this test case