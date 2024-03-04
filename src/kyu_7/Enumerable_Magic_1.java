package kyu_7;

// https://www.codewars.com/kata/54598d1fcbae2ae05200112c/train/java

import java.util.function.IntPredicate;

public class Enumerable_Magic_1 {
    private static final IntPredicate evenNumber = n -> n % 2 == 0;
    private static final IntPredicate oddNumber = n -> n % 2 != 0;
    private static final IntPredicate lessThan10 = n -> n < 10;
    private static final IntPredicate lessThan5 = n -> n < 5;
    private static final IntPredicate greaterThan1 = n -> n > 1;
    private static final IntPredicate greaterThan5 = n -> n > 5;
    private static final IntPredicate greaterThan10 = n -> n > 10;


    public static boolean all(int[] list, IntPredicate predicate) {
        boolean res = true;
        for (int j : list) {
            res = predicate.test(j);
            if (!res) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(all(new int[]{2, 4, 6, 10}, evenNumber));
    }
}
