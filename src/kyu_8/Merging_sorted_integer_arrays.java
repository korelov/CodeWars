package kyu_8;

import java.util.Arrays;

// https://www.codewars.com/kata/573f5c61e7752709df0005d2/train/java

public class Merging_sorted_integer_arrays {

    public static int[] mergeArrays(int[] first, int[] second) {
        int[] tempArr = new int[first.length + second.length];

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < tempArr.length; i++) {
            if (i < first.length) {
                tempArr[i] = first[index1++];
            } else {
                tempArr[i] = second[index2++];
            }
        }
        Arrays.sort(tempArr);
        int count = 0;
        for (int i = 1; i < tempArr.length; i++) {
            if (tempArr[i] - tempArr[i - 1] == 0) {
                count++;
            }
        }
        int[] arr1 = new int[tempArr.length - count];
        int index = 0;
        for (int i = 0; i < tempArr.length - 1; i++) {
            if (i == tempArr.length - 2) {
                arr1[arr1.length - 1] = tempArr[tempArr.length - 1];
            }
            if (tempArr[i] - tempArr[i + 1] != 0) {
                arr1[index++] = tempArr[i];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 })));
        System.out.println(Arrays.toString(mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 })));
    }
}
