package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void implicitWait(final long timeToWait) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeToWait));
    }

    public void waitForPageLoadComplete(final long timeToWait) {
        new WebDriverWait(driver, Duration.ofSeconds(timeToWait))
                .until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
    }

    public void waitVisibilityOfElement(final long timeToWait, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeToWait));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }


}
