package Basic_structure_and_Syntax;

public class variables {
    public static void main(String[] args) {

        String name = "jizter";
        int age = 100;
        final int score = 67;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);

        age = 100;
        System.out.println("Updated age: " + age);

        float height = 6.7f;
        System.out.println("Height: " + height);

        char section = 'P';
        System.out.println("Section: " + section);

        boolean regularStudent = true;
        System.out.println("Regular Student: " + regularStudent);
    }
}
