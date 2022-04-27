package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//a[contains(@class,'main-btn--green')]")
    private WebElement addToCartButton;

    @FindBy(id = "js_cart")
    private WebElement cartPopup;

    @FindBy(xpath = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]")
    private WebElement continueShoppingButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public WebElement getCartPopup() {
        return cartPopup;
    }

    public void clickOnContinueShoppingButton() {
        continueShoppingButton.click();
    }
}
