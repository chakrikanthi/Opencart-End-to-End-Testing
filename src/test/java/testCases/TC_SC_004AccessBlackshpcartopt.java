package testCases;

import org.testng.annotations.Test;

import pageObjects.imac;
import testBase.Baseclass;

public class TC_SC_004AccessBlackshpcartopt extends Baseclass {
    @Test
	public void Verify_Blackshoppingcartopt() throws InterruptedException
	{
		imac imac= new imac(driver);
		Thread.sleep(3500);
		imac.BlackShoppingcartbtn();
		Thread.sleep(3500);
	    imac.yourShoppingCartIsEmpty();
		Thread.sleep(3500);
		
		// here expected results are: 1. 'Your shopping cart is empty!' should be displayed--it's displaying this msg
		//2. User should be taken to 'Home' page-- After clicking on your shopping cart is empty it's taking to home page
	}

}
