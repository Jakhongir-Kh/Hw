import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    String surname;
    String name;
    int massivelength;
    int gpa = 0;
    Scanner scanner = new Scanner(System.in);
    void getInfo() {
        System.out.println("Enter surname");
        surname = scanner.nextLine();
        System.out.println("Enter name");
        name = scanner.nextLine();
        System.out.println("Enter the quantity of subjects");
        massivelength = scanner.nextInt();

        int[] grades = new int[massivelength];
        System.out.println("Enter marks of subjects");

        for (int i = 0; i < grades.length; i++) {
            grades[i] = scanner.nextInt();
        }
        for (int i = 0; i < grades.length; i++) {
            gpa += grades[i];
        }
        gpa /= grades.length;

        System.out.println("Average score of " + name + ": " + gpa);
    }
    @Override
    public String toString() {
        return "Student{" +
                "Фамилия='" + surname + '\'' +
                ", Имя='" + name + '\'' +
                ", Средний бал=" + gpa + '\'' +
                '}';
    }
}
