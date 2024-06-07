package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_SC_009_Enteringnegativeqntynupdate extends Baseclass {

	@Test
	
		public void verify_Enteringnegativeqntynupdate() throws InterruptedException {
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
		    HP.quantitycolumn("-2");
		    Thread.sleep(4500);
		    HP.clickupdateicon();
		    Thread.sleep(4500);
		   System.out.println(HP.negativeqntyupdatemsg());
			
			
		}

	

}
