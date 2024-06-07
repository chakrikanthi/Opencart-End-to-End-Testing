package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Specialoffers;
import testBase.Baseclass;

public class TC_SPO_010ValidateAddingpdcttoWishlistfromSpecialOffersPg   extends Baseclass{
	@Test
	public void ValidateAddingpdcttoWishlistfromSpecialOffersPg()  {
		
		Homepage hp= new Homepage(driver);
		hp.clickMyAccount();
		hp.clicklogin(); 
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password")); 
		lp.clicklogin();
		logger.info("User logged in successfully...");	
		 
		
		Specialoffers sp=new Specialoffers(driver);
		sp.specialsfromfooter();
		sp.appleaddtoWishlist();
		logger.info("Apple cinema 30' added to wishlist...");	
		
		System.out.println("Success message after adding Apple cinema 30' to wish list:"+sp.WishlistsuccesmessageApple());
		
		sp.specialsfromfooter();
		sp.CanonaddtoWishlist();
		logger.info("Canon EOS 5D added to wishlist...");	
		
		System.out.println("Success message after adding Canon EOS 5D to wish list:"+sp.wishlistsuccessmsgofCanon());
		sp.wishListICON();

		boolean canonstatusinWLpage= sp.canonEOS5Dispresent();
		if(canonstatusinWLpage==true) {
			System.out.println("Canon EOS 5D is in MY Wishlist table..");
		}
		
		
		boolean ApplestatusinWLpage= sp.Applecinema30ispresent();
		if(ApplestatusinWLpage==true) {
			System.out.println("Apple Cinema 30' is in MY Wishlist table..");
		}
		
		System.out.println("Total two products are added in My Wishlist page");
}
}