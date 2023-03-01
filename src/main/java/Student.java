import java.util.Scanner;
public class Customer {
    String surname;
    String name;
    int birth;
    int number;
    int num = 7182064;
    Scanner scanner = new Scanner(System.in);
    void takeNumber(){
        number = scanner.nextInt();
        scanner.close();
    if (num == number)
        System.out.println("Номер совпадает");
    else
        System.out.println("Номер не совпадает");
    }
    }
