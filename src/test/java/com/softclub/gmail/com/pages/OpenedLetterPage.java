package com.softclub.gmail.com.pages;

import com.softclub.gmail.com.models.Letter;
import framework.elements.Button;
import framework.webdriver.BaseForm;
import org.openqa.selenium.By;

public class OpenedLetterPage extends BaseForm {
    private Button lblSubject = new Button(By.xpath("//div[@class='nH' and @role='main']//div[contains(@class, 'ha')]//h2"), "Subject");
    private Button lblBody = new Button(By.xpath("//div[contains(@class, 'a3s aXjCH ') and not(contains(@class, 'undefined'))]"), "Body");

    public OpenedLetterPage() {
        super(By.xpath("//div[@class='nH' and @role='main']"), "Opened letter page");
    }

    public Letter getLetterInfo() {
        Letter letter = new Letter();
        letter.setSubject(lblSubject.getText());
        letter.setBody(lblBody.getText());
        return letter;
    }
}