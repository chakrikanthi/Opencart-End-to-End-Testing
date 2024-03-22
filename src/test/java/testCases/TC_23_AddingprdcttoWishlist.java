package testCases;

import org.testng.annotations.Test;

import pageObjects.SearchboxandIcon;
import pageObjects.Wishlistafteraddingprdct;
import pageObjects.iphone;
import testBase.Baseclass;

public class TC_23_AddingprdcttoWishlist extends Baseclass {
	@Test
	public void Verify_addprdcttowishlist() throws InterruptedException
	{
		SearchboxandIcon srcbox= new SearchboxandIcon(driver);
		srcbox.searchbox("iphone");
		srcbox.searchIcon();
		iphone iphone= new iphone(driver);
		iphone.iphonelink();
		iphone.addtowishlist();
		iphone.clickwishlistinsucessmsg();
		iphone.setemail("kanthi@gmail.com");
		iphone.setpassword("kanthi123");
		iphone.loginbtn();
		
		
		
		
	}

}
