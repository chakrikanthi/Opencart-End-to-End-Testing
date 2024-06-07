package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_014NumberofProductsdisplayedinSHOWfield extends Baseclass {
	@Test
	public void NumberofProductsdisplayedinSHOWfield() throws InterruptedException  {

		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		HMF.brandsfooterlinkclick();
		HMF.applebrandclick();
		Thread.sleep(1200);
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementById('input-limit').style.border='5px red solid';");
		System.out.println("Show field options are:");
		HMF.show();
		System.out.println("Products in show field changed from 20 to 50");

}
}