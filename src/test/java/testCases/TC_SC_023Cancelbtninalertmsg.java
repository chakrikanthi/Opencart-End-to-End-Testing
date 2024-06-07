package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.EstimateShippingTaxes;
import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_SC_023Cancelbtninalertmsg extends Baseclass {
	

	@Test
	public void Cancelbtninalertmsg() throws InterruptedException {
		
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
		Thread.sleep(2500);
		ES.country("United States");  //here if we dont select the country , getting only country error message
		Thread.sleep(1500);
		ES.State("Georgia"); // here if we select the country and not selecting state then only we are getting state error message
		Thread.sleep(1000);
		ES.postCode("30097");
		ES.getQuotes();
		String alertboxmsg=ES.Alertboxtext();
		System.out.println("Alert box is appiered with  message:"+alertboxmsg);
		ES.cancelbtn();
		System.out.println("Flat shipping rate got cancelled and no Estimation taxes were added");
	}
}
