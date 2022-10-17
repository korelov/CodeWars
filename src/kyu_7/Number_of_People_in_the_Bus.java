package kyu_7;

//https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java

import java.util.ArrayList;

public class Number_of_People_in_the_Bus {

    public static int countPassengers(ArrayList<int[]> stops) {

        int res = stops.get(0)[0];
        for (int i = 1; i < stops.size(); i++) {
            for (int j = 0; j < stops.get(i).length; j++) {
                if (j % 2 == 0) {
                    res += stops.get(i)[j];
                } else {
                    res -= stops.get(i)[j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});
        System.out.println(countPassengers(list));
    }

}
