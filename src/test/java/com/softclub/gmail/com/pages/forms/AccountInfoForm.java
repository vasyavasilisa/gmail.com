package com.softclub.gmail.com.pages.forms;

import framework.elements.Button;
import framework.webdriver.BaseForm;
import org.openqa.selenium.By;

public class AccountInfoForm extends BaseForm {
    private static final String PAGE_LOCATOR = "//a[contains(@href,'AddSession')]//ancestor::div[@aria-hidden='false' and contains(@class,'gb_na')]";

    private Button btnLogout = new Button(By.xpath(PAGE_LOCATOR + "//a[contains(@href, 'Logout')]"), "Logout");

    public AccountInfoForm() {
        super(By.xpath(PAGE_LOCATOR), "Account info form");
    }

    public void clickLogout() {
        btnLogout.waitAndClick();
    }
}