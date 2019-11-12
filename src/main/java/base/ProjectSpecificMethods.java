package base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import pages.LoginPage;
import pages.ReadExcel;

public class ProjectSpecificMethods {
	
	public static ChromeDriver driver;
	
	public static String fileName;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	
	public LoginPage clickLogoutLink(){
		driver.findElementByXPath("//a[text()='Logout']").click();
		return new LoginPage();
	}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		return ReadExcel.readData(fileName);
	}
	
}
