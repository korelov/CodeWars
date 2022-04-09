package kyu_8;

//https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e/train/java

import java.util.Arrays;

public class Sum_of_differences_in_array {
    public static int sumOfDifferences(int[] arr) {

        int res = 0;
        if (arr.length == 0 || arr.length == 1) {
            return 0;
        }
        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            res += temp[i] - arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{23, 19, 23, 11, 0, 0, 22, 11, 18, 9, 17, 2, 0, 11, 16, 7, 10}));
        System.out.println(sumOfDifferences(new int[]{-17, 17}));
        System.out.println(sumOfDifferences(new int[]{1, 2, 10}));
        System.out.println(sumOfDifferences(new int[]{-3, -2, -1}));
        System.out.println(sumOfDifferences(new int[]{0}));
        System.out.println(sumOfDifferences(new int[]{1}));
        System.out.println(sumOfDifferences(new int[0]));
        //[4, 3]] expected:<1> but was:<-1>
        System.out.println(sumOfDifferences(new int[]{4, 3}));
    }
}
