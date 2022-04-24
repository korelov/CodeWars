package kyu_8;

//https://www.codewars.com/kata/57202aefe8d6c514300001fd/train/java

public class If_else_and_ternary_operator {

    public static int saleHotdogs(final int n) {
        if (n < 5) {
            return 100 * n;
        } else if (n >= 5 && n < 10) {
            return 95 * n;
        } else {
            return 90 * n;
        }
    }

    public static void main(String[] args) {
        System.out.println(saleHotdogs(4));
        System.out.println(saleHotdogs(6));
        System.out.println(saleHotdogs(62));
    }
}
