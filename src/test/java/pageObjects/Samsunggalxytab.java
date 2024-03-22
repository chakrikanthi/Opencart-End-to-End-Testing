package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Samsunggalxytab extends Basepage {

	public Samsunggalxytab(WebDriver driver) {
		super(driver);
		
	}

	// product Samsung galaxy tab
			@FindBy(xpath="//a[normalize-space()='Samsung Galaxy Tab 10.1']") 
			WebElement samsungGalaxyTab10;
			
			public void samsungGalaxyTab10()
			{
				samsungGalaxyTab10.click();
			}
			
			@FindBy(xpath="//a[normalize-space()='Write a review']") 
			WebElement writeAReviewtab;
			
			public void reviewtab()
			{
				writeAReviewtab.click();
			}
			
	@FindBy(xpath="//a[normalize-space()='0 reviews']")  
	WebElement zeroReviewstab;
	
	public void clickzeroreviewtab()
	{
		zeroReviewstab.click();
	}
	
	
	
	@FindBy(xpath="//p[normalize-space()='There are no reviews for this product.']") 
	WebElement thereAreNoReviewsmsg;
	
			
		public String warningmsgdisplayed() {
			try {
				return (thereAreNoReviewsmsg.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}
	}


		

		
}
