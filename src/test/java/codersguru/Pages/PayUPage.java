package codersguru.Pages;

import aCommon.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayUPage extends BasePage {

    public PayUPage (WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "/html/body/div[1]/div/div[2]/main/div[2]/article/div[1]/div/div[1]/a[2]/div[2]/h4/span")
    private WebElement pickCardSubmitButtonLink;

    @FindBy (name = "number")
    private WebElement numberCardTextBox;

    @FindBy (xpath = "/html/body/div/div/div[2]/main/div[2]/article/div[1]/form/div[1]/label/span")
    private WebElement numberCardErrorMessage;

    @FindBy (name = "date")
    private WebElement dateCardTextBox;

    @FindBy (name = "cvv")
    private WebElement cvvCardTextBox;

    @FindBy (name = "name")
    private WebElement nameTextBox;

    @FindBy (name = "email")
    private WebElement emailTextBox;

    @FindBy (name = "submit")
    private WebElement submitOrderButtomLink;

    public void pickCreditCardPayment(){
        pickCardSubmitButtonLink.click();
    }

    public void enterOrderData (String cardNumber, String date, String noCvv, String name, String email){
        numberCardTextBox.sendKeys(cardNumber);
        dateCardTextBox.sendKeys(date);
        cvvCardTextBox.sendKeys(noCvv);
        nameTextBox.sendKeys(name);
        emailTextBox.sendKeys(email);
    }

    public String getNumberCardErrorMassage(){
        String message = numberCardErrorMessage.getText();
        return message;
    }

}
