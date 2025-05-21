package com.anhtester.Bai7_WebDriver;

import com.anhtester.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleListElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(LocatorsCRM.url);

        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@id='side-menu']/li[contains(@class,'menu-item')]"));

        System.out.println(listMenu.size());

        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println("Menu " + (i + 1) + listMenu.get(i).getText());
        }

        System.out.println(listMenu.get(0).getText().equals("Home"));
        System.out.println(listMenu.get(1).getText().equals("Customers"));

        driver.quit();
    }
}
