package Abc;

 

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 

public class Test_base  
{       @Test
	public void setup()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhbekoolint.aarohiinfo.com/Identity/Account/Login?ReturnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		Login_class lp = new Login_class();
		lp.usernamesend();
		lp.sendpassword();
		lp.clicklogin();
		
		
	}
 
    
  
}
