package com.softclub.gmail.com.steps;

import com.softclub.gmail.com.enums.LeftHandMenuItem;
import com.softclub.gmail.com.pages.forms.LeftHandForm;

public class LeftHandSteps {
    private LeftHandSteps() {
    }

    public static void clickToWrite(){
        new LeftHandForm().clickToWriteLetter();
    }

    public static void navigateMenu(LeftHandMenuItem leftHandMenuItem){
        new LeftHandForm().navigateMenu(leftHandMenuItem);
    }
}