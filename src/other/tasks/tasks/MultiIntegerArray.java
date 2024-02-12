package other.tasks.tasks;

import java.util.Arrays;

public class MultiIntegerArray {

    private static int[] multiplication(int[] arr1) {
        int[] result = new int[arr1.length];
        Arrays.fill(result, 1);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (i != j) {
                    result[i] *= arr1[j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 7, 3, 4};
        int[] arr2 = {4, 4, 4, 4};
        int[] arr3 = {4, 0, 4, 4};
        System.out.println(Arrays.toString(multiplication(arr1)));
        System.out.println(Arrays.toString(multiplication(arr2)));
        System.out.println(Arrays.toString(multiplication(arr3)));
    }
}
