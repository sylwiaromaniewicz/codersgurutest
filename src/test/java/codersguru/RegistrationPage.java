package codersguru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage  extends BasePage{

    @FindBy(id = "person")
    private WebElement personButtomLink;

    public RegistrationPage(WebDriver driver){
        super(driver);
    }

    public void clickPrivateButton(){
        this.personButtomLink.click();
    }

}
