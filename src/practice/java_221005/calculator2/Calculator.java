package practice.java_221005.calculator2;

public class Calculator {
    private NumberGenerator numberGenerator;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void plus(int num) {
        System.out.println(10 + numberGenerator.generate(num));
    }
}
