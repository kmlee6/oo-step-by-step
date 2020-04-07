package com.oocl.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void should_get_student_introduction() {
        final String studentIntroduction = "My name is Tom. I am 18 years old. Coding for the glory of OOCL";
        Student student = new Student();
        student.setAge(18);
        student.setName("Tom");
        assertEquals(studentIntroduction, student.introduce());
    }
}