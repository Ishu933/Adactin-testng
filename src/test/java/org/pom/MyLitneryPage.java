package org.pom;

import org.base.BaseClassTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyLitneryPage extends BaseClassTest {

	public MyLitneryPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='My Itinerary']")
	private WebElement mylitnery;
	
	public WebElement getMylitnery() {
		return mylitnery;
	}
}
