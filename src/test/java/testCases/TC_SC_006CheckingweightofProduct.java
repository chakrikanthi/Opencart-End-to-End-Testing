package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_SC_006CheckingweightofProduct  extends Baseclass{
	@Test
	public void checkingweightofthproduct() throws InterruptedException
	{
		HPLP3065 HP= new HPLP3065(driver);
		HP.searchbox("HP LP3065");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    HP.searchIcon();
	    Thread.sleep(3500);
	    HP.hPLP3065();
	    HP.addtocartbtn();
	    Thread.sleep(3500);
	    HP.successmsgshoppingCart();
	    String weightmessage= HP.weightofHPLP3065();
		System.out.println(weightmessage);
		
		if(weightmessage.equals("Shopping Cart  (1.00kg)"))
		{
			System.out.println("Weight of the product is correct");
		}
		
		else {
			Assert.fail();
			System.out.println("Weight of the product is INcorrect");
		}
	}

}
