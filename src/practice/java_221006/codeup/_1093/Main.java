package practice.java_221006.codeup._1093;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] called = new int[23];
        int callCount = sc.nextInt();
        for (int i = 0; i < callCount; i++) {
            int calledNumber = sc.nextInt();
            called[calledNumber-1]++;
        }
        String result = Arrays.toString(called).replaceAll("\\[|\\]|,", "");
        System.out.println(result);
    }
}
