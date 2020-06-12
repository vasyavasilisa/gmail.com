package com.softclub.gmail.com.pages.forms;

import framework.elements.Link;
import framework.webdriver.BaseForm;
import org.openqa.selenium.By;

public class HeaderForm extends BaseForm {
    private Link lnkAccountImg = new Link(By.xpath("//a[contains(@href, 'SignOutOptions')]"), "Account image");

    public HeaderForm() {
        super(By.xpath("//header"), "Header form");
    }


    public void clickAccountImage() {
        lnkAccountImg.waitAndClick();
    }
}