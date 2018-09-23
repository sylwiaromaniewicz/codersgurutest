package phptravels.Tests;

import aCommon.FirefoxBaseTest;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import phptravels.Pages.BookingFlightPage;

public class BookingFlightTest extends FirefoxBaseTest {
    @Given("^I am on phptravels website$")
    public void iAmOnPhptravelsWebsite()  {
        FirefoxBaseTest.setUp();
        driver.get("https://www.phptravels.net/flights");
    }

    @When("^I pick flights tab$")
    public void iPickFlightsTab() {
        BookingFlightPage bookingFlightPage = new BookingFlightPage(driver);
        bookingFlightPage.choseRoundTrip();
    }

    @And("^I reserve two way flights from \"([^\"]*)\" to \"([^\"]*)\" on date \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iReserveTwoWayFlightsFromToOnDateAnd(String arg0, String arg1, String arg2, String arg3) {
        BookingFlightPage bookingFlightPage = new BookingFlightPage(driver);
        bookingFlightPage.enterDepartueAndArival(arg0, arg1);
        bookingFlightPage.enterDate(arg2, arg3);

    }

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
    }
}
