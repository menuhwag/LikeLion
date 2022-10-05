package homework.homework_221005.interface_practice;

public class Main {
    public static void main(String[] args) { // 면적 계산기 구동 클래스
        Shape rectangle = new Rectangle(2, 5); // 구현체 객체 생성 파라미터 (가로, 세로)
//        Shape triangle = new Triangle(2, 5); // 구현체 객체 파라미터 (밑변, 높이)
//        Shape circle = new Circle(5); // 구현체 객체 생성 파라미터 (반지름)

        ShapeAreaCalculator recAreaCalculator = new ShapeAreaCalculator(rectangle); // 구현체 주입하여 계산기 객체 생성
        recAreaCalculator.printArea();

        /*
        위와 같이 삼각형, 원의 면적을 구해보자.
        삼각형, 원 객체는 Shape 인터페이스를 구현할 것.
        ShapeAreaCalculator 객체 생성 시 해당 구현체 (삼각형, 원과 같은)를 주입할 것.
        */
    }
}
