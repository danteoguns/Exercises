package com.qa.PetClinicSelenium;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.PetClinicSelenium.AddOwner;
import com.qa.PetClinicSelenium.AddPet;
import com.qa.PetClinicSelenium.AddVisit;
import com.qa.PetClinicSelenium.Constant;
import com.qa.PetClinicSelenium.Homepage;
import com.qa.PetClinicSelenium.Owner;

public class PCSteps {

	private WebDriver driver;
	private Homepage page = null;
	private AddOwner addOwner = null;
	private Owner owner = null;
	private AddPet pet = null;
	private AddVisit visit = null;
	
	ExtentReports reports = new ExtentReports("C:\\Users\\Admin\\Documents\\eclipse-workspace\\PetClinic\\automated.html", true);
    ExtentTest test;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Development\\web_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void homepage() throws InterruptedException {
		driver.navigate().to(Constant.URL);
        test = reports.startTest("Verify application Title");
        test.log(LogStatus.INFO, "The browser has started");
        test.log(LogStatus.PASS, "The page loaded correctly");

		// Homepage
		page = PageFactory.initElements(driver, Homepage.class);
		page.ownerTab();
		Thread.sleep(200);
		page.addNew();
		test.log(LogStatus.INFO, "The add owner page to add a new owner");
        test.log(LogStatus.PASS, "The page loaded successfully");


		// Login Page
		addOwner = PageFactory.initElements(driver, AddOwner.class);

		WebElement explicitWait = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"firstName\"]")));

		addOwner.firstName();
		Thread.sleep(500);
		addOwner.lastName();
		Thread.sleep(500);
		addOwner.address();
		Thread.sleep(500);
		addOwner.city();
		Thread.sleep(500);
		addOwner.telephone();
		Thread.sleep(500);
		addOwner.addOwnerBtn();
		test.log(LogStatus.INFO, "To add a new user");
        test.log(LogStatus.PASS, "The new owner was added successfully");

		// Owner Page
		owner = PageFactory.initElements(driver, Owner.class);
		Thread.sleep(1000);
		owner.myOwner();
		owner.addNewPet();

		// Add Pet Page
		pet = PageFactory.initElements(driver, AddPet.class);
		Thread.sleep(1000);
		pet.petName();
		Thread.sleep(500);
		pet.petBirth();
		Thread.sleep(500);
		pet.petType();
		Thread.sleep(500);
		pet.savePet();
		
		test.log(LogStatus.INFO, "The add pet page to add a new pet");
		test.log(LogStatus.PASS, "The new pet was added successfully");
        
		page.ownerTab();
		Thread.sleep(500);
		page.allOwner();
		Thread.sleep(500);
		owner.myOwner();
		
		// Add New Visit
		owner.addNewVisit();
		visit = PageFactory.initElements(driver, AddVisit.class);
		visit.visitDate();
		Thread.sleep(500);
		visit.description();
		Thread.sleep(500);
		visit.addVisitBtn();
		Thread.sleep(500);
		
		test.log(LogStatus.INFO, "The add vist page to add a new pet");
		test.log(LogStatus.PASS, "The visit was added successfully");
		
		page.ownerTab();
		Thread.sleep(500);
		page.allOwner();
		Thread.sleep(500);
		owner.myOwner();
		Thread.sleep(500);
		
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
        reports.endTest(test);
        reports.flush();
		driver.quit();
	}

}
