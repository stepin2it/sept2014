package com.stepin2it.mysimpleapplication;

public class Person {
    private String name;
    
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void printPersonData()
    {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}
