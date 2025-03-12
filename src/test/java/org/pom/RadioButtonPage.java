package org.pom;

import org.base.BaseClassTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends BaseClassTest {
	
	public RadioButtonPage () {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@name='radiobutton_0']" )
	private WebElement radiobutton;
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement Continue;
	public WebElement getContinue() {
		return Continue;
	}
}
