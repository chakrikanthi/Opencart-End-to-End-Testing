package testCases;
import org.testng.annotations.Test;

import pageObjects.Specialoffers;
import testBase.Baseclass;

public class TC_SPO_002SpecialoffersPgfromSiteMapPg  extends Baseclass{
	@Test
	public void SpecialoffersPgfromSiteMapPg()  {
		
		Specialoffers SO= new Specialoffers(driver);
		SO.siteMapfromfooter();
		SO.specialOffersinsitemap();
		String presentpage=driver.getTitle();
		if(presentpage.equals("Special Offers")) {
			System.out.println("Test got passed ...user is in Special Offers page thru site map footer tab ");
		}

}
}