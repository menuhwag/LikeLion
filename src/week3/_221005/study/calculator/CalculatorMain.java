package week3._221005.study.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        final int NUM_1 = 5;
        final int NUM_2 = 3;
        Calculator cal = new Calculator(NUM_1, NUM_2);

        System.out.printf("a + b = %d\n", cal.plus());
        System.out.printf("a - b = %d\n", cal.minus());
        System.out.printf("a * b = %d\n", cal.multiple());
        System.out.printf("a / b = %f\n", cal.divide());
    }
}
