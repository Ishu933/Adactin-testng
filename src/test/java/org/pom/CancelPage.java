package org.pom;

import org.base.BaseClassTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelPage extends BaseClassTest {

	public CancelPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='check_all']")
	private WebElement clickradiobutton;
	public WebElement getClickradiobutton() {
		return clickradiobutton;
	}
	
	@FindBy(xpath = "//input[@value='Cancel Selected']")
	private WebElement cancel;
	public WebElement getcancel() {
		return cancel;
	}	
	
	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout ;
	public WebElement getLogout() {
		return logout;
	}
}
