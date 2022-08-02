package kyu_7;

//https://www.codewars.com/kata/57ee99a16c8df7b02d00045f

import java.util.Arrays;

public class Flatten_and_sort_an_array {

    public static int[] flattenAndSort(int[][] array) {
        int size = 0;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                size++;
            }
        }
        int[] arr = new int[size];
        int index = 0;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                arr[index++] = ints[j];
            }
        }
        //Arrays.sort(arr);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
//new int[]{1, 2, 3, 4, 5, 6, 100}
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{1, 3, 5}, {100}, {2, 4, 6}})));
    }
}
