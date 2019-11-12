package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username") WebElement eleUsername;
	@FindBy(id="password") WebElement elePassword;
	@FindBy(className="decorativeSubmit") WebElement eleLogin;
	public LoginPage enterUsername() {
		//driver.findElementById("username").sendKeys("demosalesmanager",Keys.TAB);
		eleUsername.sendKeys("demosalesmanager");
		return this;
	
	}
	public LoginPage enterPassword() {
		//driver.findElementById("password").sendKeys("crmsfa");
		elePassword.sendKeys("crmsfa");
		return this;
	}
	public HomePage clickLogin() {
	//	driver.findElementByClassName("decorativeSubmit").click();
		eleLogin.click();
		return new HomePage();
	}

}
