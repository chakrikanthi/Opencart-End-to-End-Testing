package testCases;

import org.testng.annotations.Test;

import pageObjects.Specialoffers;
import testBase.Baseclass;

public class TC_SPO_004ValidatingLISTviewoptionofSpecialoffersPg extends Baseclass{
	@Test
	public void ValidatingLISTviewoptionofSpecialoffersPg() throws InterruptedException {
		Specialoffers sp=new Specialoffers(driver);
		sp.specialsfromfooter();
		Thread.sleep(2000);
		sp.listviewoption();
		System.out.println(driver.getTitle());
	}

}
