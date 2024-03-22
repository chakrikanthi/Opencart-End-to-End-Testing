package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Validatingthereviewtab extends Basepage{

	public Validatingthereviewtab(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[normalize-space()='Write a review']")  
	WebElement writeAReviewlink;
	
	public void Reviewlink()
	{
		writeAReviewlink.click();
	}
	
	@FindBy(xpath="//input[@id='input-name']") 
    WebElement yourName;
	
	public void setName(String Name)
	{
		yourName.clear();
		yourName.sendKeys(Name);
	}
	
	@FindBy(xpath="//textarea[@id='input-review']") 
	WebElement yourReview;
	
	public void reviewtext(String WriteReview)
	{
		yourReview.clear();
		yourReview.sendKeys(WriteReview);
	}
	
	@FindBy(xpath="//input[@value='4']")  
	WebElement rating;
	
	public void SetRating()
	{
		rating.click();
	}
	
	@FindBy(xpath="//button[@id='button-review']") 
	WebElement continuebtn;
	
	public void continuebtn()
	{
		continuebtn.click();
	}
	
	@FindBy(xpath="//p[normalize-space()='There are no reviews for this product.']")
	WebElement ZeroReviewsmsg;
	//there are zero reviews
	
	public String Zeroreviewmsg()
	{			try {
				return (ZeroReviewsmsg.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}
			
	}
	
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") 
	WebElement warningReviewMSG;
	
	//if the review text is less than 25 characters
	public String warningmsg() {
		try {
			return (warningReviewMSG.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
		
	}
		
		//warning message alert without filling mandatory fields
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")  
	WebElement reviewfieldsmandatorywarnmsg;
		
		public String mandatoryfieldsnotfilled() {
			try {
				return (reviewfieldsmandatorywarnmsg.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}
			
		}
	
	
}
