package pages;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	public EditLeadPage clearCompanyName() {
	driver.findElementById("updateLeadForm_companyName").clear();
	return this;
	}
	public EditLeadPage editCompanyName() {
	driver.findElementById("updateLeadForm_companyName").sendKeys("Selenium");
	return this;
	}
	public ViewLeadPage clickUpdate() {
		driver.findElementByXPath("//input[@value='Update']").click();
		return new ViewLeadPage();
	}

}
