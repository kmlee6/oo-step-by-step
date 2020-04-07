package com.oocl.person;

public class Student extends Person {
    private int classNumber=-1;
    private String newClassmate;
    private String myLeader;

    public Student(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public int getClassNumber() {
        return this.classNumber;
    }

    public boolean haveAttendedClass(){
        return getClassNumber()>-1;
    }

    public void joinClass(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a student of class %d. Coding for the glory of OOCL.", this.getName(), this.getAge(), this.getClassNumber());
    }

    public void welcomeClassmate(String newClassmate) {
        this.newClassmate = newClassmate;
    }

    public String sayHelloToClassmate(){
        return introduce()+String.format(" Welcome %s join Class %d.", newClassmate, classNumber);
    }

    public void welcomeLeader(String leader) {
        this.myLeader = leader;
    }

    public String sayHelloToLeader(){
        return introduce()+String.format(" %s is the leader of Class %d.", myLeader, classNumber);
    }
}
