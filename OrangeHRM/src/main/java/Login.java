import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

    @FindBy(xpath = Constant.LoginUsername)
    private WebElement loginUser;

    public void loginUser(){
        loginUser.click();
        loginUser.sendKeys("Admin");
    }

    @FindBy(xpath = Constant.LoginPassword)
    private WebElement loginPass;

    public void loginPass(){
        loginPass.click();
        loginPass.sendKeys("AdminAdmin");
    }

    @FindBy(xpath = Constant.LoginBtn)
    private WebElement loginBtn;

    public void loginBtn(){
        loginBtn.click();
    }
}
