package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import testBase.Baseclass;

public class TC_HMF_016AddingproducttoWishListfromBrandPg  extends Baseclass {
	@Test
	public void AddingproducttoWishListfromBrandPg() throws InterruptedException  {

		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password")); 
		lp.clicklogin();
		
		
		HMF.brandsfooterlinkclick();
		HMF.applebrandclick();
		Thread.sleep(1200);
		HMF.ipodshuffleaddToWishlist();
		boolean ipodshufflesuccessmsg=HMF.successAddedIPodStoWishlistdisplayed();
		Assert.assertTrue(ipodshufflesuccessmsg);
		System.out.println(HMF.successAddedIPodStoWishlist());
		HMF.wishListlinkfromSuccessmsg();
		System.out.println(driver.getTitle());

}
}