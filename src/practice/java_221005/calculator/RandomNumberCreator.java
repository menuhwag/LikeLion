package practice.java_221005.calculator;


public class RandomNumberCreator implements NumberCreator{

    @Override
    public int numberCreate() {
        return (int)(Math.random()*10);
    }
}
