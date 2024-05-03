package kyu_6;

// https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java

import java.util.Arrays;

public class Sort_the_odd {

    public static int[] sortArray(int[] array) {
        int[] arr = array.clone();
        int[] arraySorted = Arrays.stream(array).filter(value -> value % 2 != 0).sorted().toArray();

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arraySorted[j];
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 2, 8, 1, 4})));
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 1, 8, 0})));
        System.out.println(Arrays.toString(sortArray(new int[]{})));
    }
}
