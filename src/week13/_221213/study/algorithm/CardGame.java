package week13._221213.study.algorithm;

public class CardGame {
    int[] cards;
    Pair[][] memo;

    public CardGame(int[] cards) {
        this.cards = cards;
        this.memo = new Pair[cards.length][cards.length];
        for (int i = 0; i < memo.length; i++) {
            memo[i][i] = new Pair(cards[i], 0);
        }
        for (int i = 1; i < memo.length; i++) {
            for (int j = 0; j + i < memo.length; j++) {
                memo[j][j + i] = strategy(cards[j], cards[j + i], memo[j][j + i - 1], memo[j + 1][j + i]);
            }
        }
    }

    private Pair strategy(int leftCard, int rightCard, Pair leftPair, Pair bottomPair) {
        // 내가 오른쪽 카드를 뽑으면
        int left = rightCard + leftPair.right;
        int right = leftPair.left;
        Pair pair1 = new Pair(left, right);
        // 내가 왼쪽 카드를 뽑으면
        left = leftCard + bottomPair.right;
        right = bottomPair.left;
        Pair pair2 = new Pair(left, right);
        return Pair.best(pair1, pair2);
    }

    public void print() {
        for (Pair[] row : memo) {
            for (Pair element : row) {
                System.out.printf("%-10s", element);
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

    public static Pair best(Pair a, Pair b) {
        if (a.equals(b)) return a;
        return (a.left > b.left) ? a : b;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            if (this.left == pair.left && this.right == pair.right) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + left + ", " + right + ")";
    }
}
