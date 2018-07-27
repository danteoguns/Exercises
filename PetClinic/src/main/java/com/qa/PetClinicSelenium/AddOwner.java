package com.qa.PetClinicSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddOwner {

	@FindBy(xpath = Constant.FirstName)
    private WebElement firstName;

    public void firstName(){
    	firstName.click();
    	firstName.sendKeys("Daniel");
    }
	
    
    @FindBy(xpath = Constant.LastName)
    private WebElement lastName;

    public void lastName(){
    	lastName.click();
    	lastName.sendKeys("Oguns");
    }
    
    @FindBy(xpath = Constant.Address)
    private WebElement address;

    public void address(){
    	address.click();
    	address.sendKeys("Great Street");
    }
    
    @FindBy(xpath = Constant.City)
    private WebElement city;

    public void city(){
    	city.click();
    	city.sendKeys("Manchester");
    }
    
    @FindBy(xpath = Constant.Telephone)
    private WebElement telephone;

    public void telephone(){
    	telephone.click();
    	telephone.sendKeys("0161123456");
    }
    
    @FindBy(xpath = Constant.AddOwner)
    private WebElement addOwnerBtn;

    public void addOwnerBtn(){
    	addOwnerBtn.click();
    }
}
