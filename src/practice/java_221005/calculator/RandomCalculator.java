package practice.java_221005.calculator;

public class RandomCalculator extends Calculator{

    public RandomCalculator(int num, NumberCreator randomNumberCreator) {
        super(num, randomNumberCreator.numberCreate());
    }

    public int getRandomNumber() {
        return b;
    }

    @Override
    public double divide() {
        if (b == 0) throw new ArithmeticException("랜덤하게 생성된 숫자가 0입니다.");
        return (double) a / b;
    }
}
