package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads") WebElement eleLeadsLink;
	public LeadsPage clickLeadsLink() {
		//driver.findElementByLinkText("Leads").click();
		eleLeadsLink.click();
	return new LeadsPage();
	
	}
public LeadsPageFindLeads clickLeads() {
	driver.findElementByLinkText("Leads").click();
	return new LeadsPageFindLeads();
}
}
