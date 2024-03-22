package testCases;

import org.testng.annotations.Test;

import pageObjects.SearchboxandIcon;
import pageObjects.Validatingnegativeqty;
import testBase.Baseclass;
import utilities.DataProviders;

public class TC_018_Validatingnegativeqty extends Baseclass
{
	@Test(dataProvider="quantity",dataProviderClass=DataProviders.class)
public void Verify_Validatingnegativeqty(String quantity) throws InterruptedException
{
		
		
		SearchboxandIcon schbxic= new SearchboxandIcon(driver);
		schbxic.searchbox("Samsung galaxy");
		schbxic.searchIcon();
		schbxic.samsungGalaxyTab10();
		
		Validatingnegativeqty valnegvalu= new Validatingnegativeqty(driver);
    	valnegvalu.qty(quantity);
		Thread.sleep(2000);
		valnegvalu.addToCart();
		valnegvalu.shoppingCartbtn();
		Thread.sleep(5000);
		
		
		//It's running this program three times with out changing the value
		
		/*for(int i=1; i<=3; i++)
		{
					
	SearchboxandIcon schbxic= new SearchboxandIcon(driver);
	schbxic.searchbox("Samsung galaxy");
	schbxic.searchIcon();
	schbxic.samsungGalaxyTab10();
	Validatingnegativeqty valnegvalu= new Validatingnegativeqty(driver);

	valnegvalu.qty("i");
	Thread.sleep(2000);
	valnegvalu.addToCart();
	valnegvalu.shoppingCartbtn();
	Thread.sleep(5000);
		}
		*/
}
		
		

	
}
