package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HPLP3065 extends Basepage{

	public HPLP3065(WebDriver driver) {
		super(driver);
		
	}@FindBy(xpath="//input[@placeholder='Search']")  
	WebElement searchbox;
	
	public void searchbox(String srchtxt) 
	{
		//searchbox.clear();
		searchbox.sendKeys(srchtxt);
		
	}
	
	@FindBy(xpath="//i[@class='fa fa-search']") 
	WebElement searchIcon;
	public void  searchIcon()
	{
		searchIcon.click();
	}

	      //product search result for HP LP3065
			@FindBy(xpath="//div[@class='caption']//a[contains(text(),'HP LP3065')]") 
			WebElement hPLP3065;
			
			public void hPLP3065()
			{
				hPLP3065.click();
			}
			
			/*@FindBy(xpath="//span[normalize-space()='Add to Cart']")  
			WebElement addToCarticoninsrcpg;
			
			public void addtocarticoninsrcpg()
			{
				addToCarticoninsrcpg.click();
			}
			*/
			@FindBy(xpath="//button[@id='button-cart']") 
			WebElement addToCartbtn;
			
			public void addtocartbtn()
			{
				addToCartbtn.click();	
			}
			//Black shopping cart next to search box
			@FindBy(xpath="//span[@id='cart-total']")  
			WebElement addtocarttogglebox;
			public void addtocarttogglebox()
			{
				addtocarttogglebox.click();
			}
			
			// View cart in black togglebox shopping cart
			@FindBy(xpath="//strong[normalize-space()='View Cart']") 
			WebElement ViewcartBlackShopcart;
			
			public void ViewcartBlackShopcart()
			{
				ViewcartBlackShopcart.click();;
			}
			
			// check out in Black toggle box
			@FindBy(xpath="//strong[normalize-space()='Checkout']") 
			WebElement checkoutinBlackshopcart;
			
			public void checkoutinBlackshopcart()
			{
				checkoutinBlackshopcart.click();
			}
			
			
			@FindBy(xpath="//img[@class='img-thumbnail']")  
			WebElement hPLPimgintogglebox;
			public void hPLPimgintogglebox()
			{
				hPLPimgintogglebox.click();
			}
			
			@FindBy(xpath="//td[@class='text-left']//a[contains(text(),'HP LP3065')]") 
			WebElement hPLPprdctnameintogglebox;
			
			public void hPLPprdctnameintogglebox()
			{
				hPLPprdctnameintogglebox.click();
			}
			
			// shopping cart link in successmsg
			
			@FindBy(xpath="//a[normalize-space()='shopping cart']") 
			WebElement successmsgshoppingCart;
			
			public void successmsgshoppingCart()
			{
				successmsgshoppingCart.click();
			}
			
			// weight of the product---"Shopping Cart  (1.00kg)"
			
			@FindBy(xpath="//h1[contains(text(),'Shopping Cart')]")  
			WebElement weightofHPLP3065;
			
			public String weightofHPLP3065() {
				try {
					
					return (weightofHPLP3065.getText());
					
				} catch (Exception e) {
					return (e.getMessage());

				}
			}
			
			// quantity column in displayed shopping cart page
			
			//@FindBy(xpath="(input[value='1'][name='quantity[110562]']")
			//@FindBy(xpath="//td//div/input[@name='quantity[110562]']")
			//@FindBy(xpath="//td//div/input[@name='quantity[110574]'][contains(@size,'1')][1]") 
			//@FindBy(xpath="//td//div/input[@name='quantity[110574]'][1][1][@class='form-control']")
			@FindBy(xpath="//input[@value='1']") 
			WebElement quantitycolumn;
			
			public void quantitycolumn(String NUM)
			{
				quantitycolumn.click();
				quantitycolumn.clear();
				quantitycolumn.sendKeys(NUM);
			}
			
			// update button in shopping cart page
			@FindBy(xpath="//i[@class='fa fa-refresh']")
			WebElement updateicon;
			
			public void clickupdateicon()
			{
				updateicon.click();
			}
			// success message after updating the quantity..
			@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
			WebElement successmsgafterqtyupdate;
			
			public String successmsgafterqtyupdate()

			{					try {
						return (successmsgafterqtyupdate.getText());
					} catch (Exception e) {
						return (e.getMessage());

					}
			}
			
			// shopping cart empty after entering negative or zero value and updating it in shopping cart
			@FindBy(xpath="//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]") 
			WebElement negativeqntyupdatemsg;
			
			public String negativeqntyupdatemsg()

			{					try {
						return (negativeqntyupdatemsg.getText());
					} catch (Exception e) {
						return (e.getMessage());

					}
			}
			
			// remove icon in shopping cart page
			@FindBy(xpath="//button[@class='btn btn-danger']") 
			WebElement Removeicon;
			
			public void Removeicon()
			{
				Removeicon.click();
			}
			
			//breadcrum
			@FindBy(xpath="//ul[@class='breadcrumb']") 
			WebElement breadcrumbshoppingCart;
			
}
