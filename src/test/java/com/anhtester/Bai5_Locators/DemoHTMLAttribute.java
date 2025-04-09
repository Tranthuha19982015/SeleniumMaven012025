package com.anhtester.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoHTMLAttribute {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //maximize để phóng to màn hình hết cỡ
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //xét thời gian tối đa là 10s để tìm kiếm Element

        driver.get("https://crm.anhtester.com/admin/authentication"); // để mở 1 URL

        driver.findElement(By.id("email")).sendKeys("admin@example.com"); //id

        driver.findElement(By.name("password")).sendKeys("123456"); //name

//        driver.findElement(By.linkText("Forgot Password?")).click(); //LinkText

//        driver.findElement(By.partialLinkText("Forgot")).click(); //PartialLinkText

//        driver.findElement(By.tagName("button")).click(); //TagName

//        driver.findElement(By.className("btn-primary")).click(); //ClassName

        driver.findElement(By.xpath("//button")).click();  //xPath

        Thread.sleep(4000); // dừng màn hình 4s trước khi đóng trình duyệt (thời gian nghỉ)

        driver.quit(); //tắt trình duyệt
    }
}
