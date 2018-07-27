package com.qa.PetClinicSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

	@FindBy(xpath = Constant.OwnerTab)
    private WebElement ownerTab;

    public void ownerTab(){
    	ownerTab.click();
    }
    
    @FindBy(xpath = Constant.AddNew)
    private WebElement addNew;

    public void addNew(){
    	addNew.click();
    }
    
    @FindBy(xpath = Constant.AllOwner)
    private WebElement allOwner;

    public void allOwner(){
    	allOwner.click();
    }
    
}
