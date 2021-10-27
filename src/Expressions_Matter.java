//https://www.codewars.com/kata/5ae62fcf252e66d44d00008e/train/java

import java.util.Arrays;

public class Expressions_Matter {
    public static int expressionsMatter(int a, int b, int c) {
        int[] res = new int[]{a * (b + c), (a * b * c), (a + b * c), ((a + b) * c), (a + b + c), (a * b + c)};
        Arrays.sort(res);
        return res[5];
    }

    public static void main(String[] args) {
        System.out.println(expressionsMatter(9, 1, 1));
        System.out.println(expressionsMatter(1, 1, 1));
        System.out.println(expressionsMatter(5, 4, 1));
        System.out.println(expressionsMatter(0, 6, 4));
    }
}
