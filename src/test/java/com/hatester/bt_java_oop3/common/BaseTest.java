package com.hatester.bt_java_oop3.common;

public class BaseTest {
    public static void createDriver() {
        System.out.println("Open Browser: " + Constants.browser);
        System.out.println("Log Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    public static void closeDriver() {
        if (Constants.browser != null) {
            System.out.println("Closed browser: " + Constants.browser);
        }
    }
}
