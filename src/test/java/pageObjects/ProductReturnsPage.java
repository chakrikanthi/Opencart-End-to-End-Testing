package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReturnsPage extends Basepage{

	public ProductReturnsPage(WebDriver driver) {
		super(driver);

	}

@FindBy(xpath="//input[@id='input-firstname']") 
 WebElement ProductretrunfirstName;

public void ProductretrunfirstName(String fname) {
	ProductretrunfirstName.clear();
	ProductretrunfirstName.sendKeys(fname);
}
@FindBy(xpath="//input[@id='input-lastname']")
WebElement ProductretrunlastName;
public void ProductretrunlastName(String lname) {
	ProductretrunlastName.clear();
	ProductretrunlastName.sendKeys(lname);
}
@FindBy(xpath="//input[@id='input-email']") 
WebElement ProductretruneMail;
public void ProductretruneMail(String email) {
	ProductretruneMail.clear();
	ProductretruneMail.sendKeys(email);
}

@FindBy(xpath="//input[@id='input-telephone']") 
WebElement Productretruntelephone;
public void Productretruntelephone(String tel) {
	Productretruntelephone.clear();
	Productretruntelephone.sendKeys(tel);
}
@FindBy(xpath="//input[@id='input-order-id']") 
WebElement ProductretrunorderID;
public void ProductretrunorderID(String tel) {
	ProductretrunorderID.clear();
	ProductretrunorderID.sendKeys(tel);
}

@FindBy(xpath="//input[@id='input-date-ordered']") 
WebElement ProductretrunorderDate;
public void ProductretrunorderDate() {
	
	 ProductretrunorderDate.getText();
}
@FindBy(xpath="//input[@id='input-product']") 
WebElement ProductretrunproductName;
public void ProductretrunproductName() {
	ProductretrunproductName.getText();
}
@FindBy(xpath="//input[@id='input-model']")
WebElement returningproductCode;
public void returningproductCode() {
	returningproductCode.getText();
}

@FindBy(xpath="//input[@id='input-quantity']") 
WebElement Productretrunquantity;
public void Productretrunquantity() {
	Productretrunquantity.getText();
}
@FindBy(xpath="//label[normalize-space()='Dead On Arrival']") 
WebElement returnReasondeadonArrival;
public void returnReasondeadonArrival() {
	returnReasondeadonArrival.click();
}
@FindBy(xpath="//input[@value='4']")  
WebElement returnReasonfault;
public void returnReasonfault() {
	returnReasonfault.click();
}
@FindBy(xpath="//input[@value='4']") 
WebElement returnReasonOrderError;
public void returnReasonOrderError() {
	returnReasonOrderError.click();
}
@FindBy(xpath="//input[@value='5']") 
WebElement returnReasonOther;
public void returnReasonOther() {
	returnReasonOther.click();
}
@FindBy(xpath="//input[@value='2']") 
WebElement returnReasonReceivingWrongItem;
public void returnReasonReceivingWrongItem() {
	returnReasonReceivingWrongItem.click();
}
@FindBy(xpath="//label[normalize-space()='Yes']")
WebElement ProductopenedYESRadiobtn;
public void ProductopenedYESRadiobtn() {
	ProductopenedYESRadiobtn.click();
}
@FindBy(xpath="//input[@value='0']")  
WebElement ProductOpenedNORadiobtn;
public void ProductOpenedNORadiobtn() {
	ProductOpenedNORadiobtn.click();
}
@FindBy(xpath="//textarea[@id='input-comment']") 
WebElement faultyOrOtherDetailsTextBox;
public void faultyOrOtherDetailsTextBox(String text) {
	faultyOrOtherDetailsTextBox.sendKeys(text);;
}
@FindBy(xpath="//input[@value='Submit']") 
WebElement Returnsubmitbtn;
public void Returnsubmitbtn() {
	Returnsubmitbtn.click();
}
@FindBy(xpath="//a[normalize-space()='Back']") 
WebElement Returnbackbtn;
public void Returnbackbtn() {
	Returnbackbtn.click();
}

//Product return success message
@FindBy(xpath="//p[contains(text(),'Thank you for submitting your return request. Your')]") 
WebElement SuccessReturnmsg1;
public String SuccessReturnmsg1() {
	return SuccessReturnmsg1.getText();
}
@FindBy(xpath="//p[contains(text(),'You will be notified via e-mail as to the status o')]") 
WebElement SuccessReturnemailmsg;
public String SuccessReturnemailmsg() {
	return SuccessReturnemailmsg.getText();
}

//Error messages when test is not filled in the mandatory fields 


@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]") 
WebElement firstNameErrormsg;
public String firstNameErrormsg() {
	return firstNameErrormsg.getText();
}

@FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]") 
WebElement lastNameErrormsg;
public String lastNameErrormsg() {
	return lastNameErrormsg.getText();
}
@FindBy(xpath="//div[contains(text(),'E-Mail Address does not appear to be valid!')]") 
WebElement eMailErrormsg;
public String eMailErrormsg() {
	return eMailErrormsg.getText();
}
@FindBy(xpath="//div[contains(text(),'Telephone must be between 3 and 32 characters!')]") 
WebElement telephoneErrormsg;
public String telephoneErrormsg() {
	return telephoneErrormsg.getText();
}
@FindBy(xpath="//div[contains(text(),'Order ID required!')]") 
WebElement orderIDErrormsg;
public String orderIDErrormsg() {
	return orderIDErrormsg.getText();
}
@FindBy(xpath="//div[contains(text(),'Product Name must be greater than 3 and less than ')]")
WebElement productNameErrormsg;
public String productNameErrormsg() {
	return productNameErrormsg.getText();
}
@FindBy(xpath="//div[contains(text(),'Product Model must be greater than 3 and less than')]")  
WebElement productModelErrormsg;
public String productModelErrormsg() {
	return productModelErrormsg.getText();
}
}
