package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.HPLP3065;
import pageObjects.couponcode;
import testBase.Baseclass;

public class TC_SC_014_Validatinginvalidcouponcode extends Baseclass {
	@Test
	
	public void Validatinginvalidcouponcode() throws InterruptedException {
		HPLP3065 HP= new HPLP3065(driver);
		HP.searchbox("HP LP3065");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    HP.searchIcon();
	    Thread.sleep(1500);
	    HP.hPLP3065();
	    HP.addtocartbtn();
	    Thread.sleep(1500);
	    HP.successmsgshoppingCart();
	    couponcode cc= new couponcode(driver);
	    cc.useCouponCode();
	    cc.enterYourCouponHere("xyz");
	    cc.applyCouponbtb();
	    System.out.println("Invalid coupon warning msg:"+cc.Couponwarningmsg());
	    
		
	}

}
