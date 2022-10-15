package week3._221005.study.calculator2;

public class CalculatorFactory {
    public Calculator createRandomCalculator() {
        return new Calculator(new RandomNumberGenerator());
    }

    public Calculator createSpecificCalculator() {
        return new Calculator(new SpecificNumberGenerator());
    }
}
