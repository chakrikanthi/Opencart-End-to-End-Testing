package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.ProductComparison;
import testBase.Baseclass;

public class TC_010_ProductComparisonTestTest extends Baseclass{
  @Test(groups={"regression","master"})
  public void Verify_ProductComparison() throws InterruptedException 
  {
	  Homepage hp= new Homepage(driver);
	  ProductComparison prdcomp= new ProductComparison(driver);
	  prdcomp.searchbox("macbook air");
	  prdcomp.searchIcon();
	  prdcomp.macBookAir();
	  Thread.sleep(2000);
	 
	  prdcomp.comparebutton();
	  Thread.sleep(2000);
	  prdcomp.productComparison();
	  Thread.sleep(2000);
	  
	  
  }
}
