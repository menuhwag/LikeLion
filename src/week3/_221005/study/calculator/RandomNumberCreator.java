package week3._221005.study.calculator;


public class RandomNumberCreator implements NumberCreator{

    @Override
    public int numberCreate() {
        return (int)(Math.random()*10);
    }
}
