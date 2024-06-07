package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_013ValidatingsortingproductsinBrandsPg extends Baseclass {
	@Test
	public void ValidatingsortingproductsinBrandsPg() throws InterruptedException  {

		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		HMF.brandsfooterlinkclick();
		HMF.applebrandclick();
		Thread.sleep(1200);
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementById('input-sort').style.border='5px red solid';");
		System.out.println("Sort By field options are:");
		HMF.sortBy();
		System.out.println("Products got sorted by according to Rating(Highest)");
}
}