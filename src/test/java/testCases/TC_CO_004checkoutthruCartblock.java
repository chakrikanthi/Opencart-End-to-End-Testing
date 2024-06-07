package testCases;

import org.testng.annotations.Test;

import pageObjects.Checkoutpage;
import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_CO_004checkoutthruCartblock extends Baseclass{
	@Test
	public void checkoutthruCartblock() throws InterruptedException {
		HPLP3065 HP=new HPLP3065(driver);
		HP.searchbox("hp lp 3065");
		HP.searchIcon();
		HP.hPLP3065();
		HP.addtocartbtn();
		HP.successmsgshoppingCart();
		Thread.sleep(3000);
		 Checkoutpage CO= new  Checkoutpage(driver);
		 CO.blackcartbtn();
		 Thread.sleep(2500);
		 CO.checkoutthrublackcrtbtn();
		 System.out.println("you are in "+ driver.getTitle() +"page");
		

}}
