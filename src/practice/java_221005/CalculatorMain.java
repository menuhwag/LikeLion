package practice.java_221005;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        final int NUM_1 = 5;
        final int NUM_2 = 3;

        System.out.printf("a + b = %d\n", cal.plus(NUM_1, NUM_2));
        System.out.printf("a - b = %d\n", cal.minus(NUM_1, NUM_2));
        System.out.printf("a * b = %d\n", cal.multiple(NUM_1, NUM_2));
        System.out.printf("a / b = %f\n", cal.divide(NUM_1, NUM_2));
    }
}
