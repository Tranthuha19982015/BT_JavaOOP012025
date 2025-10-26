package com.hatester.bt_java_oop2.company;

import com.hatester.bt_java_oop2.person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person("Ha", 27, "Nu", "Ha Noi", "09659943070");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}
