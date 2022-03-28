import model.Student;

public class Main {
    public static void main(String[] args) {
        Student hugo = new Student("Hugo");

        hugo.setFaculty("Mathe");
        hugo.setAge(23);

        System.out.println(hugo);

        System.out.println(hugo.getName() + " studiert " + hugo.getFaculty() + " und ist " + hugo.getAge() + " Jahre alt");
    }
}

