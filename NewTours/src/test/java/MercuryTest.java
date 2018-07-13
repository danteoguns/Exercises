import com.sun.org.apache.regexp.internal.RE;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MercuryTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testMercury(){
        driver.manage().window().maximize();
        driver.get(Constant.URL);

        //Homepage
        Homepage clickBtn = PageFactory.initElements(driver, Homepage.class);
        clickBtn.registerUser();

        //Register
        Register reg = PageFactory.initElements(driver, Register.class);
        reg.firstNameForm();
        reg.lastNameForm();
        reg.phoneForm();
        reg.emailForm();
        reg.address1Form();
        reg.address2Form();
        reg.cityForm();
        reg.stateForm();
        reg.postalForm();
        reg.usernameForm();
        reg.passwordForm();
        reg.confirmPassForm();
        reg.submitUser();
        reg.signOut();

        //Sign On
        SignOn log = PageFactory.initElements(driver, SignOn.class);
        log.signOn();
        log.loginUser();
        log.loginPass();
        log.loginSubmit();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);

//        reports.endTest(test);
//        reports.flush();
        driver.quit();
    }

}
