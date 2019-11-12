package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC001_CreateLead extends ProjectSpecificMethods{
	@BeforeClass
	public void setData() {
		fileName="createLead";
	}
	@Test(dataProvider = "fetchData")
	public void TC001_createLead(String cName, String fName, String lName) {
		LoginPage obj=new LoginPage();
		obj.enterUsername().enterPassword().clickLogin().clickCRMSFA().clickLeadsLink().clickCreateLead().enterCompanyName(cName)
		.enterFirstName(fName).enterLastName(lName).clickCreateLeadButton().viewLead();
	}

}
