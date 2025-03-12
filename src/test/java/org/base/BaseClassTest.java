package org.base;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pom.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTest {

	public static WebDriver driver;
	public static BaseClassTest baseclasstest = new BaseClassTest();
	public static LoginPage loginpage;

	
	
	@BeforeClass
	public static void two() {

			
		baseclasstest = new BaseClassTest();
		loginpage = new LoginPage();
		
		baseclasstest.initDriver("chrome");
		
		baseclasstest.LaunchUrl("https://adactinhotelapp.com/");
		
//		baseclasstest.screenCapture();
		
		WebElement element = BaseClassTest.driver.findElement(By.xpath("//td[text()='Existing User Login - Build 1']"));
		String text = element.getText();
		System.out.println(text);
		
		LoginPage loginpage = new LoginPage ();
		
		WebElement username = loginpage.getUsername();
		baseclasstest.sendKeysByJava(username, "antonykutty");
		
		
		WebElement pass = loginpage.getPass();
		baseclasstest.sendKeysByJava(pass, "123456");
		
		WebElement login = loginpage.getLogin();
		baseclasstest.clickByJava(login);
	}
	
	
	@AfterClass
	private void quiteAndClose() {

		driver.quit();
	}

	public void initDriver(String browsertype) {

		switch (browsertype) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		
		case "edge":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		default:
			System.out.println("invalid browser type");
			break;
		}
		driver.manage().window().maximize();

	}

	public void LaunchUrl(String url) {
		driver.get(url);
	}
		public void screenCapture ()   {
			
			try {
				TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
			File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
			File target = new File ("C:\\Users\\Antony\\eclipse-workspace\\BaseClass\\ErrorImages"
			+ System.currentTimeMillis()  +".png");
			FileUtils.copyFile(source, target);
				
			} 
			catch (Exception e) {
			}
		}
		
	public void sendKeysByJava(WebElement element, String keysToSend) {

		element.sendKeys(keysToSend);
	}

	public void clickByJava(WebElement element) {

		element.click();
	}

	public void getTextByJava(WebElement element) {

		element.getText();
	}
	

	public void selectByJava(WebElement element, String value,String selectType ) {

		Select select = new Select (element);
		
		switch (selectType) {
		
		case "value":
			select.selectByValue(value);
			break;
		case "text":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("InValid Value");
			break;
			}	
	}
	
	public void sleep(long millis) throws InterruptedException {

		Thread.sleep(millis);
	}

		
	public void alert(String Accept_Dismiss) {

		switch (Accept_Dismiss) {
		case "Accept":
			driver.switchTo().alert().accept();
			break;
		case "Dismiss":
			driver.switchTo().alert().dismiss();
			break;
			

		default:
			break;
		}
	}
	
}
	
