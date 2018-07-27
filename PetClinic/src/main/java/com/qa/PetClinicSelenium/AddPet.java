package com.qa.PetClinicSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPet {
	
	@FindBy(xpath = Constant.PetName)
    private WebElement petName;

    public void petName(){
    	petName.click();
    	petName.sendKeys("Junior");
    }
	
    @FindBy(xpath = Constant.PetBirth)
    private WebElement petBirth;

    public void petBirth(){
    	petBirth.click();
    	petBirth.sendKeys("2012/07/27");
    }
    
    @FindBy(xpath = Constant.PetType)
    private WebElement petType;

    public void petType() throws InterruptedException {
    	petType.click();
    	Thread.sleep(1000);
    	petType.sendKeys(Keys.chord("d"));
    	petType.sendKeys(Keys.ENTER);
    }
    
    @FindBy(xpath = Constant.SavePet)
    private WebElement savePet;

    public void savePet(){
    	savePet.click();
    }
    
}
