package testCases;

import org.testng.annotations.Test;

import pageObjects.imac;
import testBase.Baseclass;

public class TC_SC_002AccessShoppingcartfromheaderopt extends Baseclass{
	@Test
	public void verify_acessheadershoppingcart() throws InterruptedException
	{
		imac imac= new imac(driver);
		imac.searchbox("imac");
		imac.searchIcon();
		imac.imac();
		imac.addtocart();
		Thread.sleep(3500);
		imac.headershoppingCart();
		Thread.sleep(3500);
	}

}
