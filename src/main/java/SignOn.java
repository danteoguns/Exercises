import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOn {

    @FindBy(xpath = Constant.signOn)
    private WebElement signOn;

    public void signOn(){
        signOn.click();
    }

    @FindBy(xpath = Constant.loginUser)
    private WebElement loginUser;

    public void loginUser(){
        loginUser.click();
        loginUser.sendKeys("doguns");
    }

    @FindBy(xpath = Constant.loginPass)
    private WebElement loginPass;

    public void loginPass(){
        loginPass.click();
        loginPass.sendKeys("pass");
    }


    @FindBy(xpath = Constant.loginSubmit)
    private WebElement loginSubmit;

    public void loginSubmit(){
        loginSubmit.click();
    }
}
