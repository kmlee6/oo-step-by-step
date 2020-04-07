package com.oocl.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void should_get_person_introduction() {
        final String myIntroduction = "There is a person who has name and age. He can introduce himself, like: My name is Tom. I am 21 years old.";
        Person person = new Person();
        person.setAge(21);
        person.setName("Tom");

        assertEquals(myIntroduction, person.introduce());
    }
}