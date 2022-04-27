package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//p[@class='col-xs-12']")
    private WebElement nothingFoundNotify;

    @FindBy(xpath = "//a[@class='btn-see-more js_show_more']")
    private WebElement showMoreButton;

    @FindBy(xpath = "//div[@class='item-prod col-lg-3']")
    private List<WebElement> productsOnResultPage;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getNotingFoundNotify() {
        return nothingFoundNotify;
    }

    public WebElement getShowMoreButton() {
        return showMoreButton;
    }

    public List<WebElement> getListOfProductsOnSearchPage() {
        return productsOnResultPage;
    }
}
