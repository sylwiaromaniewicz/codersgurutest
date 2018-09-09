package codersguru;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class EnterEmailTest {
    protected static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void cleanUp(){
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }

    @Test
    public void testEnteringEmail() {
        driver.get("https://men-men-s-01.codersguru.pl/");
        HomePage homePage = new HomePage(driver);
        homePage.enterEmail("test@mail.com");
    }
}