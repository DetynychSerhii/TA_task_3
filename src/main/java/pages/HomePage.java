package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[contains(@class, 'reset search-btn')]")
    private WebElement searchButton;

    @FindBy(xpath = "//li[@class='parent js_sidebar-item']//a[contains(@href,'elektronika')]")
    private WebElement computerSidebarButton;

    @FindBy(xpath = "//div[contains(@class, 'header-bottom__cart')]//div[contains(@class,'js_cart_count')]")
    private WebElement itemsInCartCount;

    @FindBy(xpath = "//div[contains(@class,'header-bottom__cart')]")
    private WebElement cartButton;

    @FindBy(xpath = "//div[@class='item']/i[@class='icon icon-close js-btn-close']")
    private WebElement removeFromCartButton;

    @FindBy(xpath = "//li[@class='parent js_sidebar-item']/a[contains(@href, 'apple-store')]")
    private WebElement appleStoreSidebarButton;

    @FindBy(xpath = "//li[@class='parent js_sidebar-item']/a[contains(@href,'iphone')]")
    private WebElement iphoneSidebarButton;

    @FindBy(xpath = "//li[@class='single-hover-block']/a[contains(@href,'promax')]")
    private WebElement iphoneProMaxSidebarButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword);
        searchButton.click();
    }

    public void clickOnComputerSidebarButton() {
        computerSidebarButton.click();
    }

    public String getItemsInCartCount() {
        return itemsInCartCount.getText();
    }

    public void clickOnCartButton() {
        cartButton.click();
    }

    public void clickOnRemoveFromCartButton() {
        removeFromCartButton.click();
    }

    public WebElement getAppleStoreSidebarButton() {
        return appleStoreSidebarButton;
    }

    public WebElement getIphoneSidebarButton() {
        return iphoneSidebarButton;
    }

    public WebElement getIphoneProMaxSidebarButton() {
        return iphoneProMaxSidebarButton;
    }

}
