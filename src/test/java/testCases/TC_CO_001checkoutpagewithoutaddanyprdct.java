package testCases;

import org.testng.annotations.Test;


import pageObjects.Checkoutpage;

import testBase.Baseclass;

public class TC_CO_001checkoutpagewithoutaddanyprdct extends Baseclass{
	@Test
	public void checkoutpagewithoutaddanyprdct () {
		Checkoutpage co= new Checkoutpage(driver);
		co.checkout();
		String Emptycartmsg =co.Emptycheckputpagemsg();
		System.out.println("Empty check out page info is:"+Emptycartmsg);
		if (Emptycartmsg.equals("Your shopping cart is empty!")) {
			System.out.println("Shopping cart is empty you didn't add any product to the cart ");
		}
		
		
	}

}
