package Abc;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo
{
    	
    public void  Setup()
{
	WebDriver driver = new ChromeDriver();
	driver.get("http://dhbekoolint.aarohiinfo.com/Identity/Account/Login?ReturnUrl=%2F");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
}
//	WebElement username = driver.findElement(By.xpath("//input[@id='Input_Email']"));
//	username.sendKeys("user"); 
//	WebElement password = driver.findElement(By.xpath("//input[@id='Input_Password']"));
//	password.sendKeys("User@123");
//	WebElement logintab = driver.findElement(By.xpath("//button[@id='login-submit']"));
//	logintab.click();
//	WebElement profile = driver.findElement(By.xpath( "(//img[@class='rounded-circle'])[4]"));
//	profile.click();
//	WebElement needhelp = driver.findElement(By.xpath("//span[text()='Need Help?']"));
//	needhelp.click(); 
	  
	 
	  
}

