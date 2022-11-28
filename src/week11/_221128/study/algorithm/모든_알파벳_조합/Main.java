package week11._221128.study.algorithm.모든_알파벳_조합;

public class Main {
    public static void main(String[] args) {
//        print1('A');
        print2('A', 'A');
    }

    private static void print1(char c) {
        if (c > 'Z') return;
        System.out.println(c);
        print1((char) (c + 1));
    }

    private static void print2(char c, char d) {
        if (c > 'Z') return;
        if (d > 'Z') {
            print2((char) (c + 1), 'A');
            return;
        }
        System.out.printf("%s%s\n", c, d);
        print2(c, (char) (d + 1));
    }
}
