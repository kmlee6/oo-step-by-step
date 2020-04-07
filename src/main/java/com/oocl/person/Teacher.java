package com.oocl.person;

public class Teacher extends Person {
    final static int maxNumOfTeaching = 5;
    private int currentTeaching;
    private String newStudent;
    private int newStudentClassNumber;
    private String newLeader;
    private int newLeaderClassNumber;

    public Teacher(String name, int age){
        this.setName(name);
        this.setAge(age);
        this.currentTeaching=0;
    }

    public boolean isAvaliable(){
        return currentTeaching<maxNumOfTeaching;
    }

    public void addTeachingClassNumber(){
        this.currentTeaching++;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. Teaching for the future of world.", this.getName(), this.getAge());
    }

    public void welcomeLeader(String newLeader, int classNumber){
        this.newLeader = newLeader;
        this.newLeaderClassNumber = classNumber;
    }

    public String sayHelloToLeader(){
        return introduce()+String.format(" %s is the leader of Class %d.", newLeader, newLeaderClassNumber);
    }

    public void welcomeStudent(String newStudent, int classNumber){
        this.newStudent = newStudent;
        this.newStudentClassNumber = classNumber;
    }

    public String sayHelloToStudent(){
        return introduce()+String.format(" Welcome %s join Class %d.", this.newStudent, this.newStudentClassNumber);
    }
}
