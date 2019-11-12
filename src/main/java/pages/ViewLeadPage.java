package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="viewLead_firstName_sp") WebElement eleViewFirstName;
	public ViewLeadPage viewLead() {
		//String fName=driver.findElementById("viewLead_firstName_sp").getText();
		String fName=eleViewFirstName.getText();
		System.out.println(fName);
	    if(fName.equals("Vidhya")){
	    		System.out.println("Test pass");
	    }
	    else
	    	System.out.println("Test fail");
		return this;
		
	}
	public EditLeadPage editLead() {
		driver.findElementByXPath("//a[text()='Edit']").click();
		return new EditLeadPage();
	}
	}


