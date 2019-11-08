package com.qa.baseFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
    WebDriver webDriver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        webDriver= new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
    }

    @Test
    public void facebookLoginPage(){
        String title = webDriver.getTitle();
        System.out.println("title of the application = " + title);
        webDriver.findElement(By.id("email")).sendKeys("sanjeevkmr531@gmail.com");
        webDriver.findElement(By.id("pass")).sendKeys("s9949424394");
        webDriver.findElement(By.xpath("//input[@type='submit']")).click();
        String currentUrl = webDriver.getCurrentUrl();
        System.out.println("currentUrl is  = " + currentUrl);
    }

  @AfterMethod
    public void teardown()
  {
      webDriver.quit();
  }

}
