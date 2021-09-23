import java.util.Arrays;

//https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/java
public class CountPositivesNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;
        if(input == null || input.length==0){
            return new int[] {};
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count++;
            }
            if (input[i] < 0){
                sum+=input[i];
            }
        }
        int[] k = new int[]{count,sum};
        return k; //return an array with count of positives and sum of negatives
    }

    public static void main(String[] args) {
        int[] x = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegatives(x)));

        int[] x1 = new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};
        System.out.println(Arrays.toString(countPositivesSumNegatives(x1)));
    }
}
