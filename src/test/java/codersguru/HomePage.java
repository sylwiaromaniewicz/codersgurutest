package codersguru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class HomePage extends BasePage {

    @FindBy(name = "email")
    private WebElement emailTextBox;

    @FindBy(xpath = "/html/body/section[1]/div/div[1]/a")
    private WebElement homePageLink;

    @FindBy(xpath = "/html/body/section[1]/div/div[2]/nav/ul/li[1]/a")
    private WebElement howItWorksLink;

    @FindBy(xpath = "/html/body/section[1]/div/div[2]/nav/ul/li[2]/a")
    private WebElement priceListLink;

    @FindBy(xpath = "/html/body/section[1]/div/div[2]/nav/ul/li[3]/a")
    private WebElement beMentorLink;

    @FindBy(name = "button")
    private WebElement singInLink;

    @FindBy(xpath = "/html/body/footer/div/div[1]/a[1]")
    private WebElement regulaminLink;

    

    WebElement[] linkList = new WebElement[]{
            homePageLink,
            howItWorksLink,
            priceListLink,
            beMentorLink,
            singInLink
    };


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        this.emailTextBox.clear();
        this.emailTextBox.sendKeys(email);
    }

    public void clickAllLinks() {
        for (WebElement temp : linkList) {
            temp.click();
            homePageLink.click();
        }
    }


}
