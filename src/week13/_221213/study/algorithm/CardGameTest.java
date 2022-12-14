package week13._221213.study.algorithm;

public class CardGameTest {
    public static void main(String[] args) {
        int[] cards = {2, 7, 40, 19};
        CardGame cardGame1 = new CardGame(cards);
        System.out.println("게임 1 :");
        cardGame1.print();
        cards = new int[]{2, 7, 40, 19, 4, 9};
        CardGame cardGame2 = new CardGame(cards);
        System.out.println("게임 2 :");
        cardGame2.print();
    }
}
