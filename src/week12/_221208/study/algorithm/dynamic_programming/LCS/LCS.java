package week12._221208.study.algorithm.dynamic_programming.LCS;

import java.util.Arrays;

public class LCS {
    private final String shortStr;
    private final String longStr;

    private int[][] table;

    // 객체를 생성할때 짧은 문자열과 긴 문자열을 구분하여 초기화
    public LCS(String str1, String str2) {
        this.shortStr = (str1.length() <= str2.length()) ? str1 : str2;
        this.longStr = (str1.length() > str2.length()) ? str1 : str2;
        table = new int[shortStr.length() + 1][longStr.length() + 1];
        lcs();
    }

    // 문자열을 비교
    private void lcs() {
        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[i].length; j++) {
                if (shortStr.charAt(i - 1) == longStr.charAt(j - 1)) table[i][j] = table[i - 1][j - 1] + 1;
                else table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
            }
        }
    }

    // 2차원 배열 출력
    public void printTable() {
        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
    }

    public static void main(String[] args) {
        String str1 = null;
        String str2 = null;
        LCS lcs = null;

        str1 = "ABCDCBA";
        str2 = "DCABDC";
        lcs = new LCS(str1, str2);
        System.out.printf("%s:%s\n", str1, str2);
        lcs.printTable();

        str1 = "ABCD";
        str2 = "DCBA";
        lcs = new LCS(str1, str2);
        System.out.printf("%s:%s\n", str1, str2);
        lcs.printTable();

        str1 = "DDDD";
        str2 = "D";
        lcs = new LCS(str1, str2);
        System.out.printf("%s:%s\n", str1, str2);
        lcs.printTable();
    }
}