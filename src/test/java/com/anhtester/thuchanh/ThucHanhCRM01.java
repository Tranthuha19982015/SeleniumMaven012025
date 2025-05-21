package com.anhtester.thuchanh;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;

public class ThucHanhCRM01 extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        loginCRM();

        driver.findElement(By.xpath());
        closeDriver();
    }
}
