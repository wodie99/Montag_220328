package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StudentDBTest {

    @Test
    void shouldMakeSureThatStudentsCanBeRetrieved() {
        // given
        Student[] students = {new Student( "Anna Abel",1), new Student("Bernd Benn",2)};
        StudentDB studentDB = new StudentDB(students);

        // when
        Student[] actual = studentDB.getAllStudents();

        // then
        Assertions.assertArrayEquals(students, actual);

        Assertions.assertEquals(1, actual[0].getId());
        Assertions.assertEquals("Anna Abel", actual[0].getName());
    }

    @Test
    void shouldReturnRandomStudent() {
        // given
        Student[] students = {new Student("Anna Abel",1), new Student("Bernd Benn",2)};
        StudentDB studentDB = new StudentDB(students);

        // when
        Student student = studentDB.getRandomStudent();

        // then
        Assertions.assertNotNull(student);
    }

    @Test
    void shouldReturnStringRepresentation() {
        // given
        Student[] students = {new Student("Anna Abel",1), new Student("Bernd Benn",2)};
        StudentDB studentDB = new StudentDB(students);

        // when
        String actual = studentDB.toString();

        // then
        Assertions.assertEquals("StudentDB{studentDB=[Student{name='Anna Abel', age=22, id=1}, Student{name='Bernd Benn', age=22, id=2}]}", actual);
    }

    @Test
    void shouldAddNewStudent() {
        // given
        Student[] students = {new Student("Anna Abel",1)};
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.add(new Student("Bernd Benn",2));
        Student[] actual = studentDB.getAllStudents();

        // then
        Student[] expected = {new Student("Anna Abel",1), new Student("Bernd Benn",2)};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveFirstStudent() {
        // given
        Student[] students = {new Student("Anna Abel",1), new Student("Bernd Benn",2)};
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove( students[0]);
        Student[] actual = studentDB.getAllStudents();

        // then
        Student[] expected = {new Student("Bernd Benn",2)};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveLastStudent() {
        // given
        Student[] students = {new Student("Anna Abel",1), new Student("Bernd Benn",2)};
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(students[1]);
        Student[] actual = studentDB.getAllStudents();

        // then
        Student[] expected = {new Student("Anna Abel",1)};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIntermediateStudent() {
        // given
        Student[] students = {new Student("Anna Abel",1), new Student("Bernd Benn",2), new Student("Claus Chast",3)};
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(students[1]);
        Student[] actual = studentDB.getAllStudents();

        // then
        Student[] expected = {new Student("Anna Abel",1), new Student("Claus Chast",3)};
        Assertions.assertArrayEquals(expected, actual);
    }
}