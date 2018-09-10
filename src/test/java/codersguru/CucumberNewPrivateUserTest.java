package codersguru;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class CucumberNewPrivateUserTest extends FirefoxBaseTest {
    @Given("^I open coders guru website$")
    public void iOpenCodersGuruWebsite()  {
        driver.get("https://men-men-s-01.codersguru.pl/");
    }

    @When("^I go to registration page$")
    public void iGoToRegistrationPage() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnRegistrationButton();
        // asercja sprawdzająca czy w linku jest słowo register
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("register"));
    }

    ///    public void clickAllLinks() {
    //        for (WebElement temp : linkList) {
    //            temp.click();
    //
    //            String title = driver.getTitle();
    //            //sprawdź czy w tytule zakładki jest słowo Coders
    //            assertTrue(title.contains("Coders"));
    //            assertFalse(title.contains("Error"));
    //
    //            driver.navigate().back();
    //        }
    //    }



    @And("^I select private user$")
    public void iSelectPrivateUser() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.clickPrivateButton();
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter name \"([^\"]*)\" surname \"([^\"]*)\"$")
    public void iEnterNameSurname(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I provide password \"([^\"]*)\"$")
    public void iProvidePassword(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter address city \"([^\"]*)\" zip code \"([^\"]*)\" street \"([^\"]*)\" number \"([^\"]*)\"$")
    public void iEnterAddressCityZipCodeStreetNumber(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I check that I have read terms$")
    public void iCheckThatIHaveReadTerms() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click registration button$")
    public void iClickRegistrationButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User should be succesfully created$")
    public void userShouldBeSuccesfullyCreated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
