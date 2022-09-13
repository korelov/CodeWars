package kyu_6;

//https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java

public class Find_the_odd_int {

    public static int findIt(int[] a) {
        int i;
        int odd = 0;
        for (i = 0; i < a.length; i++) {
            int count = 0;
            for (int k : a) {
                if (a[i] == k)
                    count++;
            }
            if (count % 2 != 0)
                odd = a[i];
        }
        return odd;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));  //5
        System.out.println(findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        System.out.println(findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
        System.out.println(findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
    }
}
