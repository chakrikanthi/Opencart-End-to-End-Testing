package testCases;

import org.testng.annotations.Test;

import pageObjects.HeaderMenuFooter;
import testBase.Baseclass;

public class TC_HMF_004ValidatingMenuOptions  extends Baseclass {
	@Test
	public void ValidatingMenuOptions() throws InterruptedException  {
		
		HeaderMenuFooter HMF= new HeaderMenuFooter(driver);
		HMF.desktoptions();
		String Desktops= driver.getTitle();
		System.out.println("First page :"+Desktops);
		Thread.sleep(2000);
		if(Desktops.equals("Desktops")) {
			System.out.println("You are successfully in Desktops page ..All products related to Desktop are displayed in this page");
		}
		
		HMF.laptopsNotebooksmenu();
		String LaptopsnNotebooks= driver.getTitle();
		System.out.println("Second page :"+LaptopsnNotebooks);
		Thread.sleep(2000);
		if(LaptopsnNotebooks.equals("Laptops & Notebooks")) {
			System.out.println("You are successfully in Laptops & Notebooks page ..All products related to Laptops & Notebooks are displayed in this page");
		}
		
		HMF.components();
		String components= driver.getTitle();
		System.out.println("Third  page :"+components);
		Thread.sleep(2000);
		if(components.equals("Components")) {
			System.out.println("You are successfully in Components page ..All products related to Components are displayed in this page");
		}
		
		
		HMF.mP3Players();
		String MP3Players= driver.getTitle();
		System.out.println("Fourth page :"+MP3Players);
		Thread.sleep(2000);
		if(MP3Players.equals("MP3 Players")) {
			System.out.println("You are successfully in MP3 Players page ..All products related to MP3 Players are displayed in this page");
		}
		System.out.println("T est got passed");
}
}