package com.oocl.classroom;

import com.oocl.person.Student;
import com.oocl.person.Teacher;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class ClassroomTest {

    @Test
    public void should_not_allow_someone_not_belong_to_class_to_be_leader(){
        final String expected = "Tom is not in our class. so.. could not be the leader.";

        Classroom classA = new Classroom(1);
        Student tom = new Student("Tom", 18);
        assertEquals(expected, classA.assignLeader(tom));
    }

    @Test
    public void should_not_attend_more_than_one_class(){
        final String expected = "Attending more than one class is not allow.";

        Classroom classA = new Classroom(1);
        Classroom classB = new Classroom(2);
        Student tom = new Student("Tom", 18);
        classA.register(tom);

        assertEquals(expected, classB.register(tom));
    }

    @Test
    public void should_not_teach_6_classes() {
        String expected = "Tom is too busy to teach class 6.";
        Teacher tom = new Teacher("Tom", 25);
        List<Classroom> classes = IntStream.range(1, 6).mapToObj(i -> new Classroom(i)).collect(Collectors.toList());
        classes.forEach(classRoom -> classRoom.assignTeacher(tom));
        Classroom anotherClass = new Classroom(6);
        assertEquals(expected, anotherClass.assignTeacher(tom));
    }
}