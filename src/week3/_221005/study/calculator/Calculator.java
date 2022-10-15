package week3._221005.study.calculator;

public class Calculator {
    protected int a;
    protected int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int plus() {
        return a + b;
    }
    public int minus() {
        return a - b;
    }
    public int multiple() {
        return a * b;
    }
    public double divide() {
        return a / (double)b;
    }
}
