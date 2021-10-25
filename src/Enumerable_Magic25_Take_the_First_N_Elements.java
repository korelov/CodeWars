//https://www.codewars.com/kata/545afd0761aa4c3055001386/train/java

import java.util.Arrays;

public class Enumerable_Magic25_Take_the_First_N_Elements {

    public static int[] take(int[] arr, int n) {

        if (arr.length == 0) return arr;
        if (n > arr.length) return arr;

        int[] res = new int[n];

        int count = 0;
        for (int i = 0; i < n; i++) {

            res[count++] = arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(take(new int[]{2, 14, 265, 3, 5, 8, 13}, 5)));
    }
}
