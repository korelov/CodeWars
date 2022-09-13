package kyu_8;

//https://www.codewars.com/kata/5513795bd3fafb56c200049e/train/java

import java.util.Arrays;

public class Count_by_X {
    public static int[] countBy(int x, int n) {
        if (n == 1) {
            return new int[]{x};
        }
        int[] temp = new int[n];
        for (int i = 1; i < temp.length; i++) {
            temp[0] = x;
            temp[i] = temp[i - 1] + x;
        }
        return temp;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(1, 10)));
        System.out.println(Arrays.toString(countBy(2, 5)));
        System.out.println(Arrays.toString(countBy(3, 7)));
        System.out.println(Arrays.toString(countBy(50, 5)));
        System.out.println(Arrays.toString(countBy(100, 6)));
        System.out.println(Arrays.toString(countBy(95,1)));
    }

}
