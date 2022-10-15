package week3._221004.homework.codeup._1008;

public class Main { // 코드업 : 1008
    public static void main(String[] args) {
        char[] arr = {
                '\u250C', '\u252C', '\u2510',
                '\u251C', '\u253C', '\u2524',
                '\u2514', '\u2534', '\u2518'
        };
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 3 != 0) {
                System.out.print(arr[i]);
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
