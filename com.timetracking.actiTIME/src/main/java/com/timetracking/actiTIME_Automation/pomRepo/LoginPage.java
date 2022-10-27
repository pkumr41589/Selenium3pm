package com.timetracking.actiTIME_Automation.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="username")
	private WebElement usernameTextField;
	
	@FindBy(name ="pwd")
	private WebElement passwordTextField;

	@FindBy(xpath="//div[text()='Login ']")
	private WebElement LoginButton;
	
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public WebElement getLoginButton() {
		return LoginButton;
	}


	public void LoginAction(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		LoginButton.click();
	}

}
