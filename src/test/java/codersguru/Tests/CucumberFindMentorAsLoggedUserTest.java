package codersguru.Tests;

import aCommon.FirefoxBaseTest;
import codersguru.Pages.HomePageUserSingIn;
import codersguru.Pages.LoginPage;
import codersguru.Pages.MentorPage;
import codersguru.Pages.PayUPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CucumberFindMentorAsLoggedUserTest extends FirefoxBaseTest {

    @Given("^I open login coders guru website$")
    public void iOpenLoginCodersGuruWebsite() {
        FirefoxBaseTest.setUp();
        driver.get("https://men-men-s-01.codersguru.pl/login");
    }

    @When("^I log in as \"([^\"]*)\" user with password \"([^\"]*)\"$")
    public void iLogInAsUserWithPassword(String email, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logginIn(email, password);
    }

    @And("^I pick from dropdown \"([^\"]*)\" and click find mentor$")
    public void iPickFromDropdownAndClickFindMentor(String arg0) {
        HomePageUserSingIn homePageUserSingIn = new HomePageUserSingIn(driver);
        homePageUserSingIn.selectGitMentor();
    }

    @And("^I pick mentor first on the list$")
    public void iPickMentorOnTheList() {
        MentorPage mentorPage = new MentorPage(driver);
        mentorPage.choseMentor();
    }

    @And("^I enter problem descriptions as \"([^\"]*)\"$")
    public void iEnterProblemDescriptionsAs(String message) {
        MentorPage mentorPage = new MentorPage(driver);
        mentorPage.writeMessage(message);
    }

    @And("^I pick first possible date and time and go to payment$")
    public void iPickFirstPossibleDateAndTimeAndGoToPayment()  {
        MentorPage mentorPage = new MentorPage(driver);
        mentorPage.choseDateAndTime();
    }

    @And("^I pick credit card payment$")
    public void iPickCreditCardPayment()  {
        PayUPage payUPage = new PayUPage(driver);
        payUPage.pickCreditCardPayment();
    }

    @And("^Provide CC data as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void provideCCDataAs(String cardNumber, String date, String noCvv, String name, String email)  {
        PayUPage payUPage = new PayUPage(driver);
        payUPage.enterOrderData(cardNumber, date, noCvv, name, email);
    }

    @Then("^Payment should be rejected$")
    public void paymentShouldBeRejected() {
        PayUPage payUPage = new PayUPage(driver);
        assertEquals("Nieprawidłowy numer karty.", payUPage.getNumberCardErrorMassage());
        driver.close();
    }


}
