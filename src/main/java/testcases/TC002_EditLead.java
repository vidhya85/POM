package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC002_EditLead extends ProjectSpecificMethods{
	@Test
	public void TC002_editLead() throws InterruptedException {
		LoginPage obj=new LoginPage();
		obj.enterUsername().enterPassword().clickLogin().clickCRMSFA().clickLeads().clickFindLeads().enterFirstName().clickFindLeadsButton().clickResultingLead()
		.editLead().clearCompanyName().editCompanyName().clickUpdate().viewLead();
	}

}
