package com.softclub.gmail.com.enums;

public enum LeftHandMenuItem {
    INBOX("inbox"),
    STARRED("starred"),
    SNOOZED("snoozed"),
    SENT("sent");

    private String locatorPart;

    LeftHandMenuItem(String locatorPart) {
        this.locatorPart = locatorPart;
    }

    public String getLocPart() {
        return locatorPart;
    }
}