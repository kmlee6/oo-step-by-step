package com.oocl.Person;

public class Student extends Person{
    @Override
    public String introduce() {
        return String.format("There is a student who will introduce himself like this: " +
                "My name is %s. I am %d years old. Coding for the glory of OOCL", this.getName(), this.getAge());
    }
}
