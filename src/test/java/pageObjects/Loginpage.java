package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage{
	

      public Loginpage(WebDriver driver) //Constructor for LOGIN page
     {
      super(driver);
    }


@FindBy(xpath="//input[@id='input-email']") @CacheLookup private WebElement txtEMailAddress;
@FindBy(xpath="//input[@id='input-password']") @CacheLookup private WebElement txtpassword;
@FindBy(xpath="//input[@value='Login']") @CacheLookup private WebElement clicklogin;


//Action methods for Email, password and Login button
public void setEmail(String email)// getting this email from test case class
{
	txtEMailAddress.clear();
	txtEMailAddress.sendKeys(email);
}

public void setPassword(String pwd)
{
	txtpassword.clear();
	txtpassword.sendKeys(pwd);
}
public void clicklogin()
{
	clicklogin.click();
}

//Login warning message
@FindBy(xpath="//div[contains(text(),'Warning: No match for E-Mail Address and/or Passwo')]") 
WebElement loginwarningmsg;
public boolean loginwarningmsgisdisplayed() {
	return loginwarningmsg.isDisplayed();
}

public String loginwarningmsggettext() {
	return loginwarningmsg.getText();
}
//Forgot password link
@FindBy(xpath="//form[@action='https://tutorialsninja.com/demo/index.php?route=account/login']//a[normalize-space()='Forgotten Password']") 
WebElement forgottenPasswordlink;
public void forgottenPasswordlink()
{
	forgottenPasswordlink.click();
}
}

