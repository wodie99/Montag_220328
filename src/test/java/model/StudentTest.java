package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAge() {
        Student test = new Student("Test", 1000);
        test.setAge(28);
        assertEquals(28, test.getAge());
    }

    @Test
    void testEquals() {
        Student test1 = new Student("Uwe", 1000, 25);
        Student test2 = new Student("Uwe", 1000, 25);
        assertTrue(test1.equals(test2));
    }
}