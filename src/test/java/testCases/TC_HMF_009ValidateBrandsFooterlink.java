package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_009ValidateBrandsFooterlink extends Baseclass{
	@Test
	public void ValidateBrandsFooterlink() throws InterruptedException  {
		
		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		System.out.println("First page:"+driver.getTitle());
		
		boolean Brandsfooterstatus=HMF.brandsfooterlinkdisplayed();
		if(Brandsfooterstatus==true) {
			System.out.println("Brands Footer link is present in main page of QAFox.com ");
		}
		HMF.brandsfooterlinkclick();
		System.out.println("Clicked on:"+HMF.brandsfooterlinkgettext());
		System.out.println("second page is:"+driver.getTitle());
		System.out.println("Current page URL:"+driver.getCurrentUrl());
		boolean AppleBrandstatus=HMF.applebranddisplayed();
		if(AppleBrandstatus==true) {
			System.out.println("Apple Brand is present in Find Your Favorite Brand page ");
		}
		HMF.applebrandclick();
		System.out.println("Clicked on:"+HMF.applebrandgettext());
		System.out.println("Third page:"+driver.getTitle());
		System.out.println("Current page URL:"+driver.getCurrentUrl());
		
		driver.navigate().back();
		boolean SonyBrandstatus=HMF.sonyBranddisplayed();
		if(SonyBrandstatus==true) {
			System.out.println("Sony Brand is present in Find Your Favorite Brand page ");
		}
		HMF.sonyBrandclick();
		System.out.println("Clicked on:"+HMF.sonyBrandgettext());
		System.out.println("Fourth page:"+driver.getTitle());
		System.out.println("Current page URL:"+driver.getCurrentUrl());
		System.out.println("Test got passed");
}
}