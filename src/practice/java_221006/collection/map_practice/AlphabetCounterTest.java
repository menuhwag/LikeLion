package practice.java_221006.collection.map_practice;

public class AlphabetCounterTest {
    public static void main(String[] args) {
        String url = "https://github.com/menuhwang/LikeLion";
        AlphabetCounter alphabetCounter = new AlphabetCounter(url);
        System.out.println(alphabetCounter.getAlphabetCount());
    }
}
