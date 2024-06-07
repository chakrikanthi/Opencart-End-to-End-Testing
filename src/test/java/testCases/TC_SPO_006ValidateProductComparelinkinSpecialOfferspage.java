package testCases;

import org.testng.annotations.Test;

import pageObjects.Specialoffers;
import testBase.Baseclass;

public class TC_SPO_006ValidateProductComparelinkinSpecialOfferspage extends Baseclass{
	@Test
	public void ValidateProductComparelinkinSpecialOfferspage() throws InterruptedException {
		Specialoffers sp=new Specialoffers(driver);
		sp.specialsfromfooter();
		Thread.sleep(2000);
		sp.productComparelink();
		System.out.println(driver.getTitle());

}
}