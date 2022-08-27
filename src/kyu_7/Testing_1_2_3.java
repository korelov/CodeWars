package kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java

public class Testing_1_2_3 {
    public static List<String> number(List<String> lines) {

        int index = 1;
        List<String> temp = new ArrayList<>();
        for (String line : lines) {
            temp.add(index++ + ": ".concat(line));
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
        System.out.println(number(Arrays.asList("", "", "", "", "")));
    }
}
