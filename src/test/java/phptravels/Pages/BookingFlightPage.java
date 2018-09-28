package phptravels.Pages;

import aCommon.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BookingFlightPage extends BasePage {

    public BookingFlightPage (WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "/html/body/div[4]/div[2]/div/form/div[9]/div[2]/div/div/ins")
    private WebElement roundTripCheckBox;

  //  @FindBy (className = "select2-input")
  //  private List<WebElement> inputs; //pobieramy web elementy tej samej klasy do listy zmiennych - nieaktualne elementów jest wiecej niż dwa

    @FindBy (id = "s2id_location_from")
    private WebElement fromCityClickOnBox;

    @FindBy (xpath = "/html/body/div[11]/div/input")
    private WebElement fromCityTextBox;

    @FindBy (id="s2id_location_to")
    private WebElement toCityClickOnBox;

    @FindBy (xpath="/html/body/div[12]/div/input")
    private WebElement toCityTextBox;

    @FindBy (name="departure")
    private WebElement fromDateTextBox;

    @FindBy (name="arrival")
    private WebElement toDateTextBox;

    @FindBy (xpath="//*[@id=\"body-section\"]/div[2]/div/form/div[6]/button")
    private WebElement submitButton;

    @FindBy (xpath="//*[@id=\"bookbtn\"]") // id="bookbtn")
    private WebElement bookingButtom;


    public void choseRoundTrip(){
        roundTripCheckBox.click();
    }

    public void enterDepartueAndArival(String from, String to){
      //  inputs.get(0).click();
      //  inputs.get(0).sendKeys(from);
      //  inputs.get(0).sendKeys(Keys.RETURN);   /// to by było do naszej listy
        fromCityClickOnBox.click();
        fromCityTextBox.sendKeys(from);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fromCityTextBox.sendKeys(Keys.RETURN);
        toCityClickOnBox.click();
        toCityTextBox.sendKeys(to);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        toCityTextBox.sendKeys(Keys.RETURN);
    }

    public void enterDate(String from, String to){
        submitButton.click();
        fromDateTextBox.click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fromDateTextBox.sendKeys(from);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fromDateTextBox.sendKeys(Keys.RETURN);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        toDateTextBox.click();
        toDateTextBox.sendKeys(to);
        toDateTextBox.sendKeys(Keys.RETURN);

    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }

    public void clickOnBookingButton() { bookingButtom.click();}




}
