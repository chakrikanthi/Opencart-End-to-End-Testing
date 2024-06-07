package testCases;

import org.testng.annotations.Test;

import pageObjects.Giftcertificates;
import testBase.Baseclass;

public class TC_GC_001ValidatingGiftcardfootertab extends Baseclass {
	@Test
	public void submittingenquiryafterloggedin()  {
		Giftcertificates GC= new Giftcertificates(driver);
		GC.giftCertificatesfootertab();
      String currentpage= driver.getTitle();
      if(currentpage.equals("Purchase a Gift Certificate")) {
    	  System.out.println("You landed in the right page:"+currentpage);
      } else
      {
    	  System.out.println("You landed in the Wrong page");
      }

}
}
