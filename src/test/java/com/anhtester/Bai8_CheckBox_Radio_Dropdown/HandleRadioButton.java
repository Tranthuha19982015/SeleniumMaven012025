package com.anhtester.Bai8_CheckBox_Radio_Dropdown;

import com.anhtester.Bai5_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleRadioButton {

    public static void HandleRadioButton1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/radio-button");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
        System.out.println("Radio button 'Yes' is selected");

        boolean check = driver.findElement(By.xpath("//input[@id='yesRadio']")).isSelected();
        System.out.println("Radio button 'Yes' is selected: " + check);

        driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
        System.out.println("Radio button 'Yes' is unselected");

        boolean unCheck = driver.findElement(By.xpath("//input[@id='yesRadio']")).isSelected();
        System.out.println("Radio button 'Yes' is unselected: " + unCheck);

        Thread.sleep(2000);
        driver.quit();

    }

    public static void HandleRadioButton2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(LocatorsCRM.url);

        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        driver.findElement(By.xpath("//span[@class='menu-text'][normalize-space()='Sales']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Proposals']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Proposal']")).click();

        List<WebElement> listRadioButton = driver.findElements(By.xpath("//span[normalize-space()='Show quantity as:']/following-sibling::div//input[@type = 'radio']"));

        System.out.println("Total radio buttons = " + listRadioButton.size());

        int check1 = 0;
        int check2 = 0;

        for (int i = 0; i < listRadioButton.size(); i++) {
            if (listRadioButton.get(i).isSelected()) {
                System.out.println("Radio button " + (i + 1) + " is selected");
                check1++;
            } else {
                System.out.println("Radio button " + (i + 1) + " is unselected");
                check2++;
            }
        }

        System.out.println("Total radio buttons selected = " + check1);
        System.out.println("Total radio buttons unselected = " + check2);

        Thread.sleep(2000);
        driver.quit();

    }

    public static void main(String[] args) throws InterruptedException {
        //  HandleRadioButton1();
        HandleRadioButton2();
    }
}
