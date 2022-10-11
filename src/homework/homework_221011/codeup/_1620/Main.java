package homework.homework_221011.codeup._1620;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int buff;
        while ((buff = m.sumDigit(num)) != num){
            num = buff;
        }
        System.out.println(num);
    }
    int sumDigit(int n) {
        int result = 0;
        while(n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
