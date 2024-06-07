package testCases;

import org.testng.annotations.Test;


import pageObjects.Homepage;
import pageObjects.Loginpage;

import pageObjects.Wishlistafteraddingprdct;

import testBase.Baseclass;

public class TC_24_ProductimageinWishListpage extends Baseclass{
	@Test
	public void verify_productimginwishlist() throws InterruptedException
	{
				
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.setEmail("kanthi@gmail.com");
		lp.setPassword("kanthi123");
		lp.clicklogin();
		
		Wishlistafteraddingprdct wishpg= new Wishlistafteraddingprdct(driver);
		Thread.sleep(2500);
		wishpg.wishList1();
		wishpg.iphoneimage();
		Thread.sleep(3000);
	}

}
