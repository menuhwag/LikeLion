package week10._221125.study.algorithm.gcd;

public class GCD {
    public static void main(String[] args) {
        int gcd = gcd(32, 72);
        int gcd2 = gcd2(32, 72);
        System.out.println(gcd);
        System.out.println(gcd2);
    }

    private static int gcd(int a, int b) {
        if (a == b) return a; // a, b가 같으면 재귀 호출 종료
        if (a > b) return gcd(b, a); // 첫 번째 인자가 크면 두 번째 인자와 자리를 바꿔 다시 호출.
        return gcd(a, b - a); // 두 번째 인자가 큰 경우 큰 수에서 작은 수를 빼 다시 호출.
    }

    private static int gcd2(int a, int b) { // 재귀 활용x
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
