package Abc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_class  
{
	 
		
	 
	 @FindBy(xpath = "//input[@id='Input_Email']")
	 WebElement username;
	 
	 @FindBy(xpath = "//input[@id='Input_Password']")
	 WebElement password;
	 
	 
	 
	 @FindBy(xpath = "//button[@id='login-submit']")
	 WebElement login;
	 
	 //3
//	 public void isUsernameValid(String user)
	  public void usernamesend()
	 {
		 username.sendKeys("user");
	 }
	 public void sendpassword()
	 {
		 password.sendKeys( "User@123"); 
	 }
	 
	 
	 public void clicklogin()
	 {
		 login.click(); 
	 }
	 
	}

