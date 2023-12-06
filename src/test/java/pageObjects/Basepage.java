package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
	
	
   public WebDriver driver;
	
	public Basepage(WebDriver driver)  //Constructor for basepage and assigning the driver to the local driver
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
