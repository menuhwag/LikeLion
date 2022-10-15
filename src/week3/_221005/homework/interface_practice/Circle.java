package week3._221005.homework.interface_practice;

public class Circle implements Shape{
    private static final double PI = Math.PI;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}
