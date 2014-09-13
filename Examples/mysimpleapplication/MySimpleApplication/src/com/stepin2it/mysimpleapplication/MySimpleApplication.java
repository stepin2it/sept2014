package com.stepin2it.mysimpleapplication;

import java.util.ArrayList;
import java.util.List;


public class MySimpleApplication
{
    public static List<Person> mPersons = new ArrayList<Person>();

    public static void main(String[] args)
    {
        Person p = new Person("John", 21);
        mPersons.add(p);
        p = new Person("Smith", 22);
        mPersons.add(p);
        p = new Person("James", 23);
        mPersons.add(p);

        for (Person person : mPersons)
        {
            person.printPersonData();
        }
    }
}
