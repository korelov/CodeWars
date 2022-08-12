package kyu_7;

//https://www.codewars.com/kata/54fb963d3fe32351f2000102/train/java

public class Collatz_Conjecture_Length {
    public static long conjecture(long x) {

        long count = 0;
        do {
            if (x % 2 == 0) {
                x = x / 2;
                count++;
            } else {
                x = x * 3 + 1;
                count++;
            }
        } while (x != 1);
        return count + 1;
    }


    public static void main(String[] args) {

        System.out.println(conjecture(20));
    }


}
