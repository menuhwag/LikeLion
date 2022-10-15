package week3._221005.study.calculator2;

public class RandomNumberGenerator implements NumberGenerator{

    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
