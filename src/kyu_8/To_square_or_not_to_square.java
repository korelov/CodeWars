package kyu_8;
// https://www.codewars.com/kata/57f6ad55cca6e045d2000627/java

import java.util.Arrays;

public class To_square_or_not_to_square {
    public static int[] squareOrSquareRoot(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if(Math.sqrt(array[i]) == Math.floor(Math.sqrt(array[i]))){
                arr[i]=(int)Math.sqrt(array[i]);
            } else {
                arr[i]=(int)Math.pow(array[i], 2);
            }
        }
        return arr;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(squareOrSquareRoot(new int[]{4, 3, 9, 7, 2, 1})));
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[]{100, 101, 5, 5, 1, 1})));
    }
}
