package phptravels.Tests;

import aCommon.FirefoxBaseTest;
import cucumber.api.java.en.Given;
import org.junit.Before;
import org.junit.Test;
import phptravels.Pages.BookingFlightPage;

public class BookingFlightTestNoCucumber extends FirefoxBaseTest {

    @Test
    public void iAmOnPhptravelsWebsitee()  {
        FirefoxBaseTest.setUp();
        driver.get("https://www.phptravels.net/flights");
    }

    @Test
    public void iPickFlightsTabb() {
        BookingFlightPage bookingFlightPagee = new BookingFlightPage(driver);
        bookingFlightPagee.choseRoundTrip();
    }

    @Test
    public void iReserveTwoWayFlightsFromToOnDateAndd() {
        BookingFlightPage bookingFlightPagee = new BookingFlightPage(driver);
        bookingFlightPagee.enterDepartueAndArival("WAW", "RDC");
        bookingFlightPagee.enterDate("2019-01-24", "2019-01-31");
        bookingFlightPagee.clickOnSubmitButton();
    }


/*
    @And("^I pick first available flight$")
    public void iPickFirstAvailableFlight() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I book as a guest with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iBookAsAGuestWith(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see prepared invoice$")
    public void iShouldSeePreparedInvoice() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/
}
