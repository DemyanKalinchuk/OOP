package sum_smoke_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class selenium_testng_search {




    public WebDriver driver;
    @Test
    public void ChromeTest(){
        System.setProperty("webdriver.chrome.driver","F:/1111/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        String title = driver.getTitle();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String email2 = "demonation20@gmail.com";
        driver.findElement(By.xpath("//rz-user/button")).click();
        driver.findElement(By.xpath("//button[@class='auth-modal__register-link button button--link ng-star-inserted']")).click();
        driver.findElement(By.xpath("//button[@class='button\n" +
                "               button--large\n" +
                "               button--gray\n" +
                "               button--with-icon\n" +
                "               auth-modal__social-button']")).click();

        // driver.findElement(By.xpath("//div[@class='AxOyFc snByac']")).sendKeys("demonation20@gmail.com");


    }
    @Test
    public void Test11()

    {
        System.out.println("Hello it's a number 2 test");
    }
}



