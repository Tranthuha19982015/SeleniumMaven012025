package com.anhtester.thuchanh;

import com.anhtester.LocatorsCRM;
import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class AddNewCustomer extends BaseTest {
    public static void openNewCustomerPage() {
        driver.findElement(By.xpath(LocatorsCRM.linkMenuCustomer)).click();
    }

    public static void addNewCustomer(String customerName) throws InterruptedException {
        driver.findElement(By.xpath(LocatorsCRM.buttonNewCustomer)).click();

        driver.findElement(By.xpath(LocatorsCRM.inputCompany)).sendKeys(customerName);
        driver.findElement(By.xpath(LocatorsCRM.inputVatNumber)).sendKeys("10");
        driver.findElement(By.xpath(LocatorsCRM.inputPhone)).sendKeys("0965868594");
        driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).sendKeys("https://www.hatestcompany.com");
//        dropdown group
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroups)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchGroups)).sendKeys("VIP", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroups)).click();
        Thread.sleep(1000);
//        default currency
        driver.findElement(By.xpath(LocatorsCRM.dropdownCurrency)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCurrency)).sendKeys("USD", Keys.ENTER);
        Thread.sleep(1000);
//        language default
        driver.findElement(By.xpath(LocatorsCRM.dropdownDefaultLanguage)).click();
        Thread.sleep(1000);
//        C1:
        String xpathLanguage = String.format(LocatorsCRM.optionDefaultLanguage, "Vietnamese");
        driver.findElement(By.xpath(xpathLanguage)).click();
        Thread.sleep(1000);
//        C2:
//        driver.findElement(By.xpath(LocatorsCRM.selectXPathLanguage("Vietnamese"))).click();

        driver.findElement(By.xpath(LocatorsCRM.inputAddress)).sendKeys("123 Street, City, Country");
        driver.findElement(By.xpath(LocatorsCRM.inputCity)).sendKeys("Hanoi");
        driver.findElement(By.xpath(LocatorsCRM.inputState)).sendKeys("Hanoi");
        driver.findElement(By.xpath(LocatorsCRM.inputZipCode)).sendKeys("100000");
//          country
        driver.findElement(By.xpath(LocatorsCRM.dropdownCountry)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCountry)).sendKeys("Vietnam", Keys.ENTER);
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.buttonSave)).click();
        Thread.sleep(2000);
    }

    public static void searchCustomer(String customerName) throws InterruptedException {
        driver.findElement(By.xpath(LocatorsCRM.linkMenuCustomer)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearch)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputSearch)).sendKeys(customerName);
        System.out.println("Searching for customer: " + customerName);
        Thread.sleep(3000);
        String firstRowCustomer = driver.findElement(By.xpath(LocatorsCRM.firstRowItemCustomer)).getText();
        System.out.println("First row customer: " + firstRowCustomer);
    }

    public static void main(String[] args) throws InterruptedException {
        createDriver();
        loginCRM();
        openNewCustomerPage();

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTime = now.format(formatter);

        addNewCustomer("Test Company " + dateTime);
        searchCustomer("Test Company " + dateTime);

        Thread.sleep(2000);
        closeDriver();
    }
}
