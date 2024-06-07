package testCases;



import org.testng.annotations.Test;

import pageObjects.Defaultquantitysetto1;
import pageObjects.SearchboxandIcon;
import testBase.Baseclass;

public class TC_017_Defaultquantitysetto1Test extends Baseclass {
	@Test(groups={"regression","master"})
	public void Verify_Defaultquantitysetto1() throws InterruptedException
	{
		
		SearchboxandIcon schbxic= new SearchboxandIcon(driver);
		schbxic.searchbox("HP LP3065");
		schbxic.searchIcon();
		schbxic.hPLP3065();
		Defaultquantitysetto1 default1= new Defaultquantitysetto1(driver);
		Thread.sleep(4000);
		
		default1.qty("3");
		
		Thread.sleep(4000);
		default1.addToCart();
		Thread.sleep(3000);
		default1.shoppingCart();
		Thread.sleep(4000);
		
	}

}
