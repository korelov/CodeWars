package kyu_5;

// https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Directions_Reduction {

    public static String[] dirReduc(String[] arr) {
        List<String> list = new ArrayList<>(Arrays.stream(arr).toList());
        boolean res = true;
        while (res) {
            res = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if ("NORTH".equals(list.get(i)) && "SOUTH".equals(list.get(i + 1)) ||
                        "SOUTH".equals(list.get(i)) && "NORTH".equals(list.get(i + 1)) ||
                        "EAST".equals(list.get(i)) && "WEST".equals(list.get(i + 1)) ||
                        "WEST".equals(list.get(i)) && "EAST".equals(list.get(i + 1))) {
                    list.remove(i);
                    list.remove(i);
                    res = true;
                    break;
                }
            }
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"});
        dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"});
    }
}

