package practice.java_221005;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        RandomCalculator cal = new RandomCalculator(5, randomNumberCreator);

        System.out.printf("a + b = %d\n", cal.plus());
        System.out.printf("a - b = %d\n", cal.minus());
        System.out.printf("a * b = %d\n", cal.multiple());
        System.out.printf("a / b = %f\n", cal.divide());
    }
}
