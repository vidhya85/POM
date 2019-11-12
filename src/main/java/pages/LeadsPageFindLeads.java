package pages;

import base.ProjectSpecificMethods;

public class LeadsPageFindLeads extends ProjectSpecificMethods{
	public FindLeadsPage clickFindLeads() {
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		return new FindLeadsPage();
	}

}
