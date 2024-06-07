package pageObjects;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Minimumquantityset extends Basepage {

	public Minimumquantityset(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath="//input[@name='option[218]']")  
	WebElement smallradiobutton;
	
	@FindBy(xpath="//input[@value='10']") 
	WebElement checkbox3option;
	
	@FindBy(xpath="//input[@value='11']") 
	WebElement checkbox4option;
	
	@FindBy(xpath="//input[@id='input-option208']")
	WebElement textbox;
	
	@FindBy(xpath="//div[@class='col-sm-4']//div[4]") 
	WebElement selectcoloroption;
	
	@FindBy(xpath="//option[@value='4']") 
	WebElement Redcoloroption;
	
	@FindBy(xpath="//option[@value='3']")  
	WebElement Bluecoloroption;
	
	@FindBy(xpath="//option[@value='1']") 
	WebElement Greencoloroption;
	
	@FindBy(xpath="//textarea[@id='input-option209']") 
	WebElement textarea;
	
	@FindBy(xpath="//button[@id='button-upload222']")  
	WebElement uploadFile;
	
	@FindBy(xpath="//div[@class='input-group date']//i[@class='fa fa-calendar']") 
	WebElement dateoption;
	//@FindBy(xpath="//div[@class='bootstrap-datetimepicker-widget dropdown-menu pull-right picker-open top']//div[@class='datepicker-days']//th[@class='next'][contains(text(),'›')]")  
	//WebElement rightclickbutton= driver.findElement(By.xpath("//div[@class='bootstrap-datetimepicker-widget dropdown-menu picker-open pull-right bottom']//div[@class='datepicker-days']//th[@class='next'][contains(text(),'›')]"));
	//@FindBy(xpath="//td[@class='day active'][normalize-space()='11']")  WebElement datepicking;//here we can change the date in xpath with any number u want ex:21
	//@FindBy(xpath="//body[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]")  WebElement date11;
	//@FindBy(xpath="//td[@class='day active'][normalize-space()='14']") 
	//WebElement date14;
	@FindBy(xpath="//body[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]")  
	WebElement date23;
	@FindBy(xpath="//div[@class='input-group time']//i[@class='fa fa-calendar']") 
	WebElement timeoption;
	@FindBy(xpath="//body[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/a[1]/span[1]") 
	WebElement time2225;
	@FindBy(xpath="//body[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]/span[1]")  WebElement up2225;
	
	@FindBy(xpath="//div[@class='input-group datetime']//i[@class='fa fa-calendar']")
	WebElement dateandTimeoption;
	
	@FindBy(xpath="//td[@class='day active'][normalize-space()='23']")  
	WebElement dateandtime23;
	
	@FindBy(xpath="//input[@id='input-quantity']")  
	WebElement qtybox;
	
	@FindBy(xpath="//button[@id='button-cart']") 
	WebElement addToCartbutton;
	
	@FindBy(xpath="//div[@class='alert alert-info']") 
	WebElement PrdctHasMinQuatxtunderdisplaypage;
	
	@FindBy(xpath="//a[normalize-space()='shopping cart']") 
	WebElement shoppingCart;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")  
	WebElement minOrderAmntApple2inshopcrtpage;
	
	
	
	public void smallradiobutton()
	{
		smallradiobutton.click();;
	}
	public void checkbox3option()
	{
		checkbox3option.click();
	}
	public void checkbox4option()
	{
		checkbox4option.click();
	}
	public void textbox(String sampletext)
	{
		textbox.clear();
		textbox.sendKeys(sampletext);
	}
	public void selectcoloroption()
	{
		selectcoloroption.click();
	}
	public void Redcoloroption()
	{
		Redcoloroption.click();
	}
	public void Bluecoloroption()
	{
		Bluecoloroption.click();
	}
	public void Greencoloroption()
	{
		Greencoloroption.click();
	}
	public void textarea(String entertxt)
	{
		textarea.clear();
		textarea.sendKeys(entertxt);
		
	}
	public void uploadFile() throws IOException, InterruptedException, AWTException
	{
		uploadFile.click();
		Robot rb= new Robot();
		rb.delay(2000);
		StringSelection SS= new StringSelection("C:\\Users\\chakr\\Desktop\\SAMPLESCREENSHOT.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);
		

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
				rb.delay(3000);
		driver.switchTo().alert().accept();
		
	}
	public void dateoption() throws InterruptedException
	{
		dateoption.click();
		date23.click();
		
		Thread.sleep(3000);
		 
		
	}
	public void timeoption() throws InterruptedException
	{
		timeoption.click();
		time2225.click();
		up2225.click();
		timeoption.click();//here we have to click otherwise that box will be displaying like that
		Thread.sleep(3500);
	}
	public void dateandTimeoption() throws InterruptedException
	{
		dateandTimeoption.click();
		
	}
	public void qtybox(String num)
	{
		qtybox.clear();
		qtybox.sendKeys(num);
	}
	
	public void addToCartbutton()
	{
		addToCartbutton.click();
	}
	
	public String PrdctHasMinQuatxtunderdisplaypage() {
		try {
			return (PrdctHasMinQuatxtunderdisplaypage.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
	public void shoppingCart()
	{
		shoppingCart.click();
	}
	public boolean minOrderAmntApple2inshopcrtpage() {
		//minOrderAmntApple2inshopcrtpage.isDisplayed();
		try {
			return(minOrderAmntApple2inshopcrtpage.isDisplayed());
		}
		catch (Exception e) {
			

	}
		return false;
	}
}
