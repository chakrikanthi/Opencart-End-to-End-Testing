package testCases;

import org.testng.annotations.Test;

import pageObjects.SearchboxandIcon;
import testBase.Baseclass;

public class TC_26_Relatedprctsinproductdisplaypg extends Baseclass{
	@Test
	public void verify_relatedproducts() throws InterruptedException
	{
		SearchboxandIcon srcbox= new SearchboxandIcon(driver);
		srcbox.searchbox("imac");
		srcbox.searchIcon();
		srcbox.imac();
		Thread.sleep(3500);
		srcbox.relatedproduct();
		Thread.sleep(3500);
	}

}
