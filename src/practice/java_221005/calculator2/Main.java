package practice.java_221005.calculator2;

public class Main {
    public static void main(String[] args) {
        CalculatorFactory calculatorFactory = new CalculatorFactory();

        for (int i = 0; i < 5; i++) {
            Calculator randomCalculator = calculatorFactory.createRandomCalculator();
            randomCalculator.plus(10); // EXPECTED : 10 + random 0 ~ num
        }

        Calculator specificCaluculator = calculatorFactory.createSpecificCalculator();
        specificCaluculator.plus(10); // EXPECTED : 1010
    }
}
