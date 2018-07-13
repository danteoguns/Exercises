import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeList {

    @FindBy(xpath = Constant.EmpList)
    private WebElement empList;

    public void empList(){
        empList.click();
    }

    @FindBy(xpath = Constant.SearchEmp)
    private WebElement searchEmp;

    public void searchEmp(){
        searchEmp.click();
        searchEmp.sendKeys("2112");
        searchEmp.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = Constant.SelectEmp)
    private WebElement selectEmp;

    public void selectEmp(){
        selectEmp.click();
    }
}
