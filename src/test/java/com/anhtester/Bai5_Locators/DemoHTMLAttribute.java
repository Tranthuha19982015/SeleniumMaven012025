package com.anhtester.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoHTMLAttribute {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        driver.findElement(By.name("password")).sendKeys("123456");

//        driver.findElement(By.linkText("Forgot Password?")).click();

//        driver.findElement(By.partialLinkText("Forgot")).click();

//        driver.findElement(By.tagName("button")).click();

//        driver.findElement(By.className("btn-primary")).click();

        driver.findElement(By.xpath("//button")).click();

        Thread.sleep(4000);

        driver.quit();
    }
}
