package testCases;

import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Orderhistory;
import testBase.Baseclass;

public class TC_OI_001verifyingdetailsinorderinfoPg extends Baseclass{
	
	@Test
	public void verifyingdetailsinorderinfoPg() {
	
	Homepage hp= new Homepage(driver);
	hp.clickMyAccount();
	hp.clicklogin(); 
	
	Loginpage lp= new Loginpage(driver);
	lp.setEmail("satvik@gmail.com"); 
	lp.setPassword("kanthi123"); 
	lp.clicklogin();  
	
	Orderhistory OH= new Orderhistory(driver);
	OH.orderHistoryfromRIGHTcolumnoption();
	OH.viewiconfororder8112();
	System.out.println("Yoe are in page:"+driver.getTitle());
	
	System.out.println("Order id and date added on:"+OH.orderID8112inOrderhistoryPg());
	
	System.out.println("Payment Method and Shippment Method is: "+OH.paymentMethod8112inOrderHistoryPg());
	System.out.println("\n");
	System.out.println("Payment Address:"+OH.Paymentadd8112inOrdHis());
	System.out.println("Shippment Address:"+OH.Shippingadd8112inOrdHis());
	System.out.println("Product name, Model, Quantity,Price & Total :"+OH.productdetailsinordertable());
	System.out.println("SubTotal of the product is:"+OH.prodcutsubTotal8112());
	System.out.println("Flat Shipping Rate of the product is:"+OH.flatShippingRate8112());
	System.out.println("Total price of the product is:"+OH.totalpriceoftheproduct8112());
	
	System.out.println("Order History, Date added,Status and Comment"+OH.orderhisdatecomment8112());
	
	
	}
}
