package kyu_7;

//https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc/train/java

public class Factorial {
    public int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().factorial(5));
        System.out.println(new Factorial().factorial(3));
        System.out.println(new Factorial().factorial(0));
    }
}
