package com.oocl.person;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TeacherTest {

    @Test
    public void should_get_teacher_introduction() {
        final String teacherIntroduction = "My name is Tom. I am 18 years old. Teaching for the future of world.";
        Teacher teacher = new Teacher();
        teacher.setAge(18);
        teacher.setName("Tom");
//        assertEquals(teacherIntroduction, teacher.introduce());
        assertThat(teacherIntroduction, is(teacher.introduce()));
    }
}