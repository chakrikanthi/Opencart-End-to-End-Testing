package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_002ValidatingCurrencyHeaderOption extends Baseclass  {
	@Test
	public void ValidatingCurrencyHeaderOption() throws InterruptedException  {
   
		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		boolean CurrencyoptDisplayed=HMF.currencyheaderoptionisdisplayed();
		if(CurrencyoptDisplayed==true) {
			System.out.println("Currency Header option is displayed in main page Qafox.com status is: "+CurrencyoptDisplayed);
		}
		HMF.currencyheaderoption();
		System.out.println("'Euro', 'Pound Streling' and 'US Dollar' options are displayed after clicking on currency option");

}
}