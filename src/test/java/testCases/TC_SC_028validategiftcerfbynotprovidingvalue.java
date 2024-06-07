package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.GiftCertificate;
import pageObjects.HPLP3065;
import testBase.Baseclass;

public class TC_SC_028validategiftcerfbynotprovidingvalue extends Baseclass {

	@Test
	public void validategiftcerfbynotprovidingvalue() throws InterruptedException {
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
		GC.enterYourGiftCertificateCo("");
		GC.applyGiftCertificatebtn();
		String Emptytxtboxwrnmsg=GC.warningPleaseEnterAGiftCert();
		System.out.println(Emptytxtboxwrnmsg);

	}
}
//hplp-addacrt-> dont enter anything in giftcertificte and click on apply->following error msg should display
/* expected output:  Warning: Please enter a gift certificate code!
 
 
 actual output:
 Shopping Cart  (1.00kg)
Image Product Name Model Quantity Unit Price Total
HP LP3065
Delivery Date:2011-04-22
Reward Points: 300 Product 21
$122.00 $122.00
What would you like to do next?
Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.
Use Coupon Code
Estimate Shipping & Taxes
Use Gift Certificate
Enter your gift certificate code here

Sub-Total: $100.00
Eco Tax (-2.00): $2.00
VAT (20%): $20.00
Total: $122.00
Continue Shopping
Checkout
*/