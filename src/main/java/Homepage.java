import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

    @FindBy(xpath = Constant.Register)
    private WebElement register;

    public void registerUser(){
        register.click();
    }
}
