package kyu_7;

//https://www.codewars.com/kata/5a4138acf28b82aa43000117/train/java

public class Maximum_Product {
    public int adjacentElementsProduct(int[] array) {
        int max = array[0] * array[1];
        for (int i = 2; i < array.length; i++) {
            if (array[i - 1] * array[i] > max) {
                max = array[i - 1] * array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(new Maximum_Product().adjacentElementsProduct(new int[]{9, 5, 10, 2, 24, -1, -48}));
        System.out.println(new Maximum_Product().adjacentElementsProduct(new int[] {-23, 4, -5, 99, -27, 329, -2, 7, -921}));
    }
}
