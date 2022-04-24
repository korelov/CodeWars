package kyu_8;

// https://www.codewars.com/kata/55d277882e139d0b6000005d/java

public class Grasshopper_Array_Mean {

    public static int findAverage(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / (nums.length);
    }

    public static void main(String[] args) {
        System.out.println(findAverage(new int[]{1, 3, 5, 7}));
    }
}
