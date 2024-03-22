package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_SC_005ViewcartoptinshopcartTogglebox extends Baseclass{
	@Test
	public void verify_viewcartinToggleshopcart() throws InterruptedException
	{
		HPLP3065 HP= new HPLP3065(driver);
		HP.searchbox("HP LP3065");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    HP.searchIcon();
	    Thread.sleep(3500);
	    HP.hPLP3065();
	    HP.addtocartbtn();
	    Thread.sleep(3500);
	    HP.addtocarttogglebox();
	    Thread.sleep(3500);
	    HP.ViewcartBlackShopcart();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));(WHEN I use this after it finds the element , it's closing immediately.. not waiting for remaining seconds after it finds the element)
	    Thread.sleep(3500);
	}

}
