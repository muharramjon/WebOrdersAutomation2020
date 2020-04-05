package com.weborders.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.weborders.utilities.Driver;

public class AbstractBasePage {

    /**
     * It meant to be extended
     */

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 20);

    public AbstractBasePage() {
        PageFactory.initElements(driver, this);
    }
}

