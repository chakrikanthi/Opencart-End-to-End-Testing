package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

public class Roboclassfileuploading extends Basepage{
	
	public Roboclassfileuploading(WebDriver driver) {
		super(driver);
		
	}
	public void fileuploading() throws AWTException {
		
	
	Robot rb= new Robot();
	rb.delay(2000);
	
	//This program is used to upload file into webpage, which involves windows actions
	/*1)copy link
	 * 2)cntrl+v
	 * 3)enter
	 */
	//put path to file in clipboar
	StringSelection SS= new StringSelection("C:\\Users\\chakr\\Desktop\\SAMPLESCREENSHOT.png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);
	
	//these 2 below statements make ctrl+v actions
	rb.keyPress(KeyEvent.VK_CONTROL);  //Press Cntrl
	rb.keyPress(KeyEvent.VK_V);  //Press V
	
	//these 2 below statements release cntrl+v
	rb.keyRelease(KeyEvent.VK_CONTROL); //Release Ctrl
	rb.keyRelease(KeyEvent.VK_V);  //Release V
	
	//Enter
	rb.keyPress(KeyEvent.VK_ENTER);//press Enter
	rb.keyRelease(KeyEvent.VK_ENTER);//Release Enter
			rb.delay(3000);
	driver.switchTo().alert().accept();
	}

}
