package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Specialoffers extends Basepage {

	public Specialoffers(WebDriver driver) {
		super(driver);
		
	}
//Specials from footer
	@FindBy(xpath="//a[normalize-space()='Specials']") 
	WebElement specialsfromfooter;
	
	public void specialsfromfooter() {
		specialsfromfooter.click();
	}
	
	//sitemap from footer
	@FindBy(xpath="//a[normalize-space()='Site Map']")
	WebElement siteMapfromfooter;
	
	public void siteMapfromfooter() {
		siteMapfromfooter.click();
	}
	//special offers in sitemap
	@FindBy(xpath="//a[normalize-space()='Special Offers']")
	WebElement specialOffersinsitemap;
	
	public void specialOffersinsitemap() {
		specialOffersinsitemap.click();
			}
	
	//special offer products
	@FindBy(xpath="//p[contains(text(),'The 30-inch Apple Cinema HD Display delivers an am')]") 
	WebElement Applecinema30;
	
	public void Applecinema30isdisplayed() {
		Applecinema30.isDisplayed();
			}
	//canonEOS5D
	@FindBy(xpath="//a[normalize-space()='Canon EOS 5D']")
	WebElement canonEOS5D;
	
	public void canonEOS5Disdisplayed() {
		canonEOS5D.isDisplayed();
			}
	public void canonEOS5Dlinkforproduct() {
		canonEOS5D.click();
			}
	//List view option
	@FindBy(xpath="//button[@id='list-view']")
	WebElement listviewoption;
	
	public void listviewoption() {
		listviewoption.click();
			}
	
	//Grid view option
	@FindBy(xpath="//button[@id='grid-view']//i") 
	WebElement gridviewoption;
	public void gridviewoption() {
		gridviewoption.click();
			}
	
	//Product compare link
	@FindBy(xpath="//a[@id='compare-total']") 
	WebElement productComparelink;
	
	public void productComparelink() {
		productComparelink.click();
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
	
	//Apple cinema 30" add to cart option
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]") 
	WebElement Applecinema30addToCart;
	public void Applecinema30addToCart() {
		Applecinema30addToCart.click();
			}
	
	//Canon EOS 5D
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[1]") 
	WebElement CanonEOS5DaddToCart;
	public void CanonEOS5DaddToCart() {
		CanonEOS5DaddToCart.click();
			}
	@FindBy(xpath="//button[@id='button-cart']")  WebElement CannonaddToCartinproductpage;
	public void CannonaddToCartinproductpage() {
		CannonaddToCartinproductpage.click();
			}
	
	//apple cinema 30' add to wishlist
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[2]/i[1]") 
	WebElement appleaddtoWishlist;
	public void appleaddtoWishlist() {
		appleaddtoWishlist.click();
			}
	//Wishlist success message
		@FindBy(xpath="//div[contains(text(),'Success: You have added')]") 
		WebElement WishlistsuccesmessageApple;
		public String WishlistsuccesmessageApple() {
			return WishlistsuccesmessageApple.getText();
		}
	
	//Canon EOS 5D add to wishlist 
		@FindBy(xpath="//div[@id='content']//div//div[2]//div[1]//div[2]//div[2]//button[2]")
	WebElement CanonaddtoWishlist;
	public void CanonaddtoWishlist() {
		CanonaddtoWishlist.click();
			}
	
	@FindBy(xpath="//div[contains(text(),'Success: You have added')]") 
	WebElement wishlistsuccessmsgofCanon;
	public String wishlistsuccessmsgofCanon() {
		return wishlistsuccessmsgofCanon.getText();
	}
	
	
	//Compare icon in apple cinema 30'
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[3]/i[1]") 
	WebElement applecinema30comparethisprdct;
	
	public void applecinema30comparethisprdct() {
		applecinema30comparethisprdct.click();
			}
	//Compare icon success messgae for Apple cinema 30'
	@FindBy(xpath="//div[contains(text(),'Success: You have added')]") 
	WebElement comparesuccessmsgApple;
	public String comparesuccessmsgApple() {
		return comparesuccessmsgApple.getText();
			}
	//Apple cinema 30 icon present in product comparsion table
	@FindBy(xpath="//td[normalize-space()='Product 15']") 
	WebElement AppleimagepresentinProductcomparisontable;
	public boolean AppleimagepresentinProductcomparisontable() {
		return AppleimagepresentinProductcomparisontable.isDisplayed();
	}
	
	// compare icon in canon EOS 5D
	
	@FindBy(xpath="//div[@id='content']//div//div[2]//div[1]//div[2]//div[2]//button[3]") 
	WebElement canoniconcomparethisprdct;
	public void canoniconcomparethisprdct() {
		canoniconcomparethisprdct.click();
			}
	//Compare icon success message for Canon EOS 5D
	@FindBy(xpath="//div[contains(text(),'Success: You have added')]") 
	WebElement ComparesuccessmsgCanon;
	public String ComparesuccessmsgCanon() {
		return ComparesuccessmsgCanon.getText();
			}
	//Canon present in product comparison table
	@FindBy(xpath="//tbody/tr[2]/td[1]") 
	WebElement canoniconimagepresentinComparisontable;
	public boolean canoniconimagepresentinComparisontable() {
		return canoniconimagepresentinComparisontable.isDisplayed();
	}
	
	//canon thumb nail
	@FindBy(xpath="//img[@title='Canon EOS 5D']") 
	WebElement canonEOS5Dthumbnail;
	public void canonEOS5Dthumbnail() {
		canonEOS5Dthumbnail.click();
			}
	//Original  price of Apple cinema 30'
	//@FindBy(xpath="//div[@id='content']//div[1]//form[1]//div[1]//div[2]//div[1]//div[1]//span[2]") 
	//WebElement OriginalpriceofApplecinema30;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/p[2]/span[2]") 
	WebElement OriginalpriceofApplecinema30 ;
	
	public String OriginalpriceofApplecinema30() {
		return OriginalpriceofApplecinema30.getText();
			}
	
	//Offer price of Applecinema30
	@FindBy(xpath="//span[normalize-space()='$110.00']")  
	WebElement OfferpriceofApplecinema30;
	public String OfferpriceofApplecinema30() {
		return OfferpriceofApplecinema30.getText();
			}
	
	
	//Actual price of CanonEOS
	@FindBy(xpath="//div[@id='content']//div[1]//form[1]//div[1]//div[2]//div[1]//div[1]//span[2]")
	WebElement ActualPriceofCanonEOS;
	
	public String ActualPriceofCanonEOS() {
		return ActualPriceofCanonEOS.getText();
			}
	
	//Offer price of CanonEOS
	@FindBy(xpath="//span[normalize-space()='$98.00']")  
	WebElement OfferpriceofCanonEOS;
	public String OfferpriceofCanonEOS() {
		return OfferpriceofCanonEOS.getText();
			}
	//wISHLIST ICON
	@FindBy(xpath="//a[@id='wishlist-total']//i") 
	WebElement wishListICON;
	public void wishListICON() {
		wishListICON.click();
	}
	
	//Verifying canon EOS added successfully to wishlist
	@FindBy(xpath="//a[normalize-space()='Canon EOS 5D']")  
	WebElement canonEOS5Dispresent;
	
	public boolean canonEOS5Dispresent() {
		return canonEOS5Dispresent.isDisplayed();
	}
	
	@FindBy(xpath="//td[normalize-space()='Product 15']")  
	WebElement Applecinema30ispresent;
	
	
		public boolean Applecinema30ispresent() {
			return Applecinema30ispresent.isDisplayed();
		}
	//product comparison link from success msg
		@FindBy(xpath="//a[normalize-space()='product comparison']") 
		WebElement productComparison;
		public void productComparison() {
			productComparison.click();
		}
		
		//appleCinema30thumbnail
		
		@FindBy(xpath="//img[@title='Apple Cinema 30']")  
		WebElement appleCinema30thumbnail;
		public void appleCinema30thumbnail() {
			appleCinema30thumbnail.click();
		}
		
		//Canon eos display page
		@FindBy(xpath="//h1[normalize-space()='Canon EOS 5D']")
		WebElement canonEOS5Display;
		
		public String canonEOS5Display() {
			return canonEOS5Display.getText();
		}
		}
