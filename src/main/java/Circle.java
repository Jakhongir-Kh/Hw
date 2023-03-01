public class Circle {
    static double pi = 3.14;
    double radius;
    double square;
    double circumference;
    void calc() {
        square = pi * (radius * radius);
        circumference = 2 * pi * radius;
        System.out.println("Площадь: " + square);
        System.out.println("Длина окружности: " + circumference);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
}
