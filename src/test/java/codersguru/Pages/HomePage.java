package codersguru.Pages;

import aCommon.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.junit.Assert.*;

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

    @FindBy(xpath = "/html/body/section[3]/div/form/input[2]")
    private WebElement registrationLink;

    @FindBy(xpath = "/html/body/footer/div/div[1]/a[1]")
    private WebElement regulaminLink;

    @FindBy(xpath = "/html/body/footer/div/div[1]/a[2]")
    private WebElement howItWorks2Link;

    @FindBy(xpath = "/html/body/footer/div/div[2]/a/img")
    private WebElement facebookLink;

    @FindBy(xpath = "/html/body/footer/div/legal/a")
    private WebElement codersLabLink;

     WebElement[] linkList = new WebElement[]{
            homePageLink,
            howItWorksLink,
            priceListLink,
            beMentorLink,
            singInLink,
            registrationLink,
            regulaminLink,
            howItWorks2Link,
            facebookLink
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

            String title = driver.getTitle();
            //sprawdź czy w tytule zakładki jest słowo Coders
            assertTrue(title.contains("Coders"));
            assertFalse(title.contains("Error"));

            driver.navigate().back();
        }
    }

    public void clickOnCodersLabLink() {
        // złap uchwyt do aktualnego okna
        String parentHandle = driver.getWindowHandle();
        // kliknij na codersLabLink i otwórz nowe okno
        codersLabLink.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // przeswitchuj się do otwartego okna
        for (String winHandle: driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        // sprawdź asercje
        assertTrue(driver.getTitle().contains("Coders"));

        // zamknij okno
        driver.close();
        // wróc do poprzedniego okna
        driver.switchTo().window(parentHandle);
    }

    public void clickOnRegistrationButton(){

        registrationLink.click();
    }

}


