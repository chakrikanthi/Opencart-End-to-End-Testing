package testCases;

import org.testng.annotations.Test;

import pageObjects.imac;
import testBase.Baseclass;

public class TC_SC_003ShoppingcartfromSitemapFooterpage extends Baseclass{
	@Test
	public void shoppigcartfromSitemap() throws InterruptedException
	{
		imac imac= new imac(driver);
		imac.searchbox("imac");
		imac.searchIcon();
		imac.imac();
		imac.addtocart();
		Thread.sleep(3500);
		imac.sitemap();
		Thread.sleep(3500);
		imac.shoppingCartinSitemap();
		
		Thread.sleep(4000);
		//According to the TC it should go to the shopping cart page but when we run this TC it's asking for login info
		
	}

}
