package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName") WebElement eleCompanyName;
	@FindBy(id="createLeadForm_firstName") WebElement eleFirstName;
	@FindBy(id="createLeadForm_lastName") WebElement eleLastName;
	@FindBy(xpath="//input[@value='Create Lead']") WebElement eleCreateLeadButton;
	
	
	public CreateLeadPage enterCompanyName(String cName) {
		//driver.findElementById("createLeadForm_companyName").sendKeys("Test leaf");
		eleCompanyName.sendKeys(cName);
		return this;
	}
	public CreateLeadPage enterFirstName(String fName) {
		//driver.findElementById("createLeadForm_firstName").sendKeys("Vidhya");
		eleFirstName.sendKeys(fName);
		return this;
	}
	public CreateLeadPage enterLastName(String lName) {
		//driver.findElementById("createLeadForm_lastName").sendKeys("Karthik");
		eleLastName.sendKeys(lName);
		return this;
		
	}
	public ViewLeadPage clickCreateLeadButton() {
		//driver.findElementByXPath("//input[@value='Create Lead']").click();
		eleCreateLeadButton.click();
		return new ViewLeadPage();
	}
	
	public void dummy(){
		System.out.println("Dummy Method");
	}
}
