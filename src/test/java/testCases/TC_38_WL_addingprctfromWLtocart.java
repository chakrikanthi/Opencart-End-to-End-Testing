package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import pageObjects.Wishlisttabindifferentlocation;
import testBase.Baseclass;

public class TC_38_WL_addingprctfromWLtocart extends Baseclass {
	@Test
	public void addprdctfromWLtocart() throws InterruptedException
	{
		MyAccountPage mp= new MyAccountPage(driver);
		mp.clickmyAccount();
		mp.clicklogin();
		
		Loginpage lp= new Loginpage(driver);
		lp.setEmail("kanthi@gmail.com");
		lp.setPassword("kanthi123");
		lp.clicklogin();
		
		Wishlisttabindifferentlocation wl=new Wishlisttabindifferentlocation(driver);
		wl.rightsideWLtab();
		wl.addimactocart();
		String successmg=wl.successimacaddmsg();
	
		System.out.println(successmg);
		 
	}

}
