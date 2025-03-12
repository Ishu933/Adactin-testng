package org.pom;

import org.base.BaseClassTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClassTest {
	
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;
	public WebElement getPass() {
		return pass;
	}
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	
}
