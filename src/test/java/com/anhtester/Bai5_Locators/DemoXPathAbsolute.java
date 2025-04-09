package com.anhtester.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoXPathAbsolute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[1]/input")).sendKeys("admin@example.com");
    }
}
