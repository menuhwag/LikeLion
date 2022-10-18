package week5._221018.study.algorithm.codeup._1859;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        Main m = new Main();
        m.printStar(1, limit, "");
    }
    public void printStar(int n, int limit,  String str) {
        if (n > limit) return;
        if (n == str.length()) {
            System.out.println(str);
            printStar(n+1, limit,"");
            return;
        }
        printStar(n, limit,str + "*");
    }
    /*
    * n이랑 문자열 길이가 같아지면 문자열을 출력한다
    * 아니면 문자열에 *하나 추가해서 재귀 호출한다.*/
}
