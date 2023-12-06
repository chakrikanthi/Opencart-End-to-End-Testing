package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage{
	

      public Loginpage(WebDriver driver) //Constructor fro LOGIN page
     {
      super(driver);
    }


@FindBy(xpath="//input[@id='input-email']") @CacheLookup private WebElement txtEMailAddress;
@FindBy(xpath="//input[@id='input-password']") @CacheLookup private WebElement txtpassword;
@FindBy(xpath="//input[@value='Login']") @CacheLookup private WebElement clicklogin;


//Action methods for Email, password and Login button
public void setEmail(String email)// getting this email from test case class
{
	txtEMailAddress.sendKeys(email);
}

public void setPassword(String pwd)
{
	txtpassword.sendKeys(pwd);
}
public void clicklogin()
{
	clicklogin.click();
}


}

