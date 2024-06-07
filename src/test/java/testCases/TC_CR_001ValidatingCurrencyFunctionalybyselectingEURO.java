package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Currencies;
import testBase.Baseclass;

public class TC_CR_001ValidatingCurrencyFunctionalybyselectingEURO extends Baseclass {
	@Test
	public void ValidatingCurrencyFunctionalybyselectingEURO() throws InterruptedException  {
		Currencies currency= new Currencies(driver);
		currency.currencyicon();
		currency.€Euroclick();
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByClassName('price')[0].style.border='5px red solid';");
		System.out.println("Product prices are changed to Euro..here we can seen sample Mac book products price got Highlighted in EURO, Please scroll down the page to view it");
		System.out.println("Mac book products price got displayed in EURO"+currency.macbookeurocurrency());
}
}