package kyu_7;

// https://www.codewars.com/kata/534ea96ebb17181947000ada/train/java

public class Breaking_chocolate_problem {

    public static long breakChocolate(long n, long m) {
        if ((n * m - 1) < 0) {
            return 0;
        } else {
            return n * m - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(breakChocolate(5,5));
        System.out.println(breakChocolate(1,1));
    }
}
