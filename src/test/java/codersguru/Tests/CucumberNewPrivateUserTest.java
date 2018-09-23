package codersguru.Tests;

import aCommon.FirefoxBaseTest;
import codersguru.Pages.HomePage;
import codersguru.Pages.HomePageUserSingIn;
import codersguru.Pages.RegistrationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CucumberNewPrivateUserTest extends FirefoxBaseTest {
    @Given("^I open coders guru website$")
    public void iOpenCodersGuruWebsite()  {
        FirefoxBaseTest.setUp();
        driver.get("https://men-men-s-01.codersguru.pl/");

    }

    @When("^I go to registration page$")
    public void iGoToRegistrationPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnRegistrationButton();
        // asercja sprawdzająca czy w linku jest słowo register
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("register"));
    }

    @And("^I select private user$")
    public void iSelectPrivateUser() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.clickPrivateButton();
        // odwołujemy się do metody w regidtraction page i sprawdzamy czy buttom jest active
        String activeClass = registrationPage.checkPrivateButtonClick();
        assertTrue(activeClass.contains("active"));
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        // wpisujemy mail i sprawdzaamy czy wyietlilo się: "Wprowadzono niepoprawny adres e-mail"
        registrationPage.fillEmailTextBox(email);
        /// nie sprawdzamy czy się wyświetliło!!! - dlatego odkomentowałam
      //  String textError = registrationPage.checkEmailErrorMassage()
        // assertFalse(textError.contains("niepoprawny"));
    }

    @And("^I enter name \"([^\"]*)\" surname \"([^\"]*)\"$")
    public void iEnterNameSurname(String name, String surname) {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        // wpisujemy imię i nazwisko
        registrationPage.fillNameAndSurnameTextBox(name,surname);
    }

    @And("^I provide password \"([^\"]*)\"$")
    public void iProvidePassword(String password) {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        // wpisujemy hasla
        registrationPage.fillPasswordTextBoxes(password);
    }

    @And("^I enter address city \"([^\"]*)\" zip code \"([^\"]*)\" street \"([^\"]*)\" number \"([^\"]*)\"$")
    public void iEnterAddressCityZipCodeStreetNumber(String city, String zipCode, String street, String no) {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        // wpisujemy adres
        registrationPage.fillAddressTextBoxes(city, zipCode, street, no);
    }

    @And("^I check that I have read terms$")
    public void iCheckThatIHaveReadTerms() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        // odznaczamy przeczytany regulamin
        registrationPage.clickOnStatuteCheckBox();
    }

    @And("^I click registration button$")
    public void iClickRegistrationButton() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        //zatwierdzamy cały szablon
        registrationPage.clickOnRegisterButtom();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^User should be succesfully created \"([^\"]*)\"$")
    public void userShouldBeSuccesfullyCreated(String name) {

        HomePageUserSingIn homePageUserSingIn = new HomePageUserSingIn(driver);
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("confirmed"));
        String nameUser = homePageUserSingIn.getUserName();
        assertTrue(nameUser.contains(name));
        driver.close();

    }

}
