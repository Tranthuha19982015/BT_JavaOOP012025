package com.hatester.bt_java_oop2.person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Ha", 27, "Nu", "Ha Noi", "09659943070");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.gender);
        System.out.println("Address: " + person.address);
        System.out.println("Phone: " + person.phone);

        System.out.println("=======================================");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Phone: " + person.getPhone());
    }
}
