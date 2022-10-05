package practice.java_221005.calculator;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
            RandomCalculator cal = new RandomCalculator(5, randomNumberCreator);
            System.out.println("====================================");
            System.out.println("랜덤 정수 : " + cal.getRandomNumber());
            System.out.printf("a + b = %d\n", cal.plus());
            System.out.printf("a - b = %d\n", cal.minus());
            System.out.printf("a * b = %d\n", cal.multiple());
            try {
                System.out.printf("a / b = %f\n", cal.divide());
            } catch (ArithmeticException e) {
                System.out.println("a / b = X " + e.getMessage());
            }
        }
    }
}
