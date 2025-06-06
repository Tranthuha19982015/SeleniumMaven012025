package com.anhtester.Bai6_WebElement;

import com.anhtester.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_Click_Sendkeys_Clear {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(LocatorsCRM.url);

        boolean checkHeaderLoginPage = driver.findElement(By.xpath(LocatorsCRM.headerLoginPage)).isDisplayed();
        System.out.println("checkHeaderLoginPage: " + checkHeaderLoginPage);

        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");

        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");

        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
