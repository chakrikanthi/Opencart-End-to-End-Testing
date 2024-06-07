package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.EstimateShippingTaxes;
import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_SC_022_ValidateShippingNTaxesnotgivingdet extends Baseclass {

	@Test
	public void ValidateShippingNTaxesnotgivingdet() throws InterruptedException {
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
		ES.State(""); // here if we select the country and not selecting state then only we are getting state error message
		Thread.sleep(1000);
		ES.postCode("");
		ES.getQuotes();
		/*
		String  Countryerrmsg=ES.pleaseSelectACountryerrmsg();
		if(Countryerrmsg.equals("Please select a country!")) {
			System.out.println("you didn't select any country:"+Countryerrmsg);
		}
		
			System.out.println("you didn't select any State/ Region:");
		*/
		
		if(ES.pleaseSelectARegionStateerrmsg().equals("Please select a region / state!")) 
		{
			System.out.println("You have selected country:");
			System.out.println("you didn't select any State/ Region:");
		}
	
		
		}

	}
