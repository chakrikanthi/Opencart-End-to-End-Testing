package testCases;

import org.testng.annotations.Test;

import pageObjects.Specialoffers;
import testBase.Baseclass;

public class TC_SPO_005ValidatingGRIDviewinSpecialoffersPg extends Baseclass {
	@Test
	public void ValidatingGRIDviewinSpecialoffersPg() throws InterruptedException {
		Specialoffers sp=new Specialoffers(driver);
		sp.specialsfromfooter();
		Thread.sleep(2000);
		sp.gridviewoption();
		System.out.println(driver.getTitle());

}
}