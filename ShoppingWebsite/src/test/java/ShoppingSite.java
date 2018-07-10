import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingSite {
    private WebDriver driver;
    String url = "http://automationpractice.com/index.php";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testAll() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        // Homepage
        Homepage pageOne = PageFactory.initElements(driver, Homepage.class);
        pageOne.searchQuery();
        Thread.sleep(500);

        // Click on search result (Ajax)

    }

//    @Test
//    public void testShoppingSite() throws InterruptedException {
//        driver.manage().window().maximize();
//        driver.get(url);
//        Thread.sleep(500);
//
//        // Click on Search Bar
//        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Dress");
//        Thread.sleep(500);
//        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).submit();
//        Thread.sleep(500);
//    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
