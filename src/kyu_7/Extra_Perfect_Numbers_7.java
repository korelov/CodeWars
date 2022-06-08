package kyu_7;

// https://www.codewars.com/kata/5a662a02e626c54e87000123/train/java

import java.util.Arrays;

public class Extra_Perfect_Numbers_7 {
    public static int[] extraPerfect(int number) {
        int count = 0;
        String temp = "";
        for (int i = 1; i <= number; i++) {
            temp = Integer.toBinaryString(i);
            if (temp.charAt(0) == temp.charAt(temp.length() - 1)) {
                count++;
            }
        }
        int[] res = new int[count];
        for (int i = 1, j = 0; i <= number; i++) {
            temp = Integer.toBinaryString(i);
            if (temp.charAt(0) == temp.charAt(temp.length() - 1)) {
                res[j++] = i;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(extraPerfect(8)));
        System.out.println(Arrays.toString(extraPerfect(28)));
        System.out.println(Arrays.toString(extraPerfect(39)));
    }
}
