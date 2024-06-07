package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Currencies;
import testBase.Baseclass;

public class TC_CR_002ValidateCurrencyFunctionalitybyselectingProudSterling extends Baseclass {
	@Test
	public void ValidateCurrencyFunctionalitybyselectingProudSterling() throws InterruptedException  {
		Currencies currency= new Currencies(driver);
		currency.currencyicon();
		currency.£PoundSterlingclick();
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementsByClassName('price')[1].style.border='5px Blue solid';");
		System.out.println("Product prices are changed to Pound Sterling..here we can seen sample iphone product price got Highlighted in Pound Sterling, Please scroll down the page to view it");
		System.out.println("Iphone product price got displayed in Pound Sterling:"+currency.iphonepriceinPoundsterling());

}
}