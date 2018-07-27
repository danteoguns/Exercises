package com.qa.PetClinicSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddVisit {
	
	@FindBy(xpath = Constant.VisitDate)
    private WebElement visitDate;

    public void visitDate(){
    	visitDate.click();
    	visitDate.sendKeys("2018/10/27");
    }
	
    
    @FindBy(xpath = Constant.Description)
    private WebElement description;

    public void description(){
    	description.click();
    	description.sendKeys("Regular Checkup");
    }
    
    @FindBy(xpath = Constant.AddVisitBtn)
    private WebElement addVisitBtn;

    public void addVisitBtn(){
    	addVisitBtn.click();
    }
}
