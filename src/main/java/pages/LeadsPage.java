package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {
	public LeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create Lead']") WebElement eleCreateLeadLink;
	public CreateLeadPage clickCreateLead() {
		//driver.findElementByXPath("//a[text()='Create Lead']").click();
		eleCreateLeadLink.click();
		return new CreateLeadPage();
	}
	

}
