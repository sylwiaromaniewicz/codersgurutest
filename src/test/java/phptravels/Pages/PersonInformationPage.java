package phptravels.Pages;

import aCommon.BasePage;
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

    @FindBy (name="phone")
    private WebElement phoneTextBox;

    @FindBy (xpath="/html/body/div[10]/div/input")
    private WebElement countryTextBox;

    @FindBy (xpath="/html/body/div[4]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/form/div[8]/div/div[1]/label/div")
    private WebElement checkBox;



    public PersonInformationPage(WebDriver driver) {
        super(driver);
    }
}
