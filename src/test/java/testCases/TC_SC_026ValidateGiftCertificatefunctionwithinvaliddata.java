package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.GiftCertificate;
import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_SC_026ValidateGiftCertificatefunctionwithinvaliddata extends Baseclass {
	@Test
	public void ValidateGiftCertificatefunctionwithinvaliddata() throws InterruptedException {
		HPLP3065 HP= new HPLP3065(driver);
		HP.searchbox("HP LP3065");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HP.searchIcon();
		Thread.sleep(1500);
		HP.hPLP3065();
		HP.addtocartbtn();
		Thread.sleep(1500);
		HP.successmsgshoppingCart();
		
		GiftCertificate GC= new GiftCertificate(driver);           
		GC.useGiftCertificate();
		GC.enterYourGiftCertificateCo("xyz");
		GC.applyGiftCertificatebtn();
		String Warningmsg=GC.warningGiftCertificateMSG();
		System.out.println(Warningmsg);
		if (Warningmsg.equals(" Warning: Gift Certificate is either invalid or the balance has been used up!")) {
			System.out.println("You have entered invalid gift certificate");
		}
		
	}

}
