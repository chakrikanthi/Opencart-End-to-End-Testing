package testCases;

import org.testng.annotations.Test;
import pageObjects.ThreeProductsComparison;
import testBase.Baseclass;

public class TC_011_Threeproductscomparisontest extends Baseclass{
	@Test(groups={"regression","master"})
	public void verify_Threeproductscomparisontest() throws InterruptedException
	{
		ThreeProductsComparison thrpdcmp=  new ThreeProductsComparison(driver);
		thrpdcmp.searchbox("MacBook");
		thrpdcmp.searchIcon();
		thrpdcmp.Macbookcomparisonbtn();
		Thread.sleep(2000);
		
		thrpdcmp.searchbox("HP LP3065");
		thrpdcmp.searchIcon();
		thrpdcmp.HPcomparisonbtn();
		Thread.sleep(2000);
		thrpdcmp.searchbox("MacBook Air");
		thrpdcmp.searchIcon();
		thrpdcmp.macbookaircomparisonbtn();
		Thread.sleep(2000);
		thrpdcmp.successprdtCmpsmsg();
		Thread.sleep(3000);
		
		
		
	}

	
}
