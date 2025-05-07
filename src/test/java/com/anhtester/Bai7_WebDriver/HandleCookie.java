package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleCookie {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/");

//         Add Cookie
        driver.manage().addCookie(new Cookie("sp_session", "sutc97hv8gbv2qud97v9icv2p9rlri8u"));


        driver.get("https://crm.anhtester.com/admin/");
        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.quit();
    }
}
