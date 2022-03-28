package model;

import java.util.Arrays;

public class StudentDB {

    private Student[] studentDB;

    public StudentDB(Student[] studentDB) {
        this.studentDB = studentDB;
    }

    public void add(Student student) {
        Student[] newArray = new Student[studentDB.length + 1];
        for (int i = 0; i < newArray.length -1; i++) {
            newArray[i] = studentDB[i];
        }
        newArray[newArray.length - 1] = student;
        studentDB = newArray;
    }

    public void remove(Student student) {

        int hit = -1;
        Student[] newArray = new Student[studentDB.length - 1];

        for (int i = 0; i < studentDB.length; i++) {
            if (studentDB[i].equals(student)) {
                hit = i;
            }
        }

        for (int i = 0; i < studentDB.length; i++) {
            if (i < hit) {
                newArray[i] = studentDB[i];
            }
            if (i > hit) {
                newArray[i-1] = studentDB[i];
            }
        }
        studentDB = newArray;
    }



    public Student[] getAllStudents() {
        return studentDB;
    }

    public Student getRandomStudent() {
        int random = (int) (Math.random()*(studentDB.length));
        return studentDB[random];
    }


    @Override
    public String toString() {
        return "StudentDB{" +
                "studentDB=" + Arrays.toString(studentDB) +
                '}';
    }
}
