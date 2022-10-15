package week3._221005.homework.interface_practice;

public class Rectangle implements Shape { // 인터페이스 구현
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
