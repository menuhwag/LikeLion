package week13._221213.study.algorithm;

import java.util.Arrays;

public class CardGame {
    int[] cards;
    Pair[][] memo;

    public CardGame(int[] cards) {
        this.cards = cards;
        this.memo = new Pair[cards.length][cards.length];
        strategy();
    }

    private void strategy() {
        for (int i = 0; i < memo.length; i++) {
            memo[i][i] = new Pair(cards[i], 0);
        }
        for (int i = 0; i < memo.length - 1; i++) {
            memo[i][i + 1] = new Pair(Math.max(cards[i], cards[i + 1]), Math.min(cards[i], cards[i + 1]));
        }
    }

    public void print() {
        for (Pair[] row : memo) {
            for (Pair element : row) {
                System.out.printf("%s\t", element);
            }
            System.out.println();
        }
    }
}

class Pair {
    int left;
    int right;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + ", " + right + ")";
    }
}
