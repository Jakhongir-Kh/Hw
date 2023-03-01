import java.util.Objects;
import java.util.Scanner;

public class Customer {
    String name;
    int adress;
    String street;
    Order order = new Order();
    Scanner scanner = new Scanner(System.in);
    void checkOrder() {
        System.out.println("Enter the name of order");
        name = scanner.nextLine();
        System.out.println("Enter the name of the street");
        street = scanner.nextLine();
        System.out.println("Enter house number");
        adress = scanner.nextInt();
        if (name.equals(order.name) && street.equals(order.street) && adress == order.adress) {
            System.out.println("The order matches");
        } else {
            System.out.println("The order does not match");
        }
    }
}
