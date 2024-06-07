package testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Minimumquantityset;
import pageObjects.Specialoffers;
import testBase.Baseclass;

public class TC_SPO_009AddingProducttoCartfromSpecialOffersPg extends Baseclass{
	@Test
	public void ValidatingShowFieldOption() throws InterruptedException, IOException, AWTException {
		Specialoffers sp=new Specialoffers(driver);
		sp.specialsfromfooter();
		Thread.sleep(2000);
		sp.Applecinema30addToCart();
		Minimumquantityset mnmqty= new Minimumquantityset(driver);
		Thread.sleep(2000);
    	mnmqty.smallradiobutton();
	    Thread.sleep(2000);
		//mnmqty.checkbox3option();
		mnmqty.checkbox4option();
		Thread.sleep(2000);
		mnmqty.textbox("Sample text for testing");
		Thread.sleep(2000);
		//mnmqty.Bluecoloroption();
		mnmqty.Bluecoloroption();
		Thread.sleep(2000);
		mnmqty.textarea("this is a sample text for running the test through testng");
		mnmqty.uploadFile();
	    
		Thread.sleep(9000);
		mnmqty.dateoption();
		logger.info("Date 23 is selected");
		Thread.sleep(5000);
		mnmqty.timeoption();
		logger.info("Time 22:25 is selected");
		Thread.sleep(7000);
		mnmqty.dateandTimeoption();
		Thread.sleep(6000);
		mnmqty.qtybox("2");//This test will pass even if we change to quantity  25 because as this product is out of stock it was displaying danger alert message just like "product has minimum qnty of 2"..this xpath is same for both alert messages
		//mnmqty.qtybox("25");
		Thread.sleep(4000);
		mnmqty.addToCartbutton();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
}

}
