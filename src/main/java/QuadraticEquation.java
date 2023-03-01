import java.util.Scanner;

public class QuadraticEquation {
    int a, b, c, x;
    double disc;
    Scanner scanner = new Scanner(System.in);
    boolean noRoot = false;
    void getDisc() {
        System.out.println("Программа решает квадратное уравнение вида: ax^2 + bx + c = 0");
        System.out.println("Задайте значения квадратного уравнения в порядке: a, b, c");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        disc = (b * b) - 4 * a * c;
        System.out.print("Дискриминант этого уравнения :" + disc);
        if (disc < 0) {
            System.out.println(" и оно меньше нуля");
            noRoot = true;
        } else if (disc == 0) {
            System.out.println(" и оно равен нулю");
        } else {
            System.out.println(" и оно больше нуля");
        }
    }
    double x1, x2;
    void root() {
        if (noRoot == true) {
            System.out.println("Уравнение не имеет никакого корня");
            System.exit(1);
            if (disc == 0)
                x = (-b) / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
            System.exit(1);
        }
        if (disc > 0) {
            x1 = (-b - Math.sqrt(disc)) / (2 * a);
            x2 = (-b + Math.sqrt(disc)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
