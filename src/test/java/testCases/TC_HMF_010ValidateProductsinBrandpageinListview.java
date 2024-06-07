package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_010ValidateProductsinBrandpageinListview  extends Baseclass{
	@Test
	public void ValidateProductsinBrandpageinListview() throws InterruptedException  {

		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		System.out.println("First page:"+driver.getTitle());

		boolean Brandsfooterstatus=HMF.brandsfooterlinkdisplayed();
		if(Brandsfooterstatus==true) {
			System.out.println("Brands Footer link is present in main page of QAFox.com ");
		}
		HMF.brandsfooterlinkclick();
		System.out.println("second page is:"+driver.getTitle());
		System.out.println("Current page URL:"+driver.getCurrentUrl());
		boolean Sonybrandstatus=HMF.sonyBranddisplayed();
		if(Sonybrandstatus==true) {
			System.out.println("Sony Brand is present in Find Your Favorite Brand page ");
		}

		HMF.sonyBrandclick();
		HMF.sonylistviewopt();

		System.out.println("second page is:"+driver.getTitle());
		System.out.println("Current page URL:"+driver.getCurrentUrl());
		HMF.sonylistviewopt();


	}
}