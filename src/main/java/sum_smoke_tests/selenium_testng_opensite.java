package sum_smoke_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class selenium_testng_opensite {
    public WebDriver driver;
    @Test
    public void ChromeTest()

    {
        //Initialize the chrome driver
        System.setProperty("webdriver.chrome.driver","F:/1111/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");



    }
}
