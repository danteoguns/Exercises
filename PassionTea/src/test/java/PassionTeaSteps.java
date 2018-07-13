import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.da.Men;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Pa;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class PassionTeaSteps {

    private WebDriver driver;
    private Homepage menuPage;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Given("^the correct web address$")
    public void the_correct_web_address() {

        driver.get(Constant.URL);

    }

    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page() {

        Homepage clickMenu = PageFactory.initElements(driver, Homepage.class);
        clickMenu.menuPage();
    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products() {

//        MenuPage product = PageFactory.initElements(driver, MenuPage.class);
//        Actions a = new Actions(driver);
//        a.moveToElement();

    }

    @When("^I click the checkout button$")
    public void i_click_the_checkout_button() {

        MenuPage clickGreen = PageFactory.initElements(driver, MenuPage.class);
        clickGreen.greenTea();

    }

    @Then("^I am taken to the checkout page$")
    public void i_am_taken_to_the_checkout_page()  {

        Checkout fill = PageFactory.initElements(driver, Checkout.class);
        fill.fillForm("matt@qa.com", "matt", "anchorage 1", "visa", "1234 5678 9123 4567", "matt", "164");
    }

    @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();

    }
}
