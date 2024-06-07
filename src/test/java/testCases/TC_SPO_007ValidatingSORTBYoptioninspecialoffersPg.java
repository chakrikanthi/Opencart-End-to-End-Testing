package testCases;

import org.testng.annotations.Test;

import pageObjects.Specialoffers;
import testBase.Baseclass;

public class TC_SPO_007ValidatingSORTBYoptioninspecialoffersPg extends Baseclass {
	@Test
	public void ValidatingSORTBYoptioninspecialoffersPg() throws InterruptedException {
		Specialoffers sp=new Specialoffers(driver);
		sp.specialsfromfooter();
		Thread.sleep(2000);
		sp.sortBy();
		System.out.println(driver.getTitle());
		System.out.println("Products are sorted by  highest rating");

	}
}
