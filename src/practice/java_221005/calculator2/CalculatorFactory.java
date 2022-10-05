package practice.java_221005.calculator2;

public class CalculatorFactory {
    public Calculator createRandomCalculator() {
        return new Calculator(new RandomNumberGenerator());
    }

    public Calculator createSpecificCalculator() {
        return new Calculator(new SpecificNumberGenerator());
    }
}
