package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orderhistory extends Basepage{

	public Orderhistory(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//a[normalize-space()='View your order history']") 
	WebElement viewYourOrderHistoryfromLEFTcolumn;

	public void viewYourOrderHistoryfromLEFTcolumn() {
		viewYourOrderHistoryfromLEFTcolumn.click();
	}

	@FindBy(xpath="//div[@id='top-links']//a[normalize-space()='Order History']") 
	WebElement orderHistoryfromMYAccountDrpdown;
	public void orderHistoryfromMYAccountDrpdown() {
		orderHistoryfromMYAccountDrpdown.click();
	}

	@FindBy(xpath="//aside[@id='column-right']//a[normalize-space()='Order History']") 
	WebElement orderHistoryfromRIGHTcolumnoption;

	public void orderHistoryfromRIGHTcolumnoption() {
		orderHistoryfromRIGHTcolumnoption.click();
	}

	@FindBy(xpath="//a[normalize-space()='Site Map']") 
	WebElement siteMap;
	public void siteMap() {
		siteMap.click();
	}
	@FindBy(xpath="//div[@id='content']//div//div//a[normalize-space()='Order History']")
	WebElement orderHistoryinSitemapPage;
	public void orderHistoryinSitemapPage() {
		orderHistoryinSitemapPage.click();
	}
	//my ACCOUNT(WITHOUT LOGIN)--Register
	@FindBy(xpath="//div[@id='top-links']//a[normalize-space()='Register']") 
	WebElement registerMyAcntDropdwn;

	public void registerMyAcntDropdwn() {
		registerMyAcntDropdwn.click();
	}

	//order history in Register page with out login
	@FindBy(xpath="//aside[@id='column-right']//a[normalize-space()='Order History']") 
	WebElement orderHistoryinRegisterPage;
	public void orderHistoryinRegisterPage() {
		orderHistoryinRegisterPage.click();
	}
	@FindBy(xpath="//a[@title='My Account']") 
	WebElement myAccountINTOPlist;
	public void myAccountINTOPlist() {
		myAccountINTOPlist.click();
	}

	//continue button in order history page
	@FindBy(xpath="//a[normalize-space()='Continue']") 
	WebElement orderhistorycontinuebtn;
	public void orderhistorycontinuebtn() {
		orderhistorycontinuebtn.click();
	}
	//view icon option
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]") 
	WebElement viewiconfororder8112;

	public void viewiconfororder8112() {
		viewiconfororder8112.click();
	}

	@FindBy(xpath="//tbody/tr[3]") 
	WebElement order8110info;
	public String order8110info() {
		return order8110info.getText();
	}

	@FindBy(xpath="//tbody/tr[2]")
	WebElement order8111info;
	public String order8111info() {
		return order8111info.getText();
	}

	@FindBy(xpath="//tbody/tr[1]")  
	WebElement order8112info;

	public String order8112info() {
		return order8112info.getText();
	}
	@FindBy(xpath="//div[@id='content']//div//table//thead//tr")  
	WebElement orderHistoryTableheader;
	public String orderHistoryTableheader() {
		return orderHistoryTableheader.getText();
	}

	//complete Order History in order history page for order 8112
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]") 
	WebElement orderID8112inOrderhistoryPg;

	public String orderID8112inOrderhistoryPg() {
		return orderID8112inOrderhistoryPg.getText();
	}
	@FindBy(xpath="//b[normalize-space()='Payment Method:']") 
	WebElement paymentMethod8112inOrderHistoryPg;
	public String paymentMethod8112inOrderHistoryPg() {
		return paymentMethod8112inOrderHistoryPg.getText();
	}
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]")  
	WebElement Paymentadd8112inOrdHis;
	public String Paymentadd8112inOrdHis() {
		return Paymentadd8112inOrdHis.getText();
	}
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[2]") 
	WebElement Shippingadd8112inOrdHis ;
	public String Shippingadd8112inOrdHis() {
		return Shippingadd8112inOrdHis.getText();
	}
	@FindBy(xpath="//tbody")
	WebElement productdetailsinordertable;

	public String productdetailsinordertable() {
		return productdetailsinordertable.getText();
	}

	@FindBy(xpath="//tfoot//tr[1]")  WebElement prodcutsubTotal8112;
	public String prodcutsubTotal8112() {
		return prodcutsubTotal8112.getText();
	}

	@FindBy(xpath="//tfoot//tr[2]") WebElement flatShippingRate8112;

	public String flatShippingRate8112() {
		return flatShippingRate8112.getText();
	}

	@FindBy(xpath="//tfoot//tr[3]") WebElement totalpriceoftheproduct8112;

	public String totalpriceoftheproduct8112() {
		return totalpriceoftheproduct8112.getText();
	}

	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/table[3]/tbody[1]/tr[1]") 
	WebElement orderhisdatecomment8112;

	public String orderhisdatecomment8112() {
		return orderhisdatecomment8112.getText();
	}
	//Re order icon in Order History Page
	@FindBy(xpath="//tbody//a[1]//i[1]") 
	WebElement reordercartIcon;

	public void reordercartIcon() {
		reordercartIcon.click();
	}
	//Reorder success message
	@FindBy(xpath="//div[contains(text(),'Success: You have added')]") 
	WebElement Reorder8112successmsg;
	public String Reorder8112successmsg() {
		return Reorder8112successmsg.getText();



	}
	//Shopping cart link in Reorder Successmsg
	@FindBy(xpath="//a[normalize-space()='shopping cart']") 
	WebElement shoppingCartlinkinreordersucmsg;
	public void shoppingCartlinkinreordersucmsg() {
		shoppingCartlinkinreordersucmsg.click();
	}
	@FindBy(xpath="//input[@name='quantity[140166]']") 
	WebElement  ProductQntyafterreordering;
	public String ProductQntyafterreordering() {
		return ProductQntyafterreordering.getAttribute("Value");
	}
	//Continue button in Order History Page
	@FindBy(xpath="//a[normalize-space()='Continue']") 
	WebElement continuebtninOrderHisPage;

	public void continuebtninOrderHisPage() {
		continuebtninOrderHisPage.click();
	}

	//Return icon in Order History page

	@FindBy(xpath="//tbody//a[2]//i[1]") 
	WebElement ReturnIcon8112inOrderHisPg;

	public void ReturnIcon8112inOrderHisPg() {
		ReturnIcon8112inOrderHisPg.click();
	}


}
