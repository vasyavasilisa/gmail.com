package com.softclub.gmail.com.steps;

import com.softclub.gmail.com.models.Letter;
import com.softclub.gmail.com.pages.InboxPage;
import org.testng.Assert;


public class LettersGridSteps {
    private LettersGridSteps() {
    }

    public static void assertInboxesPageIsOpened(){
        Assert.assertTrue(new InboxPage().isFormDisplayed(), "Inboxes page wasn't opened");
    }

    public static void assertLetterAppeared(Letter letter){
        Assert.assertTrue(new InboxPage().isLetterPresent(letter),
                String.format("Letter with subject '%1$s' didn't appear", letter.getSubject()));
    }

    public static void clickOnLetter(Letter letter){
       new InboxPage().clickOnLetter(letter);
    }
//
//    public static void assertPackageInfo(Package expectedPack){
//        Package actualPackage = new PackageInfoPage().getPackageInfo();
//        SoftAsserts.getInstance().assertEquals(actualPackage.getVersion(), expectedPack.getVersion(),
//                "Version isn't correct on Package info page");
//        SoftAsserts.getInstance().assertEquals(actualPackage.getModule(), expectedPack.getModule(),
//                "Module isn't correct on Package info page");
//        SoftAsserts.getInstance().assertEquals(actualPackage.getPublishedDate(), expectedPack.getPublishedDate(),
//                "Published Date isn't correct on Package info page");
//    }
}
