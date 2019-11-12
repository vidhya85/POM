package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="CRM/SFA") WebElement eleCRMSFA;
	public MyHomePage clickCRMSFA() {
	//	driver.findElementByLinkText("CRM/SFA").click();
		eleCRMSFA.click();
		return new MyHomePage();
	}

}
