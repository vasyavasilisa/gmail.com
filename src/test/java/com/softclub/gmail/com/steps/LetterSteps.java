package com.softclub.gmail.com.steps;

import com.softclub.gmail.com.models.Letter;
import com.softclub.gmail.com.pages.OpenedLetterPage;
import framework.SoftAsserts;

public class LetterSteps {
    private LetterSteps() {
    }

    public static void assertLetterInfoDisplayedCorrectly(Letter expectedLetter) {
        Letter actualLetter = new OpenedLetterPage().getLetterInfo();
        SoftAsserts.getInstance().assertEquals(actualLetter.getSubject(), expectedLetter.getSubject(),
                "[Subject] isn't correct in opened letter");
        SoftAsserts.getInstance().assertEquals(actualLetter.getBody(), expectedLetter.getBody(),
                "[Body] isn't correct in opened letter");
    }
}