package kyu_7;

//https://www.codewars.com/kata/5a905c2157c562994900009d/train/java

import java.util.Arrays;

public class Product_Array {
    public static long[] productArray(int[] numbers) {

        long[] result = new long[numbers.length];

        int index = 0;
        while (index != numbers.length) {
            long multiply = 1;
            for (int i = 0; i < numbers.length; i++) {
                if (index != i) {
                    multiply *= numbers[i];
                }
            }
            result[index] = multiply;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productArray(new int[]{12, 20})));
        System.out.println(Arrays.toString(productArray(new int[]{1, 5, 2})));
        System.out.println(Arrays.toString(productArray(new int[]{3, 27, 4, 2})));
        System.out.println(Arrays.toString(productArray(new int[]{16,17,4,3,5,2})));
        System.out.println(Arrays.toString(productArray(new int[]{10,11,12,13,14,15,16,17,18,19,20})));
    }
}
