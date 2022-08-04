package kyu_7;

//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java

import java.util.ArrayList;
import java.util.Collections;

public class Highest_and_Lowest {

    public static String highAndLow(String numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] temp = numbers.split(" ");
        for (String s : temp) {
            arrayList.add(Integer.parseInt(s));
        }
        return Collections.max(arrayList) + " " + Collections.min(arrayList);
    }


    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
