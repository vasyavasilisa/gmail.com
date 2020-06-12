package com.softclub.gmail.com.steps;

import com.softclub.gmail.com.models.Letter;
import com.softclub.gmail.com.pages.forms.NewDialogForm;

public class DialogSteps {

    private DialogSteps() {
    }

    public static void fillInDialogForm(Letter letter) {
        new NewDialogForm().fillInMandatoryFieldsInLetter(letter);
    }

    public static void clickToSend() {
        new NewDialogForm().clickSend();
    }

}