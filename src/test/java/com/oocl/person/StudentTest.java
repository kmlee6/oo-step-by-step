package com.oocl.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void should_get_student_introduction() {
        final String studentIntroduction = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.";
        Student student = new Student();
        student.setAge(18);
        student.setClassNumber(2);
        student.setName("Tom");
        assertEquals(studentIntroduction, student.introduce());
    }
}