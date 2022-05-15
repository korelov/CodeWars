package kyu_7;

// https://www.codewars.com/kata/5c55ad8c9d76d41a62b4ede3/train/java

import java.util.Arrays;

public class Find_all_pairs {
    public static int duplicates(int[] array) {
        int count = 0;
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] == 0) {
                count++;
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(duplicates(new int[]{0, 0, 0, 0}));
        System.out.println(duplicates(new int[]{1, 2, 5, 6, 5, 2}));
        System.out.println(duplicates(new int[]{1, 2, 2, 20, 6, 20, 2, 6, 2}));
    }
}
