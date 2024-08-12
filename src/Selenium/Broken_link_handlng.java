package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken_link_handlng 
{
	@Test
	
    public void method1() throws IOException, InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.get( "https://dhbekoolint.aarohiinfo.com/Identity/Account/Login?ReturnUrl=%2F");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000)); 
	driver.manage().window().maximize();   
	WebElement username = driver.findElement(By.xpath("//input[@id='Input_Email']"));
    username.sendKeys("Candidate"); 
    WebElement password = driver.findElement(By.xpath("//input[@id='passwordInput']"));
    password.sendKeys("Candidate@123");
    WebElement logintab = driver.findElement(By.xpath("//button[@id='login-submit']"));
    logintab.click();
    
    // find all link from page by "a" tagname and its size as well
    List<WebElement>  links = driver.findElements(By.tagName( "a"));
    int nooflinks =  links.size();
    System.out.println("total number of links are " + nooflinks);
    
	int brokenlink = 0;
	int validlink=0;
	
    for (int i=0;i<nooflinks;i++)
    {
    	WebElement element = links.get(i);
    	// collect url of all element which  have herf tagname
    	String url = element.getAttribute( "href");
    	
    	// use URL class of java.net pack for checking link is broken or not
    	URL link = new URL(url);
    	
        //use this httpconnection class of java.net pack for checking link is redirect to page	
        HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
        Thread.sleep(8000);
        // coonect method use for establish connection 
    	httpcon.connect();
    	Thread.sleep(3000);
    	//we get conne tion code by getresponce code method of HttpURLConnection class
    	int responcecode = httpcon.getResponseCode();
    
    	if(responcecode>=400)
    	{
    		System.out.println( url  +  " URL is broken ");
    		brokenlink = brokenlink+1;
    	}
    	else 
    	{
    		System.out.println( url  +  " URL is valid ");
    		validlink = validlink +1;
    	}
        
    } 
    System.out.println("broken links are  "  + brokenlink);

    System.out.println("broken links are  "  + validlink);
    
}
}
