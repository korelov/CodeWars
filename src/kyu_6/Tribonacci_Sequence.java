package kyu_6;

//https://www.codewars.com/kata/556deca17c58da83c00002db/train/java

import java.util.Arrays;

public class Tribonacci_Sequence {
    public static double[] tribonacci(double[] s, int n) {

        double[] doubles = new double[n];
        for (int i = 0; i < s.length && i < n; i++) {
            doubles[i] = s[i];
        }
        for (int i = 3; i < doubles.length; i++) {
            doubles[i] = doubles[i - 3] + doubles[i - 2] + doubles[i - 1];
        }
        return doubles;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 0, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 1, 1}, 10)));
    }

}
