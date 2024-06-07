package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_017ValidateaddProductforComparisonfromBrandpage  extends Baseclass{
	@Test
	public void AddingproducttoWishListfromBrandPg() throws InterruptedException  {

		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		HMF.brandsfooterlinkclick();
		HMF.applebrandclick();
		HMF.imacproductcomparelink();
		HMF.macbookairproductcomparisonsuccessmdgdisplayed();
		HMF.macbookairproductcomparisonsuccessmdgtext();

}
}