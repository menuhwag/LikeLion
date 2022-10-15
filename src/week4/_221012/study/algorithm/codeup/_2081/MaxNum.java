package week4._221012.study.algorithm.codeup._2081;

public class MaxNum {
    int getMax(int[] arr) {
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] arr = {-3, -29, -38, -12, -57, -74, -40, -85, -61};
        MaxNum m = new MaxNum();
        System.out.println(m.getMax(arr) == -3);
    }
}
