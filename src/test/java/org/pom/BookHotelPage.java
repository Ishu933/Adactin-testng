package org.pom;

import org.base.BaseClassTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClassTest {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='first_name']" ) 
	private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy (xpath = "//input[@id='last_name']" )
	private WebElement lastname ;
	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy (xpath = "//textarea[@name='address']")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	
	@FindBy (xpath = "//input[@onkeypress='return OnlyNumbersonly(event)']")
	private WebElement ccno;
	public WebElement getCcno() {
		return ccno;
	}
	
	@FindBy (xpath = "//select[@name='cc_type']")
	private WebElement cctype ;
	public WebElement getCctype() {
		return cctype;
	}
	
	@FindBy (xpath = "//select[@name='cc_exp_month']")
	private WebElement ccexpmnth;
	public WebElement getCcexpmnth() {
		return ccexpmnth;
	}
	
	@FindBy (xpath = "//select[@name='cc_exp_year']")
	private WebElement ccexpyear;
	public WebElement getCcexpyear() {
		return ccexpyear;
	}
	
	@FindBy (xpath = "//input[@name='cc_cvv']")
	private WebElement cvv ;
	public WebElement getCvv() {
		return cvv;
	}
	
	@FindBy(xpath = "//input[@onclick='book_hotel_validate();']")
	private WebElement booknow;
	public WebElement getBooknow() {
		return booknow;
	}
	
	
}
