package codersguru.Pages;

import aCommon.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    private WebElement emailTextBox;

    @FindBy(id = "password")
    private WebElement passwordTextBox;

    @FindBy(id = "_submit")
    private WebElement submitButtom;


    public void logginIn(String email, String password){
        emailTextBox.clear();
        emailTextBox.sendKeys(email);
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
        submitButtom.click();
    }




}
