package kyu_8;

// https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/java

public class Sum_without_highest_and_lowest_number {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 3) {
            return 0;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if ((numbers[i] < min)) {
                min = numbers[i];
            }
        }
        return sum - max - min;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{6, 2, 1, 8, 10}));
        System.out.println(sum(new int[]{1, 1, 11, 2, 3}));
        System.out.println(sum(new int[]{0}));
    }
}
