package avic_tests;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;
    private Actions action;

    private static final String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        action = new Actions(driver);
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Actions getAction() {
        return action;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(getDriver());
    }

    public ComputersPage getComputersPage() {
        return new ComputersPage(getDriver());
    }

    public SystemBlocksPage getSystemBlocksPage() {
        return new SystemBlocksPage(getDriver());
    }

    public ProductPage getProductPage() {
        return new ProductPage(getDriver());
    }
}
