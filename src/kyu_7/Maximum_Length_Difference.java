package kyu_7;

// https://www.codewars.com/kata/5663f5305102699bad000056

public class Maximum_Length_Difference {
    public static int mxdiflg(String[] a1, String[] a2) {
        int res = 0;
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;

        for (int i = 0; i < a1.length; i++) {
            if (max1 < a1[i].length()) {
                max1 = a1[i].length();
            }
            if (min1 > a1[i].length()) {
                min1 = a1[i].length();
            }
        }
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < a2.length; i++) {
            if (max2 < a2[i].length()) {
                max2 = a2[i].length();
            }
            if (min2 > a2[i].length()) {
                min2 = a2[i].length();
            }
        }
        System.out.println(min1);
        System.out.println(max1);
        System.out.println(max2);
        return Math.abs(max1 - max2);
    }

    public static void main(String[] args) {

        String[] a1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] a2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        System.out.println(mxdiflg(a1, a2)); // --> 13

    }

}
