package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_SC_010_Removingprdctfrshpcart extends Baseclass{
	@Test
	public void verify_Removingprdctfrshpcart() throws InterruptedException {
		HPLP3065 HP= new HPLP3065(driver);
		HP.searchbox("HP LP3065");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    HP.searchIcon();
	    Thread.sleep(1500);
	    HP.hPLP3065();
	    HP.addtocartbtn();
	    Thread.sleep(1500);
	    HP.successmsgshoppingCart();
	    HP.Removeicon();
	   System.out.println( HP.emptycartmsg());
	}

}
