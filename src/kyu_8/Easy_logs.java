package kyu_8;

// https://www.codewars.com/kata/5b68c7029756802aa2000176/train/java

public class Easy_logs {
    public static double logs(double x, double a, double b) {
        return Math.log(a) / Math.log(x) + Math.log(b) / Math.log(x);
    }

    public static void main(String[] args) {
        System.out.println(logs(10, 2, 3));
        System.out.println(logs(5, 2, 3));
        System.out.println(logs(1000, 2, 3));
    }
}
