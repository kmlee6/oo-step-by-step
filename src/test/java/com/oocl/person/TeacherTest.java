package com.oocl.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {

    @Test
    public void should_get_teacher_introduction() {
        final String teacherIntroduction = "There is a teacher who will introduce himself like this: My name is Tom. I am 18 years old. Teaching for the future of world.";
        Teacher teacher = new Teacher();
        teacher.setAge(18);
        teacher.setName("Tom");
        assertEquals(teacherIntroduction, teacher.introduce());
    }
}