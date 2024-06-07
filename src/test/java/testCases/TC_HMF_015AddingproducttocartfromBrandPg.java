package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_015AddingproducttocartfromBrandPg  extends Baseclass {
	@Test
	public void AddingproducttocartfromBrandPg() throws InterruptedException  {

		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		HMF.brandsfooterlinkclick();
		HMF.applebrandclick();
		Thread.sleep(1200);
		HMF.ipodaddToCart();
		boolean Appleipodsuccessmsg=HMF.successmsgYouHaveAddedIPodCisdisplayed();
		Assert.assertEquals(Appleipodsuccessmsg, true);
		System.out.println(HMF.successmsgYouHaveAddedIPodC());
		HMF.Shoppingcartlinkfromsuccmsg();
		System.out.println(driver.getTitle());

}
}