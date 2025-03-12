package org.pom;

import org.base.BaseClassTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SucessLogout extends BaseClassTest {

	public SucessLogout() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[text()='Click here to login again']")
	private WebElement logout;
	public WebElement getlogout() {
		return logout;
	}
}
