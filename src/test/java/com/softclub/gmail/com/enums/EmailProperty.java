package com.softclub.gmail.com.enums;

import framework.functions.PropertiesResourceManager;

public enum EmailProperty {
    USERNAME("emailLogin"),
    SECRET("emailPassword");

    private PropertiesResourceManager prop;
    private String key;

    EmailProperty(String key) {
        this.prop = new PropertiesResourceManager("mail.properties");
        this.key = key;
    }

    public String getValue() {
        return prop.getProperty(key);
    }
}