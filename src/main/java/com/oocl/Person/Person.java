package com.oocl.Person;

public class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String introduce(){
        return String.format("There is a person who has name and age. He can introduce himself, like: My name is Tom. I am 21 years old.")
    }
}
