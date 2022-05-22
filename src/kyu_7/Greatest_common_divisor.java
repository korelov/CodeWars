package kyu_7;

// https://www.codewars.com/kata/5500d54c2ebe0a8e8a0003fd/train/java

public class Greatest_common_divisor {
    public static int compute(int x, int y) {
        int res = 1;
        for (int i = 1; i < Math.max(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(compute(30, 12));
        System.out.println(compute(8, 9));
        System.out.println(compute(1, 1));
    }
}
