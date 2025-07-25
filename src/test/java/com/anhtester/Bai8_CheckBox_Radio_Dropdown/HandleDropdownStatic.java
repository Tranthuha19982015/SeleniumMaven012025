package com.anhtester.Bai8_CheckBox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownStatic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");

        //Tạo class Select từ Selenium
        Select select = new Select(driver.findElement(By.id("select-demo")));
        Thread.sleep(2000);

        //Select option theo text hiển thị
        select.selectByVisibleText("Thursday");
        Thread.sleep(1000);

        //Get giá trị sau khi đã chọn
        System.out.println(select.getFirstSelectedOption().getText());

        //Select option theo value
        select.selectByValue("Tuesday");
        Thread.sleep(1000);

        //Get giá trị sau khi đã chọn
        System.out.println(select.getFirstSelectedOption().getText());

        //Select option theo index (index bắt đầu từ 0)
        select.selectByIndex(2);
        Thread.sleep(1000);

        //Get giá trị sau khi đã chọn
        System.out.println(select.getFirstSelectedOption().getText());

        Thread.sleep(1000);
        closeDriver();
    }
}
