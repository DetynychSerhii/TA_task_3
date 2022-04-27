package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartTests extends BaseTest {

    private static final long TIME_TO_WAIT = 60;
    private static final String EXPECTED_ITEMS_COUNT_AFTER_ADDING = "1";
    private static final String EXPECTED_ITEMS_COUNT_AFTER_REMOVING = "0";

    @Test
    public void checkRemoveAddedItemsFromCart() {
        getHomePage().clickOnComputerSidebarButton();
        getComputersPage().clickOnSystemBlocksButton();
        getComputersPage().waitForPageLoadComplete(TIME_TO_WAIT);
        getSystemBlocksPage().clickOnFirstProduct();
        getSystemBlocksPage().waitForPageLoadComplete(TIME_TO_WAIT);
        getProductPage().clickOnAddToCartButton();
        getProductPage().waitVisibilityOfElement(TIME_TO_WAIT, getProductPage().getCartPopup());
        getProductPage().clickOnContinueShoppingButton();
        assertEquals(getHomePage().getItemsInCartCount(),EXPECTED_ITEMS_COUNT_AFTER_ADDING);
        getHomePage().clickOnCartButton();
        getProductPage().waitVisibilityOfElement(TIME_TO_WAIT, getProductPage().getCartPopup());
        getHomePage().clickOnRemoveFromCartButton();
        getHomePage().refreshPage();
        getHomePage().waitForPageLoadComplete(TIME_TO_WAIT);
        assertEquals(getHomePage().getItemsInCartCount(),EXPECTED_ITEMS_COUNT_AFTER_REMOVING);
    }
}
