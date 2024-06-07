package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCertificate extends Basepage{
	public WebDriver driver;
	 
	public GiftCertificate(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//a[normalize-space()='Use Gift Certificate']") 
	WebElement useGiftCertificate;
	
	public void useGiftCertificate() {
		useGiftCertificate.click();
	}
	
	@FindBy(xpath="//input[@id='input-voucher']")
	WebElement enterYourGiftCertificateCo;
	
	public void enterYourGiftCertificateCo(String gvoucher) {
		enterYourGiftCertificateCo.sendKeys(gvoucher);
	}
	
	@FindBy(xpath="//input[@id='button-voucher']") 
	WebElement applyGiftCertificatebtn;
	
	public void applyGiftCertificatebtn() {
		applyGiftCertificatebtn.click();
	}
	
	@FindBy(xpath="//div[contains(text(),'Warning: Gift Certificate is either invalid or the')]") 
	WebElement warningGiftCertificateMSG;
	
	public String warningGiftCertificateMSG() {
		return warningGiftCertificateMSG.getText();
	}
	@FindBy(xpath="//body/div[@id='checkout-cart']/div[1]") 
	WebElement warningPleaseEnterAGiftCert;
	public String warningPleaseEnterAGiftCert() {
		return warningPleaseEnterAGiftCert.getText();
	}
	
	
	
}
