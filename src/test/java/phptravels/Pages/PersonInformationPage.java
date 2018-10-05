package phptravels.Pages;

import aCommon.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonInformationPage extends BasePage {

    @FindBy (name="firstname")
    private WebElement firstNameTextBox;

    @FindBy (name="lastname")
    private WebElement lastNameTextBox;

    @FindBy (name="email")
    private WebElement emailTextBox;

    @FindBy (name="confirmemail")
    private WebElement confirmEmailTexTBox;

    @FindBy (name="phone")
    private WebElement phoneTextBox;

    @FindBy (name="address")
    private WebElement addressTextBox;

    @FindBy (xpath="/html/body/div[4]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/form/div[6]/div[2]/div/a")
    private WebElement countryClickOnBox;

    @FindBy (xpath="/html/body/div[10]/div/input")
    private WebElement countryTextBox;

    @FindBy (name="guest")
    private WebElement guestSubbmitButton;

    public void iFillInTheForm (String firstname, String lastname, String email, String phone, String address, String country){
        firstNameTextBox.sendKeys(firstname);
        lastNameTextBox.sendKeys(lastname);
        emailTextBox.sendKeys(email);
        confirmEmailTexTBox.sendKeys(email);
        phoneTextBox.sendKeys(phone);
        addressTextBox.sendKeys(address);
        countryClickOnBox.click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countryTextBox.sendKeys(country);
        countryTextBox.sendKeys(Keys.RETURN);
        guestSubbmitButton.click();

    }

    public PersonInformationPage(WebDriver driver) {
        super(driver);
    }
}
