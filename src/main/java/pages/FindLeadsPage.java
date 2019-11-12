package pages;

import base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods{

	public FindLeadsPage enterFirstName() {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Vidhya");
		return this;
	}
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		return this;
	}
	public ViewLeadPage clickResultingLead() {
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		return new ViewLeadPage();
	}
}
