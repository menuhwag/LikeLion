package week12._221209.study.algorithm.dynamic_programming.codeup._2699;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        LCS lcs = new LCS(str1, str2);
        System.out.println(lcs.longest());
    }

    static class LCS {
        private String shortStr;
        private String longStr;
        private int[][] table;

        public LCS(String str1, String str2) {
            this.shortStr = (str1.length() <= str2.length()) ? str1 : str2;
            this.longStr = (str1.length() > str2.length()) ? str1 : str2;
            table = new int[shortStr.length() + 1][longStr.length() + 1];
            lcs();
        }

        private void lcs() {
            for (int i = 1; i < table.length; i++) {
                for (int j = 1; j < table[i].length; j++) {
                    if (shortStr.charAt(i - 1) != longStr.charAt(j - 1)) {
                        table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                        continue;
                    }
                    table[i][j] = table[i - 1][j - 1] + 1;
                }
            }
        }

        public int longest() {
            return table[shortStr.length()][longStr.length()];
        }
    }
}
