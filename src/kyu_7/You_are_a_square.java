package kyu_7;

//https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java

public class You_are_a_square {
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(0));
        System.out.println(isSquare(25));
        System.out.println(isSquare(3));
    }
}
