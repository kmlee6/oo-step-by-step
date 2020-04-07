package com.oocl.person;

import com.oocl.classroom.Classroom;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void should_get_student_introduction() {
        final String studentIntroduction = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.";
        Student student = new Student("Tom", 18);
        student.joinClass(2);
        assertEquals(studentIntroduction, student.introduce());
    }

    @Test
    public void should_say_hello_to_new_classmate() {
        final String expected = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.";
        Student tom = new Student("Tom", 18);
        Student jim = new Student("Jim", 16);
        Classroom class2 = new Classroom(2);
        class2.register(tom);
        class2.register(jim);
        assertEquals(expected, tom.sayHelloToClassmate());
    }

    @Test
    public void should_say_hello_to_new_leader() {
        final String expected = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Jim is the leader of Class 2.";
        Student tom = new Student("Tom", 18);
        Student jim = new Student("Jim", 16);
        Classroom class2 = new Classroom(2);
        class2.register(tom);
        class2.register(jim);
        class2.assignLeader(jim);
        assertEquals(expected, tom.sayHelloToLeader());
    }
}