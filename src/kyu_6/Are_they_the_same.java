package kyu_6;

// https://www.codewars.com/kata/550498447451fbbd7600041c/train/java

import java.util.Arrays;

public class Are_they_the_same {

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        int[] aSort = Arrays.stream(a).map(operand -> operand * operand).sorted().toArray();
        Arrays.sort(b);
        return Arrays.equals(aSort, b);

    }

    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
    }
}
