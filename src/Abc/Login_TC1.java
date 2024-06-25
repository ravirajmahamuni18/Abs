package Abc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_TC1
{
	@Test
	public void method1()
	{
		

	WebDriver driver = new ChromeDriver();
	driver.get("http://dhbekoolint.aarohiinfo.com/Identity/Account/Login?ReturnUrl=%2F");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000)); 	
    WebElement username = driver.findElement(By.xpath("//input[@id='Input_Email']"));
    username.sendKeys("user"); 
    WebElement password = driver.findElement(By.xpath("//input[@id='Input_Password']"));
    password.sendKeys("User@123");
    WebElement logintab = driver.findElement(By.xpath("//button[@id='login-submit']"));
    logintab.click();
}
}
