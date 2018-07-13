import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.NullPointerException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import static org.junit.Assert.assertEquals;

public class DemoSite {
    private WebDriver driver;
    String url = "http://thedemosite.co.uk";


    ExtentReports reports = new ExtentReports("C:\\Users\\Admin\\Desktop\\Daniel\\Exercises\\TheDemoSite\\automated.html", true);
    ExtentTest test;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Development/web_driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testAll() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        FileInputStream file = null;
        try {
            file = new FileInputStream(Constant.Path_TestData + Constant.File_TestData);
        } catch (FileNotFoundException e) {
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(file);
        } catch (IOException i) {
        }
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFCell cell = sheet.getRow(1).getCell(0);
        XSSFCell cellTwo = sheet.getRow(1).getCell(1);

        // Homepage
        Homepage pageOne = PageFactory.initElements(driver, Homepage.class);
        pageOne.addUser();

        // Add A User Page
        EnterUser pageTwo = PageFactory.initElements(driver, EnterUser.class);
//        pageTwo.enterUsername();
        pageTwo.enterUsername(cell.getStringCellValue());
        Thread.sleep(500);

//        pageTwo.enterPassword();
        pageTwo.enterPassword(cellTwo.getStringCellValue());
        Thread.sleep(500);

        pageTwo.saveDetails();
        Thread.sleep(500);

        pageTwo.goToLogin();

        // Login Page
        LoginPage pageThree = PageFactory.initElements(driver, LoginPage.class);
        pageThree.loginUsername();
        Thread.sleep(500);

        pageThree.loginPassword();
        Thread.sleep(500);

        pageThree.loginDetails();

        WebElement checkElement = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
        assertEquals("**Successful Login**", checkElement.getText());


        // initialize / start the test
        test = reports.startTest("Verify application Title");

        // add a note to the test
        test.log(LogStatus.INFO, "Browser started");

        // report the test as a pass
        test.log(LogStatus.PASS, "Verify Title of the page");

        // Data Driven Testing
//        FileInputStream file = null;
//        try {
//            file = new FileInputStream(Constant.Path_TestData + Constant.File_TestData);
//        } catch (FileNotFoundException e) {}
//            XSSFWorkbook workbook = null;
//            try {
//                workbook = new XSSFWorkbook(file);
//            } catch (IOException i) {}
//                XSSFSheet sheet = workbook.getSheetAt(0);
//                XSSFCell cell = sheet.getRow(1).getCell(0);
//                System.out.println("The username is: " + cell.getStringCellValue());
//
//
//        FileInputStream fileTwo = null;
//        try {
//            fileTwo = new FileInputStream(Constant.Path_TestData + Constant.File_TestData);
//        } catch (FileNotFoundException e) {}
//            XSSFWorkbook workbookTwo = null;
//            try {
//                workbookTwo = new XSSFWorkbook(fileTwo);
//            } catch (IOException i) {}
//                XSSFSheet sheetTwo = workbookTwo.getSheetAt(0);
//                XSSFCell cellTwo = sheetTwo.getRow(1).getCell(1);
//                System.out.println("The password is: " + cellTwo.getStringCellValue());
    }


    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);

        reports.endTest(test);
        reports.flush();
        driver.quit();
    }
}

//    @Test
//    public void testDemoSite() throws InterruptedException {
//
//        driver.manage().window().maximize();
//        driver.get(url);
//
//        //Add A User Page
//        driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")).click();
//        Thread.sleep(500);
//
//        //Enter Username
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")).click();
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")).sendKeys("Daniel");
//        Thread.sleep(500);
//
//        //Enter Password
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")).click();
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")).sendKeys("Password");
//        Thread.sleep(500);
//
//        // Click Save
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")).click();
//
//        //Login Page
//        driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")).click();
//
//        //Enter Username
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")).click();
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")).sendKeys("Daniel");
//        Thread.sleep(500);
//
//        //Enter Password
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")).click();
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")).sendKeys("Password");
//        Thread.sleep(500);
//
//        //Click Test Login
//        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")).click();
//    }