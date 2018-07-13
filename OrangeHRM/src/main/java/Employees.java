import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Employees {
    //Employees Details
    @FindBy(xpath = Constant.FirstName)
    private WebElement firstName;

    public void firstName(){
        firstName.click();
        firstName.sendKeys("Daniel");
    }

    @FindBy(xpath = Constant.MiddleName)
    private WebElement middleName;

    public void middleName(){
        middleName.click();
        middleName.sendKeys("TJ");
    }

    @FindBy(xpath = Constant.LastName)
    private WebElement lastName;

    public void lastName(){
        lastName.click();
        lastName.sendKeys("Oguns");
    }

    @FindBy(xpath = Constant.EmployeeID)
    private WebElement employeeID;

    public void employeeID(){
        employeeID.click();
        employeeID.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        employeeID.sendKeys(Keys.BACK_SPACE);
        employeeID.sendKeys("2112");
    }

    @FindBy(xpath = Constant.Location)
    private WebElement location;

    public void location() throws InterruptedException {
        location.click();
        Thread.sleep(1000);
        location.sendKeys(Keys.chord("l"));
        location.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = Constant.CreateBox)
    private WebElement createBox;

    public void createBox(){
        createBox.click();
    }

    //Login Details
    @FindBy(xpath = Constant.Username)
    private WebElement username;

    public void username(){
        username.click();
        username.sendKeys("doguns11");
    }

    @FindBy(xpath = Constant.Password)
    private WebElement password;

    public void password(){
        password.click();
        password.sendKeys("thegreatest123.");
    }

    @FindBy(xpath = Constant.ConfirmPass)
    private WebElement confirmPassword;

    public void confirmPassword(){
        confirmPassword.click();
        confirmPassword.sendKeys("thegreatest123.");
    }

    @FindBy(xpath = Constant.ESSRole)
    private WebElement essRole;

    public void essRole() throws InterruptedException {
        essRole.click();
        Thread.sleep(1000);
        essRole.sendKeys(Keys.chord("d"));
        essRole.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = Constant.AdminRole)
    private WebElement adminRole;

    public void adminRole() throws InterruptedException {
        adminRole.click();
        Thread.sleep(1000);
        adminRole.sendKeys(Keys.chord("a"));
        adminRole.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = Constant.Status)
    private WebElement status;

    public void status() throws InterruptedException {
        status.click();
        Thread.sleep(1000);
        status.sendKeys(Keys.chord("e"));
        status.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = Constant.SupervisorRole)
    private WebElement supervisorRole;

    public void supervisorRole() throws InterruptedException {
        supervisorRole.click();
        Thread.sleep(1000);
        supervisorRole.sendKeys(Keys.chord("d"));
        supervisorRole.sendKeys(Keys.ENTER);
    }

    @FindBy(xpath = Constant.SaveBtn)
    private WebElement saveBtn;

    public void saveBtn() {
        saveBtn.click();
    }

}
