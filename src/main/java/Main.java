import model.Student;
import model.StudentDB;

public class Main {
    public static void main(String[] args) {
        Student eva = new Student("Eva", 1001, 20);
        Student hugo = new Student("Hugo", 1002);
        Student anna = new Student("Anna", 1003, 19);
        Student[] test = new Student[] {eva, hugo, anna};

        StudentDB studentDB = new StudentDB(test);

        Student[] temp= studentDB.getAllStudents();
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }

        System.out.println(studentDB);

        System.out.println(studentDB.getRandomStudent());





    }
}

