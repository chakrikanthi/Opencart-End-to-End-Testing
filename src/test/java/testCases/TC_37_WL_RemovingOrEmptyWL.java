package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import pageObjects.Wishlisttabindifferentlocation;
import testBase.Baseclass;

public class TC_37_WL_RemovingOrEmptyWL extends Baseclass 

{
	@Test
	public void RemoreOREmptyWL()
	{
		// before running this test make sure you added  only apple cinema 30 to wishlist and make sure WL HAS ONLY ONE PRODUCT 
		MyAccountPage mp= new MyAccountPage(driver);
		mp.clickmyAccount();
		mp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("kanthi@gmail.com");
		lp.setPassword("kanthi123");
		lp.clicklogin();
		
		
		Wishlisttabindifferentlocation wl=new Wishlisttabindifferentlocation(driver);
	    wl.rightsideWLtab();
		wl.RemoveAppleCinematab();

	//String RemoveSucMSG= wl.modifiedWLmsg();
		boolean successmsg= wl.successRemovemsg();
		System.out.println(successmsg);
	//if(RemoveSucMSG.equals("Success: You have modified your wish list!\r\n"))
		//Success: You have modified your wish list!
		Assert.assertEquals(successmsg, true,"Success: You have modified your wish list!");
	{
		System.out.println("Product removed successfully");
	} 
	
	
	String EmptyWLmsg= wl.WLemptyMSG();
	System.out.println(EmptyWLmsg);
	
	if(EmptyWLmsg.equals("Your wish list is empty."))
			{
		System.out.println("Wish list is successfully empty");
	} else
	{
		System.out.println("unable to empty Wishlist");
	}
		
	}}	
