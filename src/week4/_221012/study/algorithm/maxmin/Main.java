package week4._221012.study.algorithm.maxmin;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-3, -29, -38, -12, -57, -74, -40, -85, -61};

        MaxMinContext context = new MaxMinContext();

        int maxNum = context.getMax(arr);
        int minNum = context.getMin(arr);

        System.out.println(maxNum);
        System.out.println(minNum);
    }
}
