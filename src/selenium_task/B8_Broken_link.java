package selenium_task;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B8_Broken_link
{ 
@Test
	public void  method1() throws IOException, InterruptedException
 {

   	  WebDriver driver = new ChromeDriver();
   	  driver.get( "https://www.saucedemo.com/v1/index.html");
   	  driver.manage().window().maximize();
   	  
   	  WebElement username =driver.findElement(By.xpath( "//input[@id='user-name']"))	;
   	  username.sendKeys("standard_user");
   	
   	  WebElement password =driver.findElement(By.xpath( "//input[@id='password']"))	;
   	  password.sendKeys("secret_sauce");
   	
   	  WebElement logintab =driver.findElement(By.xpath( "//input[@id='login-button']"))	;
   	  logintab.submit();
   	  
     List<WebElement> links  = driver.findElements(By.tagName( "a"));
   	  
     int noolink  = links.size();
     System.out.println(noolink);
     
      int brokenlink = 0;
      
      int validlink = 0;
     for(int i= 0 ; i<=noolink; i++)
     {
    	 WebElement element =  links.get(i);
    	 
    	String url =  element.getAttribute( "href");
    	
    	 URL link = new URL(url);
    	 
    	 HttpURLConnection httpcon = (HttpURLConnection)link.openConnection();
    	 
    	 Thread.sleep(8000);
    	 
    	 httpcon.connect();
    	 Thread.sleep(3000);
        int resopncecode = 	 httpcon.getResponseCode();
    	 
    	if(resopncecode>=400)
    	{
    		System.out.println("its broken link");
    		brokenlink = brokenlink+ 1;
    	}
    	else
    	{
    		System.out.println("its valid link");
    		validlink = validlink+1;
    	}
    	
    	System.out.println(brokenlink);
    	System.out.println(validlink);
    	
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
   	  
   	  
   	  
 }
}
