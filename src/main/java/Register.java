import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {

    @FindBy(xpath = Constant.first_name)
    private WebElement firstName;

    public void firstNameForm(){
        firstName.click();
        firstName.sendKeys("Nathan");
    }

    @FindBy(xpath = Constant.last_name)
    private WebElement lastName;

    public void lastNameForm(){
        lastName.click();
        lastName.sendKeys("Ahrens");
    }

    @FindBy(xpath = Constant.phone)
    private WebElement phoneNo;

    public void phoneForm(){
        phoneNo.click();
        phoneNo.sendKeys("078364537213");
    }

    @FindBy(xpath = Constant.email)
    private WebElement email;

    public void emailForm(){
        email.click();
        email.sendKeys("bob@email.com");
    }

    @FindBy(xpath = Constant.addressLineOne)
    private WebElement address1;

    public void address1Form(){
        address1.click();
        address1.sendKeys("1 Its coming home");
    }

    @FindBy(xpath = Constant.addressLineTwo)
    private WebElement address2;

    public void address2Form(){
        address2.click();
        address2.sendKeys("England");
    }

    @FindBy(xpath = Constant.city)
    private WebElement city;

    public void cityForm(){
        city.click();
        city.sendKeys("the city");
    }

    @FindBy(xpath = Constant.state)
    private WebElement state;

    public void stateForm(){
        state.click();
        state.sendKeys("London");
    }

    @FindBy(xpath = Constant.postalCode)
    private WebElement postal_code;

    public void postalForm(){
        postal_code.click();
        postal_code.sendKeys("LU111");
    }

    @FindBy(xpath = Constant.user_name)
    private WebElement username;

    public void usernameForm(){
        username.click();
        username.sendKeys("signon");
    }

    @FindBy(xpath = Constant.password)
    private WebElement userPass;

    public void passwordForm(){
        userPass.click();
        userPass.sendKeys("pass");
    }

    @FindBy(xpath = Constant.confirmPassword)
    private WebElement confirmUserPass;

    public void confirmPassForm(){
        confirmUserPass.click();
        confirmUserPass.sendKeys("pass");
    }

    @FindBy(xpath = Constant.finalSubmit)
    private WebElement finalSubmit;

    public void submitUser(){
        finalSubmit.click();
    }

    @FindBy(xpath = Constant.signOut)
    private WebElement signOut;

    public void signOut(){
        signOut.click();
    }

}
