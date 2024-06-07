package testCases;

import org.testng.annotations.Test;

import pageObjects.Specialoffers;
import testBase.Baseclass;

public class TC_SPO_003ValidatingProductswhicharesoldatofferprice extends Baseclass{
	@Test
	public void submittingenquiryafterloggedin()  {
		
		Specialoffers SO= new Specialoffers(driver);
		SO.specialsfromfooter();
		
		System.out.println("Comparing Actual price with offer price..");
		
		String ActualPriceofApplecinema30= SO.OriginalpriceofApplecinema30();
		System.out.println(ActualPriceofApplecinema30);
		
		int  ActualPriceofApplecinema301=Integer.parseInt(ActualPriceofApplecinema30.replace("$",""));
		System.out.println(ActualPriceofApplecinema301);
		String OfferpriceofApplecinema30=SO.OfferpriceofApplecinema30();
		int  OfferpriceofApplecinema301=Integer.parseInt(OfferpriceofApplecinema30.replace("$","").replace(",",""));
		
		if(OfferpriceofApplecinema301<=ActualPriceofApplecinema301) {
			System.out.println("As offer price of Apple cinema 30' is less than Actual Price..So the product  is in offer  ");
			
		}
		
		
		String ActualPriceofCanonEOS= SO.ActualPriceofCanonEOS();
		int  ActualPriceofCanonEOS1=Integer.parseInt(ActualPriceofCanonEOS.replace("$",""));
		String OfferpriceofCanonEOS=SO.OfferpriceofCanonEOS();
		int  OfferpriceofCanonEOS1=Integer.parseInt(OfferpriceofCanonEOS.replace("$",""));
		
		if(OfferpriceofCanonEOS1<=ActualPriceofCanonEOS1) {
			System.out.println("As offer price of Canon EOS  is less than Actual Price..So the product  is in offer  ");
			
		}
}
}