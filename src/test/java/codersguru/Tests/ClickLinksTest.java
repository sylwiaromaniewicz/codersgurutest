package codersguru.Tests;

import aCommon.FirefoxBaseTest;
import codersguru.Pages.HomePage;
import org.junit.Test;

public class ClickLinksTest extends FirefoxBaseTest {

    @Test
    public void testClickAllLinks() {
        driver.get("https://men-men-s-01.codersguru.pl/");
        HomePage homePage = new HomePage(driver);
        homePage.clickAllLinks();

        // wywalić asercje tutaj

    }

}



