package kyu_7;

//https://www.codewars.com/kata/5aa1bcda373c2eb596000112/train/java


public class Maximum_Triplet_Sum {

    public static int maxTriSum(int[] numbers) {

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[i - 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        int sum = 0;
        int count = 0;
        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] != numbers[i - 1]) {
                sum += numbers[i];
                count++;
            }
            if (count == 3) {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maxTriSum(new int[]{3, 2, 6, 8, 2, 3}));
        System.out.println(maxTriSum(new int[]{2, 9, 13, 10, 5, 2, 9, 5}));
        System.out.println(maxTriSum(new int[]{2, 1, 8, 0, 6, 4, 8, 6, 2, 4}));
    }
}
