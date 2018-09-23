package codersguru.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageUserSingIn extends HomePage {

    public HomePageUserSingIn(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "user-name")
    private WebElement userName;  //Alt + Enter !!! zaimportował się WebElement automatycznie

    @FindBy (xpath = "/html/body/section[3]/div/div[1]/div/p[1]")
    private WebElement selectTextDesktop;

    @FindBy (xpath = "/html/body/section[3]/div/div[1]/div/ul/li[8]")
    private WebElement selectGit;

    @FindBy (xpath = "/html/body/section[3]/div/div[1]/input")
    private WebElement submitFindMentor;

    public String getUserName(){
        String text = this.userName.getText();
        return text;
    }

    public void selectGitMentor(){
        selectTextDesktop.click();
        selectGit.click();
        submitFindMentor.click();
    }



}
