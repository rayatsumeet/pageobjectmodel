package Utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Page;

public class BrokenLinks extends Page {

	
	public static void getBrokenLinks(String ur)
	{
		
	
    
    HttpURLConnection huc = null;
    int respCode = 200;
    String url = "";
    
    //driverr.get(ur);
    
    List<WebElement> links = driverr.findElements(By.tagName("a"));
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        url = it.next().getAttribute("href");
        
        System.out.println(url);
    
        if(url == null || url.isEmpty()){
System.out.println("URL is either not configured for anchor tag or it is empty");
            continue;
        }
        
        if(!url.startsWith(ur)){
            System.out.println("URL belongs to another domain, skipping it.");
            continue;
        }
        
        try {
            huc = (HttpURLConnection)(new URL(url).openConnection());
            
            huc.setRequestMethod("HEAD");
            
            huc.connect();
            
            respCode = huc.getResponseCode();
            
            if(respCode >= 400){
                System.out.println(url+" is a broken link");
            }
            else{
                System.out.println(url+" is a valid link");
            }
                
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
 

}

}

