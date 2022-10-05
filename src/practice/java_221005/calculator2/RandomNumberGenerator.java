package practice.java_221005.calculator2;

public class RandomNumberGenerator implements NumberGenerator{

    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
