package com.softclub.gmail.com.pages.forms;

import com.softclub.gmail.com.models.Letter;
import framework.elements.Button;
import framework.elements.TextBox;
import framework.webdriver.BaseForm;
import org.openqa.selenium.By;

public class NewDialogForm extends BaseForm {
    private TextBox txbTo = new TextBox(By.name("to"), "To whom");
    private TextBox txbSubject = new TextBox(By.name("subjectbox"), "Subject");
    private TextBox txbBody = new TextBox(By.xpath("//div[contains(@class, 'Ar Au')]//div"), "Body");
    private Button btnSend = new Button(By.xpath("//div[@class='dC']//div[@role='button'][not(@aria-haspopup)]"), "Send");

    public NewDialogForm() {
        super(By.xpath("//div[@role='dialog']"), "New Dialog");
    }

    public void fillInMandatoryFieldsInLetter(Letter letter){
        txbTo.clearAndType(letter.getRecipient().getLogin());
        txbSubject.clearAndType(letter.getSubject());
        txbBody.clearAndType(letter.getBody());
    }

    public void clickSend(){
       btnSend.waitAndClick();
    }
}