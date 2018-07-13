import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeSteps {

    private WebDriver driver;
    private Dashboard dashPage = null;
    private Employees employeesPage = null;
    private EmployeeList search = null;

    ExtentReports reports = new ExtentReports("C:\\Users\\Admin\\Desktop\\Daniel\\Exercises\\OrangeHRM\\automated.html", true);
    ExtentTest test;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Given("^the login page$")
    public void the_login_page() {

        driver.get(Constant.URL);
        test = reports.startTest("Verify application Title");
        test.log(LogStatus.INFO, "The browser has started");
        test.log(LogStatus.PASS, "The page loaded correctly");
    }

    @When("^I login$")
    public void i_login() {

        Login page = PageFactory.initElements(driver, Login.class);
        page.loginUser();
        page.loginPass();
        page.loginBtn();
        test.log(LogStatus.INFO, "The login page to access the HRM");
        test.log(LogStatus.PASS, "The Admin has logged in successfully");
    }

    @When("^I click the PIM tab$")
    public void i_click_the_PIM_tab() {

        dashPage = PageFactory.initElements(driver, Dashboard.class);
        dashPage.pimPage();
        test.log(LogStatus.INFO, "To access Add Employee tab under the PIM tab ");
        test.log(LogStatus.PASS, "The PIM tab was clicked successfully");
    }

    @When("^then the Add Employee Tab$")
    public void then_the_Add_Employee_Tab() throws InterruptedException {
        Thread.sleep(1000);
        dashPage.addEmployee();
        test.log(LogStatus.INFO, "To click the Add Employee tab");
        test.log(LogStatus.PASS, "The Add Employee tab was clicked successfully");
    }

    @When("^I fill out the Employee Details correctly$")
    public void i_fill_out_the_Employee_Details_correctly() throws InterruptedException {

        employeesPage = PageFactory.initElements(driver, Employees.class);

        WebElement explicitWait =
                (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[@id=\"firstName\"]")));

        employeesPage.firstName();
        Thread.sleep(500);
        employeesPage.lastName();
        Thread.sleep(500);
        employeesPage.employeeID();
        Thread.sleep(500);
        employeesPage.location();
        Thread.sleep(500);

        test.log(LogStatus.INFO, "To fill out the Employees Details");
        test.log(LogStatus.PASS, "The Employee Details were filled out successfully");
    }

    @When("^I choose to create Login Details by clicking the appropriate button$")
    public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button() throws InterruptedException {
        Thread.sleep(500);
        employeesPage.createBox();
        test.log(LogStatus.INFO, "To clicked on the Create Login Details checkbox");
        test.log(LogStatus.PASS, "The Create Login Details checkbox was clicked successfully");
    }

    @When("^I fill out the Login Details correctly$")
    public void i_fill_out_the_Login_Details_correctly() throws InterruptedException {

        employeesPage.username();
        Thread.sleep(500);
        employeesPage.password();
        Thread.sleep(500);
        employeesPage.confirmPassword();
        Thread.sleep(500);
        employeesPage.essRole();
        Thread.sleep(500);
        employeesPage.adminRole();
        Thread.sleep(500);
        employeesPage.status();
        Thread.sleep(500);
        employeesPage.supervisorRole();

        test.log(LogStatus.INFO, "To fill out the Login Details");
        test.log(LogStatus.PASS, "The Login Details were filled out successfully");
    }

    @When("^I click the Save button$")
    public void i_click_the_Save_button() throws InterruptedException {

        Thread.sleep(500);
        employeesPage.saveBtn();
        Thread.sleep(10000);
        test.log(LogStatus.INFO, "To clicked on the Save button");
        test.log(LogStatus.PASS, "The Save button was clicked successfully");
    }

    @Then("^I can search for the Employee I have just created$")
    public void i_can_search_for_the_Employee_I_have_just_created() throws InterruptedException {

        search = PageFactory.initElements(driver, EmployeeList.class);
        Thread.sleep(10000);
        WebElement explicitWait1 =
                (new WebDriverWait(driver, 120)).until(ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]")));

        search.empList();
        Thread.sleep(500);
        search.searchEmp();
        test.log(LogStatus.INFO, "To searched for the Employee created");
        test.log(LogStatus.PASS, "The Employee was searched for successfully");
    }

    @Then("^select them for inspection$")
    public void select_them_for_inspection() throws InterruptedException {

        WebElement explicitWait2 =
                (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[@id=\"employeeListTable\"]/tbody/tr[1]/td[1]/img")));

        search.selectEmp();

        WebElement explicitWait3 =
                (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[@id=\"right-side\"]/header/div/nav/div/div/ul[2]/li[1]/img")));
        Thread.sleep(2000);
        test.log(LogStatus.INFO, "To select the Employee");
        test.log(LogStatus.PASS, "The Employee was clicked on successfully");
    }

    @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(2000);
        reports.endTest(test);
        reports.flush();
        driver.quit();

    }
}
