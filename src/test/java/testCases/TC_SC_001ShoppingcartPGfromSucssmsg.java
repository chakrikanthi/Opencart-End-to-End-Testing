package testCases;

import org.testng.annotations.Test;

import pageObjects.imac;
import testBase.Baseclass;

public class TC_SC_001ShoppingcartPGfromSucssmsg extends Baseclass {
	
	@Test
	public void validateshoppingcartSucessmsg() throws InterruptedException
	{
		imac imac= new imac(driver);
		imac.searchbox("imac");
		imac.searchIcon();
		imac.imac();
		imac.addtocart();
		String successmsg= imac.SucessmgsafteraddSC();
		System.out.println(successmsg);
		Thread.sleep(4500);
		/*
		if (successmsg.equals("Success: You have added iMac to your shopping cart!×"))
		{
			System.out.println("Imac added successfully to the shopping cart");
		}
		else
		{
			System.out.println("Imac DIDN'T added to shopping cart");
		}
		*/
		imac.ShopcartlnkinSCmsg();
		Thread.sleep(4000);
	}
	
	
	//"Success: You have added iMac to your shopping cart!"

}
