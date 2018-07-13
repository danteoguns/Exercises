import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

    @FindBy(xpath = Constant.Menu)
    private WebElement menu;

    public void menuPage(){
        menu.click();
    }
}