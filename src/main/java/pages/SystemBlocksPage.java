package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SystemBlocksPage extends BasePage {

    @FindBy(xpath = "//div[@class='item-prod col-lg-3']")
    private List<WebElement> productsOnSystemBlocksPage;

    public SystemBlocksPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnFirstProduct() {
        productsOnSystemBlocksPage.get(0).click();
    }
}
