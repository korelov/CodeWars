package kyu_8;//https://www.codewars.com/kata/5f70c883e10f9e0001c89673/train/java
import java.util.Arrays;

public class Gravity_Flip {


    public static int[] flip(char dir, int[] arr) {

        if (dir == 'R') {
            Arrays.sort(arr);
            return arr;
        } else {
            int count = 0;
            int[] arr1 = new int[arr.length];
            if (dir == 'L') {
                Arrays.sort(arr);
                for (int i = arr.length - 1; i >= 0; i--) {
                    arr1[count++] = arr[i];
                }
            }
            return arr1;
        }
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(flip('R', new int[]{3, 2, 1, 2})));
        System.out.println(Arrays.toString(flip('L', new int[]{1, 4, 5, 3, 5})));
    }
}

