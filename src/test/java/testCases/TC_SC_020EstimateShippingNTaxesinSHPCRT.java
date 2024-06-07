package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.EstimateShippingTaxes;
import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_SC_020EstimateShippingNTaxesinSHPCRT extends Baseclass{
	@Test
	public void EstimateShippingNTaxesinSHPCRT() throws InterruptedException {
		HPLP3065 HP= new HPLP3065(driver);
		HP.searchbox("HP LP3065");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    HP.searchIcon();
	    Thread.sleep(1500);
	    HP.hPLP3065();
	    HP.addtocartbtn();
	    Thread.sleep(1500);
	    HP.successmsgshoppingCart();

	    EstimateShippingTaxes ES= new EstimateShippingTaxes(driver);
	    Thread.sleep(1500);
	    ES.estimateShippingTaxes();
	    Thread.sleep(1500);
	    ES.country("United States");
	    Thread.sleep(1500);
	    ES.State("Georgia");
	    Thread.sleep(1000);
	    ES.postCode("30097");
	    ES.getQuotes();
	    ES.shippingRateBtn();
	    ES.applyShippingbtn();
	    String Successmsg=ES.successShippingEstimatmsg();

	    System.out.println(Successmsg);
	}

}
