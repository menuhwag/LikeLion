package week3._221006.study.collection.set_practice;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }

    public int generate(int num, int offset) {
        return generate(num) + offset;
    }
}
