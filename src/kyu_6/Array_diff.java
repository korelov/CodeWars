package kyu_6;

// https://www.codewars.com/kata/523f5d21c841566fde000009/train/java

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_diff {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> integerSetOne = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> integerSetTwo = Arrays.stream(b).boxed().collect(Collectors.toList());
        integerSetOne.removeAll(integerSetTwo);
        return integerSetOne.stream().mapToInt(value -> value).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{}, new int[]{1, 2})));
    }
}
