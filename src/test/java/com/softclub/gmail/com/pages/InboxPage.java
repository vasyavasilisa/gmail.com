package com.softclub.gmail.com.pages;

import com.softclub.gmail.com.models.Letter;
import framework.elements.Label;
import framework.enums.Setting;
import framework.webdriver.BaseForm;
import org.openqa.selenium.By;

public class InboxPage extends BaseForm {
    private static final String UNSEEN_ROW_LOCATOR = "//tr[contains(@class, 'zE')][.//td[contains(., '%1$s')]]";
    private static final String FROM_WHOM_LOCATOR = UNSEEN_ROW_LOCATOR + "//td[contains(@class, 'yX xY')]";

    public InboxPage() {
        super(By.xpath("//div[contains(@class, 'ain')][.//a[contains(@href,'inbox')]]//ancestor::div[@class='no']//div[@class='UI']//table[.//tr[@role='row']]"),
                "Inboxes Page");
    }

    public boolean isLetterPresent(Letter letter) {
        return new Label(By.xpath(String.format(UNSEEN_ROW_LOCATOR, letter.getSubject())),
                String.format("%1$s letter", letter.getSubject())).waitForIsPresent(Setting.CONDITION_WAIT.getLongValue());
    }

    public void clickOnLetter(Letter letter) {
        new Label(By.xpath(String.format(FROM_WHOM_LOCATOR, letter.getSubject())),
                String.format("%1$s letter", letter.getSubject())).waitAndClick();
    }
}
