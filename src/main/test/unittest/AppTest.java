package unittest;

import jdk.internal.jline.internal.TestAccessible;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AppTest {

    private static WebDriver webDriver;

    @BeforeClass
    public static void initDriver(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://my.rozetka.com.ua/signin/");
    }

    @Test
    public static void loginTest(){
        MainPage mainPage = PageFactory.initElements(webDriver, MainPage.class);
        mainPage.pressLoginButton();
        LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        loginPage.enterCredentials("midgard_13@ukr.net", "13666Lol*");
        assertTrue(ProfilePage.isProfilePageopened());
    }

    @AfterClass
    public static void cleanup(){
        webDriver.quit();
    }

}
