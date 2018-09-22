package codersguru;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CucumberNewCompanyTest extends FirefoxBaseTest {
    @And("^I select company user$")
    public void iSelectCompanyUser()  {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.clickCompanyButton();
    }


    @And("^I enter company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String companyName) {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.fillCompanyNameTextBox(companyName);
    }

    @And("^I enter generated NIP$")
    public void iEnterNIP() {
        WebDriver helpDriver = new FirefoxDriver();
        helpDriver.get("http://generatory.it/");
        String nip = helpDriver.findElement(By.id("nipBox")).getText();
        helpDriver.close();

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.fillNipTextBox(nip);
    }
}
