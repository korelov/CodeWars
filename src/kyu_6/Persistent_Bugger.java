package kyu_6;

//https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java

public class Persistent_Bugger {
    public static int persistence(long n) {
        if (n / 10 == 0) return 0;
        int res = 1;
        while (n > 0) {
            res *= n % 10;
            n = n / 10;
        }
        return persistence(res) + 1;
    }


    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(4));
        System.out.println(persistence(25));
        System.out.println(persistence(999));
    }
}
