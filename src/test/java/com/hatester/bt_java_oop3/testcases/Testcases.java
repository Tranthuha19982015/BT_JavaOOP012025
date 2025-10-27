package com.hatester.bt_java_oop3.testcases;

import com.hatester.bt_java_oop3.common.BaseTest;

public class Testcases extends BaseTest {
    private String url = "https://crm.anhtester.com/admin/authentication";

    public void loginCRM(String email, String password) {
        createDriver();
        System.out.println("Open URL: " + url);
        System.out.println("Verify header login is displayed.");
        System.out.println("Enter email: " + email);
        System.out.println("Enter password: " + password);
        System.out.println("Click button Login");
        System.out.println("Verify menu Dashboard is displayed.");
        closeDriver();
    }

    public void addNewCustomer(String email, String password) {
        createDriver();
        System.out.println("Open URL: " + url);
        System.out.println("Verify header login is displayed.");
        System.out.println("Enter email: " + email);
        System.out.println("Enter password: " + password);
        System.out.println("Click button Login");
        System.out.println("Verify menu Dashboard is displayed.");

        System.out.println("Click menu Customer");
        System.out.println("Verify header Customer Summary is displayed.");
        System.out.println("Click button New Customer");
        System.out.println("Verify tab Customer Detail is displayed.");
        System.out.println("Fill Data for new customer");
        System.out.println("Click button Save");
        System.out.println("Verify information in Customer Detail");
        closeDriver();
    }

    public static void main(String[] args) {
        Testcases testcases = new Testcases();
        testcases.loginCRM("admin@example.com", "123456");

        System.out.println("=============================");
        testcases.addNewCustomer("admin@example.com", "123456");

    }
}
