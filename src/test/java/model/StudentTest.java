package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAge() {
        Student test = new Student("Test");
        test.setAge(28);
        assertEquals(28, test.getAge());
    }
}