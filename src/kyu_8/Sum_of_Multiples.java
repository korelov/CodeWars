package kyu_8;

// https://www.codewars.com/kata/57241e0f440cd279b5000829/train/java

public class Sum_of_Multiples {
    public static long sumMul(int n, int m) throws IllegalArgumentException {
        int sum = 0;
        if (n > 0 & m > 0) {
            for (int i = n; i < m; i += n) {
                sum += i;
            }
        } else throw new IllegalArgumentException();
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumMul(2, 9));
        System.out.println(sumMul(4, 123));
        System.out.println(sumMul(3, -7));
    }
}
