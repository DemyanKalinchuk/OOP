package sum_smoke_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class selenium_testng_ident {

    public WebDriver driver;
    @Test
    public void ChromeTest()

    {
        //Initialize the chrome driver
        System.setProperty("webdriver.chrome.driver","F:/1111/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
        driver.get("https://rozetka.com.ua/");
        String title = driver.getTitle();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("//rz-user/button")).click();
        String email = "demonation20@gmail.com";
        driver.findElement(By.xpath(".//*[@id='auth_email']")).sendKeys("demonation20@gmail.com");
        driver.findElement(By.id("auth_pass")).sendKeys("2rpMIUMu7BWU");
        driver.findElement(By.xpath("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']")).click();

    }
    }
