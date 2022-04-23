package kyu_8;

//https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java
public class Sum_of_positive {
    public static int sum(int[] arr) {

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result += arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println(sum(a));

        int[] a1 = new int[]{1,-2,3,4,5};
        System.out.println(sum(a1));

        int[] a2 = new int[]{-1,-2,-3,-4,-5};
        System.out.println(sum(a2));

        int[] a4 = new int[]{};
        System.out.println(sum(a4));


    }

}
