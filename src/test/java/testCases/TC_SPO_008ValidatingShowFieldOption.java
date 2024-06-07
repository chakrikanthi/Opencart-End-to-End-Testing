package testCases;

import org.testng.annotations.Test;

import pageObjects.Specialoffers;
import testBase.Baseclass;

public class TC_SPO_008ValidatingShowFieldOption  extends Baseclass{
	@Test
	public void ValidatingShowFieldOption() throws InterruptedException {
		Specialoffers sp=new Specialoffers(driver);
		sp.specialsfromfooter();
		Thread.sleep(2000);
		sp.show();
		System.out.println(driver.getTitle());
		System.out.println("Number of products that are SHOW changed from 20 to 25");

}
}