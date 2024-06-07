package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ProductThumbnail extends Basepage {

	public ProductThumbnail(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Search']") 
	WebElement searchbox;
	@FindBy(xpath="//i[@class='fa fa-search']") 
	WebElement searchbtn;
	@FindBy(xpath="//a[normalize-space()='MacBook Air']") 
	WebElement macBksearchresult;
	@FindBy(xpath="//li[1]//a[1]//img[1]")  
	WebElement macthumbnailimg;
	@FindBy(xpath="//button[@title='Next (Right arrow key)']")  
	WebElement RightArrowKey;
	@FindBy(xpath="//button[@title='Previous (Left arrow key)']") 
	WebElement LeftArrowKey;
	@FindBy(xpath="//button[normalize-space()='×']")  
	WebElement Macclose1Of4;
	@FindBy(xpath="//li[2]//a[1]//img[1]")  
	WebElement smallThumbnail2;
	@FindBy(xpath="//button[normalize-space()='×']")  
	WebElement closeMacBkAir2Of4;
	@FindBy(xpath="//li[3]//a[1]//img[1]")  
	WebElement smallThumbnail3;
	@FindBy(xpath="//button[normalize-space()='×']")  
	WebElement closeMacBkAir3Of4;
	@FindBy(xpath="//li[4]//a[1]//img[1]")
	WebElement smallThumbnail4;
	@FindBy(xpath="//button[normalize-space()='×']")
	WebElement closeMacBkAir4Of4;
	
	
	
public void searchbox(String srchtxt) 
{
	searchbox.sendKeys(srchtxt);
}
public void searchbtn() 
{
	searchbtn.click();
}
public void macBksearchresult() 
{
	macBksearchresult.click();
}public void macthumbnailimg() 
{
	macthumbnailimg.click();
}public void RightArrowKey() throws InterruptedException 
{
	for(int k=0; k<=3;k++)
	{
		RightArrowKey.click();
		Thread.sleep(1000);
	}
	
}public void LeftArrowKey() throws InterruptedException 
{
	LeftArrowKey.click();
	/*for(int i=0; i<=4;i++)
	{
		LeftArrowKey.click();
		Thread.sleep(1000);	
		}*/
	
}public void closeMacBkAir2Of4() 
{
	closeMacBkAir2Of4.click();
}
public void smallThumbnail2() 
{
	smallThumbnail2.click();
}
public void smallThumbnail3() 
{
	smallThumbnail3.click();
}
public void closeMacBkAir3Of4() 
{
	closeMacBkAir3Of4.click();
}
public void Macclose1Of4() 
{
	
		Macclose1Of4.click();
	
	 
}
public void smallThumbnail4() 
{
	smallThumbnail4.click();
}
public void closeMacBkAir4Of4() 
{
	closeMacBkAir4Of4.click();
}
}
