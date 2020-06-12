package com.softclub.gmail.com.pages;

import com.softclub.gmail.com.models.User;
import framework.elements.Button;
import framework.elements.TextBox;
import framework.webdriver.BaseForm;
import org.openqa.selenium.By;

public class LoginContinuePage extends BaseForm {
    private TextBox txbPassword = new TextBox(By.name("password"), "Password");
    private Button btnNext = new Button(By.id("passwordNext"), "Next");

    public LoginContinuePage() {
        super(By.name("password"), "Login continue page");
    }

    public void fillInPasswordAndClickNext(User user) {
        txbPassword.clearAndType(user.getPassword());
        btnNext.waitForElementClickable();
        btnNext.clickAndWait();
    }
}