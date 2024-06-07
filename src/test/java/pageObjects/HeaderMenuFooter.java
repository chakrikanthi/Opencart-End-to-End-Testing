package pageObjects;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class HeaderMenuFooter extends Basepage {

	public HeaderMenuFooter(WebDriver driver) {
		super(driver);

	}

	//contact us phone icon
	@FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=information/contact']//i") 
	WebElement phoneicon;
	public void phoneicon() {
		phoneicon.click();
	}

	//contact number corect
	@FindBy(xpath="//span[normalize-space()='123456789']")  
	WebElement correctcontactnodisplay;
	
	public String correctcontactnodisplay() {
		return correctcontactnodisplay.getText();
	}
	public boolean phoneiconisDisplayed() {
		return phoneicon.isDisplayed();
	}

	//Currency Header option
	@FindBy(xpath="//span[normalize-space()='Currency']")  
	WebElement currencyheaderoption;
	public void currencyheaderoption() {
		currencyheaderoption.click();
	}


	public boolean currencyheaderoptionisdisplayed() {
		return currencyheaderoption.isDisplayed();
	}

	// black cartbutton 
	@FindBy(xpath="//span[@id='cart-total']") 
	WebElement blackcartbtn;
	public void blackcartbtn() {
		blackcartbtn.click();
	}

	// iphone remove icon from shopping cart page
	@FindBy(xpath="//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/table[1]/tbody[1]/tr[1]/td[5]/button[1]") 
	WebElement RemoveiPhonefromshoppingcart;
	public void RemoveiPhonefromshoppingcart() {
		RemoveiPhonefromshoppingcart.click();
	}


	//About us footer
	@FindBy(xpath="//a[normalize-space()='About Us']")
	WebElement aboutUsfooter;
	public void aboutUsfooter() {
		aboutUsfooter.click();
	}
	
	public boolean aboutusdisplay() {
		return aboutUsfooter.isDisplayed();
	}
	

	//Delivery Information footer
	@FindBy(xpath="//a[normalize-space()='Delivery Information']") 
	WebElement deliveryInformationfooter;
	public String deliveryInformationfooter() {
		deliveryInformationfooter.click();
		return deliveryInformationfooter.getText();
	}
	public boolean deliveryInformationfooterdisplayed() {
		return deliveryInformationfooter.isDisplayed();
	}

	//Privacy policy
	@FindBy(xpath="//body//footer//div//div//div//ul//li//a[contains(text(),'Privacy Policy')]") 
	WebElement privacyPolicy;
	public String privacyPolicyclicking() {
		privacyPolicy.click();
		return privacyPolicy.getText();
	}
	public boolean privacyPolicydisplayed() {
		return privacyPolicy.isDisplayed();
	}
	//Terms and conditions
	@FindBy(xpath="//body//footer//div//div//div//ul//li//a[contains(text(),'Terms & Conditions')]") 
	WebElement termsnConditions;
	public String termsnConditions() {
		termsnConditions.click();
		return termsnConditions.getText();
	}
	public boolean termsnConditionsdisplayed() {
		return termsnConditions.isDisplayed();
	}

	//Brands footer link
	@FindBy(xpath="//a[normalize-space()='Brands']")  
	WebElement brandsfooterlink;
	public void brandsfooterlinkclick() {
		brandsfooterlink.click();
	}
	public boolean brandsfooterlinkdisplayed() {
		return brandsfooterlink.isDisplayed();
	}

	public String brandsfooterlinkgettext() {
		return brandsfooterlink.getText();
	}
	//Apple Brand in Brands page
	@FindBy(xpath="//a[normalize-space()='Apple']")  
	WebElement applebrand;

	public void applebrandclick() {
		applebrand.click();
	}
	public boolean applebranddisplayed() {
		return applebrand.isDisplayed();
	}

	public String applebrandgettext() {
		return applebrand.getText();
	}

	//Sony Brand in Brands page
	@FindBy(xpath="//a[normalize-space()='Sony']")  
	WebElement sonyBrand;
	public void sonyBrandclick() {
		sonyBrand.click();
	}
	public boolean sonyBranddisplayed() {
		return sonyBrand.isDisplayed();
	}

	public String sonyBrandgettext() {
		return sonyBrand.getText();
	}
	//HTC Brand in brand display page
	@FindBy(xpath="//a[normalize-space()='HTC']")  
	WebElement hTCBrand;
	public void hTCBrandclick() {
		hTCBrand.click();
	}
	public boolean hTCBranddisplayed() {
		return hTCBrand.isDisplayed();
	}

	public String hTCBrandgettext() {
		return hTCBrand.getText();
	}

	//List view option in sony brand page
	@FindBy(xpath="//button[@id='list-view']//i")  
	WebElement sonylistviewopt;

	public void sonylistviewopt() {
		sonylistviewopt.click();
	}

	//Grid view option of apple products in apple brand page
	@FindBy(xpath="//button[@id='grid-view']")  
	WebElement Applegridview;
	public void Applegridview() {
		Applegridview.click();
	}
//Apple LIST VIEW
	@FindBy(xpath="//button[@id='list-view']//i") 
	WebElement Applelistview;
	public void Applelistview() {
		Applelistview.click();
	}
	//Product compare icon of imac
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[3]") 
	WebElement imacproductcomparelink;
	public void imacproductcomparelink() {
		imacproductcomparelink.click();
	}

	//Product comparison link from successmessage
	@FindBy(xpath="//a[normalize-space()='product comparison']")
	WebElement productComparisonlink;
	public void productComparisonlink() {
		productComparisonlink.click();
	}
	//Ipod classic add to cart option
	@FindBy(xpath="//div[4]//div[1]//div[2]//div[2]//button[1]//span[1]")
	WebElement ipodaddToCart;
	public void ipodaddToCart() {
		ipodaddToCart.click();
	}

	//successs message after adding ipod classic to cart
	@FindBy(xpath="//div[contains(text(),'Success: You have added')]")  
	WebElement successmsgYouHaveAddedIPodC;
	public String successmsgYouHaveAddedIPodC() {
		return successmsgYouHaveAddedIPodC.getText();
	}
	public boolean successmsgYouHaveAddedIPodCisdisplayed() {
		return successmsgYouHaveAddedIPodC.isDisplayed();
	}
	//Shopping cart link from success msg
	@FindBy(xpath="//a[normalize-space()='shopping cart']") 
	
	WebElement Shoppingcartlinkfromsuccmsg;
	

	public void Shoppingcartlinkfromsuccmsg() {
		Shoppingcartlinkfromsuccmsg.click();
	}

	//Adding ipod shuffle to wishlist
	@FindBy(xpath="//div[6]//div[1]//div[2]//div[2]//button[2]//i[1]")  
	WebElement ipodshuffleaddToWishlist;
	public void ipodshuffleaddToWishlist() {
		ipodshuffleaddToWishlist.click();
	}

	//Wishlist success message
	@FindBy(xpath="//div[contains(text(),'Success: You have added')]")
	WebElement successAddedIPodStoWishlist;
	public String successAddedIPodStoWishlist() {
		return successAddedIPodStoWishlist.getText();
	}
	public boolean successAddedIPodStoWishlistdisplayed() {
		return successAddedIPodStoWishlist.isDisplayed();
	}

	//Wishlist link from success msg
	
	@FindBy(xpath="//a[normalize-space()='wish list']") 
	WebElement wishListlinkfromSuccessmsg;
	public void wishListlinkfromSuccessmsg() {
		wishListlinkfromSuccessmsg.click();
	}

	//Mac book air for product comparison
	@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[2]/div[9]/div[1]/div[2]/div[2]/button[3]")  WebElement MacbookAirProductComparisoniconaddToCart;

	
	
	public void MacbookAirProductComparisonicon() {
		MacbookAirProductComparisoniconaddToCart.click();
	}

	//imac add to product comparison
	@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[3]/i[1]")  WebElement imacasaddToproductcomparison;
	//product comparison success msg
	@FindBy(xpath="//a[normalize-space()='product comparison']")  
	  
	WebElement macbookairproductcomparisonsuccessmdg;
	public String macbookairproductcomparisonsuccessmdgtext() {
		return macbookairproductcomparisonsuccessmdg.getText();
	}
	public boolean macbookairproductcomparisonsuccessmdgdisplayed() {
		return macbookairproductcomparisonsuccessmdg.isDisplayed();
	}

	//product comparison link from success msg
	@FindBy(xpath="//a[normalize-space()='product comparison']") 
	WebElement productComparisonlinkfromsUCCMSG;
	public void productComparisonlinkfromsUCCMSG() {
		productComparisonlinkfromsUCCMSG.click();
	}

	//PRODUCT THUMBNAIL OF IPOD NANO
	@FindBy(xpath="//img[@title='iPod Nano']") 
	WebElement iPodNanoTHUMBNAIL;
	public void iPodNanoTHUMBNAIL() {
		iPodNanoTHUMBNAIL.click();
	}

	//Ipod nano page
	@FindBy(xpath="//h1[normalize-space()='iPod Nano']") 
	WebElement iPodNanoPage;

	public String iPodNanoPage() {
		return iPodNanoPage.getText();
	}
	//Desktop Menu Options
	@FindBy(xpath="//a[normalize-space()='Desktops']")  
	WebElement desktops;

	@FindBy(xpath="//a[normalize-space()='Show AllDesktops']") 
	WebElement showAllDesktops;
	public void desktoptions() {
		desktops.click();
		showAllDesktops.click();
		
	}

	//Laptops&Notebooks menu options
	
	@FindBy(xpath="//a[normalize-space()='Laptops & Notebooks']") 
	WebElement laptopsNotebooksmenu;
	@FindBy(xpath="//a[normalize-space()='Show AllLaptops & Notebooks']") 
	WebElement showAllLaptopsNotebooks;

	public void laptopsNotebooksmenu() {
		laptopsNotebooksmenu.click();
		showAllLaptopsNotebooks.click();
	}

	//Components menu options
	@FindBy(xpath="//a[normalize-space()='Components']") 
	WebElement components;

	@FindBy(xpath="//a[normalize-space()='Show AllComponents']") 
	WebElement showAllComponents;
	public void components() {
		components.click();
		showAllComponents.click();
	}

	
	//Mp3 players menu
	@FindBy(xpath="//a[normalize-space()='MP3 Players']") 
	WebElement mP3Players;
	@FindBy(xpath="//a[normalize-space()='Show AllMP3 Players']") 
	WebElement showAllMP3Players;
	public void mP3Players() {
		mP3Players.click();
		showAllMP3Players.click();
	}

	//sort by
		@FindBy(xpath="//select[@id='input-sort']") 
		WebElement sortBy;
		public void sortBy() {
		Select sortByopt= new Select(sortBy);
		List<WebElement> Sortbylist= sortByopt.getOptions();
		
		for(WebElement option:Sortbylist) {
			System.out.println(option.getText());
		}
		sortByopt.selectByVisibleText("Rating (Highest)");
		}
		
	   //Show options
		
		@FindBy(xpath="//select[@id='input-limit']")  
		WebElement show;
		public void show() {
			Select showopt= new Select(show);
			List<WebElement> showlist= showopt.getOptions();
			
			for(WebElement option:showlist) {
				System.out.println(option.getText());
			}
			showopt.selectByVisibleText("50");
			}
		//CONTACT NUMBER FROM CONTACT US PAGE
		@FindBy(xpath="//div[@id='content']//div//div[2]") 
		WebElement contactnumfromContactuspage;
		
		public String contactnumfromContactuspage() {
			return contactnumfromContactuspage.getText();
		}

}
