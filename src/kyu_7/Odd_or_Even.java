package kyu_7;

//https://www.codewars.com/kata/5949481f86420f59480000e7/train/java

import java.util.Arrays;

public class Odd_or_Even {
    public static String oddOrEven(int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{2, 5, 34, 6}));
    }
}
