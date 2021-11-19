package SempleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sum_smoke_tests.selenium_testng2;

public class SempleTest {
    private WebDriver webDriver;

    @BeforeMethod
public void setUp(){
        System.out.println("Start Browser");
        System.setProperty("webdriver.chrome.driver","F:/1111/chromedriver.exe");
        webDriver = new ChromeDriver();
        System.out.println("Open website");
        webDriver.get("https://rozetka.com.ua/");

    }
@AfterMethod

    public void cleanUp(){
    System.out.println("Close Browser");
      //  if(webDriver != null)
        //    webDriver.quit();
    }


    @Test
    public void Test1(){
        System.out.println("Check url");
     Assert.assertEquals("https://rozetka.com.ua/",webDriver.getCurrentUrl());
        System.out.println("Check title");
     Assert.assertEquals("Интернет-магазин ROZETKA™: официальный сайт самого популярного онлайн-гипермаркета в Украине", webDriver.getTitle());


    }
@Test
    public void Test2_register(){

    WebDriverWait wait = new WebDriverWait(webDriver, 10);

    System.out.println("Click on register button");
    webDriver.findElement(By.xpath("//rz-user/button")).click();

    System.out.println("Enter email");
    webDriver.findElement(By.id("auth_email")).sendKeys("demonation20@gmail.com");

    System.out.println("Enter pass");
    webDriver.findElement(By.id("auth_pass")).sendKeys("QWASZXerdfcv12345");

    System.out.println("Click autorization");
    webDriver.findElement(By.xpath("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']")).click();


}



}
