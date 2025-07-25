package com.anhtester.Bai8_CheckBox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleRadioButton extends BaseTest {

    public static void handleRadioButton() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        Thread.sleep(1000);

        boolean unCheck = driver.findElement(By.xpath("//p[text()='Click on button to get the selected value.']/following-sibling::label[text()='Female']/input")).isSelected();
        System.out.println("Radio button 'Female' is unselected: " + unCheck);

        driver.findElement(By.xpath("//p[text()='Click on button to get the selected value.']/following-sibling::label[text()='Female']")).click();
        System.out.println("Radio button 'Female' is selected");

        boolean check = driver.findElement(By.xpath("//p[text()='Click on button to get the selected value.']/following-sibling::label[text()='Female']/input")).isSelected();
        System.out.println("Radio button 'Female' is selected: " + check);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//p[text()='Click on button to get the selected value.']/following-sibling::label[text()='Male']")).click();
        System.out.println("Radio button 'Male' is selected");

        boolean unCheck2 = driver.findElement(By.xpath("//p[text()='Click on button to get the selected value.']/following-sibling::label[text()='Female']/input")).isSelected();
        System.out.println("Radio button 'Female' is unselected: " + unCheck2);

        Thread.sleep(2000);
        driver.quit();

    }

    public static void handleListRadio() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        loginCRM();

        driver.findElement(By.xpath("//span[@class='menu-text'][normalize-space()='Sales']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Proposals']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Proposal']")).click();

        List<WebElement> listRadioButton = driver.findElements(By.xpath("//span[normalize-space()='Show quantity as:']/following-sibling::div//input[@type='radio']"));

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

        WebElement element = driver.findElement(By.xpath("//label[normalize-space()='Hours']/preceding-sibling::input"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//label[normalize-space()='Hours']")).click();

        Thread.sleep(2000);
        driver.quit();

    }

    public static void main(String[] args) throws InterruptedException {
        handleRadioButton();
        handleListRadio();
    }
}
