package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddADDRESpage extends Basepage {
	
	public WebDriver driver;
	public AddADDRESpage(WebDriver driver) {
		super(driver);
		
	}


@FindBy(xpath="//input[@id='input-firstname']") 
WebElement firstName;
public void firstName(String fname) {
	firstName.clear();
	firstName.sendKeys(fname);;
}

@FindBy(xpath="//input[@id='input-lastname']")  
WebElement lastName;
public void lastName(String lname) {
	lastName.clear();
	lastName.sendKeys(lname);;
}

@FindBy(xpath="//input[@id='input-company']")  
WebElement company;
public void company(String comp) {
	company.clear();
	company.sendKeys(comp);
}


@FindBy(xpath="//input[@id='input-address-1']")  
WebElement address1;
public void address1(String add1) {
	address1.clear();
	address1.sendKeys(add1);;
}


@FindBy(xpath="//input[@id='input-address-2']")  
WebElement address2;
public void address2(String add1) {
	address2.sendKeys(add1);
}

@FindBy(xpath="//input[@id='input-city']") 
WebElement city;
public void city(String cityname) {
	city.clear();
	city.sendKeys(cityname);;
}
@FindBy(xpath="//input[@id='input-postcode']") 
WebElement postCode;
public void postCode(String PCODE) {
	city.clear();
	city.sendKeys(PCODE);;
}

@FindBy(xpath="//select[@id='input-country']")  
WebElement country;
public void country(String country1) {
	new Select(country).selectByVisibleText(country1);
}


@FindBy(xpath="//select[@id='input-zone']") 
WebElement regionorState;
public void regionorState(String state1) {
	new Select(regionorState).selectByVisibleText(state1);
}

@FindBy(xpath="//input[@value='1']")  
WebElement defaultadressYESopt;
public void defaultadressYESopt() {
	defaultadressYESopt.click();
}
@FindBy(xpath="//input[@value='0']") 
WebElement defaultaddressNOoption;
public void defaultaddressNOoption() {
	defaultaddressNOoption.click();
}
@FindBy(xpath="//input[@value='Continue']")  
WebElement continuebtn;
public void continuebtn() {
	continuebtn.click();
}
//vivek address edit btn
@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]") 
WebElement VivekAddresseditbtn;
public void VivekAddresseditbtn() {
	VivekAddresseditbtn.click();
}

}
