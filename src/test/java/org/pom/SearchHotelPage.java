package org.pom;

import org.base.BaseClassTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClassTest {
	
	public SearchHotelPage () {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (xpath = "//select[@id='location']")
	private WebElement location;
	public WebElement getlocation () {
		return location;
	}
	
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;
	public WebElement getHotels() {
		return hotels;
	}
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomtype;
	public WebElement getRoomtype() {
		return roomtype;
	}
	
	@FindBy (xpath = "//select[@name='room_nos']")
	private WebElement noofroom;
	public WebElement getNoofroom() {
		return noofroom;
	}
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkindate;
	public WebElement getCheckindate() {
		return checkindate;
	}
	
	@FindBy (xpath = "//input[@name='datepick_out']")
	private WebElement checkoutdate;
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	
	@FindBy (xpath = "//select[@name='adult_room']")
	private WebElement adtperroom;
	public WebElement getAdtperroom() {
		return adtperroom;
	}
	
	@FindBy (xpath = "//select[@name='child_room']")
	private WebElement childroom;
	public WebElement getChildroom() {
		return childroom;
	}
	
	@FindBy (xpath = "//input[@name='Submit']")
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}

}
