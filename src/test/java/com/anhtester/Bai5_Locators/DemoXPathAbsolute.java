package com.anhtester.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoXPathAbsolute {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[1]/input")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[4]/button")).click();

//        driver.findElement(By.xpath("/html/body/aside/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/aside[1]/ul[1]/li[3]/a[1]")).click();
//        driver.findElement(By.xpath("//ul[@id='side-menu']/li"));

        Thread.sleep(3000);
        driver.quit();
    }
}
