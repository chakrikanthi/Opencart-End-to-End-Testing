package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_SC_008Updatingquantityofprdctinshopcart extends Baseclass {
	@Test
	public void verify_updatingthequanityinshoppingcart() throws InterruptedException
	{
		HPLP3065 HP= new HPLP3065(driver);
		HP.searchbox("HP LP3065");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    HP.searchIcon();
	    Thread.sleep(3500);
	    HP.hPLP3065();
	    HP.addtocartbtn();
	    Thread.sleep(3500);
	    HP.successmsgshoppingCart();
	    Thread.sleep(4000);
	    HP.quantitycolumn("2");
	    Thread.sleep(4500);
	    HP.clickupdateicon();
	    Thread.sleep(4500);
	   String Successmessage= HP.successmsgafterqtyupdate();
	   System.out.println(Successmessage);
	   
	   /*if(Successmessage.equals("Success: You have modified your shopping cart!"))
	   {
		   System.out.println("Quantity is updated successfully..");
	   }
	   */
	}

}
