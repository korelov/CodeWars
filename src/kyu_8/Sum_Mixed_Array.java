package kyu_8;

import java.util.Arrays;
import java.util.List;
//https://www.codewars.com/kata/57eaeb9578748ff92a000009/train/java
public class Sum_Mixed_Array {
    public static int sum(List<?> mixed) {

        String temp = "";
        for (int i = 0; i < mixed.size(); i++) {
            temp += mixed.get(i);
        }
        int res = 0;
        for (int i = 0; i < temp.length(); i++) {
            res += temp.charAt(i) - 48;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(9, 3, "7", "3")));
        System.out.println(sum(Arrays.asList(5, "5")));
        System.out.println(sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
        System.out.println(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
        System.out.println(sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
        System.out.println(sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
        System.out.println(sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));

    }
}
