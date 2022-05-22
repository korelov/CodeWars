package kyu_7;

// https://www.codewars.com/kata/5a523566b3bfa84c2e00010b/train/java

public class Minimize_Sum_Of_Array {
    public static int minSum(int[] passed) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < passed.length; i++) {
                if (passed[i] < passed[i - 1]) {
                    int temp = passed[i];
                    passed[i] = passed[i - 1];
                    passed[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        int sum = 0;
        for (int i = 1, j = 0; i < passed.length; i = i + 2, j = j - 2) {
            sum += passed[i - 1] * passed[passed.length - 1 + j];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(minSum(new int[]{5, 4, 2, 3}));
        System.out.println(minSum(new int[]{12,6,10,26,3,24}));
        System.out.println(minSum(new int[]{9,2,8,7,5,4,0,6}));
    }
}
