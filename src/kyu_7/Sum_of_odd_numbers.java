package kyu_7;

// https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/java

public class Sum_of_odd_numbers {
    public static int rowSumOddNumbers(int n) {
        return (int) Math.pow(n, 3);
    }


    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1));
        System.out.println(rowSumOddNumbers(42));
    }
}
