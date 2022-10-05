package practice.java_221005;


public class RandomNumberCreator implements NumberCreator{

    @Override
    public int numberCreate() {
        return (int)(Math.random()*10);
    }
}
