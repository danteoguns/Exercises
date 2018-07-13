import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {

    @FindBy(xpath = Constant.PimTab)
    private WebElement pim;

    public void pimPage(){
        pim.click();
    }

    @FindBy(xpath = Constant.AddEmployee)
    private WebElement addEmployee;

    public void addEmployee(){
        addEmployee.click();
    }
}
