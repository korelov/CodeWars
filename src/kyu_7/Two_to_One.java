package kyu_7;

// https://www.codewars.com/kata/5656b6906de340bd1b0000ac/java

import java.util.Arrays;

public class Two_to_One {

    public static String longest(String s1, String s2) {

        String res = "";
        StringBuilder sb = new StringBuilder(s1 + s2);
        for (int i = 1; i < sb.length(); i++) {
            String ch = String.valueOf(sb.charAt(i - 1));
            while (sb.indexOf(ch, i) != -1) {
                sb.deleteCharAt(sb.indexOf(ch, i));
            }
        }
        String arr = sb.toString();
        int[] arr1 = new int[arr.length()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (arr.charAt(i));
        }
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            res += (char) arr1[i];
        }
        return res;
    }

    public static void main(String[] args) {
        String a = "xyaabbbccccdefww";
        String b = "xxxxyyyyabklmopq";
        System.out.println(longest(a, b));

        System.out.println("===========");

        String a1 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(longest(a1, a1));
    }
}
