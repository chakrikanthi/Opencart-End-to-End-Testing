package testCases;

import org.testng.annotations.Test;

import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_CO_002checkoutinShoppingcartPage extends Baseclass{
	@Test
	public void checkoutinShoppingcartPage() {
		HPLP3065 HP=new HPLP3065(driver);
		HP.searchbox("hp lp 3065");
		HP.searchIcon();
		HP.hPLP3065();
		HP.addtocartbtn();
		HP.successmsgshoppingCart();
		HP.checkoutbtninSHPage();
		System.out.println("Current page is:"+driver.getTitle());
		
	}

}
