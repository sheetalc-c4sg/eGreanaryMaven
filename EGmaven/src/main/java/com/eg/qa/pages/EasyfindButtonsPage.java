package com.eg.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eg.qa.base.EGranaryBase;


public class EasyfindButtonsPage extends EGranaryBase {
	
	@FindBy(id = "easy")
	WebElement easyfindbuttons;
	
	@FindBy(id = "Audio")
	WebElement audio;
	
	@FindBy(id = "Video")
	WebElement video;
	
	CatalogSearchPage cs = new CatalogSearchPage();
	
	public EasyfindButtonsPage() {
		
		PageFactory.initElements(driver, this);
	}

	public boolean validate_efb()
	{

		//return bbctitle.isDisplayed();
		
		return easyfindbuttons.isDisplayed();
 
 
	}
	
	public EasyfindButtonsPage click_audiobutton() throws InterruptedException
	{
		audio.click();
		//driver.findElement(By.id("Audio")).click();
		click_audio_link();
		
		
		return new EasyfindButtonsPage();
		
	}
	
	public void click_audio_link() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"resultItemLine1\"]/a")).click();
		Thread.sleep(5000);
		driver.navigate().to("http://egranary/");
		
	}
	
	public EasyfindButtonsPage click_video_button() throws InterruptedException, AWTException, IOException
	{
		//cs.gotohomepage();
		video.click();
		//driver.findElement(By.id("Audio")).click();
		
		play_video();
		
		Thread.sleep(5000);
		return new EasyfindButtonsPage();
		
	}
	
	
	
	
	public void play_video() throws InterruptedException, AWTException
	{
		//Introduction to Physics Demonstration Videos
		driver.findElement(By.xpath("//*[@id=\"resultItemLine1\"]/a")).click(); 
		//Actions action = new Actions(null); 
		 // action.click() (Keys.ENTER);
		 //Runtime.getRuntime().exec("D:\\Sheetal\\autoitscript.exe");
		Thread.sleep(6000);
		Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_TAB);
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(6000);
	}
	
	
	public void add_to_favorite()
	{
		
	}
	
}
	
	


