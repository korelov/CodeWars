package kyu_7;

// https://www.codewars.com/kata/590e03aef55cab099a0002e8/train/java

import java.util.Arrays;

public class Incrementer {
    public static int[] incrementer(int[] numbers) {
        for (int i = 0, j = 1; i < numbers.length; i++) {
            numbers[i] += j;
            if (numbers[i] >= 10) {
                numbers[i] = numbers[i] % 10;
            }
            j++;
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(incrementer(new int[]{5, 8, 0, 5, 8})));
        System.out.println(Arrays.toString(incrementer(new int[]{2, 4, 6, 8, 0, 2, 4, 6, 8, 9, 0, 1, 2, 2})));
        System.out.println(Arrays.toString(incrementer(new int[]{4, 8, 2, 2, 4})));
    }
}
