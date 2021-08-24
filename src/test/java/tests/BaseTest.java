package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;

public class BaseTest {
    public WebDriver driver;


    @BeforeClass(alwaysRun = true)
    public void navigateToUrl() {
        try {
            System.out.println("Start The Browser Session before test execution");
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator
                    + "drivers" + File.separator + "chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } catch (Exception ex) {
            System.out.println("error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        System.out.println("Closing The Browser Session after test execution");
        driver.quit();

    }
}
