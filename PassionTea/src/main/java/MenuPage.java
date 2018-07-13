import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {

    @FindBy(xpath = Constant.CheckOutGreenTea)
    private WebElement greenTea;

    public void greenTea(){
        greenTea.click();
    }

    @FindBy(xpath = Constant.CheckOutRedTea)
    private WebElement redTea;

    public void redTea(){
        redTea.click();
    }

    @FindBy(xpath = Constant.CheckOutOolongTea)
    private WebElement oolongTea;

    public void oolongTea(){
        oolongTea.click();
    }
}
