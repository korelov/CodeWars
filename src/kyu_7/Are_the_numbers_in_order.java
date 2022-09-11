package kyu_7;

// https://www.codewars.com/kata/56b7f2f3f18876033f000307/train/java

public class Are_the_numbers_in_order {

    public static boolean isAscOrder(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true;
        }
        boolean res = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isAscOrder(new int[]{1, 4, 13, 97, 508, 1047, 20058}));
        System.out.println(isAscOrder(new int[] {56, 98, 123, 67, 742, 1024, 32, 90969}));
        System.out.println(isAscOrder(new int[] {1, 3, 2}));
    }
}
