package kyu_7;

// https://www.codewars.com/kata/5aba780a6a176b029800041c/train/java

public class Maximum_Multiple {

    public static int maxMultiple(int divisor, int bound) {

        int max = 0;
        for (int i = 0; i <= bound; i++) {
            if (i % divisor == 0) {
                max = i;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(maxMultiple(2, 7));
        System.out.println(maxMultiple(10, 50));
        System.out.println(maxMultiple(37, 200));
    }
}
