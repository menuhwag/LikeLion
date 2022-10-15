package week3._221005.homework.interface_practice;

public class ShapeAreaCalculator { // 면적 계산 클래스
    private Shape shape;

    public ShapeAreaCalculator(Shape shape) {
        this.shape = shape;
    }

    public void printArea() {
        System.out.println("면적 : " + shape.calculateArea());
    }
}
