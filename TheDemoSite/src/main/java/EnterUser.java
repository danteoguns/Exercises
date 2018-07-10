import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterUser {

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
    private WebElement usernameForm;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")
    private WebElement passwordForm;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
    private WebElement saveBtn;

    @FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
    private WebElement loginPage;

    public void enterUsername(){
        usernameForm.click();
        usernameForm.sendKeys("Daniel");
    }

    public void enterPassword(){
        passwordForm.click();
        passwordForm.sendKeys("Password");
    }

    public void saveDetails(){
        saveBtn.click();
    }

    public void goToLogin(){
        loginPage.click();
    }

}