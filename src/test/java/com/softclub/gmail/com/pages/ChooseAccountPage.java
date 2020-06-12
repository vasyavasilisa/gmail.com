package com.softclub.gmail.com.pages;

import framework.webdriver.BaseForm;
import org.openqa.selenium.By;

public class ChooseAccountPage extends BaseForm {
    public ChooseAccountPage() {
        super(By.id("profileIdentifier"), "Choose account page");
    }
}
