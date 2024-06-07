package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Currencies;
import testBase.Baseclass;

public class TC_CR_003ValidatingUSCurrency  extends Baseclass{
	@Test
	public void ValidateCurrencyFunctionalitybyselectingProudSterling() throws InterruptedException  {
		Currencies currency= new Currencies(driver);
		currency.currencyicon();
		currency.$USDollarclick();
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByClassName('price')[3].style.border='5px Blue solid';");
		System.out.println("Product prices are changed to US Dollars..here we can seen sample CanonEOS 5D product price got Highlighted in US Dollars, Please scroll down the page to view it");
		System.out.println("Iphone product price got displayed in US Dollars:"+currency.CanonEOSinUSDollars());
}
}