package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends BasePage {


    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'gotovyie-pk')]")
    private WebElement systemBlocksButton;

    public ComputersPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSystemBlocksButton() {
        systemBlocksButton.click();
    }
}
