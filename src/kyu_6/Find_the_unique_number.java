package kyu_6;

//https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java

import java.util.Arrays;

public class Find_the_unique_number {
    public static double findUniq(double arr[]) {

        Arrays.sort(arr);
        double res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] - arr[1] != 0) {
                if (arr[i - 1] != arr[i]) {
                    res = arr[i - 1];
                }
            } else {
                if (arr[i - 1] != arr[i]) {
                    res = arr[i];
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
        System.out.println(findUniq(new double[]{0, 1, 0}));
    }

}
