package week11._221128.study.algorithm.모든_알파벳_조합;

public class Main {
    public static void main(String[] args) {
        print1();
        print2();
    }

    private static void print1() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
        }
    }

    private static void print2() {
        for (char c = 'A'; c <= 'Z'; c++) {
            for (char d = 'A'; d <= 'Z'; d++) {
                System.out.printf("%s%s\n", c, d);
            }
        }
    }
}
