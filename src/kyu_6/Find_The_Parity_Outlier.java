package kyu_6;

//https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java

public class Find_The_Parity_Outlier {

    static int find(int[] integers) {
        int odd = 0;
        int even = 0;
        int oddCount = 0;
        for (int integer : integers) {
            if (integer % 2 == 0) {
                even = integer;
            } else {
                odd = integer;
                oddCount++;
            }
        }
        if (oddCount == 1) {
            return odd;
        } else {
            return even;
        }
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{2, 6, 8, -10, 3}));
        System.out.println(find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        System.out.println(find(new int[]{Integer.MAX_VALUE, 0, 1}));
    }
}
