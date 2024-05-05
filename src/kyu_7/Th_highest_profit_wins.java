package kyu_7;

// https://www.codewars.com/kata/559590633066759614000063/train/java

import java.util.Arrays;

public class Th_highest_profit_wins {
    public static int[] minMax(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        minMax(new int[]{1, 2, 3, 4, 5});
    }

}
