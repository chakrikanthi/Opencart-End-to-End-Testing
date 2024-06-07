package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_012ValidateProductcomparelinkinBrandpG  extends Baseclass {
	@Test
	public void ValidateProductcomparelinkinBrandpG() throws InterruptedException  {

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
		HMF.applebrandclick();
		HMF.imacproductcomparelink();
		boolean SUCCESSMSGDISPLAYSTATUS=HMF.macbookairproductcomparisonsuccessmdgdisplayed();
		if(SUCCESSMSGDISPLAYSTATUS==true) {
			System.out.println("Imac got added successfully for comparison and the success message is displayed as below");
		}
		System.out.println("iMac product compare link got clicked successfully ");
		
        HMF.productComparisonlinkfromsUCCMSG();
}
}