package avic_tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private static final String WRONG_KEYWORD = "asfdvsdafawdsf";
    private static final String PRO_MAX_KEYWORD = "Pro Max";
    private static final long TIME_TO_WAIT = 3;

    @Test
    public void checkThatNothingFound() {
        getHomePage().searchByKeyword(WRONG_KEYWORD);
        assertTrue(getSearchResultPage().getNotingFoundNotify().isDisplayed());
    }

    @Test(priority = 1)
    public void checkProductsFiltering() {
        getAction().moveToElement(getHomePage().getAppleStoreSidebarButton())
                .pause(Duration.ofSeconds(TIME_TO_WAIT))
                .moveToElement(getHomePage().getIphoneSidebarButton())
                .pause(Duration.ofSeconds(TIME_TO_WAIT))
                .moveToElement(getHomePage().getIphoneProMaxSidebarButton())
                .click().build().perform();

        if (getSearchResultPage().getShowMoreButton().isDisplayed()) {
            getAction().moveToElement(getSearchResultPage().getShowMoreButton())
                    .pause(Duration.ofSeconds(TIME_TO_WAIT)).click().build().perform();
        }

        for(WebElement element : getSearchResultPage().getListOfProductsOnSearchPage()) {
            assertTrue(element.getText().contains(PRO_MAX_KEYWORD));
        }
    }
}
