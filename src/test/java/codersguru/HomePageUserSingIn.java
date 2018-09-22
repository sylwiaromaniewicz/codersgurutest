package codersguru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageUserSingIn extends HomePage {

    @FindBy(id = "user-name")
    private WebElement userName;  //Alt + Enter !!! zaimportował się WebElement automatycznie

    public HomePageUserSingIn(WebDriver driver){
        super(driver);
    }

    public String getUserName(){
        String text = this.userName.getText();
        return text;
    }
}
