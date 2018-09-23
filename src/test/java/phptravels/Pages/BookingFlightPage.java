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

       @FindBy (className = "select2-input")
    private List<WebElement> inputs; //pobieramy dwa web elementy tej samej klasy do listy zmiennych

    @FindBy (xpath = "/html/body/div[11]/div/input")
    private WebElement fromCitySelectBox;

    @FindBy (xpath = "/html/body/div[12]/div/input")
    private WebElement toCitySelectBox;

    @FindBy (xpath = "/html/body/div[4]/div[2]/div/form/div[3]/div/input")
    private WebElement fromDateSelectBox;

    @FindBy (xpath = "/html/body/div[4]/div[2]/div/form/div[3]/div/input")
    private WebElement toDateSelectBox;


    public void choseRoundTrip(){
        roundTripCheckBox.click();
    }


    public void enterDepartueAndArival(String from, String to){
      //  inputs.get(0).click();
      //  inputs.get(0).sendKeys(from);
      //  inputs.get(0).sendKeys(Keys.RETURN);
        fromCitySelectBox.click();
        fromCitySelectBox.sendKeys(from);
        fromCitySelectBox.sendKeys(Keys.RETURN);
        toCitySelectBox.click();
        toCitySelectBox.sendKeys(to);
        toCitySelectBox.sendKeys(Keys.RETURN);
    }

    public void enterDate(String from, String to){
        fromDateSelectBox.click();
        fromDateSelectBox.sendKeys(from);
        fromDateSelectBox.sendKeys(Keys.RETURN);
        toDateSelectBox.click();
        toDateSelectBox.sendKeys(to);
        toDateSelectBox.sendKeys(Keys.RETURN);
    }





}
