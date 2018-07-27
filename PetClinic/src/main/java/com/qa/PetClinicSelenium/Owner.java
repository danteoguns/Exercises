package com.qa.PetClinicSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Owner {
	@FindBy(partialLinkText = "Oguns")
    private WebElement myOwner;

    public void myOwner(){
    	myOwner.click();
    }
    
    @FindBy(xpath = Constant.AddNewPet)
    private WebElement addNewPet;

    public void addNewPet(){
    	addNewPet.click();
    }
    
    @FindBy(xpath = Constant.AddNewVisit)
    private WebElement addNewVisit;

    public void addNewVisit(){
    	addNewVisit.click();
    }
    
    
}
