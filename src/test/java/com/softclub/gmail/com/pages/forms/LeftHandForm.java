package com.softclub.gmail.com.pages.forms;

import com.softclub.gmail.com.enums.LeftHandMenuItem;
import framework.elements.Button;
import framework.elements.Link;
import framework.webdriver.BaseForm;
import org.openqa.selenium.By;

public class LeftHandForm extends BaseForm {
    private static final String PACKAGE_LOCATOR = "//a[contains(@href, '%1$s')]";

    private Button btnWrite = new Button(By.xpath("//div[@class='aic']//div[@role='button']"), "Write");

    public LeftHandForm() {
        super(By.xpath("//div[contains(@class,'aeN')]"), "Left hand menu");
    }

    public void clickToWriteLetter() {
        btnWrite.waitAndClick();
    }

    public void navigateMenu(LeftHandMenuItem menuItem){
        new Link(By.xpath(String.format(PACKAGE_LOCATOR, menuItem.getLocPart())), menuItem.name()).waitAndClick();
    }
}