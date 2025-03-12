package org.configjunit;

import org.base.BaseClassTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.AgainLogin;
import org.pom.BookHotelPage;
import org.pom.CancelPage;
import org.pom.MyLitneryPage;
import org.pom.RadioButtonPage;
import org.pom.SearchHotelPage;
import org.pom.SucessLogout;
import org.testng.annotations.Test;

public class TestSample extends BaseClassTest {

	public static SearchHotelPage searchhotel;
	public static MyLitneryPage bookconfpage;
	public static CancelPage cancelpage;
	public static SucessLogout sucesslogout;
	public static BaseClassTest baseclasstest = new BaseClassTest();
	public static BookHotelPage bookhotelpage = new BookHotelPage();
	public static RadioButtonPage radiobuttonpage = new RadioButtonPage();

	@Test
	public void tc01() {

		searchhotel = new SearchHotelPage();

		try {

			WebElement text1 = BaseClassTest.driver.findElement(By.xpath("//td[text()='Search Hotel ']"));
			String text2 = text1.getText();
			System.out.println(text2);

			WebElement location = searchhotel.getlocation();
			baseclasstest.selectByJava(location, "London", "text");

			WebElement hotel = searchhotel.getHotels();
			baseclasstest.selectByJava(hotel, "Hotel Sunshine", "text");

			WebElement roomtype = searchhotel.getRoomtype();
			baseclasstest.selectByJava(roomtype, "Double", "text");

			WebElement noofroom = searchhotel.getNoofroom();
			baseclasstest.selectByJava(noofroom, "2", "value");

			WebElement checkindate = searchhotel.getCheckindate();
			baseclasstest.sendKeysByJava(checkindate, "30/01/2025");

			WebElement checkoutdate = searchhotel.getCheckoutdate();
			baseclasstest.sendKeysByJava(checkoutdate, "32/01/2025");

			WebElement adtperroom = searchhotel.getAdtperroom();
			baseclasstest.selectByJava(adtperroom, "4", "value");

			WebElement childroom = searchhotel.getChildroom();
			baseclasstest.selectByJava(childroom, "3", "value");

			WebElement search = searchhotel.getSearch();
			baseclasstest.clickByJava(search);

			radiobuttonpage = new RadioButtonPage();

			WebElement radiobutton = radiobuttonpage.getRadiobutton();
			baseclasstest.clickByJava(radiobutton);

			WebElement continue1 = radiobuttonpage.getContinue();
			baseclasstest.clickByJava(continue1);

			bookhotelpage = new BookHotelPage();

			WebElement bookconf = BaseClassTest.driver.findElement(By.xpath("//td[text()='Book A Hotel ']"));
			String text3 = bookconf.getText();
			System.out.println(text3);

			WebElement firstname = bookhotelpage.getFirstname();
			baseclasstest.sendKeysByJava(firstname, "Antony");

			WebElement lastname = bookhotelpage.getLastname();
			baseclasstest.sendKeysByJava(lastname, "kutty");

			WebElement address = bookhotelpage.getAddress();
			baseclasstest.sendKeysByJava(address, "Erode,Bhavani");

			WebElement ccno = bookhotelpage.getCcno();
			baseclasstest.sendKeysByJava(ccno, "1234567891012233445");

			WebElement cctype = bookhotelpage.getCctype();
			baseclasstest.selectByJava(cctype, "American Express", "text");

			WebElement ccexpmnth = bookhotelpage.getCcexpmnth();
			baseclasstest.selectByJava(ccexpmnth, "October", "text");

			WebElement ccexpyear = bookhotelpage.getCcexpyear();
			baseclasstest.selectByJava(ccexpyear, "2025", "value");

			WebElement cvv = bookhotelpage.getCvv();
			baseclasstest.sendKeysByJava(cvv, "666");

			bookhotelpage = new BookHotelPage();

			WebElement booknow = bookhotelpage.getBooknow();
			baseclasstest.clickByJava(booknow);

			baseclasstest.sleep(5000);

			bookconfpage = new MyLitneryPage();

			WebElement mylitnery = bookconfpage.getMylitnery();
			baseclasstest.clickByJava(mylitnery);

			cancelpage = new CancelPage();

			WebElement clickradiobutton = cancelpage.getClickradiobutton();
			baseclasstest.clickByJava(clickradiobutton);

			cancelpage = new CancelPage();

			WebElement getcancel = cancelpage.getcancel();
			baseclasstest.clickByJava(getcancel);

			cancelpage = new CancelPage();

			Alert alert = BaseClassTest.driver.switchTo().alert();
			alert.accept();

			WebElement logout = cancelpage.getLogout();
			baseclasstest.clickByJava(logout);

			sucesslogout = new SucessLogout();

			WebElement getlogout = sucesslogout.getlogout();
			baseclasstest.clickByJava(getlogout);

			AgainLogin againlogin = new AgainLogin();

			WebElement login2 = againlogin.getLogin();
			baseclasstest.clickByJava(login2);

		} catch (Exception e) {
		}

	}

}
