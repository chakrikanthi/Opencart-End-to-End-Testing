package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_011ValidatingProductsinBrandpageinGRIDview  extends Baseclass {
	@Test
	public void ValidatingProductsinBrandpageinGRIDview () throws InterruptedException  {

		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		System.out.println("First page Title is:"+driver.getTitle());
		System.out.println("First page URL is :"+driver.getCurrentUrl());
		boolean Brandsfooterstatus=HMF.brandsfooterlinkdisplayed();
		if(Brandsfooterstatus==true) {
			System.out.println("Brands Footer link is present in main page of QAFox.com ");
		}
		HMF.brandsfooterlinkclick();
		System.out.println("second page Title  is:"+driver.getTitle());
		System.out.println("Current page URL:"+driver.getCurrentUrl());
		boolean Applebrandstatus=HMF.applebranddisplayed();
		if(Applebrandstatus==true) {
			System.out.println("Apple Brand is present in Find Your Favorite Brand page ");
		}

		HMF.applebrandclick();
		
		HMF.Applelistview();
		System.out.println("Products are in  LIST view now");
		Thread.sleep(2500);
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("document.getElementById('grid-view').style.border='5px red solid';");
	   System.out.println("Grid view got highlighted now");
		HMF.Applegridview();
		System.out.println("Products are in  GRID view now");
		

}
}