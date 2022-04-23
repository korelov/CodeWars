package kyu_8;

import java.util.Arrays;

//https://www.codewars.com/kata/56f699cd9400f5b7d8000b55/train/java
public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        String[] b = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[arr.length - 1 - i];
        }
        return b;
    }
        public static void main(String[] args) {

            String[] a = new String[]{ "head", "body", "tail" };
            System.out.println(Arrays.deepToString(a));
            System.out.println(Arrays.deepToString(fixTheMeerkat(a)));
        }
}
