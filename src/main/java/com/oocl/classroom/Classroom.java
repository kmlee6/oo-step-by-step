package com.oocl.classroom;

import com.oocl.person.Student;
import com.oocl.person.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Classroom {
    private int classId;
    private List<Student> members;
    private Student leader;
    private Teacher teacher;

    public Classroom(int classId){
        this.classId = classId;
        this.members = new ArrayList<Student>();
    }

    private boolean includeStudent(Student unknown){
        return getStudents().stream().map(student -> student.getName()).collect(Collectors.toList()).contains(unknown.getName());
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String assignTeacher(Teacher teacher) {
        if(!teacher.isAvaliable()){
            return String.format("%s is too busy to teach class %d.", teacher.getName(), this.getClassId());
        }
        teacher.addTeachingClassNumber();
        this.teacher = teacher;
        return String.format("%s is now class %d teacher.", teacher.getName(), this.getClassId());
    }

    public String assignLeader(Student newLeader) {
        if(!includeStudent(newLeader)){
            return String.format("%s is not in our class. so.. could not be the leader.", newLeader.getName());
        }
        this.getStudents().forEach(student -> student.welcomeLeader(newLeader.getName()));
        if(this.getTeacher()!=null){
            this.getTeacher().welcomeLeader(newLeader.getName(), getClassId());
        }
        this.leader = newLeader;
        return String.format("%s is now our leader.", newLeader.getName());
    }

    public String register(Student newStudent) {
        if(newStudent.haveAttendedClass()){
            return "Attending more than one class is not allow.";
        }
        newStudent.joinClass(this.getClassId());
        this.getStudents().forEach(student -> student.welcomeClassmate(newStudent.getName()));
        if(this.getTeacher()!=null){
            this.teacher.welcomeStudent(newStudent.getName(), this.getClassId());
        }
        this.members.add(newStudent);
        return String.format("%s have joined Class %d", newStudent.getName(), this.getClassId());
    }

    public int getClassId() {
        return classId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student getLeader() {
        return leader;
    }

    public List<Student> getStudents() {
        return members;
    }
}
