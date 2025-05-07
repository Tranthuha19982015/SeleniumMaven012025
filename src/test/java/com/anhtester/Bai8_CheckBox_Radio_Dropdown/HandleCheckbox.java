package com.anhtester.Bai8_CheckBox_Radio_Dropdown;

import com.anhtester.Bai5_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HandleCheckbox {
    public static void HandleCheckbox1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/checkbox");

        driver.findElement(By.xpath("//label[@for='tree-node-home']")).click();
        System.out.println("Checkbox 'Home' is selected: ");

        // Kiem tra checkbox da duoc chon hay chua
        boolean checkboxSelected = driver.findElement(By.xpath("//input[@id='tree-node-home']")).isSelected();
        System.out.println("Checkbox 'Home' is selected: " + checkboxSelected);

        driver.findElement(By.xpath("//label[@for='tree-node-home']")).click();
        System.out.println("Checkbox 'Home' is unselected: ");

        // Kiem tra checkbox da duoc bo chon hay chua
        boolean checkboxUnSelected = driver.findElement(By.xpath("//input[@id='tree-node-home']")).isSelected();
        System.out.println("Checkbox 'Home' is selected: " + checkboxUnSelected);

        Thread.sleep(2000);
        driver.quit();
    }

    public static void HandleCheckbox2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(LocatorsCRM.url);

        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        driver.findElement(By.xpath("//div[normalize-space()='Dashboard Options']")).click();

        List<WebElement> listCheckbox = driver.findElements(By.xpath("//div[@id='dashboard-options']//input[@type = 'checkbox']"));
        System.out.println("Total checkboxes = " + listCheckbox.size());

        boolean check = false;

        for (int i = 0; i < listCheckbox.size(); i++) {
            if (listCheckbox.get(i).isSelected()) {
                System.out.println("Checkbox " + (i + 1) + " is selected");
                check = true;
            } else {
                System.out.println("Checkbox " + (i + 1) + " is unselected");
                check = false;
                break;
//                listCheckbox.get(i).click();
//                System.out.println("Checkbox " + (i + 1) + " is now selected");
            }
        }

        Thread.sleep(2000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        HandleCheckbox2();
    }
}
