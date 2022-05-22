package kyu_7;

// https://www.codewars.com/kata/525e5a1cb735154b320002c8/train/java

public class Triangular_Treasure {
    public static long triangular(long n) {
        long result = 0;
        while (n > 0) {
            result += n;
            n -= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(triangular(2));
        System.out.println(triangular(4));
        System.out.println(triangular(0));
        System.out.println(triangular(1275));
        System.out.println(triangular(-1));
    }
}
