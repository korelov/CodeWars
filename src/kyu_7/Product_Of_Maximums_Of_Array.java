package kyu_7;

// https://www.codewars.com/kata/5a63948acadebff56f000018/train/java

import java.util.Arrays;

public class Product_Of_Maximums_Of_Array {
    public static long maxProduct(int[] numbers, int sub_size) {
        Arrays.sort(numbers);
        long multiply = 1;
        int count = 0;
        for (int i = numbers.length - 1; i > 0; i--) {
            multiply *= numbers[i];
            count++;
            if(count==sub_size){
                break;
            }
        }
        return multiply;
    }


    public static void main(String[] args) {

        System.out.println(maxProduct(new int[]{4, 3, 5}, 2));
        System.out.println(maxProduct(new int[]{10, 2, 3, 8, 1, 10, 4}, 5));
        System.out.println(maxProduct(new int[]{-4, -27, -15, -6, -1}, 2));
        System.out.println(maxProduct(new int[]{14, 29, -28, 39, -16, -48}, 4));
    }

}
