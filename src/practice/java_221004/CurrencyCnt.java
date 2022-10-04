package practice.java_221004;

public class CurrencyCnt {
    final static int[] MONEY_UNIT = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

    public static void main(String[] args) {

        int money = 25000;

        calculate(money);

    }
    public static void calculate(int money) {
        for (int unit : MONEY_UNIT) {
            int cnt = money / unit;
            money = money % unit;
            System.out.printf("%d원? %d장\n", unit, cnt);
        }
    }
}
