package com.softclub.gmail.com.pages;

import com.softclub.gmail.com.models.User;
import framework.elements.Button;
import framework.elements.TextBox;
import framework.webdriver.BaseForm;
import org.openqa.selenium.By;

public class LoginPage extends BaseForm {
    private TextBox txbLogin = new TextBox(By.name("identifier"), "Login");
    private Button btnNext = new Button(By.id("identifierNext"), "Next");

    public LoginPage() {
        super(By.name("identifier"), "Login page");
    }

    public void fillInLoginAndClickNext(User user) {
        txbLogin.clearAndType(user.getLogin());
        btnNext.waitAndClick();
    }
}