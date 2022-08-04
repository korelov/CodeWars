package kyu_7;

//https://www.codewars.com/kata/5ac6932b2f317b96980000ca/train/java

import java.util.Arrays;

public class Form_The_Minimum {
    public static int minValue(int[] values) {
        Arrays.sort(values);
        int k = 0;
        for (int i = 0; i < values.length; i++) {
            if (i == 0 || values[i] != values[i - 1]) {
                values[k++] = values[i];
            }
        }
        int[] temp = Arrays.copyOf(values, k);
        StringBuilder res = new StringBuilder();
        for (int j : temp) {
            res.append(j);
        }
        return Integer.parseInt(res.toString());
    }

    public static void main(String[] args) {
        System.out.println(minValue(new int[]{1, 3, 1}));
        System.out.println(minValue(new int[]{4, 7, 5, 7}));
        System.out.println(minValue(new int[]{5, 7, 9, 5, 7}));
    }
}
