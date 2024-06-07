package pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EstimateShippingTaxes extends Basepage {
	 public WebDriver driver;
	 
	   public EstimateShippingTaxes(WebDriver driver) {
		super(driver);
		
	}
	   @FindBy(xpath="//a[normalize-space()='Estimate Shipping & Taxes']") 
	   WebElement estimateShippingTaxes;
	   
	   public void estimateShippingTaxes() {
		   estimateShippingTaxes.click();
	   }
	   
	   @FindBy(xpath="//select[@id='input-country']") 
	   WebElement country;
	   
	   public void country(String cname)
	   {
		   country.sendKeys(cname);
	   }
	   
	   @FindBy(xpath="//select[@id='input-zone']") 
       WebElement State;
	   public void State(String Sname)
	   {
		   State.sendKeys(Sname);
	   }

	   @FindBy(xpath="//input[@id='input-postcode']") 
	   WebElement postCode;
	   public void postCode(String pcode)
	   {
		   postCode.sendKeys(pcode);
	   }
	

	   @FindBy(xpath="//button[@id='button-quote']") 
	   WebElement getQuotes;
	   public void getQuotes() {
		   getQuotes.click();
	   }
	   @FindBy(xpath="//input[@name='shipping_method']") 
	   WebElement shippingRateBtn;
	   
	   public void shippingRateBtn() {
		   shippingRateBtn.click();
	   }
	   //alert buttons
	   @FindBy(xpath="//input[@id='button-shipping']")
	   WebElement applyShippingbtn;
	   
	   public void applyShippingbtn() {
		   applyShippingbtn.click();
	   }
	   @FindBy(xpath="//h4[contains(text(),'Please select the preferred shipping method to use')]") 
	   WebElement pleaseSelectThePreferredSh;
	   public String Alertboxtext() {
		   return pleaseSelectThePreferredSh.getText();
		   
	   }
	   
	   @FindBy(xpath="//button[normalize-space()='Cancel']") 
	   WebElement cancelbtn;
	   public void cancelbtn() {
		   cancelbtn.click();
	   }
	   
	   @FindBy(xpath="//body/div[@id='checkout-cart']/div[1]") 
       WebElement successShippingEstimatmsg;
	  
	   
	   public String successShippingEstimatmsg() {
		   try {
			   String msg=successShippingEstimatmsg.getText();
			   return msg;
			} catch (Exception e) {
				return (e.getMessage());

		  
	   }}
	  //Error message when u didn't select country or state 
	   
	   @FindBy(xpath="//div[normalize-space()='Please select a country!']")
	   WebElement pleaseSelectACountryerrmsg;


	   public String pleaseSelectACountryerrmsg() {
		   return pleaseSelectACountryerrmsg.getText();
	   }
	   
	   @FindBy(xpath="//div[normalize-space()='Please select a region / state!']") 
	   WebElement pleaseSelectARegionStateerrmsg;

	   public String pleaseSelectARegionStateerrmsg() {
		   return pleaseSelectARegionStateerrmsg.getText();
	   }
	   
	   
	   
}
