package com.oocl.person;

public class Student extends Person {
    private int classNumber;

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return this.classNumber;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a student of class %d. Coding for the glory of OOCL.", this.getName(), this.getAge(), this.getClassNumber());
    }
}
