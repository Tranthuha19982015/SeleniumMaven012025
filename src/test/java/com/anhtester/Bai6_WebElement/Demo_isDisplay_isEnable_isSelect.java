package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_isDisplay_isEnable_isSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(LocatorsCRM.url);

        boolean checkHeaderLoginPage = driver.findElement(By.xpath(LocatorsCRM.headerLoginPage)).isDisplayed();
        System.out.println("checkHeaderLoginPage: " + checkHeaderLoginPage);

        driver.findElement(By.xpath(LocatorsCRM.checkboxRememberMe)).click();
        boolean checkIsSelected = driver.findElement(By.xpath(LocatorsCRM.checkboxRememberMe)).isSelected();
        System.out.println("checkIsSelected: " + checkIsSelected);
        Thread.sleep(3000);

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        Thread.sleep(3000);

        boolean checkButtonIsDisplay = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isDisplayed();
        System.out.println("CheckButtonIsEnable: " + checkButtonIsDisplay);

        boolean checkButtonIsEnable = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("CheckButtonIsEnable: " + checkButtonIsEnable);

        Thread.sleep(3000);
        driver.quit();
    }
}
