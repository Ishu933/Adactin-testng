package org.pom;

import org.base.BaseClassTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgainLogin extends BaseClassTest {

	public AgainLogin() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
}
