package kyu_7;

//https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

import java.util.Arrays;

public class Descending_Order {
    public static int sortDesc(final int num) {
        String[] temp = String.valueOf(num).split("");
        Arrays.sort(temp);
        return Integer.parseInt(new StringBuilder(String.join("", temp)).reverse().toString());
    }

    public static void main(String[] args) {

        System.out.println(sortDesc(42145));  //54421
        System.out.println(sortDesc(145263));
        System.out.println(sortDesc(123456789));
    }
}
