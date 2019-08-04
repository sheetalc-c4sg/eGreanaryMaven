package com.eg.qa.pages;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eg.qa.base.EGranaryBase;

public class ValidateAllLinks extends EGranaryBase {
	
	
	public ValidateAllLinks CheckLinks() throws MalformedURLException, IOException {
		
	List<WebElement> linkslist	= driver.findElements(By.tagName("a"));
	linkslist.addAll(driver.findElements(By.tagName("img")));
	
	System.out.println("Size of total links" + linkslist.size());
	
	List<WebElement> activelist = new ArrayList<WebElement>();
	
	List<WebElement> nonactivelist = new ArrayList<WebElement>();
	
	for(int i = 0;  i < linkslist.size(); i++)
	{	
		System.out.println(linkslist.get(i));
		if(linkslist.get(i).getAttribute("href")!=null)
		{	
			activelist.add(linkslist.get(i));
			
		}else
		{
			nonactivelist.add(linkslist.get(i));
		}
		
		
	}
	
	//get the size of active links list
	System.out.println("Size of active links" + activelist.size());
	
	for (int j = 0; j<activelist.size(); j++)
	{ 
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("egdemo.widernet.org", 9980));
		//conn = new URL(urlString).openConnection(proxy);
		HttpURLConnection connection = (HttpURLConnection)new URL(activelist.get(j).getAttribute("href")).openConnection(proxy);
	 
	 connection.connect();
	 
	 String response = connection.getResponseMessage();
	 System.out.println(activelist.get(j).getAttribute("href")+ "---> " + response);
	 connection.disconnect();
	// System.out.println("Proxy? " + connection.usingProxy());
	 
		
		
	}
	
	
	
			
		return new ValidateAllLinks();
		
	}
	

}
