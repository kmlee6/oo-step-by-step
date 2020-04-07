package com.oocl.Person;

public class Teacher extends Person {
    @Override
    public String introduce() {
        return String.format("There is a teacher who will introduce himself like this: " +
                "My name is %s. I am %d years old. Teaching for the future of world.", this.getName(), this.getAge());
    }
}
