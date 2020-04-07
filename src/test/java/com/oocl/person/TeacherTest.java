package com.oocl.person;

import com.oocl.classroom.Classroom;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TeacherTest {

    @Test
    public void should_get_teacher_introduction() {
        final String expected = "My name is Tom. I am 18 years old. Teaching for the future of world.";
        Teacher teacher = new Teacher("Tom", 18);
//        assertEquals(teacherIntroduction, teacher.introduce());
        assertThat(expected, is(teacher.introduce()));
    }

    @Test
    public void should_say_hello_to_new_student() {
        final String expected = "My name is Jim. I am 18 years old. Teaching for the future of world. Welcome Tom join Class 2.";
        Teacher jim = new Teacher("Jim", 18);
        Student tom = new Student("Tom", 16);
        Classroom class2 = new Classroom(2);
        class2.assignTeacher(jim);
        class2.register(tom);
        assertEquals(expected, jim.sayHelloToStudent());
    }

    @Test
    public void should_say_hello_to_new_leader() {
        final String expected = "My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2.";
        Teacher woody = new Teacher("Woody", 30);
        Student tom = new Student("Tom", 16);
        Classroom class2 = new Classroom(2);
        class2.assignTeacher(woody);
        class2.register(tom);
        class2.assignLeader(tom);
        assertEquals(expected, woody.sayHelloToLeader());
    }
}