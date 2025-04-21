package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_GetText {
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

        Thread.sleep(2000);

        driver.findElement(By.xpath(LocatorsCRM.linkMenuCustomer)).click();

        Thread.sleep(2000);
        String headerCustomersText = driver.findElement(By.xpath(LocatorsCRM.labelCustomersSummary)).getText();

        System.out.println("Header Customers: " + headerCustomersText);

        if (headerCustomersText.equals("Customers Summary")) {
            System.out.println("Header Customer is correct");
        }

        String totalCustomer = driver.findElement(By.xpath(LocatorsCRM.numberTotalCustomers)).getText();
        System.out.println(totalCustomer);

        String tagName = driver.findElement(By.xpath(LocatorsCRM.numberTotalCustomers)).getTagName();
        System.out.println(tagName);

        String textColor=driver.findElement(By.xpath(LocatorsCRM.labelActiveCustomers)).getCssValue("color");
        System.out.println(textColor);

        String textFontFamily=driver.findElement(By.xpath(LocatorsCRM.labelActiveCustomers)).getCssValue("font-family");
        System.out.println(textFontFamily);

        String textFontSize=driver.findElement(By.xpath(LocatorsCRM.labelActiveCustomers)).getCssValue("font-size");
        System.out.println(textFontSize);

        Thread.sleep(2000);
        driver.quit();
    }
}
