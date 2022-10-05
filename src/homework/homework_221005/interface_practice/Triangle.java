package homework.homework_221005.interface_practice;

public class Triangle implements Shape{
    private int width;
    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double) width * height / 2;
    }
}
