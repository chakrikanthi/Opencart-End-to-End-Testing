package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_CO_003CheckoutbtninHeader extends Baseclass{
	@Test
	public void CheckoutbtninHeader() throws InterruptedException {
		HPLP3065 HP=new HPLP3065(driver);
		HP.searchbox("hp lp 3065");
		HP.searchIcon();
		HP.hPLP3065();
		HP.addtocartbtn();
		HP.successmsgshoppingCart();
		Thread.sleep(3000);
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByClassName('hidden-xs hidden-sm hidden-md')[5].style.border='5px red solid';");
		Thread.sleep(1000);
		HP.checkoutinheader();
		String Currentpage=driver.getTitle();
		System.out.println("Current page is:"+Currentpage);
		
		if (Currentpage.equals("Checkout"))
		{
			System.out.println("currently you are in "+ Currentpage +" Page You are ready for check out");
		}
	}
	

}
