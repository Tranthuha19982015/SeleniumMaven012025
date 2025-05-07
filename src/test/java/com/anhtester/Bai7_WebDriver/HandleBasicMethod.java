package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBasicMethod {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://anhtester.com/");

        driver.findElement(By.id("btn-login")).click();

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Page Title: " + driver.getCurrentUrl());
        System.out.println("Page Source");
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
