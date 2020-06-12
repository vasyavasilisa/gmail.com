package com.softclub.gmail.com.models;

import framework.Logger;
import framework.utils.StringUtils;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
public class Letter implements Comparable<Letter>, Cloneable {
    private String subject;
    private String body;
    private User recipient;
    private User sender;

    private static final int BODY_LENGTH = 30;
    private static final int SUBJECT_LENGTH = 10;

    public Letter() {
    }

    public Letter(String subject, String body, User recipient, User sender) {
        this.subject = subject;
        this.body = body;
        this.recipient = recipient;
        this.sender = sender;
    }

    public Letter initData() {
        subject = StringUtils.generateRandomText(SUBJECT_LENGTH);
        body = StringUtils.generateRandomText(BODY_LENGTH);
        return this;
    }

    @Override
    public int compareTo(Letter letter) {
        if (letter == null && subject == null) {
            return 0;
        } else if (letter == null) {
            return 1;
        } else if (letter.getSubject() == null && subject == null) {
            return 0;
        } else if (letter.getSubject() == null) {
            return 1;
        } else if (letter.getSubject() != null && subject == null) {
            return -1;
        }
        return subject.compareTo(letter.getSubject());
    }

    @Override
    public Letter clone() {
        try {
            return (Letter) super.clone();
        } catch (CloneNotSupportedException e) {
            Logger.getInstance().warn("[Letter] object could not or should not be cloned");
            throw new IllegalArgumentException();
        }
    }
}