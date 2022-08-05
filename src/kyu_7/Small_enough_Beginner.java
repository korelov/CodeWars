package kyu_7;

//https://www.codewars.com/kata/57cc981a58da9e302a000214/train/java

public class Small_enough_Beginner {
    public static boolean smallEnough(int[] a, int limit) {

        for (int j : a) {
            if (j > limit) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(smallEnough(new int[]{66, 101}, 200));
        System.out.println(smallEnough(new int[]{78, 117, 110, 99, 104, 117, 107, 115}, 100));
    }
}
