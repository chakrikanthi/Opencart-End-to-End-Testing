package testCases;

import org.testng.annotations.Test;

import pageObjects.Specialoffers;
import testBase.Baseclass;

public class TC_SPO_011ValidateaddingProductforComparisonfromSpecialOfferspage  extends Baseclass   {
	@Test
	public void ValidateaddingProductforComparisonfromSpecialOfferspage() throws InterruptedException  {
		
		Specialoffers sp=new Specialoffers(driver);
		sp.specialsfromfooter();
		Thread.sleep(2000);
		
		
		sp.applecinema30comparethisprdct();
		System.out.println(sp.comparesuccessmsgApple());
		Thread.sleep(2000);
		logger.info("Apple cinema 30' added to comapre list successfully...");
		
		
		sp.canoniconcomparethisprdct();
		System.out.println(sp.ComparesuccessmsgCanon());
		logger.info("Canon EOS 5D  added to  comapre list successfully...");
		
		sp.productComparelink();
		
		boolean canonstatusinPCpage= sp.canoniconimagepresentinComparisontable();
		if(canonstatusinPCpage==true) {
			System.out.println("Canon EOS 5D is in Product Comparison table..");
		}
		
		
		boolean ApplestatusinPCpage= sp.AppleimagepresentinProductcomparisontable();
		if(ApplestatusinPCpage==true) {
			System.out.println("Apple Cinema 30' is in Product Comparison table..");
		}
		
		System.out.println("Total two products are added in Product Comparison table ");
		
	}

}
