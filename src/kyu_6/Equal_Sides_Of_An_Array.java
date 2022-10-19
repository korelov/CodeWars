package kyu_6;

//https://www.codewars.com/kata/5679aa472b8f57fb8c000047/train/java

public class Equal_Sides_Of_An_Array {
    public static int findEvenIndex(int[] arr) {
        int sumR = 0;
        int sumL = 0;
        for (int j : arr) {
            sumR += j;
        }
        for (int i = 0; i < arr.length; i++) {
            sumR -= arr[i];
            if (sumR == sumL) {
                return i;
            }
            sumL += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));
        System.out.println(findEvenIndex(new int[]{4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 5, 6}));
    }
}
