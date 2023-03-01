import java.util.Objects;
import java.util.Scanner;

public class Car {
    String mark;
    String model;
    String model1;
    int encap;
    int year;
    int year1;
    Scanner scanner = new Scanner(System.in);
    void compare(){
        mark = scanner.nextLine();
        model = scanner.nextLine();
        model1 = scanner.nextLine();
        encap = scanner.nextInt();
        year = scanner.nextInt();
        year1 = scanner.nextInt();

    }
    @Override
    public boolean equals(Object obj) {
        if (Objects.equals(model, model1) && year == year1) {
            System.out.println("Cars are the same");
        }
        return true;
    }
}