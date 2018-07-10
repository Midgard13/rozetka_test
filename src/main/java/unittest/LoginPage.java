package unittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
        public static void main( String[] args )
        {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://my.rozetka.com.ua/ua/");

        WebElement webelement = driver.findElement(By.id(a[@Name='signin']));
                //matching single element with attribute value=container

}
