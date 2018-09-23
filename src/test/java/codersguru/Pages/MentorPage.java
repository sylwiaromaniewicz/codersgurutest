package codersguru.Pages;

import aCommon.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MentorPage extends BasePage {
    public MentorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "/html/body/main/div[2]/div/div[1]/div/div[2]/div[2]/button")
    private WebElement firstMentor;

    @FindBy (xpath = "/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/textarea")
    private WebElement messageTextBox;

    @FindBy (xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/ul/li[1]")
    private WebElement dateLink;

    @FindBy (xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[3]/div[2]/ul/li[1]")
    private WebElement houreLink;

    @FindBy (xpath = "/html/body/div[1]/div/div/div[2]/div[2]/div[3]/a/button")
    private WebElement submitOrderAndPaymentButton;

    public void choseMentor(){
        firstMentor.click();
    }

    public void writeMessage(String message){
        messageTextBox.sendKeys(message);
    }

    public void choseDateAndTime(){
        dateLink.click();
        houreLink.click();
        submitOrderAndPaymentButton.click();
    }






}
